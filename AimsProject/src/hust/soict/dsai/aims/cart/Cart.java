package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private static final int MAX_NUMBERS_ORDER = 100;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    // Add a single DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDER) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full! Cannot add \"" + disc.getTitle() + "\".");
        }
    }

    // Add multiple DVDs using an array
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            this.addDigitalVideoDisc(disc);
        }
    }

    // Add multiple DVDs using varargs
    public void addDigitalVideoDisc1(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc disc : dvds) {
            this.addDigitalVideoDisc(disc);
        }
    }

    // Add two DVDs at once
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    // Remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" is not found in the cart.");
    }

    // Calculate the total cost of the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    // Print the cart contents with detailed formatting
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].toString());
            totalCost += itemOrdered[i].getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    // Search for DVDs by title
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for title: \"" + title + "\"");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                System.out.println(itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No disc with title \"" + title + "\" was found.");
        }
    }

    // Search for DVDs by ID
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id) {
                System.out.println("Found: " + itemOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No disc with ID: " + id);
        }
    }
}

