package org.example.HW01;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


    Category grocery = new Category("GROCERY", new ArrayList<>());
    Category fruits = new Category("FRUITS", new ArrayList<>());

    grocery.addProduct(new Product("pasta", 98.5, 4));
    grocery.addProduct(new Product("flour", 315.0, 2));
    grocery.addProduct(new Product("sugar", 567.3, 1));
    fruits.addProduct(new Product("banana", 115.4, 5));
    fruits.addProduct(new Product("apple", 99.0, 2));
    fruits.addProduct(new Product("orange", 214.6, 4));

    System.out.println(grocery.toString());
    System.out.println(fruits.toString());

    User Anton = new User("Anton","pass",new Basket());
    Anton.bayProduct(fruits,new Product("banana"));

    User user = new User("Anna","qwer",new Basket());
    user.bayProduct(grocery,new Product("pasta"));


    System.out.println(grocery.toString());
    System.out.println(fruits.toString());

        System.out.println(Anton.toString());
        System.out.println(user.toString());
    }



}
