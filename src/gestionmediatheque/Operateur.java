package gestionmediatheque;

import Interfaces.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.itextpdf.text.Font.FontStyle;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Chunk;
import java.awt.Desktop;
import com.itextpdf.text.DocumentException;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.activation.*;

public class Operateur {

    static Long userId = 0L;

    public static void getUsrId(long id) {
        userId = id;
    }

    public Operateur() {
    }

    //Consulter document par type :
    public static ResultSet consulterDocParType(String type) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM document where type = ?;");
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    /*
    //Consulter document par auteur :
    public static Vector<Document> consulterDocParAuteur(String nomAuteur) {
        int idAuteur, idDocument;
        Vector<Document> documents = new Vector<>();
        try {
            Connection conn = ConnectionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Auteur where nom = ?;");
            ps.setString(1, nomAuteur);
            ResultSet rs = ps.executeQuery();
            rs.next();
            idAuteur = rs.getInt(1);
            PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM documentAuteur where idAuteur = ?;");
            ps1.setInt(1, idAuteur);
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                idDocument = rs1.getInt(1);
                PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM document where cote = ?;");
                ps2.setInt(1, idDocument);
                ResultSet rs2 = ps2.executeQuery();
                rs2.next();
                documents.add(new Document(rs2.getInt(1), rs2.getString(3), rs2.getString(4), rs2.getString(5), rs2.getInt(8)));
            }
            return documents;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }*/
    public static ResultSet consulterDocParAuteur(String nomAuteur) {

        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT document.cote, document.type, document.etat, "
                    + "document.domicile, document.titre, document.caution, document.quantite from document, "
                    + "auteur, documentauteur where id = idAuteur and cote = idDocument and nom = ?;");
            ps.setString(1, nomAuteur);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    //Consulter document par date : 
    public static ResultSet consulterDocParDate(java.sql.Date date) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM document WHERE date = ? AND (type = ? OR type = ?);");
            ps.setDate(1, date);
            ps.setString(2, "Journal");
            ps.setString(3, "Microfilm");
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    // Consulter document par cote :
    public static ResultSet consulterDocParCote(long cote) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM document where cote = ?;");
            ps.setLong(1, cote);
            ResultSet resultQuery = ps.executeQuery();
            return resultQuery;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            // Display a more user-friendly error message
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet consulterDocParTitre(String titre) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM document where titre = ?;");
            ps.setString(1, titre);
            ResultSet resultQuery = ps.executeQuery();
            return resultQuery;
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            // Display a more user-friendly error message
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void updateMateriel(Long id_materiel, String type, javax.swing.JComboBox<String> select, javax.swing.JComboBox<String> select3, javax.swing.JComboBox<String> select2) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE matériel SET type = ? WHERE idMatériel = ?");
            ps.setLong(2, id_materiel);
            ps.setString(1, type);

