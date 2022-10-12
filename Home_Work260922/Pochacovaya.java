package Home_Work260922;

public class Pochacovaya extends Oplata {

    public Pochacovaya() {
        super.nalog = 20;
        super.nalogChild = 5;
        super.paymentTapeName = "Почасовая";
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
