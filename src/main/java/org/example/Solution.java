package org.example;

public class Solution {
    public static void main(String[] args) {
        Product p1 = new Product("тесто");
        Product p2 = new Product("Мука");
        Product p3 = new Product("Яйца");
        Product p4 = new Product("Вода");
        Product p5 = new Product("Пшеница");

        System.out.println(p1.addProduct(p2));
        System.out.println(p1.addProduct(p3));
        System.out.println(p1.addProduct(p4));
        System.out.println(p2.addProduct(p1));
        System.out.println(p2.addProduct(p5));
        System.out.println(p5.addProduct(p1));

    }
}