package com.msb.learn.amazonDesign;

import java.util.ArrayList;
import java.util.List;
//import java.util.concurrent.locks.

class Item{
    String name;
    Double price;
    Item(String name,Double price){
        this.name = name;
        this.price = price;
    }
}

public class Product {
    String productName = null;
    List<Item> items=null;
    void addItems(List<Item> items){
        this.items.addAll(items);
    }
    Integer getAvailableItems(){
        return items.size();
    }
    Item getItem(){
        Item item = null;
        if(!items.isEmpty()){
            item = items.remove(0);
        }
        return item;
    }
}

class BabySoapItem extends Item{
    BabySoapItem(String name, Double price){
        super(name,price);
    }
}
class BabySoap extends Product{
    BabySoap(){
        this.productName = "BabySoap";
    }
}
class ItemFactory{
    static List<Item> getItems(String itemName,Double price, int quantity){
        ArrayList<Item> items = new ArrayList<>();
        switch (itemName){
            case Constants.BABY_SOAP_ITEM:
                for(int i=0;i<quantity;i++){
                    items.add(new BabySoapItem(itemName,price));
                }
                break;
        }
        return items;
    }
}
final class Constants{
static final String BABY_SOAP_ITEM = "BabySoapItem";
}
class Runner{
    public static void main(String args[]){
        BabySoap babySoapProduct = new BabySoap();
        babySoapProduct.addItems(ItemFactory.getItems(Constants.BABY_SOAP_ITEM,20.5,100));
    }
}

enum ORDER_STATUS {
    WAITING_FOR_PAYMENT,
    PAYMENT_COMPLETE,
    SHIPPED,
    OUT_FOR_DELIVERY,
    COMPLETE,
    WAITING_FOR_SHIPPMENT,
    CANCELLED
}