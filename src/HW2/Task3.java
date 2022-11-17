package HW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите размер ");
        Scanner cs1 = new Scanner(System.in);
        int size = cs1.nextInt();
        for (int i = 0; i < size; i++) {
            //лево пусто
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            //левый треугольник
            for (int j1 = 0; j1 < i; j1++) {
                if (j1 == 0 || i == size - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //правый треугольник
            for (int j = 0; j < i + 1; j++) {
                if (j == i || i == size - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
