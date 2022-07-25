package HW3;

import java.util.Random;

public class Task7TailsHeads {
    public static void main(String[] args) {
        Random r = new Random();
        int chance = r.nextInt(2);
        if (chance == 1) {
            System.out.println("Tails");
        }
        else {
            System.out.println("Heads");
        }
    }
}
