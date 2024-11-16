package gestionmediatheque;

import java.sql.Date;

public class Relance {
    private String lettreRelance;
    private Date dateRelance;
    private EmprunterDocument empDoc;

    public Relance(String lettreRelance, Date dateRelance, EmprunterDocument eDocument) {
        this.lettreRelance = lettreRelance;
        this.dateRelance = dateRelance;
        this.empDoc = eDocument;
    }

    public String getLettreRelance() {
        return lettreRelance;
    }

    public void setLettreRelance(String lettreRelance) {
        this.lettreRelance = lettreRelance;
    }

    public Date getDateRelance() {
        return dateRelance;
    }

    public void setDateRelance(Date dateRelance) {
        this.dateRelance = dateRelance;
    }

    public EmprunterDocument getEmpDoc() {
        return empDoc;
    }

    public void setEmpDoc(EmprunterDocument empDoc) {
        this.empDoc = empDoc;
    }

    public void envoyerRelance() {
    }

}
