package com.luizgustavz.character.character.api.springboot.repository;

import com.luizgustavz.character.character.api.springboot.model.entities.UniverseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniverseRepository extends JpaRepository<UniverseEntity, Long> {
}
