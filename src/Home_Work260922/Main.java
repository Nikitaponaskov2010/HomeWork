package Home_Work260922;

public class Main {
    public static void main(String[] args) {
        Sotrudnik ivanov = new Sotrudnik();
        Oplata pay = new Stavka();
        ivanov.fio = "Иванов";
        ivanov.payment = 300;
        ivanov.typeOfPayment = pay;
        ivanov.countOfWorkingDay = 10;
        ivanov.child = 1;
        ivanov.offshore = 1;
        ivanov.getPayment();
        ivanov.getPaymentHours();
        ivanov.getPaymentMinusNalog();
        System.out.println(ivanov.toString());

        Sotrudnik sidorov = new Sotrudnik();
        Oplata pay1 = new Pochacovaya();
        sidorov.fio = "Сидоров";
        sidorov.payment = 800;
        sidorov.typeOfPayment = pay1;
        sidorov.countOfWorkingHours = 200;
        sidorov.child = 4;
        sidorov.offshore = 0;
        sidorov.getPayment();
        sidorov.getPaymentHours();
        sidorov.getPaymentMinusNalog();
        System.out.println(sidorov.toString());

        Sotrudnik petrov = new Sotrudnik();
        Oplata pay2 = new Sdelnaya();
        petrov.fio = "Петров";
        petrov.payment = 5500;
        petrov.typeOfPayment = pay2;
        petrov.child = 0;
        petrov.offshore = 1;
        petrov.getPayment();
        petrov.getPaymentHours();
        petrov.getPaymentMinusNalog();
        System.out.println(petrov.toString());

        double sum =  ivanov.totalPayment1 + sidorov.totalPayment1 + petrov.totalPayment1;

        System.out.println("Итого = " + sum);
    }

}

