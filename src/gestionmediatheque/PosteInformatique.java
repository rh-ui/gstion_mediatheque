package gestionmediatheque;

public class PosteInformatique {
    
    private static int idPoste = 0;
    private Boolean etatPoste;

    public PosteInformatique(Boolean etatPoste) {
        this.etatPoste = etatPoste;
        idPoste++;
    }

    public static int getIdPoste() {
        return idPoste;
    }

    public static void setIdPoste(int idPoste) {
        PosteInformatique.idPoste = idPoste;
    }

    public Boolean getEtatPoste() {
        return etatPoste;
    }

    public void setEtatPoste(Boolean etatPoste) {
        this.etatPoste = etatPoste;
    }

}
