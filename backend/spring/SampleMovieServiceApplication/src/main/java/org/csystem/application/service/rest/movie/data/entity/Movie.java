package org.csystem.application.service.rest.movie.data.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie { //POJO class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    public long id;

    @Column(nullable = false)
    public String name;

    @Column(name= "scene_time", nullable = false)
    public LocalDate sceneTime;

    @Column(nullable = false)
    public long rating;

    @Column(nullable = false)
    public BigDecimal cost;

    @Column(nullable = false)
    public float imdb;

    @ManyToMany(mappedBy = "movies", fetch = FetchType.LAZY)
    public Set<Director> directors = new HashSet<>();
}
