package gestionmediatheque;
import java.util.*;

public class Mediatheque {
    private String nom;
    private List<Document> docs;

    public Mediatheque(String nom) {
        this.nom = nom;
        docs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Document> getDocs() {
        return docs;
    }

    public void setDocs(List<Document> docs) {
        this.docs = docs;
    }
    

}
