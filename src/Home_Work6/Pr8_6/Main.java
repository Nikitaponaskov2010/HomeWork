package Home_Work6.Pr8_6;

public class Main {
    public static void main(String[] args) {
        for (CarBody c:CarBody.values()) {
            System.out.print(c + " ");
            System.out.print(c.getConsumption() + " ");
            System.out.print(c.getPrice());
            System.out.println();
        }

        Car cabriolet = new Car();
        cabriolet.bodyType = CarBody.CABRIOLET;

        System.out.println("Car has body as " + cabriolet.bodyType);
    }
    }

