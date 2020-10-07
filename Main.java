package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String prenom;
        String nomDeFamille;
        System.out.println("Comment tu t'appelles? Écris ton prénom puis ton nom de famille");
        prenom = scanner.nextLine();
        nomDeFamille = scanner.nextLine();
        System.out.println("Bonjour " + prenom + " " + nomDeFamille);
    }
}
