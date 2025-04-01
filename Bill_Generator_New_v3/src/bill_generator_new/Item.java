/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bill_generator_new;

/**
 *
 * @author hp
 */
public class Item {
    String name;
    int quantity;
    double rate;
    double total;

    // Constructor to initialize the item
    public Item(String name, int quantity, double rate) {
        this.name = name;
        this.quantity = quantity;
        this.rate = rate;
        this.total = quantity * rate;  // Calculate total as quantity * rate
    }

    // Getter for the name of the item
    public String getName() {
        return name;
    }

    // Getter for the quantity of the item
    public int getQuantity() {
        return quantity;
    }

    // Getter for the rate of the item
    public double getRate() {
        return rate;
    }

    // Getter for the total price of the item (quantity * rate)
    public double getTotal() {
        return total;
    }

  

}
