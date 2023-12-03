package pk1;

import java.util.Objects;

public class IngenieurInformatique extends Ingenieur {
    private String specialite;

    public IngenieurInformatique(String nom, String prenom, String domaine, int age, String specialite) {
        super(nom, prenom, domaine, age);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "IngenieurInformatique [specialite=" + specialite + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(specialite);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        IngenieurInformatique other = (IngenieurInformatique) obj;
        return Objects.equals(specialite, other.specialite);
    }
}
