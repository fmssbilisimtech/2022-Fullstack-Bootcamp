package fifthweek.animals;

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
         pingou.dive();
         pingou.swimDown(3);
         pingou.swimUp(1);
         pingou.swimDown(4);
         pingou.swimUp(5);
         pingou.swimUp(1);
         pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");

        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(30);
        hawkeye.glide();
        hawkeye.descend(140);
        hawkeye.land();
        hawkeye.descend(10);
        hawkeye.land();

    }
}
