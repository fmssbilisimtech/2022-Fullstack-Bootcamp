package fifthweek.vehicle;

public class Car implements Vehicle {

    @Override
    public void Accelerate() {
        // TODO Auto-generated method stub
        System.out.println("Car Acceleration Start");

    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Car using Brake");

    }

    @Override
    public void honk() {
        // TODO Auto-generated method stub
        System.out.println("Car Honk Honk !");

    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        System.out.println("Car Engine Started");

    }

}
