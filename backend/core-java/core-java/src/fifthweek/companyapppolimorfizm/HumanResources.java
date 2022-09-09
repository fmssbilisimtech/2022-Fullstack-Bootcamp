package fifthweek.companyapppolimorfizm;

public class HumanResources {
    public void payInsurance(Employee employee)
    {
        System.out.printf("CitizenId:%s%n", employee.getCitizenId());
        System.out.printf("Name:%s%n", employee.getName());

        System.out.printf("Payment:%f%n", employee.calculatePayment());
    }
    //...
}
