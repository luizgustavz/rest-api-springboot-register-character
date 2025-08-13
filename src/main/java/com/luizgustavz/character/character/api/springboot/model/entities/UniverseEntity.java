package com.luizgustavz.character.character.api.springboot.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_universe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniverseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String yearPublication;

    @OneToMany(mappedBy = "universe")
    private List<PersonEntity> person;

}
