package HW3;

public class Task9Ran {
    public static void main(String[] args) {
        int limitRandom = 10;
        int random;
        do {
            random = (int) (Math.random() * limitRandom);
        } while (random == 0);
        int summ = 0;
        int countOfNumbers = 0;
        System.out.println("Случайная последовательность:");
        while (random != 0) {
            System.out.print(random + " ");
            summ = random + summ;
            countOfNumbers++;
            random = (int) (Math.random() * limitRandom);

        }
        System.out.println();
        System.out.println("Cредняя величина " + (float) summ / countOfNumbers);
    }
    }

