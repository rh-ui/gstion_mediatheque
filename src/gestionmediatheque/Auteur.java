package gestionmediatheque;

import java.util.ArrayList;
import java.util.List;

public class Auteur extends Personne {

    private List<CD_ROM> cdRoms;
    private List<Livre> livres;

    public Auteur(long id, String nom, String prenom, String cin, String adress, String email, String telephone,
            String passwd) {
        super(id, nom, prenom, cin, adress, email, telephone, passwd);
        cdRoms = new ArrayList<>();
        livres = new ArrayList<>();
    }

    public List<CD_ROM> getCdRoms() {
        return cdRoms;
    }

    public void setCdRoms(List<CD_ROM> cdRoms) {
        this.cdRoms = cdRoms;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    


}
