package gestionmediatheque;
import java.util.*;


public class Livre extends Document{

    private double caution;
    private Vector<Auteur> auteurs;

    public Livre(long cote, String etat, String domicile, String titre, int quantité, double caution) {
        super(cote, etat, domicile, titre, quantité);
        this.caution = caution;
        this.auteurs = new Vector<Auteur>();
    }



    public double getCaution() {
        return caution;
    }



    public void setCaution(double caution) {
        this.caution = caution;
    }



    public Vector<Auteur> getAuteurs() {
        return auteurs;
    }



    public void setAuteurs(Vector<Auteur> auteurs) {
        this.auteurs = auteurs;
    }



    
    public void getinfo() {
    }
    
}
