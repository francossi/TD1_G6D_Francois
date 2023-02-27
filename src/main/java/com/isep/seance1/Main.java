package com.isep.seance1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        volume();

    }
    public static void maFonction(){
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la première valeur");
        int premièreValeur = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième valeur");
        float deuxièmeValeur = scanner.nextInt();
        float division = premièreValeur / deuxièmeValeur;
        System.out.println("La division de " + premièreValeur + " avec " + deuxièmeValeur +
                " est égale à " + division);
    }
    public static void volume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        float volume = hauteur*longueur*largeur;
        System.out.println("Le volume de ce pavé droit est égale à "+volume );
    }

}
