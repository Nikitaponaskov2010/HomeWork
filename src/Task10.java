import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("введите номер квартиры");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        System.out.println("введите количество квартир на этаже");
        Scanner scanner2 = new Scanner(System.in);
        int v = scanner2.nextInt();
        System.out.println("подъезд" +(n/(9*v)+1));
    }
}
