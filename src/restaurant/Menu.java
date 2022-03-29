package restaurant;

import java.util.*;
import java.time.LocalDate;

public class Menu {


    private static ArrayList<MenuItem> restaurantMenu = new ArrayList<>();


    public static void main(String[] args) {

        LocalDate lastUpdatedDate = LocalDate.now();

        MenuItem cheeseburger = new MenuItem("cheeseburger", 8.00, "grass-fed beef with choice of cheese", "main course", false );
        MenuItem calamari = new MenuItem("calamari", 9.00, "served with special sauce", "appetizer", true);
        MenuItem applePie = new MenuItem("apple pie", 4.00, "made with local apples", "dessert", false);

        restaurantMenu.add(cheeseburger);
        restaurantMenu.add(calamari);
        restaurantMenu.add(applePie);


        printMenu(restaurantMenu);

    }

    // Prints menu

    private static void printMenu(ArrayList<MenuItem> restaurantMenu) {
        for(MenuItem items: restaurantMenu){
            System.out.println(items);
        }
    }


}
