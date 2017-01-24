package week1.homeWork.klassMaterial;

/**
 * Created by Игорь on 24.01.2017.
 */
public class RunFlower {
    public static void main(String[] args) {

        Flower flower1 = new Flower("Rose", 20, 50);
        Flower flower2 = new Flower("Rose", 15, 30);
        Flower flower3 = new Flower("Rose", 25, 65);
        Flower flower4 = new Flower("Tulip", 25, 65);
        Flower flower5 = new Flower("Tulip", 25, 65);
        Flower flower6 = new Flower("Tulip", 25, 65);
        Accessory accessory1 = new Accessory("ribbom", 10);
        Accessory accessory2 = new Accessory("pack", 15);
        Bouquet bouquet1 = new Bouquet(new Flower[]{flower1, flower2, flower3},
                                        new Accessory[]{accessory1, accessory2});
        Bouquet bouquet2 = new Bouquet(new Flower[]{flower3, flower4, flower5},
                                        new Accessory[]{accessory1, accessory2});


    }
}
