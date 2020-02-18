package com.company;

import java.text.DecimalFormat;

public class villes {

    public static void afficherTab(int [][] tab){
        for (int i=0; i<tab.length;i++){
            for (int j=0; j<tab[i].length;j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sommeUneLigne(int[][] tab, int ligne){
        int sommes = 0;

        for (int i=0; i<tab[ligne].length;i++){
            sommes += tab[ligne][i];
        }
         return sommes;
    }

    public static double moyenneUneCol(int[][] tab, int col){
        double sommes = 0;
        double moyenne;

        for (int i=0; i<tab.length;i++){
            sommes += tab[i][col];
        }

        moyenne = sommes / tab.length;

        return moyenne;
    }

    public static double moyenneUneLigne(int [][] tab, int ligne){

        double sommes = sommeUneLigne(tab, ligne);
        double moyenne = sommes / tab[ligne].length;

        return moyenne;

    }

    public static int maxLigne(int [][] tab, int ligne){
        int max = tab[ligne][0];

        for (int i=0; i<tab[ligne].length;i++){
            if (tab[ligne][i] > max)
                max = tab[ligne][i];
        }
        return max;
    }

    public static int minLigne(int [][] tab, int ligne){
        int min = tab[ligne][0];

        for (int i=0; i<tab[ligne].length;i++){
            if (tab[ligne][i] < min)
                min = tab[ligne][i];
        }
        return min;
    }
}
