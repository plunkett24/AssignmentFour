package com.timbuchalka;

/**
 * Created by Jamie Plunkett on 10/27/2017.
 */
public class Order {


private Date dateReceived;
private double price;
private int orderID;

    public Order(Date dateReceived, double price, int orderID) {
        this.dateReceived = dateReceived;
        this.price = price;
        this.orderID = orderID;
    }

    public  getDateReceived(){
    return this.dateReceived;
}
public double calculatePrice(){
    return price;
}








}
