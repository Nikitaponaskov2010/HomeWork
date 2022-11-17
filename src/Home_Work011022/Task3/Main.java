package Home_Work011022.Task3;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.fieldX = 2.5;
        p.fieldY = 5.9;

        Point p1 = new Point();
        p1.fieldX = 6.5;
        p1.fieldY = 7.7;

        System.out.println(p.equals(p1));
        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
    }
}