            int updatedRows = ps.executeUpdate();
            if (updatedRows > 0) {
                actualiserListeMaterielDisponibles(select, "Ecran");
                actualiserListeMaterielDisponibles(select3, "Poste informatique");
                actualiserMateriel(select2);
                JOptionPane.showMessageDialog(null, "La mise à jour du matériel a été effectuée avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Aucun matériel n'est trouvé",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Boolean docEstDisponible(Long cote) {
        try {
            Connection conn = Utilitaire.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement("SELECT etat FROM document WHERE cote = ? AND etat = ? ; ");
            ps.setLong(1, cote);
            ps.setString(2, "disponible".toLowerCase());

            ResultSet res = ps.executeQuery();
            System.out.println(res);
            if (res.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static Boolean docEstDomicile(Long cote) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT etat FROM document WHERE cote = ? AND domicile = ? ; ");
            ps.setLong(1, cote);
            ps.setString(2, "oui");
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static int usagerNbreEmprunte(Long idUsager) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT nbrEmprunts FROM usager WHERE id = ? ;");
            ps.setLong(1, idUsager);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    public static Boolean usagerExiste(Long idUsager) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM usager WHERE id = ? ;");
            ps.setLong(1, idUsager);
            ResultSet res = ps.executeQuery();
            if (!res.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static Boolean verifierNbrePret(Long idUsager, Long cote) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM emprunterdocument WHERE idUsager = ? AND idDocument = ?;");
            ps.setLong(1, idUsager);
            ps.setLong(2, cote);
            ResultSet res = ps.executeQuery();
            return res.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static void emprunterDocument(Long cote, Long idUsager, java.sql.Date dateRetour, javax.swing.JComboBox<String> select) {
        if (verifierNbrePret(idUsager, cote)) {
            System.out.println(verifierNbrePret(idUsager, cote));
            JOptionPane.showMessageDialog(null, "Ce document est déjà prêté !",
                    "Aucun résultat", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!usagerExiste(idUsager)) {
            JOptionPane.showMessageDialog(null, "Aucun utilisateur trouvé avec l'ID " + idUsager,
                    "Aucun résultat", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (usagerExiste(idUsager) && docEstDisponible(cote) && docEstDomicile(cote) && !verifierNbrePret(idUsager, cote)) {
            int nbreEmprunte = usagerNbreEmprunte(idUsager);
            if (nbreEmprunte < 5) {
                try {
                    Connection conn = Utilitaire.getConnection();
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO emprunterdocument (dateRetour, idDocument, idUsager) VALUES (?, ?, ?) ");
                    ps.setDate(1, dateRetour);
                    ps.setLong(2, cote);
                    ps.setLong(3, idUsager);
                    ps.executeUpdate();
                    ps.close();

                    // augmenter le nombre d'emprunte chez l'usager :
                    PreparedStatement ps1 = conn.prepareStatement("UPDATE usager SET nbrEmprunts = ? WHERE id = ? ;");
                    ps1.setInt(1, nbreEmprunte + 1);
                    ps1.setLong(2, idUsager);
                    ps1.executeUpdate();
                    ps1.close();

                    // decrementer la quantite du document :
                    Long qtte = getQuantiteDoc(cote);
                    if (qtte > 1) {
                        PreparedStatement ps2 = conn.prepareStatement("UPDATE document SET quantite = ? WHERE cote = ? ;");
                        ps2.setLong(1, qtte - 1);
                        ps2.setLong(2, cote);
                        ps2.executeUpdate();
                    } else if (qtte == 1) {
                        PreparedStatement ps2 = conn.prepareStatement("UPDATE document SET etat = ?, quantite = quantite-1 WHERE cote = ? ;");
                        ps2.setString(1, "non disponible");
                        ps2.setLong(2, cote);
                        ps2.executeUpdate();
                    }

                    PreparedStatement ps4 = conn.prepareStatement("UPDATE usager SET cotisation = 1 WHERE id = ?");
                    ps4.setLong(1, idUsager);
                    ps4.executeUpdate();
                    ps4.close();

                    PreparedStatement ps3 = conn.prepareStatement("SELECT nom, prenom FROM usager WHERE id = ?;");
                    ps3.setLong(1, idUsager);
                    ResultSet r = ps3.executeQuery();
                    if (r.next()) {
                        String nom = r.getString(1);
                        String prenom = r.getString(2);
                        actualiserDocumentsEmpruntés(select);
                        JOptionPane.showMessageDialog(null, "Le document a été bien emprunté par " + nom + " " + prenom + ".",
                                "Succès", JOptionPane.INFORMATION_MESSAGE);
                    }
                    r.close();
                    ps3.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(),
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vous avez depassé le nombre d'empruntes autorisés !",
                        "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static Long getQuantiteDoc(Long cote) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT quantite FROM document WHERE cote = ?");
            ps.setLong(1, cote);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                return res.getLong(1);
            }
            res.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return 0L;
    }

    public static void achatDocument(Long cote, javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            Long qtte = getQuantiteDoc(cote);
            if (qtte > 1) {
                PreparedStatement ps = conn.prepareStatement("UPDATE document SET quantite = ? WHERE cote = ?");
                ps.setLong(2, cote);
                ps.setLong(1, (qtte - 1));
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "L'achat a été effectuer avec succès.", "Succès d'achat", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Aucun document trouvé.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                ps.close();
            } else if (qtte == 1){
                PreparedStatement ps = conn.prepareStatement("UPDATE document SET quantite = ? and etat = ? WHERE cote = ?");
                ps.setLong(3, cote);
                ps.setLong(1, (qtte - 1));
                ps.setString(2, "Non disponible");
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "L'achat a été effectuer avec succès.", "Succès d'achat", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Aucun document trouvé.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                ps.close();                
            }
            if (qtte == 0) {
                PreparedStatement ps = conn.prepareStatement("UPDATE document SET etat = ? WHERE cote = ?");
                ps.setLong(2, cote);
                ps.setString(1, "non diponible");
                if (ps.executeUpdate() > 0) {
                    actualiserDocumentsNonAchetés(select);
                    JOptionPane.showMessageDialog(null, "L'achat a été effectuer avec succès.", "Succès d'achat", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Aucun document trouvé.",
                            "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ResultSet displayPrets() {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT U.nom, U.prenom, U.cin, U.téléphone, D.type, D.titre, ED.dateRetour FROM document D, usager U, emprunterdocument ED WHERE D.cote = ED.idDocument AND U.id = ED.idUsager;");
            ResultSet res = ps.executeQuery();
            return res;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet displayPretsEnRetards() {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT u.nom, u.prenom, u.cin, u.téléphone, d.type, d.titre, ed.dateRetour FROM emprunterdocument ed INNER JOIN usager u ON u.id = ed.idUsager INNER JOIN document d ON d.cote = ed.idDocument WHERE ed.dateRetour < CURDATE();");
            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet displayUsers() {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM usager");
            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet displayDocuments() {
        try {
            Connection conn = Utilitaire.getConnection();
            //Tester si le document est un Livre ou CD-ROM pour afficher l'auteur sinon afficher des tirets
            PreparedStatement ps = conn.prepareStatement("SELECT d.cote, d.titre, d.type, d.date, IF(d.type IN ('Livre', 'CD-ROM'), CONCAT(a.nom, ' ', a.prenom), '---') AS auteur, d.etat, d.domicile, d.caution, d.quantite FROM document d LEFT JOIN documentauteur da ON d.cote = da.idDocument LEFT JOIN auteur a ON a.id = da.idAuteur;");

            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet displayEmployeeProfile() {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee WHERE id = ?");
            ps.setLong(1, userId);
            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static ResultSet displayUsrProfile() {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM usager WHERE id = ?");
            ps.setLong(1, userId);
            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void addDocument(String typeDocument, String empruntableSelection, String titreDocument, java.sql.Date dateDocument, int quantiteDocument, double cautionDocument, javax.swing.JComboBox<String> select,
            javax.swing.JComboBox<String> select2, javax.swing.JComboBox<String> select3) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO document (type, etat, domicile, titre, date, quantite, caution) VALUES (?, ?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, typeDocument);
            if (quantiteDocument == 0) {
                preparedStatement.setString(2, "non Disponible");
            } else {
                preparedStatement.setString(2, "Disponible");
            }
            preparedStatement.setString(3, empruntableSelection);
            preparedStatement.setString(4, titreDocument);
            preparedStatement.setDate(5, dateDocument);
            preparedStatement.setInt(6, quantiteDocument);
            preparedStatement.setDouble(7, cautionDocument);

            if (preparedStatement.executeUpdate() > 0) {
                actualiserDocumentsNonAchetés(select);
                actualiserListeDocumentDomicile(select2);
                actualiserListeDocument(select3);
                JOptionPane.showMessageDialog(null, "Le document est ajouter avec succes .",
                        "succes d'ajout", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void modifierDocument(long idDocument, String empruntableSelection, String titreDocument, java.sql.Date dateDocument, int quantiteDocument, double cautionDocument, String etat, 
            javax.swing.JComboBox<String> select, javax.swing.JComboBox<String> select2, javax.swing.JComboBox<String> select3, javax.swing.JComboBox<String> select4) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE document SET domicile = ?, titre = ?, date = ?, quantite = ?, caution = ?, etat = ? WHERE cote = ?");

            preparedStatement.setString(1, empruntableSelection);
            preparedStatement.setString(2, titreDocument);
            preparedStatement.setDate(3, dateDocument);
            preparedStatement.setInt(4, quantiteDocument);
            preparedStatement.setDouble(5, cautionDocument);
            preparedStatement.setString(6, etat);
            preparedStatement.setLong(7, idDocument);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Le document a été modifié avec succès.", "Succès de modification", JOptionPane.INFORMATION_MESSAGE);
                actualiserDocumentsNonAchetés(select);
                actualiserListeDocumentDomicile(select2);
                actualiserListeDocument(select3);
                actualiserDocumentsEmpruntés(select4);
            } else {
                JOptionPane.showMessageDialog(null, "Aucun document trouvé avec l'ID spécifié.", "Erreur de modification", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification du document. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addUsager(String nomUsager, String prenomUsager, String cinUsager, String adresseUsager, String emailUsager, String telephoneUsager, javax.swing.JComboBox<String> select) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO usager (nom, prenom, cin, motdepasse, adresse, email, téléphone, cotisation, nbrEmprunts) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // Affecter les valeurs aux paramètres de la requête
            preparedStatement.setString(1, nomUsager);
            preparedStatement.setString(2, prenomUsager);
            preparedStatement.setString(3, cinUsager);
            preparedStatement.setString(4, cinUsager);
            preparedStatement.setString(5, adresseUsager);
            preparedStatement.setString(6, emailUsager);
            preparedStatement.setString(7, telephoneUsager);
            preparedStatement.setInt(8, 0);
            preparedStatement.setInt(9, 0);

            if (preparedStatement.executeUpdate() > 0) {
                actualiserListeUsagers(select); 
                JOptionPane.showMessageDialog(null, "L'usager " + nomUsager + " " + prenomUsager + " a été ajouter avec succes .",
                        "succes d'ajout", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Fermer les ressources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void modifierUsager(int idUsager, String nomUsager, String prenomUsager, String CIN, String email, String tele, String adresse, javax.swing.JComboBox<String> select, javax.swing.JComboBox<String> select1) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            if (!("".equals(nomUsager)) && !("".equals(prenomUsager)) && !("".equals(CIN)) && !("".equals(email)) && !("".equals(tele)) && !("".equals(adresse))) {

                preparedStatement = connection.prepareStatement("UPDATE usager SET nom = ?, prenom = ?, cin = ? ,adresse = ?, email = ?, téléphone = ? WHERE id = ?");

                preparedStatement.setString(1, nomUsager);
                preparedStatement.setString(2, prenomUsager);
                preparedStatement.setString(3, CIN);
                preparedStatement.setString(4, adresse);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, tele);
                preparedStatement.setInt(7, idUsager);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "L'usager a été modifié avec succès.", "Succès de modification", JOptionPane.INFORMATION_MESSAGE);
                    actualiserListeUsagers(select); 
                     actualiserDocumentsEmpruntés(select1);
                }
                return;
            }

            if (!("".equals(nomUsager))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET nom = ? WHERE id = ?");
                ps.setString(1, nomUsager);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }

            if (!("".equals(prenomUsager))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET prenom = ? WHERE id = ?");
                ps.setString(1, prenomUsager);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }

            if (!("".equals(CIN))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET cin = ? WHERE id = ?");
                ps.setString(1, CIN);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }

            if (!("".equals(adresse))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET adresse = ? WHERE id = ?");
                ps.setString(1, adresse);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }

            if (!("".equals(email))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET email = ? WHERE id = ?");
                ps.setString(1, email);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }
            if (!("".equals(tele))) {
                PreparedStatement ps = connection.prepareStatement("UPDATE usager SET téléphone = ? WHERE id = ?");
                ps.setString(1, tele);
                ps.setInt(2, idUsager);
                ps.executeUpdate();
            }
            
            actualiserListeUsagers(select);
            JOptionPane.showMessageDialog(null, "L'usager a été modifié avec succès.", "Succès de modification", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification du document. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void retournerDocument(Long cote, long idUsager, javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();

            PreparedStatement ps1 = conn.prepareStatement("UPDATE document SET quantite = quantite+1  WHERE cote = ?");
            ps1.setLong(1, cote);
            int res1 = ps1.executeUpdate();
            ps1.close();

            PreparedStatement ps2 = conn.prepareStatement("UPDATE usager SET nbrEmprunts = nbrEmprunts-1  WHERE id = ?");
            ps2.setLong(1, idUsager);
            int res2 = ps2.executeUpdate();
            ps2.close();

            PreparedStatement ps3 = conn.prepareStatement("DELETE FROM emprunterdocument WHERE idDocument  = ? and idUsager = ?");
            ps3.setLong(1, cote);
            ps3.setLong(2, idUsager);
            int res3 = ps3.executeUpdate();
            ps2.close();

            if ((res1 > 0) && (res2 > 0) && (res3 > 0)) {
                actualiserDocumentsEmpruntés(select);
                JOptionPane.showMessageDialog(null, "Le document est bien retourner", "Succes", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Changer mot de passe de l'employe
    public static void changerMotDePasse(String cin, String mdpCr, String nvMdp, String nvMdpconfirmer) {
        try {
            Connection conn = Utilitaire.getConnection();
            // Vérifier si le mot de passe actuel est correct
            PreparedStatement ps = conn.prepareStatement("SELECT motdepasse FROM employee WHERE cin = ? AND motdepasse = ?");
            ps.setString(1, cin);
            ps.setString(2, mdpCr);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Vérifier si les deux saisies de nouveau mot de passe correspondent
                if (nvMdp.equals(nvMdpconfirmer)) {
                    // Mettre à jour le mot de passe
                    PreparedStatement psUpdate = conn.prepareStatement("UPDATE employee SET motdepasse = ? WHERE cin = ?");
                    psUpdate.setString(1, nvMdp);
                    psUpdate.setString(2, cin);
                    int rowsAffected = psUpdate.executeUpdate();
                    psUpdate.close();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Le mot de passe a été changé avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Échec du changement de mot de passe. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Les deux saisies de nouveau mot de passe ne correspondent pas. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mot de passe actuel ou CIN incorrect. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification du mot de passe. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Changer mot de passe de l'usager
    public static void changerMotDePasseUsager(String cin, String mdpCr, String nvMdp, String nvMdpconfirmer) {
        try {
            Connection conn = Utilitaire.getConnection();
            // Vérifier si le mot de passe actuel est correct
            PreparedStatement ps = conn.prepareStatement("SELECT motdepasse FROM usager WHERE cin = ? AND motdepasse = ?");
            ps.setString(1, cin);
            ps.setString(2, mdpCr);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Vérifier si les deux saisies de nouveau mot de passe correspondent
                if (nvMdp.equals(nvMdpconfirmer)) {
                    // Mettre à jour le mot de passe
                    PreparedStatement psUpdate = conn.prepareStatement("UPDATE usager SET motdepasse = ? WHERE cin = ?");
                    psUpdate.setString(1, nvMdp);
                    psUpdate.setString(2, cin);
                    int rowsAffected = psUpdate.executeUpdate();
                    psUpdate.close();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Le mot de passe a été changé avec succès.", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Échec du changement de mot de passe. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Les deux saisies de nouveau mot de passe ne correspondent pas. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mot de passe actuel ou CIN incorrect. Veuillez réessayer.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification du mot de passe. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void addMateriel(String type, javax.swing.JComboBox<String> select, javax.swing.JComboBox<String> select2) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO matériel (disponible, type) VALUES (?, ?)");

            // Affecter les valeurs aux paramètres de la requête
            preparedStatement.setBoolean(1, true);
            preparedStatement.setString(2, type);

            if (preparedStatement.executeUpdate() > 0) {
                actualiserMateriel(select);
                actualiserListeMaterielDisponibles(select2, type);
                JOptionPane.showMessageDialog(null, "Le materiel a été ajouter avec succes .",
                        "succes d'ajout", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Fermer les ressources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteMateriel(int idMateriel, javax.swing.JComboBox<String> select) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Utilitaire.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM matériel WHERE idMatériel = ?");
            preparedStatement.setInt(1, idMateriel);

            if (preparedStatement.executeUpdate() > 0) {
                actualiserListeMatériels(select);
                JOptionPane.showMessageDialog(null, "Le materiel a été supprimer avec succes .",
                        "succes de suppression", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Fermer les ressources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean EstDisponibleMateriel(int idMateriel) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean disponible = false;
        try {
            conn = Utilitaire.getConnection();
            ps = conn.prepareStatement("SELECT disponible FROM matériel WHERE idMatériel = ?");
            ps.setInt(1, idMateriel);
            rs = ps.executeQuery();

            if (rs.next()) {
                disponible = rs.getBoolean(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
        }
        return disponible;
    }

    public static void actualiserListeMaterielDisponibles(javax.swing.JComboBox<String> select, String typeM) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM matériel WHERE type = ? and disponible = ?;");
            stmt.setString(1, typeM);
            stmt.setBoolean(2, true);
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String type = rs.getString(3);
                documentsMap.put(cote, type);
            }
            rs.close();
            stmt.close();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun matériel n'est disponible");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserListeMaterielNonDisponibles(javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM matériel WHERE disponible = ?;");
            stmt.setBoolean(1, false);
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String type = rs.getString(3);
                documentsMap.put(cote, type);
            }
            rs.close();
            stmt.close();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun matériel n'est disponible");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserMateriel(javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM matériel ;");
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String type = rs.getString(3);
                documentsMap.put(cote, type);
            }
            rs.close();
            stmt.close();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun matériel n'est disponible");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void actualiserListeUsagers(javax.swing.JComboBox<String> select) {
        try {
        Connection conn = Utilitaire.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usager;");
        ResultSet rs = stmt.executeQuery();

        Map<Long, String> documentsMap = new HashMap<>();
        while (rs.next()) {
            Long cote = rs.getLong(1);
            String nom = rs.getString(2);
            documentsMap.put(cote, nom);
        }
        rs.close();
        stmt.close();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
            String item = entry.getKey() + " - " + entry.getValue();
            comboBoxModel.addElement(item);
        }
        select.setModel(comboBoxModel);
        
        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserListeDocumentDisponibles(javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM document WHERE etat = ?;");
            stmt.setString(1, "disponible");
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String titre = rs.getString("titre");
                documentsMap.put(cote, titre);
            }
            rs.close();
            stmt.close();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Tous les documents ne sont pas disponibles !");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void actualiserListeDocumentDomicile(javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM document WHERE etat = ? and domicile = ?  ;");
            stmt.setString(1, "disponible");
            stmt.setString(2, "oui");
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String titre = rs.getString(5);
                documentsMap.put(cote, titre);
            }
            rs.close();
            stmt.close();
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun matériel n'est disponible");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }

            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserListeDocument(javax.swing.JComboBox<String> select) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM document ;");
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String titre = rs.getString(5);
                documentsMap.put(cote, titre);
            }
            rs.close();
            stmt.close();
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                String item = entry.getKey() + " - " + entry.getValue();
                comboBoxModel.addElement(item);
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserDocumentsEmpruntés(javax.swing.JComboBox<String> select) {

        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT d.cote, d.titre, u.id, u.nom, u.prenom FROM emprunterdocument as ed, document d, usager u "
                    + "where idDocument = cote and id = idUsager;");
            ResultSet rs = stmt.executeQuery();

            Map<String, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                String infoDocument = rs.getLong(1) + " - " + rs.getString(2);
                String infoUsager = rs.getLong(3) + " - " + rs.getString(4) + " " + rs.getString(5);
                documentsMap.put(infoDocument, infoUsager);
            }
            rs.close();
            stmt.close();
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun document n'est actuellement emprunté !");
            } else {
                for (Map.Entry<String, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " a été emprunté par " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public static void actualiserListeMatériels(javax.swing.JComboBox<String> select) {
        try {
        Connection conn = Utilitaire.getConnection();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM matériel;");
        ResultSet rs = stmt.executeQuery();

        Map<Long, String> documentsMap = new HashMap<>();
        while (rs.next()) {
            Long cote = rs.getLong(1);
            String type = rs.getString(3);
            documentsMap.put(cote, type);
        }
        rs.close();
        stmt.close();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
            String item = entry.getKey() + " - " + entry.getValue();
            comboBoxModel.addElement(item);
        }
        select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualiserDocumentsNonAchetés(javax.swing.JComboBox<String> select) {

        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM document WHERE etat = 'disponible' ;");
            ResultSet rs = stmt.executeQuery();

            Map<Long, String> documentsMap = new HashMap<>();
            while (rs.next()) {
                Long cote = rs.getLong(1);
                String titre = rs.getString(5);
                documentsMap.put(cote, titre);
            }
            rs.close();
            stmt.close();
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            if (documentsMap.isEmpty()) {
                comboBoxModel.addElement("Aucun document n'est actuellement disponible !");
            } else {
                for (Map.Entry<Long, String> entry : documentsMap.entrySet()) {
                    String item = entry.getKey() + " - " + entry.getValue();
                    comboBoxModel.addElement(item);
                }
            }
            select.setModel(comboBoxModel);

        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String getTypeMateriel(int idMateriel) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Utilitaire.getConnection();
            ps = conn.prepareStatement("SELECT * FROM matériel WHERE idMatériel = ?");
            ps.setInt(1, idMateriel);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                return res.getString(3);
            }
        } catch (SQLException e) {
            System.err.println("Erreur de base de données : " + e.getMessage());
            // Afficher un message d'erreur convivial pour l'utilisateur
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void utiliserMateriel(int idMateriel, Long cote, javax.swing.JComboBox<String> select,
            javax.swing.JComboBox<String> select2, int duree) {
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;

        if (EstDisponibleMateriel(idMateriel) == false) {
            JOptionPane.showMessageDialog(null, "Le matériel est actuellement indisponible.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (docEstDisponible(cote) == false) {
            JOptionPane.showMessageDialog(null, "Le document est actuellement indisponible.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (docEstDisponible(cote) && EstDisponibleMateriel(idMateriel)) {
            try {
                conn = Utilitaire.getConnection();

                ps = conn.prepareStatement("UPDATE matériel SET disponible = ? WHERE idMatériel = ?");
                ps.setBoolean(1, false);
                ps.setInt(2, idMateriel);

                ps2 = conn.prepareStatement("UPDATE document SET quantite = quantite-1 WHERE cote = ?");
                //ps2.setInt(1, res.getInt(1) - 1);
                ps2.setLong(1, cote);

                ps3 = conn.prepareStatement("Insert into consultationdocument (idMatériel, idDocument, durée) values "
                        + "(?,?,?);");
                ps3.setInt(1, idMateriel);
                ps3.setLong(2, cote);
                ps3.setInt(3, duree);

                if ((ps2.executeUpdate() > 0) && (ps.executeUpdate() > 0) && ((ps3.executeUpdate() > 0))) {
                    actualiserListeMaterielDisponibles(select, getTypeMateriel(idMateriel));
                    actualiserListeMaterielNonDisponibles(select2);
                    JOptionPane.showMessageDialog(null, "Le materiel a été utilisé avec succes .",
                            "succes de modification", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                        "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void libererMateriel(int idMateriel, javax.swing.JComboBox<String> select,
            javax.swing.JComboBox<String> select2, javax.swing.JComboBox<String> select3) {
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        PreparedStatement ps3 = null;
        PreparedStatement ps4 = null;

        try {
            conn = Utilitaire.getConnection();

            ps = conn.prepareStatement("UPDATE matériel SET disponible = ? WHERE idMatériel = ?");
            ps.setBoolean(1, true);
            ps.setInt(2, idMateriel);

            ps2 = conn.prepareStatement("SELECT * FROM consultationdocument WHERE idMatériel = ?");
            ps2.setInt(1, idMateriel);
            ResultSet rs = ps2.executeQuery();

            ps3 = conn.prepareStatement("UPDATE document SET quantite = quantite+1 WHERE cote = ?");
            if (rs.next()) {
                ps3.setLong(1, rs.getLong(2));
            }

            ps4 = conn.prepareStatement("DELETE FROM consultationdocument WHERE idMatériel = ?");
            ps4.setInt(1, idMateriel);

            if ((ps.executeUpdate() > 0) && (ps3.executeUpdate() > 0) && (ps4.executeUpdate() > 0)) {
                actualiserListeMaterielNonDisponibles(select);
                actualiserListeMaterielDisponibles(select2, getTypeMateriel(idMateriel));
                actualiserListeMaterielDisponibles(select3, getTypeMateriel(idMateriel));

                JOptionPane.showMessageDialog(null, "Le materiel a été libéré avec succes .",
                        "succes de modification", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void addAuteur(String nomAuteur, String prenomAuteur) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Utilitaire.getConnection();
            // vérifier si l'auteur existe dans la bdd
            String checkQuery = "SELECT COUNT(*) AS count FROM auteur WHERE nom = ? AND prenom = ?";
            preparedStatement = connection.prepareStatement(checkQuery);
            preparedStatement.setString(1, nomAuteur);
            preparedStatement.setString(2, prenomAuteur);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt("count");
            if (count > 0) {
                // L'auteur existe déjà
                JOptionPane.showMessageDialog(null, "Cet auteur existe déjà dans la base de données.", "Auteur existant", JOptionPane.WARNING_MESSAGE);
                return;
            }
            preparedStatement.close();
            //l'auteur n'existe pas 
            //l'insertion de l'auteur
            preparedStatement = connection.prepareStatement("INSERT INTO auteur (nom, prenom) VALUES (?, ?)");

            preparedStatement.setString(1, nomAuteur);
            preparedStatement.setString(2, prenomAuteur);

            if (preparedStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "L'auteur " + nomAuteur + " " + prenomAuteur + " a été ajouté avec succès.", "Succès d'ajout", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Fermer les ressources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addDocumentAuteur(String nomAuteur, String prenomAuteur) {
        Connection connection = null;
        PreparedStatement ps1 = null, ps2 = null, ps3 = null;
        int idDocument = 0;
        int idAuteur = 0;
        try {
            connection = Utilitaire.getConnection();
            // Récupérer l'ID du dernier document inséré
            ps1 = connection.prepareStatement("SELECT * FROM document ORDER BY cote DESC LIMIT 1;");
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                idDocument = rs.getInt("cote");
            }
            rs.close();
            // Récupérer l'ID de l'auteur dont le nom et prénom sont les paramètres
            ps2 = connection.prepareStatement("SELECT id FROM auteur WHERE nom = ? and prenom = ?;");
            ps2.setString(1, nomAuteur);
            ps2.setString(2, prenomAuteur);
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                idAuteur = rs2.getInt("id");
            }
            rs2.close();
            // Insérer les deux IDs dans la table documentauteur
            ps3 = connection.prepareStatement("INSERT INTO documentauteur(idDocument, idAuteur) VALUES(?, ?);");
            ps3.setInt(1, idDocument);
            ps3.setInt(2, idAuteur);
            if (ps3.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "L'insertion a été effectuée avec succès.",
                        "Succès d'ajout", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Fermer les ressources
            try {
                if (ps1 != null) {
                    ps1.close();
                }
                if (ps2 != null) {
                    ps2.close();
                }
                if (ps3 != null) {
                    ps3.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ResultSet displayUsrPrets(String type) {
        try {
            Connection conn = Utilitaire.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT cote, type, titre, dateEmprunt, dateRetour FROM document ,emprunterdocument WHERE cote = idDocument and idUsager = ? and type = ? ");
            ps.setLong(1, userId);
            ps.setString(2, type);
            return ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void afficherFicheUtilisateur() {
        File folder = new File("documents");
        if (!folder.exists()) {
            folder.mkdir();
        }
        String nom_fichier = "documents/Fiche_lecteur.pdf";
        // Déclaration des styles de police
        Font titreFont = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD, new BaseColor(120, 168, 252));
        Font sousTitreFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
        Font contenuFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.NORMAL, BaseColor.BLACK);

        Document document = new Document();

        try {
            Connection connection = Utilitaire.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usager WHERE id = ?");
            ps.setLong(1, userId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String idString = String.valueOf(id);
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String cin = rs.getString("cin");
                String telephone = rs.getString("téléphone");
                String email = rs.getString("email");
                String adresse = rs.getString("adresse");

                PdfWriter.getInstance(document, new FileOutputStream(nom_fichier));
                document.open();

                // Message de bienvenue
                Paragraph bienvenue = new Paragraph("Bienvenue dans notre médiathèque, " + nom + " " + prenom + " !", titreFont);
                document.add(new Paragraph(" "));
                document.add(new Paragraph(" "));
                bienvenue.setAlignment(Element.ALIGN_CENTER);
                document.add(bienvenue);

                // Informations sur l'usager
                document.add(Chunk.NEWLINE); // Ajout d'un espace
                addLine(document, "L'identifiant d'usager  : ", idString, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "Le nom d'usager         : ", nom, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "Le prénom d'usager      : ", prenom, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "La CIN d'usager         : ", cin, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "Le téléphone d'usager   : ", telephone, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "L'email d'usager        : ", email, contenuFont);
                document.add(new Paragraph(" "));
                addLine(document, "L'adresse d'usager       : ", adresse, contenuFont);
                document.add(new Paragraph(" "));

                document.close();

                // Demande d'ouverture du fichier
                int valid = JOptionPane.showOptionDialog(
                        null,
                        new Object[]{
                            "Voulez-vous ouvrir le fichier maintenant ?",
                            "___________________________________________",
                            "Cliquez sur \"Oui\" pour ouvrir ou sur \"Non\" pour annuler",},
                        "Ouverture du fichier",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        null,
                        "OK"
                );
                if (valid == JOptionPane.OK_OPTION) {
                    File fileToOpen = new File(nom_fichier);
                    Desktop.getDesktop().open(fileToOpen);
                }
            } else {
                System.out.println("Utilisateur non trouvé.");
            }
        } catch (IOException | SQLException | DocumentException ex) {
            ex.printStackTrace();
        }
    }

    // Méthode pour ajouter une ligne dans le document PDF
    private static void addLine(Document document, String key, String value, Font font) throws DocumentException {
        Paragraph line = new Paragraph();
        line.setFont(font);
        line.add(Chunk.TABBING);
        line.add(key);
        line.add(Chunk.TABBING);
        line.add(value);
        document.add(line);
    }

    public static void horsServiceDocument(long idDocument, javax.swing.JComboBox<String> select) {
        Connection cnn = null;
        PreparedStatement ps = null;

        try {

            cnn = Utilitaire.getConnection();
            ps = cnn.prepareStatement("Update document set etat = ? where cote = ? ;");
            ps.setString(1, "Hors service");
            ps.setLong(2, idDocument);

            if (ps.executeUpdate() > 0) {
                actualiserListeDocumentDisponibles(select);
                JOptionPane.showMessageDialog(null, "L'opération a été effectuée avec succés.",
                        "succes de modification", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Long getIdPret(Long cote, Long idUsager) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = Utilitaire.getConnection();
            ps = conn.prepareStatement("SELECT * FROM emprunterdocument WHERE idDocument = ? AND idUsager = ?");
            ps.setLong(1, cote);
            ps.setLong(2, idUsager);
            ResultSet res = ps.executeQuery();
            if (res.next()) {
                return res.getLong(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return 0L;
    }

    public static void envoyerRelance() {
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        Long idPret;
        // configuration du protocole smtp :
        String host = "smtp.gmail.com";
        String port = "587"; // Port SMTP pour Gmail
        String username = "oi.mediatheque.fst@gmail.com";
        String password = "nslf hjic vdyr eybe";

        // message à envoyer :
        String corps = "";
        String objet = "Lettre de relance";

        // Propriétés pour la session
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Création de la session avec authentification
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            conn = Utilitaire.getConnection();
            ps = conn.prepareStatement("SELECT u.email, u.id, d.cote, u.nom, u.prenom FROM emprunterdocument ed INNER JOIN usager u ON u.id = ed.idUsager INNER JOIN document d ON d.cote = ed.idDocument WHERE ed.dateRetour < CURDATE()");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                // Création du message
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("oi.mediatheque.fst@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(res.getString(1)));
                corps = "<p>Bonjour " + res.getString(4) + " " + res.getString(5) + ",</p> <p>On vous rappele que vous n'avez pas encore rendu vos prêts chez oi mediatheque</p> <p>cordialement.</p>";
                message.setSubject(objet);
                message.setContent(corps, "text/html; charset=utf-8");

                // Envoi du message :
                Transport.send(message);

                // inserer dans la table relance :
                idPret = getIdPret(res.getLong(3), res.getLong(2));
                ps2 = conn.prepareStatement("INSERT INTO relance (lettreRelance, idEmprunt ) VALUES (?,?)");
                ps2.setString(1, corps);
                ps2.setLong(2, idPret);
                ps2.executeUpdate();
//                System.out.println("Email sent successfully!");
            }

            JOptionPane.showMessageDialog(null, "Les lettres de relance sont envoyés avec succès.",
                    "Succès d'envoi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }
}
