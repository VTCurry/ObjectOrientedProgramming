package com.novauc;

/**
 * Created by vtcurry on 2/14/17.
 */
public class GuyStuff extends InventoryItem {

    public GuyStuff(String name, int quantity) {

        super (name, quantity);
        this.category = "Guy Stuff";
    }
}