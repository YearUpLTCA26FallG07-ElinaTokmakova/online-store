package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static HashMap<String, Product> products;

    public static ArrayList<Product> cart;

    public static void main(String[] args) {
        products = loadProducts();

        displayItems(products);

    }

    public static HashMap<String, Product> loadProducts() {

        //this will load from a file

        HashMap<String, Product> result = new HashMap<>();
        result.put("ASDF", new Product("ASDF", "abc abc", 6.99, "misc"));
        result.put("Aabc", new Product("ASDF", "abc abc", 6.99, "misc"));
        result.put("cccr", new Product("ASDF", "abc abc", 6.99, "misc"));

        return result;
    }
    public static void showScreenHomeScreen() {

        //as loop

        //display products

        //display cart

        //exit
    }

    public static void showScreenDisplayProducts() {

        //display all, or search

        //add to cart

        //go back to home screen
    }

    public static void showScreenDisplayCart() {

        //display items in cart

        //display total sales amount

        //check out - not functional yet

        //remove product

        //go back to home screen
    }

    public static void displayItems(HashMap<String, Product> products) {

        //display products in a nicely formatted table
        System.out.println("output products here");
        System.out.println(products);

        //todo: fix this to be nice.
    }
}
