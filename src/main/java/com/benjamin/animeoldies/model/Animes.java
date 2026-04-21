package com.benjamin.animeoldies.model;

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
public class Animes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer anime_id;

    @NotBlank
    private String title;

    @NotBlank
    private String resume;

    @NotNull
    private Integer state_id;
}
