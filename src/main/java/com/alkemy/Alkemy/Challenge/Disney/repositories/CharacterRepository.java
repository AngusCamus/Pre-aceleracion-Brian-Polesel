package com.alkemy.Alkemy.Challenge.Disney.repositories;

import com.alkemy.Alkemy.Challenge.Disney.dto.CharacterFilterDTO;
import com.alkemy.Alkemy.Challenge.Disney.entities.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> , JpaSpecificationExecutor<CharacterFilterDTO> {


    //obterner 1
    //obtener lista
    //crear
    //eliminar
    //update
}
