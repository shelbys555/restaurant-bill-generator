package bill_generator_new;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import bill_generator_new.Item;

public class BillData {
    private ArrayList<Item> items; // List of items in the bill
    private String subtotal;
    private String gst;
    private String discount;
    private String grandTotal;
    private String paidAmount;
    private String balance;

    // Constructor
    public BillData(ArrayList<Item> items, String subtotal, String gst, String discount, String grandTotal, String paidAmount, String balance) {
        this.items = items;
        this.subtotal = subtotal;
        this.gst = gst;
        this.discount = discount;
        this.grandTotal = grandTotal;
        this.paidAmount = paidAmount;
        this.balance = balance;
    }

    // Getter methods
    public ArrayList<Item> getItems() {
        return items;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public String getGst() {
        return gst;
    }

    public String getDiscount() {
        return discount;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public String getBalance() {
        return balance;
    }
}
