package org.example.HW01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Category {

    private String name;
    private ArrayList<Product> products;

    public Category(String name, ArrayList<Product> arrayList) {
        this.name = name;
        products = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(Collection<Product> items) {
        products.addAll(items);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void removeProducts(Collection<Product> items) {
        products.removeAll(items);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name: '" + name + '\'' +
                ", products: \n" + products +
                '}';
    }
}
