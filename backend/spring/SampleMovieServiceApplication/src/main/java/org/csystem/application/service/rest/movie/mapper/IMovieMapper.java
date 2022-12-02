package org.csystem.application.service.rest.movie.mapper;

import org.csystem.application.service.rest.movie.data.entity.Movie;
import org.csystem.application.service.rest.movie.dto.MovieDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "MovieMapperImpl", componentModel = "spring")
public interface IMovieMapper {
    @Mapping(source = "sceneTime", target = "sceneTime", dateFormat = "dd/MM/yyyy")
    MovieDTO toMovieDTO(Movie movie);
    @Mapping(source = "sceneTime", target = "sceneTime", dateFormat = "dd/MM/yyyy")
    Movie toMovie(MovieDTO movieDTO);
}
