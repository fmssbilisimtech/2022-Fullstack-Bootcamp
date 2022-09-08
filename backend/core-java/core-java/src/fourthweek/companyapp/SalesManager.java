package fourthweek.companyapp;

public class SalesManager extends Manager {
    private double m_extra;

    public SalesManager(String citizenId, String name, String address, double salary, String department, double extra)
    {
        super(citizenId, name, address, salary, department);
        m_extra = extra;
    }

    public double getExtra()
    {
        return m_extra;
    }

    public void setExtra(double extra)
    {
        m_extra = extra;
    }
}
