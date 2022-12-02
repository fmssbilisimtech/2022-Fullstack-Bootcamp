package org.csystem.application.service.rest.movie.data.repository;

import org.csystem.application.service.rest.movie.data.entity.Director;
import org.springframework.data.repository.CrudRepository;

public interface IDirectorRepository extends CrudRepository<Director, Long> {
    //...
}
