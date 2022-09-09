package fifthweek.companyapppolimorfizm;

public class ProjectWorker extends Worker{
    private double m_extra;

    public ProjectWorker(String citizenId, String name, String address, int hourPerDay, double feePerHour, double extra)
    {
        super(citizenId, name, address, hourPerDay, feePerHour);
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

    public double calculatePayment()
    {
        return super.calculatePayment() + m_extra * 30;
    }
}
