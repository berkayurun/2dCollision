package first;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args){
        Location testLoc = new Location(0,0);

        Item item1 = new Item(3, new Velocity(4,0), 0, testLoc, 10 , 10);
        Item item2 = new Item(5, new Velocity(-6,0), 0, testLoc, 10 , 10);

        Collision col1 = new Collision(item1, item2);

        System.out.println("Velocity of first item: " + item1.getVelocity().getX() + "\n");
        System.out.println("Velocity of second item: " + item2.getVelocity().getX() + "\n");

        col1.collideX();

        System.out.println("New Velocity of first item: " + item1.getVelocity().getX() + "\n");
        System.out.println("New Velocity of second item: " + item2.getVelocity().getX() + "\n");
    }

}
