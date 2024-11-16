package gestionmediatheque;

public class Document {
    protected long cote;
    protected String etat;
    protected String domicile;
    protected String titre;
    protected int quantité;

    public Document(long cote, String etat, String domicile, String titre, int quantité) {
        this.cote = cote;
        this.etat = etat;
        this.domicile = domicile;
        this.titre = titre;
        this.quantité = quantité;
    }

    public long getCote() {
            return cote;
    }

    public void setCote(long cote) {
            this.cote = cote;
    }

    public String getEtat() {
            return etat;
    }

    public void setEtat(String etat) {
            this.etat = etat;
    }

    public String getDomicile() {
            return domicile;
    }

    public void setDomicile(String domicile) {
            this.domicile = domicile;
    }

    public String getTitre() {
            return titre;
    }

    public void setTitre(String titre) {
            this.titre = titre;
    }

    public int getQuantité() {
            return quantité;
    }

    public void setQuantité(int quantité) {
            this.quantité = quantité;
    }
    
}
