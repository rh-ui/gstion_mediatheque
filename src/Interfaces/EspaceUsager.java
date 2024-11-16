package Interfaces;

import com.sun.jdi.connect.spi.Connection;
import gestionmediatheque.Document;
import java.awt.Color;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gestionmediatheque.Operateur;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EspaceUsager extends javax.swing.JFrame {

    public EspaceUsager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accueilButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fiche_lecteur = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        logOut = new javax.swing.JToggleButton();
        subPannelDocDisp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TypeBtnSearch = new javax.swing.JButton();
        auteurBtnSearch = new javax.swing.JButton();
        titreBtnSearch = new javax.swing.JButton();
        dateBtnSearch = new javax.swing.JButton();
        coteBtnSearch = new javax.swing.JButton();
        typeContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        microfilmBtn = new javax.swing.JButton();
        cdRomBtn = new javax.swing.JButton();
        livreBtn = new javax.swing.JButton();
        journalBtn = new javax.swing.JButton();
        tableauLivres = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tableauMicrofilm = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tableauCD = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        tableauJournal = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        SearchByAuteur = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AuteurSaisie = new javax.swing.JTextField();
        auteurBtn = new javax.swing.JButton();
        tableausearchByAuteur = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        tableauTitre = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        searchByTitre = new javax.swing.JPanel();
        titreSaisie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        searchtitrebtn = new javax.swing.JButton();
        searchByDate = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchdate_btn = new javax.swing.JButton();
        dateSaisie = new com.toedter.calendar.JDateChooser();
        tableauDate = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        searchByCote = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        coteSaisie = new javax.swing.JTextField();
        searchcotebtn = new javax.swing.JButton();
        tableauCote = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        subPanelPret = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cdRomPret_btn = new javax.swing.JButton();
        livrePret_btn = new javax.swing.JButton();
        CD_TAB = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        Livre_TAB = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        subPanelProfil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        saisiePsswd = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        mdp_cr = new javax.swing.JTextField();
        mdp_nv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mdp_nv_r = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        savepasswd_btn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        profileView = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nameUsager = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        prenomUsager = new javax.swing.JTextField();
        cinUsager = new javax.swing.JTextField();
        teleUsager = new javax.swing.JTextField();
        emailUsager = new javax.swing.JTextField();
        adressUsager = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESPACE USAGER");
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(222, 222, 222));

        jPanel3.setBackground(new java.awt.Color(18, 27, 49));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(18, 27, 49));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 27, 49)));
        jLabel1.setFocusCycleRoot(true);
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 90));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 90));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 90));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 120));

        accueilButton.setBackground(new java.awt.Color(18, 27, 49));
        accueilButton.setFont(new java.awt.Font("Calibri", 1, 21)); // NOI18N
        accueilButton.setForeground(new java.awt.Color(255, 255, 255));
        accueilButton.setText("Documents disponnibles");
        accueilButton.setAlignmentX(0.5F);
        accueilButton.setBorderPainted(false);
        accueilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        accueilButton.setFocusPainted(false);
        accueilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accueilButtonActionPerformed(evt);
            }
        });
        jPanel3.add(accueilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 70));

        jButton3.setBackground(new java.awt.Color(18, 27, 49));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 21)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Vos prêts");
        jButton3.setAlignmentX(0.5F);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, 70));

        jButton1.setBackground(new java.awt.Color(18, 27, 49));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Profil");
        jButton1.setAlignmentX(0.5F);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 70));

        fiche_lecteur.setBackground(new java.awt.Color(18, 27, 49));
        fiche_lecteur.setFont(new java.awt.Font("Calibri", 1, 21)); // NOI18N
        fiche_lecteur.setForeground(new java.awt.Color(255, 255, 255));
        fiche_lecteur.setText("Votre fiche de lecteur");
        fiche_lecteur.setBorder(null);
        fiche_lecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiche_lecteurActionPerformed(evt);
            }
        });
        jPanel3.add(fiche_lecteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 60));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(71, 120, 197));

        logOut.setBackground(new java.awt.Color(123, 156, 225));
        logOut.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Déconnexion");
        logOut.setAlignmentX(0.5F);
        logOut.setBorder(null);
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.setFocusPainted(false);
        logOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(779, Short.MAX_VALUE)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));

        subPannelDocDisp.setBackground(new java.awt.Color(255, 255, 255));
        subPannelDocDisp.setVisible(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Consulter les documents par :");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        TypeBtnSearch.setBackground(new java.awt.Color(120, 168, 252));
        TypeBtnSearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        TypeBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        TypeBtnSearch.setText("Type");
        TypeBtnSearch.setAlignmentX(0.5F);
        TypeBtnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TypeBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TypeBtnSearch.setFocusPainted(false);
        TypeBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeBtnSearchActionPerformed(evt);
            }
        });

        auteurBtnSearch.setBackground(new java.awt.Color(120, 168, 252));
        auteurBtnSearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        auteurBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        auteurBtnSearch.setText("Auteurs");
        auteurBtnSearch.setAlignmentX(0.5F);
        auteurBtnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        auteurBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        auteurBtnSearch.setFocusPainted(false);
        auteurBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auteurBtnSearchActionPerformed(evt);
            }
        });

        titreBtnSearch.setBackground(new java.awt.Color(120, 168, 252));
        titreBtnSearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        titreBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        titreBtnSearch.setText("Titre");
        titreBtnSearch.setAlignmentX(0.5F);
        titreBtnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titreBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titreBtnSearch.setFocusPainted(false);
        titreBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreBtnSearchActionPerformed(evt);
            }
        });

        dateBtnSearch.setBackground(new java.awt.Color(120, 168, 252));
        dateBtnSearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        dateBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        dateBtnSearch.setText("Date");
        dateBtnSearch.setAlignmentX(0.5F);
        dateBtnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dateBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dateBtnSearch.setFocusPainted(false);
        dateBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBtnSearchActionPerformed(evt);
            }
        });

        coteBtnSearch.setBackground(new java.awt.Color(120, 168, 252));
        coteBtnSearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        coteBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        coteBtnSearch.setText("Côte");
        coteBtnSearch.setAlignmentX(0.5F);
        coteBtnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coteBtnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coteBtnSearch.setFocusPainted(false);
        coteBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coteBtnSearchActionPerformed(evt);
            }
        });

        typeContainer.setBackground(new java.awt.Color(249, 249, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Cliquez sur le type du document convenable : ");

        microfilmBtn.setBackground(new java.awt.Color(123, 156, 225));
        microfilmBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        microfilmBtn.setForeground(new java.awt.Color(255, 255, 255));
        microfilmBtn.setText("Microfilms");
        microfilmBtn.setAlignmentX(0.5F);
        microfilmBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        microfilmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        microfilmBtn.setFocusPainted(false);
        microfilmBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        microfilmBtn.setName(""); // NOI18N
        microfilmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                microfilmBtnActionPerformed(evt);
            }
        });

        cdRomBtn.setBackground(new java.awt.Color(123, 156, 225));
        cdRomBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cdRomBtn.setForeground(new java.awt.Color(255, 255, 255));
        cdRomBtn.setText("CD-ROM");
        cdRomBtn.setAlignmentX(0.5F);
        cdRomBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cdRomBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cdRomBtn.setFocusPainted(false);
        cdRomBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cdRomBtn.setName(""); // NOI18N
        cdRomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRomBtnActionPerformed(evt);
            }
        });

        livreBtn.setBackground(new java.awt.Color(123, 156, 225));
        livreBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        livreBtn.setForeground(new java.awt.Color(255, 255, 255));
        livreBtn.setText("Livres");
        livreBtn.setAlignmentX(0.5F);
        livreBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        livreBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        livreBtn.setFocusPainted(false);
        livreBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        livreBtn.setName(""); // NOI18N
        livreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livreBtnActionPerformed(evt);
            }
        });

        journalBtn.setBackground(new java.awt.Color(123, 156, 225));
        journalBtn.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        journalBtn.setForeground(new java.awt.Color(255, 255, 255));
        journalBtn.setText("Journal");
        journalBtn.setAlignmentX(0.5F);
        journalBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        journalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        journalBtn.setFocusPainted(false);
        journalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        journalBtn.setName(""); // NOI18N
        journalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typeContainerLayout = new javax.swing.GroupLayout(typeContainer);
        typeContainer.setLayout(typeContainerLayout);
        typeContainerLayout.setHorizontalGroup(
            typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typeContainerLayout.createSequentialGroup()
                .addGroup(typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(typeContainerLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typeContainerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cdRomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(journalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(101, 101, 101)))
                    .addGroup(typeContainerLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(livreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(microfilmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        typeContainerLayout.setVerticalGroup(
            typeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(typeContainerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(livreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(microfilmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cdRomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(journalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        tableauLivres.setBackground(new java.awt.Color(239, 239, 239));
        tableauLivres.setAutoscrolls(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cote", "Titre", "Etat", "Empruntable", "Caution", "Quantité"
            }
        ));
        tableauLivres.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cote", "Titre", "Etat", "Empruntable", "Date"
            }
        ));
        tableauMicrofilm.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Côte", "Titre", "Etat", "Empruntable", "Caution"
            }
        ));
        tableauCD.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Côte", "Titre", "Etat", "Empruntable", "Date"
            }
        ));
        tableauJournal.setViewportView(jTable4);

        SearchByAuteur.setBackground(new java.awt.Color(249, 249, 255));

        jLabel5.setBackground(new java.awt.Color(249, 249, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Entrez le nom de l'auteur :");
        jLabel5.setAlignmentX(0.5F);

        AuteurSaisie.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        AuteurSaisie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuteurSaisieActionPerformed(evt);
            }
        });

        auteurBtn.setBackground(new java.awt.Color(120, 168, 252));
        auteurBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        auteurBtn.setForeground(new java.awt.Color(255, 255, 255));
        auteurBtn.setText("rechercher");
        auteurBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        auteurBtn.setFocusPainted(false);
        auteurBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auteurBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchByAuteurLayout = new javax.swing.GroupLayout(SearchByAuteur);
        SearchByAuteur.setLayout(SearchByAuteurLayout);
        SearchByAuteurLayout.setHorizontalGroup(
            SearchByAuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchByAuteurLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchByAuteurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(auteurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(SearchByAuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchByAuteurLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(AuteurSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        SearchByAuteurLayout.setVerticalGroup(
            SearchByAuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchByAuteurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(auteurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(SearchByAuteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchByAuteurLayout.createSequentialGroup()
                    .addContainerGap(70, Short.MAX_VALUE)
                    .addComponent(AuteurSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Côte", "Type", "Titre", "Etat", "Domicile", "Quantité", "Caution"
            }
        ));
        tableausearchByAuteur.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cote", "Type", "Etat", "Empruntable", "Titre", "Caution"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableauTitre.setViewportView(jTable6);

        searchByTitre.setBackground(new java.awt.Color(249, 249, 255));

        titreSaisie.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        titreSaisie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titreSaisie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreSaisieActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel6.setText("Entrez le titre correspondant :");

        searchtitrebtn.setBackground(new java.awt.Color(120, 168, 252));
        searchtitrebtn.setFont(auteurBtn.getFont());
        searchtitrebtn.setForeground(new java.awt.Color(255, 255, 255));
        searchtitrebtn.setText("Rechercher");
        searchtitrebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        searchtitrebtn.setFocusPainted(false);
        searchtitrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtitrebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchByTitreLayout = new javax.swing.GroupLayout(searchByTitre);
        searchByTitre.setLayout(searchByTitreLayout);
        searchByTitreLayout.setHorizontalGroup(
            searchByTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchByTitreLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(searchByTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titreSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchByTitreLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(searchtitrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        searchByTitreLayout.setVerticalGroup(
            searchByTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchByTitreLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titreSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(searchtitrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        searchByDate.setBackground(new java.awt.Color(249, 249, 255));

        jLabel7.setBackground(new java.awt.Color(249, 249, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel7.setText("Entrez la date correspondante : ");

        searchdate_btn.setBackground(auteurBtn.getBackground());
        searchdate_btn.setFont(auteurBtn.getFont());
        searchdate_btn.setForeground(new java.awt.Color(255, 255, 255));
        searchdate_btn.setText("Rechercher");
        searchdate_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        searchdate_btn.setFocusPainted(false);
        searchdate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdate_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchByDateLayout = new javax.swing.GroupLayout(searchByDate);
        searchByDate.setLayout(searchByDateLayout);
        searchByDateLayout.setHorizontalGroup(
            searchByDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchByDateLayout.createSequentialGroup()
                .addGroup(searchByDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchByDateLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(searchByDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateSaisie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchByDateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchdate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        searchByDateLayout.setVerticalGroup(
            searchByDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchByDateLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(searchdate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cote", "Type", "Titre", "Etat", "Empruntable", "Caution"
            }
        ));
        tableauDate.setViewportView(jTable7);

        searchByCote.setBackground(new java.awt.Color(249, 249, 255));

        jLabel8.setBackground(new java.awt.Color(249, 249, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel8.setText("Entrez la cote correspondante :");

        coteSaisie.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        coteSaisie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        coteSaisie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coteSaisieActionPerformed(evt);
            }
        });

        searchcotebtn.setBackground(new java.awt.Color(120, 168, 252));
        searchcotebtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        searchcotebtn.setForeground(new java.awt.Color(255, 255, 255));
        searchcotebtn.setText("Rechercher");
        searchcotebtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        searchcotebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcotebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchByCoteLayout = new javax.swing.GroupLayout(searchByCote);
        searchByCote.setLayout(searchByCoteLayout);
        searchByCoteLayout.setHorizontalGroup(
            searchByCoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchByCoteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchcotebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(searchByCoteLayout.createSequentialGroup()
                .addGroup(searchByCoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchByCoteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(coteSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchByCoteLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        searchByCoteLayout.setVerticalGroup(
            searchByCoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchByCoteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coteSaisie, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchcotebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cote", "Type", "Etat", "Empruntable", "Titre", "Caution "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableauCote.setViewportView(jTable8);

        javax.swing.GroupLayout subPannelDocDispLayout = new javax.swing.GroupLayout(subPannelDocDisp);
        subPannelDocDisp.setLayout(subPannelDocDispLayout);
        subPannelDocDispLayout.setHorizontalGroup(
            subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPannelDocDispLayout.createSequentialGroup()
                .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPannelDocDispLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPannelDocDispLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypeBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(auteurBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titreBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coteBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(typeContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(tableauLivres, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(tableauMicrofilm, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(282, Short.MAX_VALUE)
                    .addComponent(tableauCD, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(tableauJournal, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(301, Short.MAX_VALUE)
                    .addComponent(SearchByAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(tableausearchByAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(280, Short.MAX_VALUE)
                    .addComponent(tableauTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(283, Short.MAX_VALUE)
                    .addComponent(searchByTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(269, Short.MAX_VALUE)
                    .addComponent(searchByDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(279, Short.MAX_VALUE)
                    .addComponent(tableauDate, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(280, Short.MAX_VALUE)
                    .addComponent(searchByCote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(278, Short.MAX_VALUE)
                    .addComponent(tableauCote, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        subPannelDocDispLayout.setVerticalGroup(
            subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPannelDocDispLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPannelDocDispLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TypeBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(auteurBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titreBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(coteBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(tableauLivres, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(60, Short.MAX_VALUE)
                    .addComponent(tableauMicrofilm, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addGap(0, 61, Short.MAX_VALUE)
                    .addComponent(tableauCD, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(tableauJournal, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(102, Short.MAX_VALUE)
                    .addComponent(SearchByAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(60, Short.MAX_VALUE)
                    .addComponent(tableausearchByAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(tableauTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(100, Short.MAX_VALUE)
                    .addComponent(searchByTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(96, Short.MAX_VALUE)
                    .addComponent(searchByDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(tableauDate, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(108, Short.MAX_VALUE)
                    .addComponent(searchByCote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
            .addGroup(subPannelDocDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPannelDocDispLayout.createSequentialGroup()
                    .addContainerGap(60, Short.MAX_VALUE)
                    .addComponent(tableauCote, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        typeContainer.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableausearchByAuteur.setVisible(false);
        tableauTitre.setVisible(false);
        searchByTitre.setVisible(false);
        searchByDate.setVisible(false);
        tableauDate.setVisible(false);
        searchByCote.setVisible(false);
        tableauCote.setVisible(false);

        getContentPane().add(subPannelDocDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 800, 520));
        subPannelDocDisp.setVisible(false);

        subPanelPret.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(249, 249, 255));

        cdRomPret_btn.setBackground(new java.awt.Color(120, 168, 252));
        cdRomPret_btn.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        cdRomPret_btn.setForeground(new java.awt.Color(255, 255, 255));
        cdRomPret_btn.setText("CD-ROM");
        cdRomPret_btn.setBorder(null);
        cdRomPret_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cdRomPret_btn.setFocusPainted(false);
        cdRomPret_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRomPret_btnActionPerformed(evt);
            }
        });

        livrePret_btn.setBackground(new java.awt.Color(120, 168, 252));
        livrePret_btn.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        livrePret_btn.setForeground(new java.awt.Color(255, 255, 255));
        livrePret_btn.setText("Livres");
        livrePret_btn.setBorder(null);
        livrePret_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        livrePret_btn.setFocusPainted(false);
        livrePret_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrePret_btnActionPerformed(evt);
            }
        });

        CD_TAB.setBackground(new java.awt.Color(204, 204, 255));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cote", "Type", "Titre", "Date d'emprunt", "Date de retour"
            }
        ));
        jScrollPane1.setViewportView(jTable9);

        javax.swing.GroupLayout CD_TABLayout = new javax.swing.GroupLayout(CD_TAB);
        CD_TAB.setLayout(CD_TABLayout);
        CD_TABLayout.setHorizontalGroup(
            CD_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(CD_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
        );
        CD_TABLayout.setVerticalGroup(
            CD_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
            .addGroup(CD_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
        );

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cote", "Type", "Titre", "Date d'emprunt", "Date de retour"
            }
        ));
        jScrollPane2.setViewportView(jTable10);

        javax.swing.GroupLayout Livre_TABLayout = new javax.swing.GroupLayout(Livre_TAB);
        Livre_TAB.setLayout(Livre_TABLayout);
        Livre_TABLayout.setHorizontalGroup(
            Livre_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(Livre_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
        );
        Livre_TABLayout.setVerticalGroup(
            Livre_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(Livre_TABLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cdRomPret_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(livrePret_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CD_TAB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Livre_TAB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(livrePret_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(cdRomPret_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(431, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(96, Short.MAX_VALUE)
                    .addComponent(CD_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(96, Short.MAX_VALUE)
                    .addComponent(Livre_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        CD_TAB.setVisible(false);
        Livre_TAB.setVisible(false);

        javax.swing.GroupLayout subPanelPretLayout = new javax.swing.GroupLayout(subPanelPret);
        subPanelPret.setLayout(subPanelPretLayout);
        subPanelPretLayout.setHorizontalGroup(
            subPanelPretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelPretLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        subPanelPretLayout.setVerticalGroup(
            subPanelPretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelPretLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(subPanelPret, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 800, 520));
        subPanelPret.setVisible(false);

        subPanelProfil.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(246, 246, 249));

        jButton8.setBackground(new java.awt.Color(120, 168, 252));
        jButton8.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Changer votre mot de passe");
        jButton8.setToolTipText("");
        jButton8.setAlignmentX(0.5F);
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(120, 168, 252));
        jButton7.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Voir votre profil");
        jButton7.setAlignmentX(0.5F);
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saisiePsswd.setBackground(new java.awt.Color(246, 246, 249));

        jLabel15.setBackground(new java.awt.Color(246, 246, 249));
        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel15.setText("Entrez votre mot de passe courant :");

        mdp_cr.setBorder(null);

        mdp_nv.setBorder(null);

        jLabel16.setBackground(new java.awt.Color(246, 246, 249));
        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 4, 4));
        jLabel16.setText("Entrez votre nouveau mot de passe :");

        mdp_nv_r.setBorder(null);

        jLabel17.setBackground(new java.awt.Color(246, 246, 249));
        jLabel17.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 4, 4));
        jLabel17.setText("Retapez le nouveau mot de passe :");

        savepasswd_btn.setBackground(new java.awt.Color(123, 156, 225));
        savepasswd_btn.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        savepasswd_btn.setForeground(new java.awt.Color(255, 255, 255));
        savepasswd_btn.setText("Sauvegarder");
        savepasswd_btn.setAlignmentX(0.5F);
        savepasswd_btn.setBorder(null);
        savepasswd_btn.setFocusPainted(false);
        savepasswd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savepasswd_btnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel18.setText("Entrez  votre cin :");

        cin.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        cin.setBorder(null);
        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saisiePsswdLayout = new javax.swing.GroupLayout(saisiePsswd);
        saisiePsswd.setLayout(saisiePsswdLayout);
        saisiePsswdLayout.setHorizontalGroup(
            saisiePsswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saisiePsswdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savepasswd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(saisiePsswdLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(saisiePsswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saisiePsswdLayout.createSequentialGroup()
                        .addGroup(saisiePsswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(saisiePsswdLayout.createSequentialGroup()
                        .addGroup(saisiePsswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cin)
                            .addComponent(mdp_cr)
                            .addGroup(saisiePsswdLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(mdp_nv)
                            .addComponent(mdp_nv_r))
                        .addContainerGap())))
        );
        saisiePsswdLayout.setVerticalGroup(
            saisiePsswdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saisiePsswdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdp_cr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdp_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mdp_nv_r, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savepasswd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        profileView.setBackground(new java.awt.Color(246, 246, 249));

        jLabel9.setBackground(new java.awt.Color(246, 246, 249));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 18, 18));
        jLabel9.setText("Nom");

        nameUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        nameUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameUsager.setBorder(null);
        nameUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nameUsager.setEnabled(false);

        jLabel10.setBackground(new java.awt.Color(246, 246, 249));
        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 18, 18));
        jLabel10.setText("Prénom");

        prenomUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        prenomUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prenomUsager.setBorder(null);
        prenomUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        prenomUsager.setEnabled(false);

        cinUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        cinUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cinUsager.setBorder(null);
        cinUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cinUsager.setEnabled(false);

        teleUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        teleUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teleUsager.setBorder(null);
        teleUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        teleUsager.setEnabled(false);

        emailUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        emailUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailUsager.setBorder(null);
        emailUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailUsager.setEnabled(false);

        adressUsager.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        adressUsager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adressUsager.setBorder(null);
        adressUsager.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        adressUsager.setEnabled(false);

        jLabel11.setBackground(new java.awt.Color(246, 246, 249));
        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 18, 18));
        jLabel11.setText("CIN");

        jLabel12.setBackground(new java.awt.Color(246, 246, 249));
        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(18, 18, 18));
        jLabel12.setText("Numéro de téléphone");

        jLabel13.setBackground(new java.awt.Color(246, 246, 249));
        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 18, 18));
        jLabel13.setText("E-mail");

        jLabel14.setBackground(new java.awt.Color(246, 246, 249));
        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(18, 18, 18));
        jLabel14.setText("Adresse");

        javax.swing.GroupLayout profileViewLayout = new javax.swing.GroupLayout(profileView);
        profileView.setLayout(profileViewLayout);
        profileViewLayout.setHorizontalGroup(
            profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileViewLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileViewLayout.createSequentialGroup()
                            .addComponent(prenomUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileViewLayout.createSequentialGroup()
                            .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)))
                    .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(adressUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teleUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        profileViewLayout.setVerticalGroup(
            profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailUsager, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout subPanelProfilLayout = new javax.swing.GroupLayout(subPanelProfil);
        subPanelProfil.setLayout(subPanelProfilLayout);
        subPanelProfilLayout.setHorizontalGroup(
            subPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelProfilLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(subPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanelProfilLayout.createSequentialGroup()
                        .addComponent(saisiePsswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profileView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        subPanelProfilLayout.setVerticalGroup(
            subPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelProfilLayout.createSequentialGroup()
                        .addComponent(profileView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(saisiePsswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        saisiePsswd.setVisible(false);
        profileView.setVisible(false);

        getContentPane().add(subPanelProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 800, 520));
        subPanelProfil.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accueilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accueilButtonActionPerformed

        subPannelDocDisp.setOpaque(true);
        subPannelDocDisp.setVisible(true);
        subPanelPret.setVisible(false);
        subPanelProfil.setVisible(false);

    }//GEN-LAST:event_accueilButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        subPannelDocDisp.setOpaque(false);
        subPannelDocDisp.setVisible(false);
        SearchByAuteur.setVisible(false);
        subPanelProfil.setVisible(false);

        subPanelPret.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchcotebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcotebtnActionPerformed
        // TODO add your handling code here:
        searchByCote.setVisible(false);

        tableauCote.setVisible(true);
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable8.getModel();
            tableModel.setRowCount(0);
            Long cote = Long.valueOf(coteSaisie.getText());
            ResultSet r = Operateur.consulterDocParCote(cote);

            while (r.next()) {
                Object[] rowData = {r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getDouble(8)};
                tableModel.addRow(rowData);
            }
            jTable8.setModel(tableModel);
            r.close();

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
    }//GEN-LAST:event_searchcotebtnActionPerformed

    private void cdRomPret_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRomPret_btnActionPerformed
        // TODO add your handling code here:
        Livre_TAB.setVisible(false);
        CD_TAB.setVisible(true);
        
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable9.getModel();
            tableModel.setRowCount(0);
            
            ResultSet rs = Operateur.displayUsrPrets("CD-ROM");

            while (rs.next()) {
                Object[] rowData = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5)};
                tableModel.addRow(rowData);
            }
            jTable9.setModel(tableModel);
            rs.close();

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cdRomPret_btnActionPerformed

    private void livrePret_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrePret_btnActionPerformed
        // TODO add your handling code here:
        CD_TAB.setVisible(false);

        Livre_TAB.setVisible(true);
        try {
            DefaultTableModel tableModel = (DefaultTableModel) jTable10.getModel();
            tableModel.setRowCount(0);
            
            ResultSet rs = Operateur.displayUsrPrets("Livre");

            while (rs.next()) {
                Object[] rowData = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5)};
                tableModel.addRow(rowData);
            }
            jTable10.setModel(tableModel);
            rs.close();

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur de connexion à la base de données est survenue. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite. Veuillez réessayer plus tard.",
                    "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_livrePret_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        subPanelPret.setVisible(false);
        subPannelDocDisp.setVisible(false);

        subPanelProfil.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
            // TODO add your handling code here:
            saisiePsswd.setVisible(false);
            profileView.setVisible(true);
            
        try {    
            ResultSet res = Operateur.displayUsrProfile();
            if (res.next()) {
                nameUsager.setText(res.getString(2));
                prenomUsager.setText(res.getString(3));
                cinUsager.setText(res.getString(4));
                teleUsager.setText(res.getString(8));
                emailUsager.setText(res.getString(7));
                adressUsager.setText(res.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EspaceUsager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        profileView.setVisible(false);

        saisiePsswd.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void savepasswd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savepasswd_btnActionPerformed
        // TODO add your handling code here:
        String cinUsg = cin.getText();
        String mdpCr = mdp_cr.getText();
        String nvMdp = mdp_nv.getText();
        String nvMdpconfirmer = mdp_nv_r.getText();
        Operateur.changerMotDePasseUsager(cinUsg, mdpCr, nvMdp, nvMdpconfirmer);
    }//GEN-LAST:event_savepasswd_btnActionPerformed

    private void coteBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coteBtnSearchActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        typeContainer.setVisible(false);
        tableauTitre.setVisible(false);
        searchByTitre.setVisible(false);
        tableauDate.setVisible(false);
        searchByDate.setVisible(false);
        tableauCote.setVisible(false);

        searchByCote.setVisible(true);
    }//GEN-LAST:event_coteBtnSearchActionPerformed

    private void dateBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBtnSearchActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        tableausearchByAuteur.setVisible(false);
        typeContainer.setVisible(false);
        tableauTitre.setVisible(false);
        searchByTitre.setVisible(false);
        tableauDate.setVisible(false);
        searchByCote.setVisible(false);
        tableauCote.setVisible(false);

        searchByDate.setVisible(true);
    }//GEN-LAST:event_dateBtnSearchActionPerformed

    private void titreBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreBtnSearchActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        tableausearchByAuteur.setVisible(false);
        typeContainer.setVisible(false);
        tableauTitre.setVisible(false);
        searchByDate.setVisible(false);
        tableauDate.setVisible(false);
        searchByCote.setVisible(false);
        tableauCote.setVisible(false);

        searchByTitre.setVisible(true);
    }//GEN-LAST:event_titreBtnSearchActionPerformed

    private void auteurBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auteurBtnSearchActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        tableausearchByAuteur.setVisible(false);
        typeContainer.setVisible(false);
        tableauTitre.setVisible(false);
        searchByTitre.setVisible(false);
        searchByDate.setVisible(false);
        tableauDate.setVisible(false);
        searchByCote.setVisible(false);
        tableauCote.setVisible(false);

        SearchByAuteur.setVisible(true);
    }//GEN-LAST:event_auteurBtnSearchActionPerformed

    private void TypeBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeBtnSearchActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);
        tableauTitre.setVisible(false);
        searchByTitre.setVisible(false);
        searchByDate.setVisible(false);
        tableauDate.setVisible(false);
        searchByCote.setVisible(false);
        tableauCote.setVisible(false);

        typeContainer.setVisible(true);
    }//GEN-LAST:event_TypeBtnSearchActionPerformed

    private void journalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journalBtnActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        typeContainer.setVisible(false);

        tableauJournal.setVisible(true);
        try {
            DefaultTableModel table = (DefaultTableModel) jTable4.getModel();
            table.setRowCount(0);
            ResultSet rs = Operateur.consulterDocParType("Journal");

            while (rs.next()) {
                Object[] ligneretourne = {rs.getInt(1), rs.getString(5), rs.getString(3), rs.getString(4), rs.getDate(6)};
                table.addRow(ligneretourne);
            }
            jTable4.setModel(table);
            rs.close();
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
    }//GEN-LAST:event_journalBtnActionPerformed

    private void livreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livreBtnActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        typeContainer.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);

        tableauLivres.setVisible(true);

        try {
            DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
            table.setRowCount(0);
            ResultSet rs = Operateur.consulterDocParType("Livre");

            while (rs.next()) {
                Object[] ligneretourne = {rs.getInt(1), rs.getString(5), rs.getString(3), rs.getString(4), rs.getDouble(8),rs.getLong(7)};
                table.addRow(ligneretourne);
            }
            jTable1.setModel(table);
            rs.close();

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
    }//GEN-LAST:event_livreBtnActionPerformed

    private void cdRomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRomBtnActionPerformed
        // TODO add your handling code here:
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        typeContainer.setVisible(false);

        tableauCD.setVisible(true);

        try {
            DefaultTableModel table = (DefaultTableModel) jTable3.getModel();
            table.setRowCount(0);
            ResultSet rs = Operateur.consulterDocParType("CD-ROM");

            while (rs.next()) {
                Object[] ligneretourne = {rs.getInt(1), rs.getString(5), rs.getString(3), rs.getString(4), rs.getDouble(8)};
                table.addRow(ligneretourne);
            }
            jTable3.setModel(table);
            rs.close();
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
    }//GEN-LAST:event_cdRomBtnActionPerformed

    private void microfilmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microfilmBtnActionPerformed
        // TODO add your handling code here
        tableausearchByAuteur.setVisible(false);
        SearchByAuteur.setVisible(false);
        typeContainer.setVisible(false);
        tableauLivres.setVisible(false);
        tableauCD.setVisible(false);

        tableauMicrofilm.setVisible(true);

        try {
            DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
            table.setRowCount(0);
            ResultSet rs = Operateur.consulterDocParType("Microfilm");

            while (rs.next()) {
                Object[] ligneretourne = {rs.getInt(1), rs.getString(5), rs.getString(3), rs.getString(4), rs.getDate(6)};
                table.addRow(ligneretourne);
            }
            jTable2.setModel(table);
            rs.close();

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
    }//GEN-LAST:event_microfilmBtnActionPerformed

    private void searchdate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdate_btnActionPerformed
        // TODO add your handling code here:
        searchByDate.setVisible(false);
        tableauDate.setVisible(true);
        try {
            DefaultTableModel table = (DefaultTableModel) jTable7.getModel();
            table.setRowCount(0);

            java.util.Date date = (java.util.Date) dateSaisie.getDate();
            java.sql.Date dateSaisie = new java.sql.Date(date.getTime());
            ResultSet rs = Operateur.consulterDocParDate(dateSaisie);

            while (rs.next()) {
                Object[] ligneretourne = {rs.getInt(1), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(4), rs.getLong(8)};
                table.addRow(ligneretourne);
            }
            jTable7.setModel(table);
            rs.close();
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
    }//GEN-LAST:event_searchdate_btnActionPerformed

    private void auteurBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auteurBtnActionPerformed
        // TODO add your handling code here:

        SearchByAuteur.setVisible(false);
        tableausearchByAuteur.setVisible(false);
        tableauLivres.setVisible(false);
        tableauMicrofilm.setVisible(false);
        tableauCD.setVisible(false);
        tableauJournal.setVisible(false);

        tableausearchByAuteur.setVisible(true);

        try {
            String auteur = AuteurSaisie.getText();
            DefaultTableModel tableModel = (DefaultTableModel) jTable5.getModel();
            tableModel.setRowCount(0);
            ResultSet rs = Operateur.consulterDocParAuteur(auteur);
            while(rs.next()){
                Object[] ligneretourne = {rs.getLong("cote"), rs.getString("type"), rs.getString("titre"), rs.getString("etat"), rs.getString("domicile"), rs.getLong("quantite"), rs.getDouble("caution")};
                tableModel.addRow(ligneretourne);            
            }
            jTable5.setModel(tableModel);
            rs.close();
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Une erreurio s'est produite. Veuillez réessayer plus tard.",
                "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_auteurBtnActionPerformed

    private void searchtitrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtitrebtnActionPerformed
        // TODO add your handling code here:
        searchByTitre.setVisible(false);
        tableauTitre.setVisible(true);

        try {
            String titre = titreSaisie.getText();
            DefaultTableModel tableModel = (DefaultTableModel) jTable6.getModel();
            tableModel.setRowCount(0);
            ResultSet r = Operateur.consulterDocParTitre(titre);

            while (r.next()) {
                Object[] rowData = {r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5), r.getDouble(8)};
                tableModel.addRow(rowData);
            }
            jTable6.setModel(tableModel);
            r.close();

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
    }//GEN-LAST:event_searchtitrebtnActionPerformed

    private void titreSaisieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreSaisieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreSaisieActionPerformed

    private void AuteurSaisieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuteurSaisieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuteurSaisieActionPerformed

    private void coteSaisieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coteSaisieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coteSaisieActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        Login espace = new Login();
        espace.setVisible(true);
        EspaceUsager.this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void fiche_lecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiche_lecteurActionPerformed
        // TODO add your handling code here:
        Operateur.afficherFicheUtilisateur();
    }//GEN-LAST:event_fiche_lecteurActionPerformed

    public static void init() {
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
//            System.out.println(e.toString());
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspaceUsager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuteurSaisie;
    private javax.swing.JPanel CD_TAB;
    private javax.swing.JPanel Livre_TAB;
    private javax.swing.JPanel SearchByAuteur;
    private javax.swing.JButton TypeBtnSearch;
    private javax.swing.JButton accueilButton;
    private javax.swing.JTextField adressUsager;
    private javax.swing.JButton auteurBtn;
    private javax.swing.JButton auteurBtnSearch;
    private javax.swing.JButton cdRomBtn;
    private javax.swing.JButton cdRomPret_btn;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField cinUsager;
    private javax.swing.JButton coteBtnSearch;
    private javax.swing.JTextField coteSaisie;
    private javax.swing.JButton dateBtnSearch;
    private com.toedter.calendar.JDateChooser dateSaisie;
    private javax.swing.JTextField emailUsager;
    private javax.swing.JButton fiche_lecteur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JButton journalBtn;
    private javax.swing.JButton livreBtn;
    private javax.swing.JButton livrePret_btn;
    private javax.swing.JToggleButton logOut;
    private javax.swing.JTextField mdp_cr;
    private javax.swing.JTextField mdp_nv;
    private javax.swing.JTextField mdp_nv_r;
    private javax.swing.JButton microfilmBtn;
    private javax.swing.JTextField nameUsager;
    private javax.swing.JTextField prenomUsager;
    private javax.swing.JPanel profileView;
    private javax.swing.JPanel saisiePsswd;
    private javax.swing.JButton savepasswd_btn;
    private javax.swing.JPanel searchByCote;
    private javax.swing.JPanel searchByDate;
    private javax.swing.JPanel searchByTitre;
    private javax.swing.JButton searchcotebtn;
    private javax.swing.JButton searchdate_btn;
    private javax.swing.JButton searchtitrebtn;
    private javax.swing.JPanel subPanelPret;
    private javax.swing.JPanel subPanelProfil;
    private javax.swing.JPanel subPannelDocDisp;
    private javax.swing.JScrollPane tableauCD;
    private javax.swing.JScrollPane tableauCote;
    private javax.swing.JScrollPane tableauDate;
    private javax.swing.JScrollPane tableauJournal;
    private javax.swing.JScrollPane tableauLivres;
    private javax.swing.JScrollPane tableauMicrofilm;
    private javax.swing.JScrollPane tableauTitre;
    private javax.swing.JScrollPane tableausearchByAuteur;
    private javax.swing.JTextField teleUsager;
    private javax.swing.JButton titreBtnSearch;
    private javax.swing.JTextField titreSaisie;
    private javax.swing.JPanel typeContainer;
    // End of variables declaration//GEN-END:variables
}
