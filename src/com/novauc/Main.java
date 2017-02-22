package com.novauc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<InventoryItem> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("[1] Create New Item\n");
            System.out.println("[2] Remove Item\n");
            System.out.println("[3] Update Item's Quantity\n");

            String option = scanner.nextLine();


    int i = 1;
    for (InventoryItem item : items) {
        System.out.println(i + " - " + item.name + " [" + item.category + "], You have, " + item.quantity + ".\n");
        i++;
    }

    switch (option) {

        case "1":


            System.out.println("Enter the item name:\n");
            String name = scanner.nextLine();

            System.out.println("Enter the quantity of the item");
            String text = scanner.nextLine();
            Integer.valueOf(text);
            int quantity = Integer.parseInt(text);

            System.out.println("Which category does the item belong to?");
            String category = scanner.nextLine();
            InventoryItem.createItem(name, quantity, category);
            items.add(InventoryItem.createItem(name, quantity, category));


            System.out.println("You now have " + quantity + " " + name + " " + category + "(s).");

            break;

        case "2":


            System.out.println("\nEnter the number of the item you want to remove");

            int idx = Integer.valueOf(scanner.nextLine());
            InventoryItem item = items.get(idx - 1);
            items.remove(item);

            break;

        case "3":


            System.out.println("Enter the number of the item you want to update...\n");
            String itemString = scanner.nextLine();
            int itemUpdate = Integer.parseInt(itemString);
            InventoryItem quantityChange = items.get(itemUpdate - 1);


            System.out.println("Enter new quantity:");
            String itemQuantity = scanner.nextLine();


            int updateQuantity = Integer.parseInt(itemQuantity);

            quantityChange.setQuantity(updateQuantity);

            break;
            }
        }
    }
}
