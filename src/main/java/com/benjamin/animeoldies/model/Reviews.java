package com.benjamin.animeoldies.model;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer review_id;

    @NotNull
    private Integer user_id;

    @NotNull
    private Integer anime_id;

    @NotNull
    private Integer score;

    @NotBlank
    private VarcharJdbcType body;

    @NotNull
    private Integer state;
}
