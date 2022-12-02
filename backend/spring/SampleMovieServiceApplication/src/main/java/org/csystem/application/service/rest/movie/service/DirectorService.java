package org.csystem.application.service.rest.movie.service;

import org.csystem.application.service.rest.movie.data.dal.MovieServiceApplicationDAL;
import org.csystem.application.service.rest.movie.dto.DirectorDTO;
import org.csystem.application.service.rest.movie.mapper.IDirectorMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.csystem.util.data.DatabaseUtil.doWorkForService;

@Service
public class DirectorService {
    private final MovieServiceApplicationDAL m_movieServiceApplicationDAL;
    private final IDirectorMapper m_directorMapper;

    private DirectorDTO saveDirectorCallback(DirectorDTO directorDTO)
    {
        m_movieServiceApplicationDAL.saveDirector(m_directorMapper.toDirector(directorDTO));

        return directorDTO;
    }

    private List<DirectorDTO> findAllDirectorsCallback()
    {
        return StreamSupport.stream(m_movieServiceApplicationDAL.findAllDirectors().spliterator(), false)
                .map(m_directorMapper::toDirectorDTO)
                .collect(Collectors.toList());
    }

    public DirectorService(MovieServiceApplicationDAL movieServiceApplicationDAL, IDirectorMapper directorMapper)
    {
        m_movieServiceApplicationDAL = movieServiceApplicationDAL;
        m_directorMapper = directorMapper;
    }

    public DirectorDTO saveDirector(DirectorDTO directorDTO)
    {
        return doWorkForService(() -> saveDirectorCallback(directorDTO), "MovieApplicationService.saveDirector");
    }

    public List<DirectorDTO> findAllDirectors()
    {
        return doWorkForService(this::findAllDirectorsCallback, "MovieApplicationService.findAllDirectors");
    }

    //...
}
