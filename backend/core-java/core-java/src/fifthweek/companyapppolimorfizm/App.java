package fifthweek.companyapppolimorfizm;


class App {
    public static void main(String [] args)
    {
        CompanyApp.run();
    }
}



 class CompanyApp {
    private CompanyApp()
    { }

    public static void run()
    {
        Worker worker = new Worker("12345678124", "Ali", "mecidiyeköy", 6, 100);
        Manager manager = new Manager("98765432154", "Veli", "Şişli", 20000, "Pazarlama");
        SalesManager salesManager = new SalesManager("12678654322", "Selami", "Fulya", 30000, "Pazarlama", 10000);
        ProjectWorker projectWorker = new ProjectWorker("12345678964", "Halis", "Şişli", 6, 100, 1000);
        HumanResources humanResources = new HumanResources();

        humanResources.payInsurance(worker);
        humanResources.payInsurance(manager);
        humanResources.payInsurance(salesManager);
        humanResources.payInsurance(projectWorker);
    }
}
