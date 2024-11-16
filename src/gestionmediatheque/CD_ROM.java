package gestionmediatheque;

import java.util.Vector;


public class CD_ROM extends Document {
    private double caution;
    private Vector<Auteur> auteurs;
    private Vector<ConsultationCDRom> conCdRom;

    public CD_ROM(long cote, String etat, String domicile, String titre, int quantité, double caution) {
        super(cote, etat, domicile, titre, quantité);
        this.caution = caution;
        this.auteurs = new Vector<>();
        this.conCdRom = new Vector<>();
    }

    /**
     *
     */
    

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

    public Vector<ConsultationCDRom> getConCdRom() {
        return conCdRom;
    }

    public void setConCdRom(Vector<ConsultationCDRom> conCdRom) {
        this.conCdRom = conCdRom;
    }

    
}
