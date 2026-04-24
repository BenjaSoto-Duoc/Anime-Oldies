package com.benjamin.animeoldies.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="animes")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String resume;

    @NotNull
    @ManyToOne
    private State state;

    @OneToMany(mappedBy = "anime")
    private List<CategoriaAnime> categories;

    @OneToMany(mappedBy = "anime")
    private List<Link> links;

    @OneToMany(mappedBy = "anime")
    private List<Review> reviews;
}
