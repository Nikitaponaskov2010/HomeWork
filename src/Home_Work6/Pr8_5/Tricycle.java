package Home_Work6.Pr8_5;

public class Tricycle  extends Cycle {
    @Override
    public void ride() {
        wheels =  3;
        System.out.println("Tricycle has" + getWheels() +" wheels");
    }
    public void balance () {
        System.out.println("Tricycle has balance");
    }
}
