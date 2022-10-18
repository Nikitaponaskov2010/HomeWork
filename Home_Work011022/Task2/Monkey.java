package Home_Work011022.Task2;

public class Monkey {
    String name;

    static int totalMonkey;

    public Monkey() {
        System.out.println("This is Monkey");
    }

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.name = "Cara";
        totalMonkey ++;

        Monkey m1 = new Monkey();
        m1.name = "Igor";
        totalMonkey ++;

        System.out.println("This is first : " + m.name);
        System.out.println("This is second : " + m1.name);
        System.out.println("Total monkey: " +  totalMonkey);
    }
}
