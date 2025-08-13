package com.luizgustavz.character.character.api.springboot.repository;

import com.luizgustavz.character.character.api.springboot.model.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {
}
