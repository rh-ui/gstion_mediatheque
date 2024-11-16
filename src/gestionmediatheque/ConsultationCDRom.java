package gestionmediatheque;

import java.sql.Date;

public class ConsultationCDRom {
    private Date dateDebut, dateFin;
    private CD_ROM cdRom;
    private PosteInformatique posteInformatique;

    public ConsultationCDRom(Date dateDebut, Date dateFin, CD_ROM cdRom, PosteInformatique posteInformatique) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.cdRom = cdRom;
        this.posteInformatique = posteInformatique;
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

    public CD_ROM getCdRom() {
        return cdRom;
    }

    public void setCdRom(CD_ROM cdRom) {
        this.cdRom = cdRom;
    }

    public PosteInformatique getPosteInformatique() {
        return posteInformatique;
    }

    public void setPosteInformatique(PosteInformatique posteInformatique) {
        this.posteInformatique = posteInformatique;
    }

    public void utiliserPoste(PosteInformatique p, CD_ROM cd) {
    }

    public void libererPoste(PosteInformatique p) {
    }

}
