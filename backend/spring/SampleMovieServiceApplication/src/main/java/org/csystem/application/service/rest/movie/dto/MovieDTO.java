package org.csystem.application.service.rest.movie.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

public class MovieDTO {
    private String m_name;
    private String m_sceneTime;
    private long m_rating;
    private BigDecimal m_cost;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public String getSceneTime()
    {
        return m_sceneTime;
    }

    public void setSceneTime(String sceneTime)
    {
        m_sceneTime = sceneTime;
    }

    public long getRating()
    {
        return m_rating;
    }

    public void setRating(long rating)
    {
        m_rating = rating;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getCost()
    {
        return m_cost;
    }

    public void setCost(BigDecimal cost)
    {
        m_cost = cost;
    }
}
