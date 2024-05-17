package org.learning.oop.shop;
import java.util.Random;

public class Product {

       /*
        Esercizio 1: Java Shop :shopping_trolley:
        Creare la classe Prodotto che gestisce i prodotti dello shop.
        Un prodotto è caratterizzato da:
        - codice (numero intero)
        - nome
        - descrizione
        - prezzo
        - iva
        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
        - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
        - il codice prodotto sia accessibile solo in lettura e deve essere restituito come Stringa con un padleft a 6 caratteri (es. codice 15->“000015")
        - gli altri attributi siano accessibili sia in lettura che in scrittura
        - il prodotto esponga un metodo per avere il prezzo base
        - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
        - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
        Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
        */

    Random random = new Random();

    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int vat;


    // COSTRUTTORI

    public Product ( String name, String description, double price){
        this.code = random.nextInt(20) + 1;
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = 22;
    }


    // METODI
    public String getCode() {
        return String.format("%06d", this.code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxedPrice(){
        double tax =  this.price * 0.22;
        return this.price + tax;
    }

    public int getVat(){
        return vat;
    }

    public void setVat(int vat){
        this.vat = vat;
    }

    public  String getFullName(){
        return getCode() + "-" + name;
    }
}
