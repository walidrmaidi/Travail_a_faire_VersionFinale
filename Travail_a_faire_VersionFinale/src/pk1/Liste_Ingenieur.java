package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Liste_Ingenieur {

    private List<Ingenieur> liste;

    public Liste_Ingenieur() {
        this.liste = new ArrayList<>();
    }

    public void alimenterListe(List<Ingenieur> newListe) {
        liste.addAll(newListe);
    }

    public void afficherListe() {
        for (Ingenieur ingenieur : liste) {
            System.out.println(ingenieur);
        }
    }

    public void parcourirListe() {
        Iterator<Ingenieur> iterator = liste.iterator();
        while (iterator.hasNext()) {
            Ingenieur ingenieur = iterator.next();
            
        }
    }

    public void insererElement(Ingenieur ingenieur) {
        liste.add(ingenieur);
    }

    public Ingenieur recupererElement(int index) {
        return liste.get(index);
    }

    public void supprimerElement(Ingenieur ingenieur) {
        liste.remove(ingenieur);
    }

    public void trierListe() {
        Collections.sort(liste);
    }

    public List<Ingenieur> copierListeDansTableau() {
        return new ArrayList<>(liste);
    }

    public void melangerListe() {
        Collections.shuffle(liste);
    }

    public void inverserListe() {
        Collections.reverse(liste);
    }

    public List<Ingenieur> extrairePartieListe(int debut, int fin) {
        return liste.subList(debut, fin);
    }

    public boolean comparerDeuxListes(List<Ingenieur> autreListe) {
        return liste.equals(autreListe);
    }

    public void echangerDeuxElements(int index1, int index2) {
        Collections.swap(liste, index1, index2);
    }

    public void viderListe() {
        liste.clear();
    }

    public boolean testerListeVide() {
        return liste.isEmpty();
    }
}
