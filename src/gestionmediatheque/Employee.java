package gestionmediatheque;
import java.sql.*;


public class Employee extends Personne {

    private Mediatheque m;

    public Employee(long id, String nom, String prenom, String cin, String adress, String email, String telephone,
            String passwd, Mediatheque m) {
        super(id, nom, prenom, cin, adress, email, telephone, passwd);
        this.m = m;
    }

    public Mediatheque getM() {
        return m;
    }

    public void setM(Mediatheque m) {
        this.m = m;
    }

}
