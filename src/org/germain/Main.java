package org.germain;

import org.apache.commons.lang3.StringUtils;
import org.germain.Store.Prenom;

import java.text.DecimalFormat;
import java.util.Scanner;

import static org.germain.UI.Affichage.entrePrenom;
import static org.germain.UI.Affichage.menu;

public class Main {


    public static void main(String[] args) {
        Prenom prenom1 = new Prenom();
        Prenom prenom2 = new Prenom();
        Boolean encore = false;

        do {
            // On récupère les prénoms et on le lisse
            prenom1.setPrenom(entrePrenom("Entrez un premier prénom"));
            prenom2.setPrenom(entrePrenom("Entrez un second prénom"));


            prenom1.normalise();
            prenom1.calculNombre();
            prenom2.normalise();
            prenom2.calculNombre();
            prenom1.description();
            prenom2.description();


            prenom1.checkMatch(prenom2);

            encore = menu();
        } while (encore);

    }
}
