package HW3;

import java.util.Random;

public class Task4DataOnly2 {
    static int i;
    static double d;
    static boolean b;


    public static void main(String[] args) {

        new Task4DataOnly2();

        Random random = new Random();
        i = random.nextInt();
        d = random.nextDouble();
        b = random.nextBoolean();

        if (i < d){

            System.out.println(i + " < " + d + " " + b);

        }
        else

            System.out.println(b);


    }


}
