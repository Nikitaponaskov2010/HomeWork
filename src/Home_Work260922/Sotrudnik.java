package Home_Work260922;

public class Sotrudnik {
    String fio;
    int child;
    Oplata typeOfPayment;
    int payment;
    int countOfWorkingDay;
    int countOfWorkingHours;
    double totalPayment;
    double totalPayment1;
    double totalPayment2;
    double totalPayment3;
    int offshore;
    int CountOfWorkingDayHours;

    public void getPayment() {
        if (countOfWorkingDay != 0) {
            this.totalPayment = payment * countOfWorkingDay;
        } else if (countOfWorkingHours != 0) {
            this.totalPayment = payment * countOfWorkingHours;
        } else {
            this.totalPayment = payment;
        }
        System.out.println();
    }

    public void getPaymentMinusNalog() {
        if (offshore != 0){
            this.totalPayment1 = this.totalPayment;
        }else if (child == 0) {
            this.totalPayment1 = typeOfPayment.calc(totalPayment);
        } else {
            this.totalPayment1 = typeOfPayment.calc1(totalPayment);
        }
        System.out.println();
    }

    public void getPaymentHours() {
        CountOfWorkingDayHours = 8 * countOfWorkingDay;
        if (CountOfWorkingDayHours >= 200 && offshore == 0){
            System.out.println("Премия!");
            this.totalPayment = this.totalPayment + 25000;
        }else if (countOfWorkingHours >= 200 && offshore == 0){
            System.out.println("Премия!");
            this.totalPayment = this.totalPayment + 25000;
        }else if (countOfWorkingHours != 0) {
            this.totalPayment2 = this.totalPayment1 / 2;
            this.totalPayment3 = totalPayment2 / 8;
        }
    }

    @Override
    public String toString() {
        return "Sotrudnik " + fio +
                ", child = " + child +
                ", typeOfPayment = " + typeOfPayment +
                ", payment = " + payment +
                ", countOfWorkingDay = " + countOfWorkingDay +
                ", countOfWorkingHours = " + countOfWorkingHours +
                ", totalPayment = " + totalPayment +
                ", totalPayment1 = " + totalPayment1 +
                ", totalPayment2 = " + totalPayment2 +
                " and " + totalPayment3 +
                ", offshore = " + offshore;
    }
}
