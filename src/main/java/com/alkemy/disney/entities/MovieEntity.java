package com.alkemy.Disney.entities;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@SQLDelete(sql= "UPDATE movies SET deleted = true WHERE movie_id=?")
@Where(clause= "deleted=false")
@Table(name="movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "movie_id")
    private Long id;

    private String title;
    private String image;
    @DateTimeFormat
    @Column(name="fecha_creacion")
    private LocalDate creationDate;
    private Integer rating;
    private boolean deleted = Boolean.FALSE;


    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name= "movies_chars",
            joinColumns = @JoinColumn(name="movie_id"),
            inverseJoinColumns = @JoinColumn(name = "char_id")
    )
    private Set<CharacterEntity> characters = new HashSet<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id", insertable = false, updatable = false)
    private GenreEntity genre;



    public void addCharacter (CharacterEntity entity){
        characters.add(entity);
    }

    public void delCharacter (CharacterEntity entity){
        characters.remove(entity);
    }

}