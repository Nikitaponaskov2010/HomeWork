import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("введите символ:");
        String символ = scanner1.nextLine();
        Pattern patlatletter = Pattern.compile("[s+nD_J]{1}");
        Matcher matlatletter = patlatletter.matcher(символ);
        Pattern patkirletter = Pattern.compile("[a=za=я]{1}");
        Matcher matkirletter = patlatletter.matcher(символ);
        Pattern patnumber = Pattern.compile("[2-7]{1}");
        Matcher matnumber = patnumber.matcher(символ);
        if (matlatletter.matches() == true) {
            System.out.println("Kot");
        }
        else if (matkirletter.matches() == true); {
        System.out.println("Com");
        }
         if (matnumber.matches() == true) {
            System.out.println("Sait");

        } else {
            System.out.println("невозможно определить");

}}}

