package org.germain.Store;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;

public class Prenom {
    private String prenom;
    private String prenomNorm;
    private int nombre;

    public Prenom() {
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void normalise(){
        prenomNorm = this.prenom.toLowerCase();
        prenomNorm = StringUtils.stripAccents(prenomNorm);

    }

    public void description(){
        System.out.println("======================");
        System.out.println("prenom " + prenom );
        System.out.println("prenomNorm " + prenomNorm);
        System.out.println("nombre " + nombre);

        System.out.println("======================");

    }

    public void calculNombre(){
          for (int i = 0; i < prenom.length(); i++) {
            if (Constantes.alphabet.indexOf(prenom.charAt(i)) >= 0) nombre += (Constantes.alphabet.indexOf(prenom.charAt(i)) + 1);
        }
        while (nombre > 9) {
            nombre = nombre / 10 + nombre % 10;
        }
    }

    public void checkMatch(Prenom prenom){
        double match = ((9.0 - Math.abs(prenom.nombre - this.nombre)) / 9) * 100;
        DecimalFormat format = new DecimalFormat("#.00");

        System.out.println("coefficient de matching " + format.format(match) + "%");
    }
}
