package gestionmediatheque;

import java.util.Date;

public class Usager extends Personne {
    private boolean cotisation;
    private static int nbrEmprunts = 0;
    private final int MAX_EMPRUNTS = 5;

    public Usager(long id, String nom, String prenom, String cin, String adress, String email, String telephone,
            String passwd, boolean cotisation) {
        super(id, nom, prenom, cin, adress, email, telephone, passwd);
        this.cotisation = cotisation;
    }

    public void consulterDocumentParType(String type) {
    }

    public void consulterDocumentParAuteur(Auteur auteur) {
    }

    public void consulterDocumentParCote(Double cote) {
    }

    public void consulterDocumentParTitre(String titre) {
    }

    public void consulterDocumentParDate(Date date) {
    }

    public void reglerCotisation() {
    }

    public boolean isCotisation() {
        return cotisation;
    }

    public void setCotisation(boolean cotisation) {
        this.cotisation = cotisation;
    }

    public static int getNbrEmprunts() {
        return nbrEmprunts;
    }

    public static void setNbrEmprunts(int nbrEmprunts) {
        Usager.nbrEmprunts = nbrEmprunts;
    }

    public int getMAX_EMPRUNTS() {
        return MAX_EMPRUNTS;
    }

}
