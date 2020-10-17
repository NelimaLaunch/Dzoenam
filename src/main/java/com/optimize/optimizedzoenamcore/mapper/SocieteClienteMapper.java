package com.optimize.optimizedzoenamcore.mapper;

import com.optimize.optimizedzoenamcore.dto.SocieteClienteDto;
import com.optimize.optimizedzoenamcore.entities.SocieteCliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocieteClienteMapper {
    SocieteCliente fromSocieteClienteDto(SocieteClienteDto dto);
}
