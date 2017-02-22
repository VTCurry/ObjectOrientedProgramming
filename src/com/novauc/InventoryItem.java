package com.novauc;

/**
 * Created by vtcurry on 2/22/17.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;

    public InventoryItem(String name, int quantity) {

        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.quantity + this.name + this.category;
    }

    public static InventoryItem createItem(String name, int quantity, String category) {
        if (category.equalsIgnoreCase("Guy Stuff")) {
            return new GuyStuff(name, quantity);
        } else if (category.equalsIgnoreCase("Girl Stuff")) {
            return new GirlStuff(name, quantity);
        } else if (category.equalsIgnoreCase("Kids Stuff")) {
            return new KidsStuff(name, quantity);
        } else if (category.equalsIgnoreCase("Pet Stuff")) {
            return new PetStuff(name, quantity);
        } else if (category.equalsIgnoreCase("Car Stuff")) {
            return new CarStuff(name, quantity);
        }
        return createItem(name, quantity, category);
    }

}

