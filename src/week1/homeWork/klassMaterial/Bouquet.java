package week1.homeWork.klassMaterial;

/**
 * Created by Игорь on 24.01.2017.
 */
public class Bouquet {
    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public int costBouquet(){
        int cost = 0;
        for (int i = 0; i < flowers.length; i++) {
            cost += flowers[i].getCost();
        }
        for (Accessory j: accessories) {
            cost += j.getCost();
        }
        return cost;
    }

    public static Flower[] sortByStem(Flower[] arr) {


        for (int j = 0; j < arr.length; j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i].getLenghtStem() < arr[j].getLenghtStem()) {
                    Flower temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }


        }
        return arr;
    }
}
