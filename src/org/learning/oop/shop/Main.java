package org.learning.oop.shop;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Palla", "bella palla", 25);
        System.out.println("Code: " + product.getCode());
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Vat: " + product.getVat());
        System.out.println("Taxed Price : " + product.getTaxedPrice());
        System.out.println("Full Name : " + product.getFullName());
    }
}
