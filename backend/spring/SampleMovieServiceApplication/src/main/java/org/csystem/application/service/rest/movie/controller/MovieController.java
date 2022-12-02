package org.csystem.application.service.rest.movie.controller;

import org.csystem.application.service.rest.movie.dto.MovieDTO;
import org.csystem.application.service.rest.movie.dto.exception.ErrorInfo;
import org.csystem.application.service.rest.movie.service.MovieService;
import org.csystem.util.data.service.DataServiceException;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.csystem.util.exception.ExceptionUtil.subscribe;

@RestController
@RequestMapping("api/movie")
@Scope("prototype")
public class MovieController {
    private final MovieService m_movieService;

    public MovieController(MovieService movieService)
    {
        m_movieService = movieService;
    }

    @GetMapping("/all")
    public List<MovieDTO> findAll()
    {
        return subscribe(m_movieService::findAllMovies, ex -> new ArrayList<>());
    }

    @GetMapping("/info/y")
    public ResponseEntity<List<MovieDTO>> findMovieByYearResponseEntity(@RequestParam("year") String yearStr)
    {
        ResponseEntity<List<MovieDTO>> responseEntity = ResponseEntity.badRequest().build();

        try {
            responseEntity = ResponseEntity.ok(m_movieService.findMoviesByYear(Integer.parseInt(yearStr)));
        }
        catch (DataServiceException|NumberFormatException ex) {
            //...
        }

        return responseEntity;
    }

    @GetMapping("/info/my")
    public ResponseEntity<List<MovieDTO>> findMoviesByMonthAndYear(@RequestParam("month") String monthStr,
                                                                   @RequestParam("year") String yearStr)
    {
        ResponseEntity<List<MovieDTO>> responseEntity = ResponseEntity.badRequest().build();

        try {
            responseEntity = ResponseEntity.ok(m_movieService.findMoviesByMonthYear(Integer.parseInt(monthStr), Integer.parseInt(yearStr)));
        }
        catch (DataServiceException|NumberFormatException ex) {
            //...
        }

        return responseEntity;
    }

    @GetMapping("/count")
    public long count()
    {
        return subscribe(m_movieService::countMovies, ex -> -1L);
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveMovie(@RequestBody MovieDTO movieDTO)
    {
        return subscribe(() -> ResponseEntity.ok(m_movieService.saveMovie(movieDTO)),
                ex -> new ResponseEntity<>(new ErrorInfo(ex.getMessage(), null), HttpStatus.BAD_REQUEST));
    }


    /*
    @GetMapping("/info/detail")
    public ResponseEntity<List<MovieDetailDTO>> findMoviesDetailsByYear(@RequestParam("year") String yearStr)
    {
        ResponseEntity<List<MovieDetailDTO>> responseEntity = ResponseEntity.badRequest().build();

        try {
            responseEntity = ResponseEntity.ok(m_movieService.findMoviesDetailsByYear(Integer.parseInt(yearStr)));
        }
        catch (DataServiceException|NumberFormatException ex) {
            //...
        }

        return responseEntity;
    }

     */

    /*
    @GetMapping("/info/detailstat")
    public ResponseEntity<Object> findMoviesDetailsByYearStatus(@RequestParam("year") String yearStr)
    {
        return subscribe(() -> ResponseEntity.ok(m_movieService.findMoviesDetailsByYear(Integer.parseInt(yearStr))),
                ex -> new ResponseEntity<>(new ErrorInfo(ex.getMessage(), yearStr), HttpStatus.BAD_REQUEST));
    }

     */

    //...
}
