package restaurant;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {

    //fields



    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean isNewItem;

    private ArrayList<MenuItem> items = new ArrayList<>();

//getters and setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public boolean isNewItem() {

        return isNewItem;
    }

    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }


    //constructor

    public MenuItem(String itemName, double price, String description, String category, boolean isNewItem) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNewItem = isNewItem;
    }

    @Override
    public String toString() {
        return '\n' + itemName  + '\n' +
                "price: " + price + '\n' +
                "description: " + description + '\n' +
                "category: " + category + '\n' +
                "isNewItem: " + isNewItem + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemName, menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }
}





