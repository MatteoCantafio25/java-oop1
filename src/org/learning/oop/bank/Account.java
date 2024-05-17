package org.learning.oop.bank;

import java.util.Random;

public class Account {
    /*
    Creare la classe Conto caratterizzata da:
    - numero di conto
    - nome del proprietario
    - saldo
    Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
    - alla creazione di un nuovo conto il saldo sia 0€
    - Il codice conto sia accessibile solo in lettura, il proprietario sia accessibile in lettura e in scrittura e il saldo sia accessibile solo in lettura
    - siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: il saldo non può mai diventare negativo)
    - altri metodi per ritornare le informazioni del conto e il saldo formattato
    Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)
    Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro o uscire.
    Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto.
    Se l’operazione non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
    Il menu continua ad apparire fino a che l’utente sceglie di uscire.
     */

    // ATTRIBUTI
    private long accNumber;
    private String ownerName;
    private double balance;


    // COSTRUTTORI
    public Account (String ownerName){
        this.accNumber = getRandomNumber();
        this.ownerName =  ownerName;
        this.balance = 0;
    }


    // METODI
    public long getAccNumber() {
        return accNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double money){
        balance += money;
    }


    public void withdraw(double money){
       balance -= money;
    }


    public String getFormattedInfos() {
        return String.format("Owner: " + ownerName + "/" + " Account Number: "+ accNumber + "/" + " Balance: " + getBalance()) + "€";
    }

    public long getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
