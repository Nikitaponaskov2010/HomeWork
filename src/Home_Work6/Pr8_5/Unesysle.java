package Home_Work6.Pr8_5;

public class Unesysle extends Cycle {

    @Override
    public void ride(){
        wheels = 1;
        System.out.println("Unicycle has " + getWheels() + " wheel");
    }

    public void balance () {
        System.out.println("Unicycle has balance");
    }

}
