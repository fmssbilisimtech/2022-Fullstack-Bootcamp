package fifthweek.vehicle;

public class Boat implements Vehicle {

    @Override
    public void Accelerate() {
        // TODO Auto-generated method stub
        System.out.println("Boat Acceleration Start");

    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Boat using Brake");

    }

    @Override
    public void honk() {
        // TODO Auto-generated method stub
        System.out.println("Boat Honk Honk !");

    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        System.out.println("Boat Engine Started");

    }
}
