import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input an animal");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        switch (animal) {
            case "cat": {
                System.out.println("мяу");
                break;
            }
            case "dog": {
                System.out.println("гав");
                break;
            }
            case "mouse": {
                System.out.println("пи пи пи");
                break;
            }
            case "cow" : {
                System.out.println("му");
                break;
            }
            case "pig" : {
                System.out.println("хрю");
                break;
    }
            default: {
                System.out.println("Input the correct animal");
            }
    }}}
