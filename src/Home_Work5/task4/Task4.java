package Home_Work5.task4;


class WrapperTest{
    Integer x;
    Double y;
}
public class Task4 {
    public static void main(String[] args) {
        Integer x1, x2;
        Double y1, y2, y3;
        x1 = 5;
        x2 = 15;
        System.out.println("x1 = " + x1 + " " + "x2 = " + x2);

        y1 = 3.14;
        y2 = y1;
        y3 = y1;
        y3++;
        System.out.println("y1 = " + y1 + " " + "y2 = " + y2 + " " + "y3 = " + y3);

        x1 = 500;
        x2 = 500;
        System.out.println("Comparison of two variables -127 < Integer = 500 > 128 x1 == x2 - result = " + (x1 == x2));


        x1 = 20;
        x2 = 20;
        System.out.println("Comparison of two variables -127 > Integer = 20 < 128 x1 == x2 - result = " + (x1 == x2));
    }
}