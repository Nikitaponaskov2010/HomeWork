package HW2;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        scanner.close();
        String s = scanner.nextLine();
        int n = 5; //ширина цифры
        int mid = n / 2 + 1;
        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 1; j <= n; j++) {
                    boolean draw;

                    switch (s.charAt(i)) {
                        case '0':
                            draw = (j == 1 || j == n) || (k == 1 || k == n);
                            break;
                        case '1':
                            draw = j == mid || k == n || (k + j == mid && j <= mid);
                            break;
                        default:
                            continue;
                    }

                    System.out.print(draw ? "*" : " ");
                }
                System.out.print(" ");
            }
            System.out.println();
                            }
                        }
                }
