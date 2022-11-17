package Home_Work6.Pr8_2;

import java.util.Scanner;

public class Employee {
    private String familia;
    private String name;
    private int age;
    private String dolgnost;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.proverkaVozrasta();
    }
    public void proverkaVozrasta(){
        System.out.println("Vvedite vozrast dlu proverki: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 100 ||age<18 ){
            System.err.println("Vozrast ne podhodit");
            System.out.println("Povtorite vvod: ");
            sc.nextInt();
        } else {
            System.out.println("Vozrast podxodit!!!");
        }
    }
}
