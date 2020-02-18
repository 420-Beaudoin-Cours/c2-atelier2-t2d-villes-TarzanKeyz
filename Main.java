package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        int [] [] tab = {{76, 68, 81, 91, 65, 96, 107, 94, 98, 107, 96, 130},
                         {55, 51, 59, 65, 66, 67, 69, 82, 72, 61, 72, 67},
                         {71, 63,70, 72, 76, 90, 89, 96, 89, 80, 92, 92},
                         {87, 68, 84, 84, 78, 78, 95, 91, 73, 89, 86, 102}};

        System.out.println("\n---EXERCICE 1---\n");
        villes.afficherTab(tab);

        System.out.println("\n---EXERCICE 2---\n");
        System.out.println("Québec : " + villes.sommeUneLigne(tab, 0));
        System.out.println("Toronto : " + villes.sommeUneLigne(tab, 1));
        System.out.println("Joliette : " + villes.sommeUneLigne(tab, 2));
        System.out.println("Gaspé : " + villes.sommeUneLigne(tab, 3));

        System.out.println("\n---EXERCICE 3---\n");
        System.out.println("Moyenne des précipitations des villes pour Février : " + villes.moyenneUneCol(tab, 1));

        System.out.println("\n---EXERCICE 4---\n");
        System.out.println("Québec : " + df.format(villes.moyenneUneLigne(tab, 0)));
        System.out.println("Toronto : " + df.format(villes.moyenneUneLigne(tab, 1)));
        System.out.println("Joliette : " + df.format(villes.moyenneUneLigne(tab, 2)));
        System.out.println("Gaspé : " + df.format(villes.moyenneUneLigne(tab, 3)));

        System.out.println("\n---EXERCICE 5---\n");
        System.out.println("Québec : " + villes.maxLigne(tab, 0));
        System.out.println("Toronto : " + villes.maxLigne(tab, 1));
        System.out.println("Joliette : " + villes.maxLigne(tab, 2));
        System.out.println("Gaspé : " + villes.maxLigne(tab, 3));

        System.out.println("\n---EXERCICE 6---\n");
        System.out.println("Québec : " + villes.minLigne(tab, 0));
        System.out.println("Toronto : " + villes.minLigne(tab, 1));
        System.out.println("Joliette : " + villes.minLigne(tab, 2));
        System.out.println("Gaspé : " + villes.minLigne(tab, 3));
    }
}
