package Home_Work260922;

        public abstract class Oplata {
        String paymentTapeName;
        int nalog;
        int nalogChild;

        public abstract double calc(double totalPayment);

        public abstract double calc1(double totalPayment);

        @Override
        public String toString() {
            return "Oplata: " + paymentTapeName +
                    ", nalog = " + nalog;
        }

}

