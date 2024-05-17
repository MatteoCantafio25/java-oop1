package org.learning.oop.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creo le variabili
        String userName;
        int userChoice;
        double depositCoiche;
        double withdrawCoiche;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Chiedo il nome dell'intestatario
        System.out.println("Enter owner's name");
        userName = scanner.nextLine();

        // Creo l'account
        Account account = new Account(userName);
        // Do un riepilogo delle informazioni iniziali
        System.out.println("Full infos: " + account.getFormattedInfos());

        // Chiedo cosa vuole fare
        System.out.println("Enter: 1 if you want to deposit, 2 if you want to withdraw, 3 if you want to exit");
        userChoice = Integer.parseInt(scanner.nextLine());

        // Finchè la scelta dell'utente è diversa da 0
        while (userChoice != 0){
            // Se la scelta è 1
            if (userChoice == 1){
                // Chiedo quanto vuole depositare
                System.out.println("How much you want to deposit?");
                depositCoiche = Double.parseDouble(scanner.nextLine());

                // Se la scelta del deposito è maggiore di 0
                if (depositCoiche > 0){
                    // Faccio il deposito
                    account.deposit(depositCoiche);

                    // Mostro il responso
                    System.out.println("Successfully deposited!");

                    // Mostro all'utente il bilancio aggiornato
                    System.out.println("Updated balance: " + account.getBalance());
                }else{
                    // Mostro il responso
                    System.out.println("You can deposit only 1 or more €");
                }

                // Richiedo che vuole fare
                System.out.println("Enter: 1 if you want to deposit, 2 if you want to withdraw, 3 if you want to exit");
                userChoice = Integer.parseInt(scanner.nextLine());

                // Se la scelta è 2
            } else if (userChoice == 2) {
                // Chiedo quanto vuole prelevare
                System.out.println("How much you want to withdraw?");
                withdrawCoiche = Double.parseDouble(scanner.nextLine());

                // Se la scelta di prelievo è maggiore di 0
                if (withdrawCoiche > 0){
                    // Se la scelta di prelievo è minore di quanto c'è sul bilancio
                    if (withdrawCoiche < account.getBalance()){
                        // Effettuo il prelievo
                        account.withdraw(withdrawCoiche);
                        // Do un responso
                        System.out.println("Successfully withdrawn!");

                        // Mostro all'utente il bilancio aggiornato
                        System.out.println("Updated balance: " + account.getBalance());
                    // Altrimenti
                    }else {
                        // Mando un messaggio di errore
                        System.out.println("Insufficent funds, try again");
                    }
                }else{
                    System.out.println("You have exceeded the limit of money you can withdraw");
                }

                // Richiedo che vuole fare
                System.out.println("Enter: 1 if you want to deposit, 2 if you want to withdraw, 3 if you want to exit");
                userChoice = Integer.parseInt(scanner.nextLine());

            // Altrimenti
            }else {
                // Faccio finire il ciclo
                userChoice = 0;

                // Saluto l'utente
                System.out.println("Have a good day " + account.getOwnerName());
            }
        }

        // Chiudo lo scanner
        scanner.close();
    }
}
