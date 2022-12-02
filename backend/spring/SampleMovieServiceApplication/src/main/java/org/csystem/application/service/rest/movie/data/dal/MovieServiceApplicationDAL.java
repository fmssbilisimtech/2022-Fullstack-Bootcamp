package org.csystem.application.service.rest.movie.data.dal;

import org.csystem.application.service.rest.movie.data.entity.Director;
import org.csystem.application.service.rest.movie.data.entity.Movie;
import org.csystem.application.service.rest.movie.data.repository.IDirectorRepository;
import org.csystem.application.service.rest.movie.data.repository.IMovieRepository;
import org.springframework.stereotype.Component;

import static org.csystem.util.data.DatabaseUtil.doWorkForRepository;

@Component
public class MovieServiceApplicationDAL {
    private final IMovieRepository m_movieRepository;
    private final IDirectorRepository m_directorRepository;

    public MovieServiceApplicationDAL(IMovieRepository movieRepository, IDirectorRepository directorRepository)
    {
        m_movieRepository = movieRepository;
        m_directorRepository = directorRepository;
    }

    public long countMovies()
    {
        return doWorkForRepository(m_movieRepository::count, "MovieServiceApplicationDAL.countMovies");
    }

    public Iterable<Movie> findAllMovies()
    {
        return doWorkForRepository(m_movieRepository::findAll, "MovieServiceApplicationDAL.findAllMovies");
    }

    public Iterable<Movie> findMoviesByMonthYear(int month, int year)
    {
        return doWorkForRepository(() -> m_movieRepository.findMoviesByMonthAndYear(month, year),
                "MovieServiceApplicationDAL.findMoviesByMonthYear");
    }

    public Iterable<Movie> findMoviesByYear(int year)
    {
        return doWorkForRepository(() -> m_movieRepository.findMoviesByYear(year), "MovieServiceApplicationDAL.findByYear");
    }

    public Movie saveMovie(Movie movie)
    {
        return doWorkForRepository(() -> m_movieRepository.save(movie), "MovieServiceApplicationDAL.saveMovie");
    }

    public long countDirectors()
    {
        return doWorkForRepository(m_directorRepository::count, "MovieServiceApplicationDAL.countDirectors");
    }

    public Director saveDirector(Director director)
    {
        return doWorkForRepository(() -> m_directorRepository.save(director), "MovieServiceApplicationDAL.saveDirector");
    }

    public Iterable<Director> findAllDirectors()
    {
        return doWorkForRepository(m_directorRepository::findAll, "MovieServiceApplicationDAL.findAllDirectors");
    }
}
