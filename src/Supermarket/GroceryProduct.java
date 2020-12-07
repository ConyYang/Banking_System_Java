package Supermarket;

import java.awt.*;
import java.util.ArrayList;

public class GroceryProduct {
    private String name;
    private double price;
    private double discount;

    public static void main (String[] args){
        ArrayList <GroceryProduct> cart = new ArrayList<GroceryProduct>();
        GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
        cart.add(toast);
        BeverageProduct milk = new BeverageProduct("Milk", 3.4, 20, SugarLevel.LIGHT);
        cart.add(milk);
        BeverageProduct latte = new BeverageProduct("Latte", 5.0, 2, SugarLevel.ZERO);

        double total_price = 0;
        System.out.println("Here are the products you have chosen: "+"\n");
        for (int i=0; i<cart.size(); i++){
            System.out.println("Good: " + cart.get(i).getName() + "\n"+
                   "Price: "+cart.get(i).getPrice()+"\n");
            total_price += cart.get(i).getActualPrice();
        }
        System.out.println("\n" + "---------------------------");
        System.out.println("The total price is: "+total_price);
    }

    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getActualPrice(){
        return (price - (discount*price)/100);
    }

    public String display(){
        return (
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Discount: "+ discount + "%"
                );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
