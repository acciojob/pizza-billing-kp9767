package com.driver;

import java.net.StandardSocketOptions;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    public Pizza(Boolean isVeg){
        this.isVeg=isVeg;
        if(isVeg==true) this.price=300;
        else this.price=400;

    }

    public int getPrice(){
        return this.price;
    }
    boolean cheese=true;
    public void addExtraCheese(){
        // your code goes here
        if(cheese==true) {
            price = price + 80;
            System.out.println("Extra Cheese Added: 80");
        cheese=false;
        }
    }
    boolean topping=true;
    public void addExtraToppings(){
        // your code goes here
        if(cheese==false) {
            if (topping == true) {
                if (isVeg == true) {
                    System.out.println("Extra Toppings Added: 70");
                    price += 70;
                } else {
                    System.out.println("Extra Toppings Added: 120");
                    price += 120;
                }
                topping = false;
            }
        }
    }
    boolean take=true;
   public void addTakeaway(){
        // your code goes here
       if(take==true){
        price+=20;
        System.out.println("Paperbag Added: 20");
        take=false;
       }

    }

    public String getBill(){
        // your code goes here
         return ("Total price: "+price);
    }
}
