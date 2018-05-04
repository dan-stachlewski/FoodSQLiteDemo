package com.example.dnafv.foodsqlitedemo;

public class Food {

    //Define the variables and their scope
    private int food_id;
    private String name;
    private String price;
    private byte[] image;


    //Right-mouse click > generate > constructor > choose all variables:
    public Food(int food_id, String name, String price, byte[] image) {
        this.food_id = food_id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    //Right-mouse click > generate > getters & setters > choose all variables:
    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
