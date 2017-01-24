package week1.homeWork.klassMaterial;

/**
 * Created by Игорь on 24.01.2017.
 */
public class Flower {
    private String name;
    private int cost;
    private int lenghtStem;

    public Flower(String name, int cost, int longStem) {
        this.name = name;
        this.cost = cost;
        this.lenghtStem = longStem;
    }

    public int getCost() {
        return cost;
    }

    public int getLenghtStem() {
        return lenghtStem;
    }
}
