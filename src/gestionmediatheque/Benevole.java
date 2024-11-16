package gestionmediatheque;

import java.sql.Date;

public class Benevole extends Employee {

    public Date dateDebut;
    public Date dateFin;

    public Benevole(long id, String nom, String prenom, String cin, String adress, String email, String telephone,
            String passwd, Mediatheque m, Date dateDebut, Date dateFin) {
        super(id, nom, prenom, cin, adress, email, telephone, passwd, m);
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

}
