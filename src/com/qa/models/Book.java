package com.qa.models;

import com.qa.models.Readable;

public class Book extends Readable {
    private int price;

    public Book(String name, String author, int price) {
        super(name, author);
        this.price = price;
    }

    @Override
    public String getName() {
        String name = super.getName();
        // do something, maybe validation
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
