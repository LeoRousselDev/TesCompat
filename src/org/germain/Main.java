package org.germain;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    //chaine de référence
    public static String alpha = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String prenom1;
        int nb1 = 0;
        String prenom2;
        int nb2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un premier prénom");
        // On récupère le prénom et on le lisse
        prenom1 = sc.nextLine();
        prenom1 = prenom1.toLowerCase();
        prenom1 = StringUtils.stripAccents(prenom1);
        System.out.println("Entrez un second prénom");
        // On récupère le prénom et on le lisse

        prenom2 = sc.nextLine();
        prenom2 = prenom2.toLowerCase();
        prenom2 = StringUtils.stripAccents(prenom2);

//Calcul du nombre pour le premier prénom
        for (int i = 0; i < prenom1.length(); i++) {
            if (alpha.indexOf(prenom1.charAt(i)) >= 0) nb1 += (alpha.indexOf(prenom1.charAt(i)) + 1);
        }
        while (nb1 > 9) {
            nb1 = nb1 / 10 + nb1 % 10;
        }
//Calcul du nombre pour le second prénom

        for (int i = 0; i < prenom2.length(); i++) {
            if (alpha.indexOf(prenom2.charAt(i)) >= 0) nb2 += (alpha.indexOf(prenom2.charAt(i)) + 1);
        }

        while (nb2 > 9) {
            nb2 = nb2 / 10 + nb2 % 10;
        }

//Calcul et affichage de la correspondance
        double match = ((9.0 - Math.abs(nb1 - nb2)) / 9) * 100;
        DecimalFormat format = new DecimalFormat("#.00");

        System.out.println("coefficient de matching " + format.format(match) + "%");
    }
}
