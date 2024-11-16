package gestionmediatheque;

import java.sql.Date;

public class ConsultationMicroFilm {
    private Date dateDebut;
    private Date dateFin;
    private MicroFilm microFilm;
    private Ecran ecran;

    public ConsultationMicroFilm(Date dateDebut, Date dateFin, MicroFilm microFilm, Ecran ecran) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.microFilm = microFilm;
        this.ecran = ecran;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public MicroFilm getMicroFilm() {
        return microFilm;
    }

    public void setMicroFilm(MicroFilm microFilm) {
        this.microFilm = microFilm;
    }

    public Ecran getEcran() {
        return ecran;
    }

    public void setEcran(Ecran ecran) {
        this.ecran = ecran;
    }

    public void utiliserEcran(Ecran e, MicroFilm m) {

    }

    public void libererEcran(Ecran e) {
        
    }

}
