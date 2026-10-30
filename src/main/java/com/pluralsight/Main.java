package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Main {

    public static HashMap<String, Product> products;

    public static ArrayList<Product> cart;

    public static void main(String[] args) {

        loadProducts(products);
        showScreenHomeScreen();

    }

    public static void showScreenHomeScreen() {
        int selectedOption = 0;
        do { //as loop
            System.out.println("""
           \n+----------------------------------------+
           |               home screen              |
           +----------------------------------------+
           |  [1] display products                  |
           |  [2] display cart                      |
           |  [3] exit application                  |
           +----------------------------------------+""");

            selectedOption = Console.promptForInt("Pick an option (1-3): ");

            switch (selectedOption) {
                case 1 -> {
                    showScreenDisplayProducts();
                    break;
                }
                case 2 -> {
                    showScreenDisplayCart();
                    break;
                }
                case 3 -> {
                    break;
                }
                default -> System.out.println("\nInvalid command, please try again.");
            }
        } while (selectedOption != 3);

        System.out.println("Goodbye!");

    }

    public static void showScreenDisplayProducts() {

        //display all, or search

        //add to cart

        //go back to home screen
        int selectedOption = 0;

        do {
            System.out.println("""
           \n+----------------------------------------+
           |            display products            |
           +----------------------------------------+
           |  [1] display all products              |
           |  [2] search for products               |
           |  [3] add to cart                       |
           |  [4] back to home screen               |
           +----------------------------------------+""");

            selectedOption = Console.promptForInt("Pick an option (1-3): ");

            switch (selectedOption) {
                case 1 -> displayItems(products);
                case 2 -> searchForProducts();
                case 3 -> addToCart();
                case 4 -> {}
                default -> System.out.println("\nInvalid command, please try again.");
            }
        } while (selectedOption != 4);

    }

    private static void addToCart() {
        String selectedProduct = Console.promptForString("Enter SKU of the item you want to add to care:");
    }

    private static void searchForProducts() {
    }

    private static void displayAllProducts() {
        //display all
    }

    public static void showScreenDisplayCart() {

        //display items in cart

        //display total sales amount

        //check out - not functional yet

        //remove product

        //go back to home screen
    }

    public static void loadProducts(HashMap<String, Product> products) {

        // this loads from a file

        try {
            //create a bufReader and file reader
            BufferedReader bufReader = new BufferedReader(new FileReader("products.csv"));

            String line;

            bufReader.readLine(); //skip first line(header) in products.csv

            bufReader.close();
        }

        catch(IOException e){
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }

//    private static Product getProductFromFileLine(String line) {
//        //            SKU|Product Name|Price|Department
////            AV1051|JBL Bluetooth Speaker|89.95|Audio Video
//
////        try{
////            String[] parts; //split
////        }
////        catch(){
////
////        }
//    }

    public static void displayItems(HashMap<String, Product> products) {
        //display products in a nicely formatted table
         System.out.printf("%-9s | %49s | %-14s | %10.2fd", "sku", "name", "department", "price");

         for (Product value : products.values()) {
            System.out.print(value.toString());
        }
    }
}

