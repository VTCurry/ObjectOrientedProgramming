package com.novauc;

/**
 * Created by vtcurry on 2/14/17.
 */
public class PetStuff extends InventoryItem {

    public PetStuff(String name, int quantity) {

        super (name, quantity);
        this.category = "Pet Stuff";
    }
}