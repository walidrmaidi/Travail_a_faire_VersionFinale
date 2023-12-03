package pk1;

import java.util.Objects;

public class Ingenieur implements Comparable<Ingenieur> {

    @Override
    public int compareTo(Ingenieur o) {
        // TODO Auto-generated method stub
        return 0;
    }

    private String nom;
    private String prenom;
    private String domaine;
    private int age;

    public Ingenieur(String nom, String prenom, String domaine, int age) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.domaine = domaine;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " nom=" + nom + ", prenom=" + prenom + ", domaine=" + domaine
                + ", age=" + age;
    }

    @Override
    protected Ingenieur clone() {
        try {
            return (Ingenieur) super.clone();
        } catch (CloneNotSupportedException b) {
            System.err.println("erreur de clonage");
            return null;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, domaine, nom, prenom);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ingenieur other = (Ingenieur) obj;
        return age == other.age && Objects.equals(domaine, other.domaine) && Objects.equals(nom, other.nom)
                && Objects.equals(prenom, other.prenom);
    }

}
