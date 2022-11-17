package HW4;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("0123456789");

        sd.append(4227);
        sd.delete(0, 10);
        System.out.println(sd);


        StringBuilder sd2 = new StringBuilder("0123456789");

        sd2.insert(5, 247);
        sd2.replace(0, 4, "").replace(4, 9, "");

        System.out.println(sd2);

        String str = "0123456789";
        System.out.println("\nString " + str);
        String newStr = str.replace('1', '4').replace('3', '4');
        System.out.println(newStr.substring(1, 4).concat("7"));
    }
}








