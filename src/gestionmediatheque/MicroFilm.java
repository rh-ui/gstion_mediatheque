package gestionmediatheque;

import java.sql.Date;
import java.util.Vector;


public class MicroFilm extends Document {
    private Date date;
    private Vector<ConsultationMicroFilm> conMicroFilm;

    public MicroFilm(long cote, String etat, String domicile, String titre, int quantité, Date date) {
        super(cote, etat, domicile, titre, quantité);
        this.date = date;
        this.conMicroFilm = new Vector<>();
    }

    
    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Vector<ConsultationMicroFilm> getConMicroFilm() {
        return conMicroFilm;
    }


    public void setConMicroFilm(Vector<ConsultationMicroFilm> conMicroFilm) {
        this.conMicroFilm = conMicroFilm;
    }


    public void getinfo() {
    }

}
