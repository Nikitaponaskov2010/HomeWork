package HW2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        scanner.close();
        String s = Integer.toString(number);
        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int n = 5; //ширина цифры
            int mid = n / 2 + 1;

            switch (intArray[i] ) {
                case 0:
                    for (i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if ((j == 1 || j == n) || (i == 1 || i == n)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                        continue;
                    }
                case 1:
                    for (i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j == mid || i == n || (i + j == mid && j <= mid)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                        continue;
                    }
    }
}}}

