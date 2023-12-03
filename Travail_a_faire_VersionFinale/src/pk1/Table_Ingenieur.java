package pk1;

import java.util.Arrays;
import java.util.Collections;

public class Table_Ingenieur {
    private Ingenieur[] tableau;

    public Table_Ingenieur(Ingenieur[] tableau) {
        this.tableau = tableau;
    }

    public void trierTableau() {
        Arrays.sort(tableau);
    }

    public void ajouterElement(Ingenieur ingenieur) {
        tableau = Arrays.copyOf(tableau, tableau.length + 1);
        tableau[tableau.length - 1] = ingenieur;
    }

    public void supprimerElement(Ingenieur ingenieur) {
        int index = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].equals(ingenieur)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Ingenieur[] nouveauTableau = new Ingenieur[tableau.length - 1];
            System.arraycopy(tableau, 0, nouveauTableau, 0, index);
            System.arraycopy(tableau, index + 1, nouveauTableau, index, tableau.length - index - 1);
            tableau = nouveauTableau;
        }
    }

    public int compterElements() {
        return tableau.length;
    }

    public void inverserOrdreTableau() {
        Collections.reverse(Arrays.asList(tableau));
    }

    public void afficherTableau() {
        for (Ingenieur ingenieur : tableau) {
            System.out.println(ingenieur);
        }
    }

    public Ingenieur getElementPlusGrand() {
        if (tableau.length == 0) {
            return null;
        }

        Ingenieur plusAge = tableau[0];
        for (Ingenieur ingenieur : tableau) {
            if (ingenieur.getAge() > plusAge.getAge()) {
                plusAge = ingenieur;
            }
        }

        return plusAge;
    }

    public boolean testerEgaliteTableaux(Ingenieur[] autreTableau) {
        return Arrays.equals(tableau, autreTableau);
    }
}
