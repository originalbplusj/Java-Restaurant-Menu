package restaurant;


import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {



        MenuItem cheeseburger = new MenuItem("Cheeseburger", 8.00, "Grass-fed beef with choice of cheese",  "main course",false );
        MenuItem calamari = new MenuItem("Calamari", 9.00,"Served with special sauce", "appetizer", true);
        MenuItem applePie = new MenuItem("Apple Pie",  4.00,"Made with local apples", "dessert", false);

        Menu.addItem(cheeseburger);
        Menu.addItem(calamari);
        Menu.addItem(applePie);
        Menu.addItem(cheeseburger);



        Menu.printMenu();

        Menu.printMenuItem(applePie);

        Menu.removeItem(calamari);

        System.out.println("This menu was last updated on: " + Menu.lastUpdatedDate);

        Menu.printMenu();



    }
}
