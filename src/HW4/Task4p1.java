package HW4;

import java.util.Random;
import java.util.Scanner;

public class Task4p1 {
    public static void main(String[] args) {
        Task4p1 obj = new Task4p1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int n = sc.nextInt();
        int[] arrayOfNumbers = obj.randomArray(n);
        obj.displayArray(arrayOfNumbers);
        System.out.println();
        int[] sortedArray = obj.sort(arrayOfNumbers);
        obj.displayArray(sortedArray);
    }
    private int[] randomArray (int n){
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public void displayArray (int[] a){
        for (int c : a){
            System.out.print(c + " ");
        }
    }

    private int[] sort (int[] a){
        int j = 0;
        boolean swapNeeded;
        while (j < a.length - 1) {
            swapNeeded = false;
            for (int i = 0; i < a.length - j - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int buff = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buff;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded){
                break;
            }
            j++;
        }
        return a;
    }


}
