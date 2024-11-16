package gestionmediatheque;

public class Personne {
    protected static long id = 0;
    protected String nom, prenom, cin, adress, email, telephone, passwd;

    public Personne(long id, String nom, String prenom, String cin, String adress, String email, String telephone,
            String passwd) {
        id++;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adress = adress;
        this.email = email;
        this.telephone = telephone;
        this.passwd = passwd;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Personne.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
