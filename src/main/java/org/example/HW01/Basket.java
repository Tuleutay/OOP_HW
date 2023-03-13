package org.example.HW01;

import java.util.ArrayList;
import java.util.Collection;

public class Basket {



    private ArrayList<Product> basket = new ArrayList<>();

    public Basket(ArrayList<Product> arrayList) {

        basket = new ArrayList<>();
    }



    public Basket() {
    }




    public void addBasket(Product product) {
        basket.add(product);
    }

    @Override
    public String toString() {
        return "Basket{" + basket + '}';
    }


}


