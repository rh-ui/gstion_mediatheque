package gestionmediatheque;

import java.sql.Date;
import java.util.*;

public class EmprunterDocument {
    private static long idEmprunt = 0;
    private Date dateEmprunt;
    private Date dateRetour;
    private Usager usager;
    private Document doc;
    private List<Relance> relances;

    public EmprunterDocument(Date dateEmprunt, Date dateRetour, Usager usager, Document doc) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.usager = usager;
        this.doc = doc;
        relances = new ArrayList<>();
    }

    public Boolean estEnRetard() {
        return null;
    }

    public void retourner() {
    }

    public void validerEmprunte() {
    }

    public static long getIdEmprunt() {
        return idEmprunt;
    }

    public static void setIdEmprunt(long idEmprunt) {
        EmprunterDocument.idEmprunt = idEmprunt;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Usager getUsager() {
        return usager;
    }

    public void setUsager(Usager usager) {
        this.usager = usager;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public List<Relance> getRelances() {
        return relances;
    }

    public void setRelances(List<Relance> relances) {
        this.relances = relances;
    }
    
}
