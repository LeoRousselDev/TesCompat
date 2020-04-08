package org.germain.UI;

import java.util.Scanner;

public class Affichage {
    public static String entrePrenom(String message){
        String prenom;
        System.out.println("===================");
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return prenom = sc.nextLine();
    }

    public static boolean menu(){
        Boolean encore = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Voulez vous continuer? (O/N)");
            String choix = sc.next().toUpperCase();
            switch (choix) {
                case "O":
                    encore = true;
                    break;
                case "N":
                    encore = false;
                    break;
                default:
                    System.out.println("entrée non valide");
                    break;
            }
        } while (encore == null);

        return encore;
    }
}
