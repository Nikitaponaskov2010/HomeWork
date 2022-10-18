package Home_Work011022.Task4;

public class Main {
    public static void main(String[] args) {
        InhabitantsOfSea KitSwimming = new Kit();
        KitSwimming.moveInWater();
        ((Kit)KitSwimming).KitSwimming();

        InhabitantsOfSea shark = new Shark();
        shark.moveOnLand();

    }
}
