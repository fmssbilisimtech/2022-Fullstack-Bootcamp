package org.csystem.application.service.rest.movie.dto;

import com.fasterxml.jackson.annotation.JsonGetter;

public class MovieDetailDTO {
    private MovieDTO m_movieDTO;
    private String m_directorName;

    //...

    @JsonGetter("movie")
    public MovieDTO getMovieDTO()
    {
        return m_movieDTO;
    }

    public void setMovieDTO(MovieDTO movieDTO)
    {
        m_movieDTO = movieDTO;
    }

    public String getDirectorName()
    {
        return m_directorName;
    }

    public void setDirectorName(String directorName)
    {
        m_directorName = directorName;
    }
}
