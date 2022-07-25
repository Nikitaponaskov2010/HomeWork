package HW3;

public class Task5Spaceship {
    String nameOfTheSpaceship1 = "Avrora";
    String nameOfTheSpaceship2 = "Siri";

    public void spaceship1() {
        Task5Spaceship ss1 = new Task5Spaceship();
        System.out.println("The name of the first spaceship is:");
        System.out.println(ss1.nameOfTheSpaceship1);
    }

    public void spaceship2() {
        Task5Spaceship ss2 = new Task5Spaceship();
        System.out.println("The name of the second spaceship is ");
        System.out.println(ss2.nameOfTheSpaceship2);
    }

    public static void main(String[] args) {
        Task5Spaceship nameView = new Task5Spaceship();
        nameView.spaceship1();
        nameView.spaceship2();
    }
}
