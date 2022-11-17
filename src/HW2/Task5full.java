package HW2;

import java.util.Scanner;

public class Task5full {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner cs1 = new Scanner(System.in);
        int size = cs1.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
