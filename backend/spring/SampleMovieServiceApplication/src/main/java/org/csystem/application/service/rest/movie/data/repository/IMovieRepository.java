package org.csystem.application.service.rest.movie.data.repository;

import org.csystem.application.service.rest.movie.data.entity.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IMovieRepository extends CrudRepository<Movie, Long> {
    @Query(value = "select * from movies where date_part('year', scene_time) = :year", nativeQuery = true)
    Iterable<Movie> findMoviesByYear(int year);

    //Iterable<MovieDirectorDetail> findMoviesDetailsByYear(int year);

    @Query(value = "select * from movies where date_part('month', scene_time) = :month and date_part('year', scene_time) = :year", nativeQuery = true)
    Iterable<Movie> findMoviesByMonthAndYear(int month, int year);
}
