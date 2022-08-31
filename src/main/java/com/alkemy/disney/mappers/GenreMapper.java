package com.alkemy.Alkemy.Challenge.Disney.mappers;

import com.alkemy.Alkemy.Challenge.Disney.dto.GenreDTO;
import com.alkemy.Alkemy.Challenge.Disney.entities.GenreEntity;
import org.springframework.stereotype.Component;

@Component
public class GenreMapper {
    //E2DTO
    public GenreDTO genreEntity2DTO (GenreEntity entity){

        GenreDTO genreDTO = new GenreDTO();
        genreDTO.setId(entity.getId());
        genreDTO.setImage(entity.getImage());
        genreDTO.setMovies(entity.getMovies());
        genreDTO.setName(entity.getName());

        return genreDTO;
    }
    //DTO2E
    public GenreEntity genreDTO2Entity (GenreDTO dto){
        GenreEntity entity = new GenreEntity();

        entity.setId(dto.getId());
        entity.setImage(dto.getImage());
        entity.setMovies(dto.getMovies());
        entity.setName(dto.getName());

        return entity;
    }

}