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
@Table(name="anime_categories")
public class CategoriasAnime {
    @NotNull
    private Integer anime_id;
    
    @NotNull
    private Integer category_id;
}
