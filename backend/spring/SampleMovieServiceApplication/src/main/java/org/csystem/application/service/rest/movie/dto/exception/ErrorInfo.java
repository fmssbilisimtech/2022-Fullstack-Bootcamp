package org.csystem.application.service.rest.movie.dto.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

public class ErrorInfo {
    private String m_message;
    private LocalDateTime m_localDateTime = LocalDateTime.now();
    private Object m_data;

    public ErrorInfo(String message, Object data)
    {
        m_message = message;
        m_data = data;
    }

    public String getMessage()
    {
        return m_message;
    }

    public void setMessage(String message)
    {
        m_message = message;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    public LocalDateTime getLocalDateTime()
    {
        return m_localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime)
    {
        m_localDateTime = localDateTime;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getData()
    {
        return m_data;
    }

    public void setData(Object data)
    {
        m_data = data;
    }
}
