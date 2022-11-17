package Home_Work260922;

public class Sdelnaya extends Oplata{
    public Sdelnaya() {
        super.nalog = 15;
        super.nalogChild = 5;
        super.paymentTapeName = "Сделка";

    }

    @Override
    public double calc(double totalPayment) {
        double nalogTotal = totalPayment * nalog / 100;
        return totalPayment - nalogTotal;
    }

    @Override
    public double calc1(double totalPayment) {
        super.nalog = super.nalog + super.nalogChild;
        return totalPayment - (totalPayment * nalog / 100);
    }
}
