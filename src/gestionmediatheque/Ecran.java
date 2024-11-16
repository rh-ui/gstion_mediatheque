package gestionmediatheque;

public class Ecran {
    private static int idEcran = 0;
    private boolean etatEcran;

    public Ecran(Boolean etatEcran) {
        this.etatEcran = etatEcran;
        idEcran++;
    }

    public static int getIdEcran() {
        return idEcran;
    }

    public static void setIdEcran(int idEcran) {
        Ecran.idEcran = idEcran;
    }

    public boolean isEtatEcran() {
        return etatEcran;
    }

    public void setEtatEcran(boolean etatEcran) {
        this.etatEcran = etatEcran;
    }

    
}
