package gestionmediatheque;

import java.sql.Date;

public class Journal extends Document {
    private Date date;

    public Journal(long cote, String etat, String domicile, String titre,int quantité, Date date) {
        super(cote, etat, domicile, titre, quantité);
        this.date = date;
    }

    
    
    public void getinfo() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

}

