package com.optimize.optimizedzoenamcore.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class SocieteClienteDto {
    private Long id;
    @NotEmpty(message = "nom.notEmpty")
    private String nom;
}
