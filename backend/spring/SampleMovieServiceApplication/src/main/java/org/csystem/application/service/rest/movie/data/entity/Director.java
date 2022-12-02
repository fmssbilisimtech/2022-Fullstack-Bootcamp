package org.csystem.application.service.rest.movie.data.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "directors")
public class Director { //POJO class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "director_id")
    public long id;

    @Column(nullable = false)
    public String name;

    @Column(name = "birth_date", nullable = false)
    public LocalDate birthDate;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "movies_to_director",
            joinColumns = @JoinColumn(name = "director_id", referencedColumnName = "director_id", nullable = false, updatable = false),
            inverseJoinColumns =  @JoinColumn(name = "movie_id", referencedColumnName = "movie_id", nullable = false, updatable = false))
    public Set<Movie> movies = new HashSet<>();
}
