package data.camera;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarCameraInfo {
    private final String m_plate;
    private final LocalDateTime m_passDateTime = LocalDateTime.now();
    //...

    public CarCameraInfo(String plate)
    {
        m_plate = plate;
    }

    public String getPlate()
    {
        return m_plate;
    }

    public LocalDateTime getPassDateTime()
    {
        return m_passDateTime;
    }

    @Override
    public boolean equals(Object obj)
    {
        return (obj instanceof CarCameraInfo) && (((CarCameraInfo)obj).m_plate.equals(m_plate));
    }
    @Override
    public String toString()
    {
        return String.format("[%s] %s", m_plate, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(m_passDateTime));
    }
}
