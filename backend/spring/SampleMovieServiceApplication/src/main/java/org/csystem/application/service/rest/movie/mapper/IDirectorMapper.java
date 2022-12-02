package org.csystem.application.service.rest.movie.mapper;

import org.csystem.application.service.rest.movie.data.entity.Director;
import org.csystem.application.service.rest.movie.dto.DirectorDTO;
import org.mapstruct.Mapper;

@Mapper(implementationName = "DirectorMapperImpl", componentModel = "spring")
public interface IDirectorMapper {
    Director toDirector(DirectorDTO directorDTO);
    DirectorDTO toDirectorDTO(Director director);
}
