package HW3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task8Distance {
    private static final float GETDISTANCE(){
        System.out.print("Введите расстояние в метрах");
        Scanner scan1 = new Scanner(System.in);
        float getDistance = scan1.nextFloat();
        return getDistance;
    }
    private static final float GETTIME(){
        System.out.print("Введите расстояние в минутах");
        Scanner scan2 = new Scanner(System.in);
        float getTime = scan2.nextFloat();
        return getTime;
    }
    public static void main(String[] args) {
        float velocity = (GETDISTANCE()/GETTIME());
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.print("cкорость равняется "+df.format(velocity)+" м/с");
    }
}
