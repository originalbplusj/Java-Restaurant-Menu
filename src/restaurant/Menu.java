package restaurant;

import java.time.LocalDate;
import java.util.*;

public class Menu {


    private static ArrayList<MenuItem> restaurantMenu = new ArrayList<>();
     static LocalDate lastUpdatedDate;

    public Menu(ArrayList<MenuItem> restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }


    //methods

    public static LocalDate lastUpdated(){
        return lastUpdatedDate = LocalDate.now();

    }

    public static void addItem(MenuItem item){
        if(!restaurantMenu.contains(item)) {
            restaurantMenu.add((MenuItem) item);
            lastUpdated();
        }else{
            System.out.println("This item already exists");
        }
    }

    public static void removeItem(MenuItem item){
        restaurantMenu.remove((MenuItem) item);
        lastUpdated();
    }


    // Prints menu

    public static void printMenu() {
        System.out.println(restaurantMenu);
    }

    public static void printMenuItem(MenuItem selection){
        for (MenuItem item:
             restaurantMenu) {
            if(item.equals(selection)) {
                System.out.println(item);
            }
        }

    }


}
