import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.awt.font.TextAttribute;
import java.io.File;
//File ersteller
import java.nio.file.*;
import java.time.*;
import java.io.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
// Romans Dinge

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.List;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 28.12.2021
 * @author 
 */

public class Programm extends JFrame {
  // Anfang Attribute
  //Einlogg Menue
  private JLabel lEinloggen = new JLabel();
  private JTextField tfNutzername = new JTextField();
  private JTextField tfPasswort = new JTextField();
  private JButton bEinloggen = new JButton();
  private JButton bRegistrieren = new JButton();
  
  //Registrierungs Menue
  private JTextField tfPassworterneuteingeben = new JTextField();
  private JButton bZurueckRegistrierung = new JButton();
  private JButton bDateiMenueZurueck = new JButton();
  private JTextField tfVorname = new JTextField();
  private JTextField tfNachname = new JTextField();
  private JTextField tfEMailAdresse = new JTextField();
  private JButton bRegistrierungBestaetigen = new JButton();
  
  //Eigene Dateien und Ordner
  private JLabel lEigeneDateienundOrdner = new JLabel();
  private JLabel lMenueOrdner = new JLabel();
  private JLabel lMenueDatei = new JLabel();
  private JComboBox<String> jEigeneDateienUndOrdner = new JComboBox<String>();
  private DefaultComboBoxModel<String> jEigeneDateienUndOrdnerModel = new DefaultComboBoxModel<String>();
  private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>();
  
  private JComboBox<String> jDateien = new JComboBox<String>();
  private DefaultComboBoxModel<String> jDateienModel = new DefaultComboBoxModel<String>();
  private DefaultComboBoxModel<String> jComboBox2Model = new DefaultComboBoxModel<String>();
  
  
  private JCheckBox checkboxComboDatei = new JCheckBox();
  private JCheckBox checkboxComboOrdner = new JCheckBox();
  
  private JButton bEingeladeneDateien = new JButton();
  //Datei funktionen
  private JButton bNew = new JButton();
  private JButton bOpen = new JButton();
  private JButton bUmbennen = new JButton();
  private JButton bDelete = new JButton();
  private JButton bInvite = new JButton();
  //private JButton bAuswaehlen1 = new JButton();
  
  //Filter Funktion
  private JLabel lEinladen = new JLabel();
  private JButton bEinladenbestaetigen = new JButton();
  private JButton bFilterbestaetigen = new JButton();
  private JComboBox<String> jComboBoxEinladen = new JComboBox<String>();
  private DefaultComboBoxModel<String> jComboBoxEinladenModel = new DefaultComboBoxModel<String>();
  private JComboBox<String> jComboBoxFilter = new JComboBox<String>();
  private DefaultComboBoxModel<String> jComboBoxFilterModel = new DefaultComboBoxModel<String>();
  
  //Anfang Roman Startseite und Profil Attribute
  private JButton buttonAufEigeneDateienundOrdnerzugreifen = new JButton();
  private JButton buttonAufaufdaseigeneProfilzugreifen = new JButton();
  private JButton buttonAusloggenStartseite = new JButton();
  private JButton buttonHilfeStartseite = new JButton();
  private JLabel labelWilkommenzuIhrerStartseite = new JLabel();
  private JLabel labelWasmoechtenSietun = new JLabel();
  private JLabel labelEigenerName = new JLabel();
  private JLabel labelEigeneEmail = new JLabel();
  private JLabel labelZugeteilteAbteilungen = new JLabel();
  private JButton buttonZurueckzurStartseite = new JButton();
  private JButton buttonProfilLoeschen = new JButton();
  private JButton buttonHilfe = new JButton();
  private JButton buttonPasswortAendern = new JButton();
  private JButton buttonAusloggenProfil = new JButton();
  private JLabel labelAbteilungsbeispiel = new JLabel();

  //Anfang Roman Hilfe auf Profil Attribute
  private JLabel lHilfeUeberschrift = new JLabel();
  private JLabel lHilfeZurueckZurStartseite = new JLabel();
  private JTextArea jHilfeBeschreibungStartseite = new JTextArea("");
  private JScrollPane jHilfeBeschreibungStartseiteScrollPane = new JScrollPane(jHilfeBeschreibungStartseite);
  private JLabel lHilfeProfilLoeschen = new JLabel();
  private JTextArea jHilfeBeschreibungProfilLoeschen = new JTextArea("");
  private JScrollPane jHilfeBeschreibungProfilLoeschenScrollPane = new JScrollPane(jHilfeBeschreibungProfilLoeschen);
  private JLabel lHilfePasswortaendern = new JLabel();
  private JTextArea jHilfeBeschreibungPasswortAendern = new JTextArea("");
  private JScrollPane jHilfeBeschreibungPasswortAendernScrollPane = new JScrollPane(jHilfeBeschreibungPasswortAendern);
  private JTextArea jHilfeBeschreibungSonstiges = new JTextArea("");
  private JScrollPane jHilfeBeschreibungSonstigesScrollPane = new JScrollPane(jHilfeBeschreibungSonstiges);
  private JButton bHilfeZurueckzumProfil = new JButton();
  private JButton bFilterZurueck = new JButton();
  
  //Anfang Roman Hilfe auf Startseite Attribute
  private JLabel lStartseiteHilfe = new JLabel();
  private JButton bHilfeZurueckzumStartseite = new JButton();
  private JLabel lHilfeAufEigeneDateienundOrdnerzugreifen = new JLabel();
  private JTextArea jHilfeEigeneDateienBeschreibung = new JTextArea("");
  private JScrollPane jHilfeEigeneDateienBeschreibungScrollPane = new JScrollPane(jHilfeEigeneDateienBeschreibung);
  private JLabel lHilfeStartseiteAufdaseigeneProfilzugreifen = new JLabel();
  private JTextArea jHilfeAufProfilZugreifenBeschreibung = new JTextArea("");
  private JScrollPane jHilfeAufProfilZugreifenBeschreibungScrollPane = new JScrollPane(jHilfeAufProfilZugreifenBeschreibung);
  private JTextArea jHilfeStartseiteWeitereFragen = new JTextArea("");
  private JScrollPane jHilfeStartseiteWeitereFragenScrollPane = new JScrollPane(jHilfeStartseiteWeitereFragen);
  
  //Neue Datei erstellen Knöpfe                      
  private TextField tfNamehierEingeben = new TextField();
  private Label lDatei = new Label();
  private Label lOrdner = new Label();
  private Checkbox checkboxDatei = new Checkbox();
  private Checkbox checkboxOrdner = new Checkbox();
  private Button bErstellen = new Button();
  private JLabel lAusgewaehlteDatei = new JLabel();
  
  //Admin Ansicht ANFANG
  private JButton bZurAdminansicht = new JButton();
  private JButton bAdminZurueckzurStartseite = new JButton();
  private JLabel lAdminansichtAdminAnsicht = new JLabel();
  private JLabel lWasmoechtenSietun = new JLabel();
  private JButton bAbteilungbearbeiten = new JButton();
  private JButton bAdminansichtZurueckZurStartseite = new JButton();
  private JLabel lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten = new JLabel();
  private JComboBox<String> jAbteilungBearbeitenComboBox1 = new JComboBox<String>();
  private DefaultComboBoxModel<String> jAbteilungBearbeitenComboBox1Model = new DefaultComboBoxModel<String>();
  private JLabel lMoechtenSieeineneueAbteilungerstellen = new JLabel();
  private JTextField jAbteilungBearbeitenTextField1 = new JTextField();
  private JLabel lWelcheOperationenmoechtenSieausfuehren = new JLabel();
  private JButton bAbteilungBearbeitenEntfernen = new JButton();
  private JButton bAbteilungBearbeitenUmbennen = new JButton();
  private JButton bAbteilungBearbeitenHinzufuegen = new JButton();
  private JButton bZurueckzurAdminAnsicht = new JButton();
  
  
  //Allgemeine Objekte / Swings
  private JOptionPane jMeldung = new JOptionPane();        // Nachichten Meldung
  Nutzer angemeldeterNutzer = new Nutzer();  //NUTZER OBJEKT WIRD ERSTELLT
  
  
  //Pfade
  private String serverPfad = "C:\\Users\\peik_\\OneDrive\\Desktop\\Se Projekt\\Finalisten\\Programm\\Server\\";
  private String kundenListenPfad="C:\\Users\\peik_\\OneDrive\\Desktop\\Se Projekt\\Finalisten\\Programm\\Kundenliste.csv";
  private String aktuellerPfad = serverPfad;
  boolean Gedrueckt = false;
  // Ende Attribute
  
  public Programm() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 322; 
    int frameHeight = 292;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Programm");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    //Einlogmenue Knöpfe
    lEinloggen.setBounds(96, 24, 122, 33);
    lEinloggen.setText("Einloggen");
    lEinloggen.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(lEinloggen);
    tfNutzername.setBounds(32, 72, 241, 33);
    tfNutzername.setText("Nutzername");
    tfNutzername.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(tfNutzername);
    tfPasswort.setBounds(32, 112, 241, 33);
    tfPasswort.setText("Passwort");
    tfPasswort.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(tfPasswort);
    bEinloggen.setBounds(72, 160, 153, 33);
    bEinloggen.setText("Einloggen");
    bEinloggen.setMargin(new Insets(2, 2, 2, 2));
    
    bEinloggen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEinloggen_ActionPerformed(evt);
      }
    });
    cp.add(bEinloggen);
    
    bRegistrieren.setBounds(96, 200, 105, 25);
    bRegistrieren.setText("Registrieren");
    bRegistrieren.setMargin(new Insets(2, 2, 2, 2));
    bRegistrieren.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRegistrieren_ActionPerformed(evt);
      }
    });
    cp.add(bRegistrieren);
    
    //Registrierungs Knöpfe
    tfPassworterneuteingeben.setBounds(1376, 256, 241, 33);
    tfPassworterneuteingeben.setText("Passwort erneut eingeben");
    tfPassworterneuteingeben.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(tfPassworterneuteingeben);
    tfPassworterneuteingeben.setVisible(false);
    
    bZurueckRegistrierung.setBounds(1448, 472, 89, 25);
    bZurueckRegistrierung.setText("Zurueck");
    bZurueckRegistrierung.setMargin(new Insets(2, 2, 2, 2));
    bZurueckRegistrierung.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEigeneDateienZurueck_ActionPerformed(evt);
      }
    });
    cp.add(bZurueckRegistrierung);
     
    tfVorname.setBounds(1376, 296, 241, 33);
    tfVorname.setText("Vorname");
    cp.add(tfVorname);
    
    tfNachname.setBounds(1376, 336, 241, 33);
    tfNachname.setText("Nachname");
    cp.add(tfNachname);
    
    tfEMailAdresse.setBounds(1376, 376, 241, 33);
    tfEMailAdresse.setText("E-Mail Adresse");
    cp.add(tfEMailAdresse);
    
    
    bRegistrierungBestaetigen.setBounds(1376, 424, 241, 33);
    bRegistrierungBestaetigen.setText("Registrierung bestaetigen");
    bRegistrierungBestaetigen.setMargin(new Insets(2, 2, 2, 2));
    bRegistrierungBestaetigen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRegistrierungBestaetigen_ActionPerformed(evt);
      }
    });
    cp.add(bRegistrierungBestaetigen);
    
    //DateiMenue Knöpfe
    bDateiMenueZurueck.setBounds(1448, 472, 89, 25);
    bDateiMenueZurueck.setText("Zurueck");
    bDateiMenueZurueck.setMargin(new Insets(2, 2, 2, 2));
    bDateiMenueZurueck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bDateiMenueZurueck_ActionPerformed(evt);
      }
    });
    cp.add(bDateiMenueZurueck);
   
    lEigeneDateienundOrdner.setBounds(1360, 536, 289, 57);
    lEigeneDateienundOrdner.setText("Eigene Dateien und Ordner");
    lEigeneDateienundOrdner.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(lEigeneDateienundOrdner);
    
    lMenueDatei.setBounds(1360, 536, 289, 57);
    lMenueDatei.setText("Dateien");
    lMenueDatei.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(lMenueDatei);
    
    lMenueOrdner.setBounds(1360, 536, 289, 57);
    lMenueOrdner.setText("Ordner");
    lMenueOrdner.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(lMenueOrdner);
    
    
    jEigeneDateienUndOrdner.setModel(jEigeneDateienUndOrdnerModel);
    jEigeneDateienUndOrdner.setBounds(1224, 600, 537, 409);
    cp.add(jEigeneDateienUndOrdner);
    
    jDateien.setModel(jEigeneDateienUndOrdnerModel);
    jDateien.setBounds(1224, 600, 537, 609);
    cp.add(jDateien);
   
    checkboxComboDatei.setBounds(1000, 1000, 41, 33);
    checkboxComboDatei.setOpaque(false);
    checkboxComboDatei.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 12));
    cp.add(checkboxComboDatei);
   
    checkboxComboDatei.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        checkboxComboDatei_ItemStateChanged(evt);
      }
    });
    checkboxComboDatei.setIcon(new ImageIcon("Icons\\NichtAngeklickt.jpg"));
    checkboxComboDatei.setSelectedIcon(new ImageIcon("Icons\\Angeklickt.jpg"));
    checkboxComboDatei.setDisabledIcon(new ImageIcon("Icons\\NichtAngeklickt.jpg"));
    cp.add(checkboxComboDatei);
    
    checkboxComboOrdner.setBounds(1000, 1000, 41, 33);
    checkboxComboOrdner.setOpaque(false);
    checkboxComboOrdner.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 12));
    cp.add(checkboxComboOrdner);
    checkboxComboOrdner.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        checkboxComboOrdner_ItemStateChanged(evt);
      }
    });
    checkboxComboOrdner.setIcon(new ImageIcon("Icons\\NichtAngeklickt.jpg"));
    checkboxComboOrdner.setSelectedIcon(new ImageIcon("Icons\\Angeklickt.jpg"));
    checkboxComboOrdner.setDisabledIcon(new ImageIcon("Icons\\NichtAngeklickt.jpg"));
    
    checkboxComboOrdner.setSelected(true);
    cp.add(checkboxComboOrdner);
    
     bEingeladeneDateien.setBounds(1272, 136, 89, 41);
    bEingeladeneDateien.setText("Eingeladene Dateien");
    bEingeladeneDateien.setMargin(new Insets(2, 2, 2, 2));
    bEingeladeneDateien.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEingeladeneDateien_ActionPerformed(evt);
      }
    });
    cp.add(bEingeladeneDateien);
    
    //Datei Funktions Knöpfe
    bNew.setBounds(1272, 136, 89, 41);
    bNew.setText("New");
    bNew.setMargin(new Insets(2, 2, 2, 2));
    bNew.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNew_ActionPerformed(evt);
      }
    });
    cp.add(bNew);
    
    bOpen.setBounds(1272, 184, 89, 41);
    bOpen.setText("Open");
    bOpen.setMargin(new Insets(2, 2, 2, 2));
    bOpen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bOpen_ActionPerformed(evt);
      }
    });
    cp.add(bOpen);
    
    bUmbennen.setBounds(1272, 232, 89, 41);
    bUmbennen.setText("Umbennen");
    bUmbennen.setMargin(new Insets(2, 2, 2, 2));
    bUmbennen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bUmbennen_ActionPerformed(evt);
      }
    });
    cp.add(bUmbennen);
    
    bDelete.setBounds(1272, 280, 89, 41);
    bDelete.setText("Delete");
    bDelete.setMargin(new Insets(2, 2, 2, 2));
    bDelete.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bDelete_ActionPerformed(evt);
      }
    });
    cp.add(bDelete);
    
    bInvite.setBounds(1272, 328, 89, 41);
    bInvite.setText("Invite");
    bInvite.setMargin(new Insets(2, 2, 2, 2));
    bInvite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bInvite_ActionPerformed(evt);
      }
    });
    cp.add(bInvite);
    
   
    /*
    bAuswaehlen1.setBounds(1360, 1024, 297, 41);
    bAuswaehlen1.setText("Auswaehlen");
    bAuswaehlen1.setMargin(new Insets(2, 2, 2, 2));
    bAuswaehlen1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAuswaehlen1_ActionPerformed(evt);
      }
    });
    bAuswaehlen1.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(bAuswaehlen1);
     */
    
    //Einladungs/ Filter Menue
    lEinladen.setBounds(1000, 1000, 105, 44);
    lEinladen.setText("Einladen");
    Hashtable<TextAttribute, Object> lEinladen_map = new Hashtable<TextAttribute, Object>();
    lEinladen_map.put(TextAttribute.FAMILY, "Dialog");
    //lEinladen_map.put(TextAttribute.SIZE, new Integer(24));
    lEinladen_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    lEinladen.setFont(new Font(lEinladen_map));
    cp.add(lEinladen);
    
    bEinladenbestaetigen.setBounds(1000, 1000, 131, 57);
    bEinladenbestaetigen.setText("Einladenbestaetigen");
    bEinladenbestaetigen.setMargin(new Insets(2, 2, 2, 2));
    bEinladenbestaetigen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bEinladenbestaetigen_ActionPerformed(evt);
      }
    });
    cp.add(bEinladenbestaetigen);
    
    bFilterbestaetigen.setBounds(1000, 1000, 131, 25);
    bFilterbestaetigen.setText("Filterbestaetigen");
    bFilterbestaetigen.setMargin(new Insets(2, 2, 2, 2));
    bFilterbestaetigen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFilterbestaetigen_ActionPerformed(evt);
      }
    });
    cp.add(bFilterbestaetigen);
    
    String comboBoxEinladen[] = {"Kein Filter","Abteilung","Benutzer"};
    DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxEinladen);
    jComboBoxEinladen.setModel(model);
    jComboBoxEinladen.setBounds(1000, 1000, 174, 60);
    cp.add(jComboBoxEinladen);
    
    String comboBoxFilter[] = {"Kein Filter ausgewählt"};
    DefaultComboBoxModel model4 = new DefaultComboBoxModel(comboBoxFilter);
    jComboBoxFilter.setModel(model4);
    jComboBoxFilter.setBounds(1000, 1000, 174, 60);
    cp.add(jComboBoxFilter);
    
    //Anfang Roman Startseite und Profil Komponenten 
    buttonAufEigeneDateienundOrdnerzugreifen.setBounds(1000, 1000, 300, 80);
    buttonAufEigeneDateienundOrdnerzugreifen.setText("auf Eigene Dateien und Ordner zugreifen");
    buttonAufEigeneDateienundOrdnerzugreifen.setMargin(new Insets(2, 2, 2, 2));
    buttonAufEigeneDateienundOrdnerzugreifen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonAufEigeneDateienundOrdnerzugreifen_ActionPerformed(evt);
      }
    });
    buttonAufEigeneDateienundOrdnerzugreifen.setHorizontalAlignment(SwingConstants.CENTER);
    buttonAufEigeneDateienundOrdnerzugreifen.setHorizontalTextPosition(SwingConstants.CENTER);
    buttonAufEigeneDateienundOrdnerzugreifen.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(buttonAufEigeneDateienundOrdnerzugreifen);
    
    buttonAufaufdaseigeneProfilzugreifen.setBounds(1000, 1000, 300, 80);
    buttonAufaufdaseigeneProfilzugreifen.setText("auf das eigene Profil zugreifen");
    buttonAufaufdaseigeneProfilzugreifen.setMargin(new Insets(2, 2, 2, 2));
    buttonAufaufdaseigeneProfilzugreifen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonAufaufdaseigeneProfilzugreifen_ActionPerformed(evt);
      }
    });
    cp.add(buttonAufaufdaseigeneProfilzugreifen);
    buttonAusloggenStartseite.setBounds(1000, 1000, 129, 33);
    buttonAusloggenStartseite.setText("Ausloggen");
    buttonAusloggenStartseite.setMargin(new Insets(2, 2, 2, 2));
    buttonAusloggenStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonAusloggenStartseite_ActionPerformed(evt);
      }
    });
    cp.add(buttonAusloggenStartseite);
    buttonHilfeStartseite.setBounds(1000, 1000, 129, 33);
    buttonHilfeStartseite.setText("Hilfe?");
    buttonHilfeStartseite.setMargin(new Insets(2, 2, 2, 2));
    buttonHilfeStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonHilfeStartseite_ActionPerformed(evt);
      }
    });
    cp.add(buttonHilfeStartseite);
    labelWilkommenzuIhrerStartseite.setBounds(1000, 1000, 400, 50);
    labelWilkommenzuIhrerStartseite.setText("Wilkommen zu Ihrer Startseite");
    labelWilkommenzuIhrerStartseite.setHorizontalAlignment(SwingConstants.CENTER);
    labelWilkommenzuIhrerStartseite.setFont(new Font("Dialog", Font.BOLD, 25));
    cp.add(labelWilkommenzuIhrerStartseite);
    labelWasmoechtenSietun.setBounds(1000, 1000, 300, 50);
    labelWasmoechtenSietun.setText("Was möchten Sie tun?");
    labelWasmoechtenSietun.setFont(new Font("Dialog", Font.BOLD, 15));
    labelWasmoechtenSietun.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(labelWasmoechtenSietun);
    
    labelEigenerName.setBounds(1000, 1000, 300, 63);
    labelEigenerName.setText("Eigener Name");
    labelEigenerName.setFont(new Font("Dialog", Font.BOLD, 20));
    labelEigenerName.setHorizontalAlignment(SwingConstants.CENTER);
    labelEigenerName.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(labelEigenerName);
    
    labelEigeneEmail.setBounds(1000, 1000, 300, 45);
    labelEigeneEmail.setText("Eigene Email");
    labelEigeneEmail.setFont(new Font("Dialog", Font.BOLD, 15));
    labelEigeneEmail.setHorizontalAlignment(SwingConstants.CENTER);
    labelEigeneEmail.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(labelEigeneEmail);
    
    buttonZurueckzurStartseite.setBounds(1000, 1000, 150, 400);
    buttonZurueckzurStartseite.setText("zurück zur Startseite");
    buttonZurueckzurStartseite.setMargin(new Insets(2, 2, 2, 2));
    buttonZurueckzurStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonZurueckzurStartseite_ActionPerformed(evt);
      }
    });
    cp.add(buttonZurueckzurStartseite);
    
    buttonHilfe.setBounds(1000, 1000, 145, 49);
    buttonPasswortAendern.setBounds(1000, 1000, 145, 49);
    buttonAusloggenProfil.setBounds(1000, 1000, 145, 49);
    
    buttonProfilLoeschen.setBounds(1000, 1000, 145, 49);
    buttonProfilLoeschen.setText("Profil löschen");
    buttonProfilLoeschen.setMargin(new Insets(2, 2, 2, 2));
    buttonProfilLoeschen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonProfilLoeschen_ActionPerformed(evt);
      }
    });
    cp.add(buttonProfilLoeschen);
    
    buttonHilfe.setText("Hilfe?");
    buttonHilfe.setMargin(new Insets(2, 2, 2, 2));
    buttonHilfe.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonHilfeProfil_ActionPerformed(evt);
      }
    });
    cp.add(buttonHilfe);
    
    buttonPasswortAendern.setText("Passwort ändern");
    buttonPasswortAendern.setMargin(new Insets(2, 2, 2, 2));
    buttonPasswortAendern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonPasswortAendern_ActionPerformed(evt);
      }
    });
    cp.add(buttonPasswortAendern);
    
    buttonAusloggenProfil.setText("Ausloggen");
    buttonAusloggenProfil.setMargin(new Insets(2, 2, 2, 2));
    buttonAusloggenProfil.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        buttonAusloggenProfil_ActionPerformed(evt);
      }
    });
    cp.add(buttonAusloggenProfil);
    
    labelAbteilungsbeispiel.setBounds(1000, 1000, 300, 41);
    labelAbteilungsbeispiel.setText("Abteilungsbeispiel");
    labelAbteilungsbeispiel.setHorizontalAlignment(SwingConstants.CENTER);
    labelAbteilungsbeispiel.setFont(new Font("Dialog", Font.BOLD, 15));
    cp.add(labelAbteilungsbeispiel);
    
    labelZugeteilteAbteilungen.setBounds(1000, 1000, 150, 40);
    labelZugeteilteAbteilungen.setText("Ihre Abteilung");
    labelZugeteilteAbteilungen.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(labelZugeteilteAbteilungen);
    
    //Hilfe im Profil Menue
    lHilfeUeberschrift.setBounds(1000, 1000, 78, 57);
    lHilfeUeberschrift.setText("Hilfe");
    lHilfeUeberschrift.setFont(new Font("Dialog", Font.BOLD, 30));
    lHilfeUeberschrift.setHorizontalAlignment(SwingConstants.LEFT);
    cp.add(lHilfeUeberschrift);
    lHilfeZurueckZurStartseite.setBounds(1000, 1000, 185, 49);
    lHilfeZurueckZurStartseite.setText("zurück zur Startseite");
    lHilfeZurueckZurStartseite.setHorizontalTextPosition(SwingConstants.LEFT);
    lHilfeZurueckZurStartseite.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 14));
    cp.add(lHilfeZurueckZurStartseite);
    jHilfeBeschreibungStartseiteScrollPane.setBounds(1000, 1000, 425, 35);
    jHilfeBeschreibungStartseite.setText("Falls Sie auf Ihre eigenen Dateien und Ordner zugreifen oder sich vom \nSystem abmelden möchten, können Sie es unter diesem Punkt erledigen. ");
    jHilfeBeschreibungStartseite.setEditable(false);
    jHilfeBeschreibungStartseiteScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungStartseiteScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungStartseite.setFont(new Font("Dialog", Font.PLAIN, 12));
    jHilfeBeschreibungStartseite.setForeground(Color.BLACK);
    jHilfeBeschreibungStartseite.setBackground(new java.awt.Color(255, 255, 255, 0));
    
    cp.add(jHilfeBeschreibungStartseiteScrollPane);
    lHilfeProfilLoeschen.setBounds(1000, 1000, 185, 49);
    lHilfeProfilLoeschen.setText("Profil Löschen");
    lHilfeProfilLoeschen.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 14));
    cp.add(lHilfeProfilLoeschen);
    jHilfeBeschreibungProfilLoeschenScrollPane.setBounds(1000, 1000, 425, 50);
    jHilfeBeschreibungProfilLoeschen.setText("Falls Sie Ihr bestehendes Konto löschen möchten, können Sie dies \nunter diesem Punkt erledigen. \nACHTUNG! Dies führt zur Löschung all Ihrer Daten.");
    jHilfeBeschreibungProfilLoeschen.setEditable(false);
    jHilfeBeschreibungProfilLoeschenScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungProfilLoeschenScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungProfilLoeschen.setBackground(new java.awt.Color(255, 255, 255, 0));
    cp.add(jHilfeBeschreibungProfilLoeschenScrollPane);
    lHilfePasswortaendern.setBounds(1000, 1000, 185, 49);
    lHilfePasswortaendern.setText("Passwort ändern");
    lHilfePasswortaendern.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 14));
    cp.add(lHilfePasswortaendern);
    jHilfeBeschreibungPasswortAendernScrollPane.setBounds(1000, 1000, 425, 35);
    jHilfeBeschreibungPasswortAendernScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungPasswortAendernScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungPasswortAendern.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeBeschreibungPasswortAendern.setText("Falls Sie Ihr aktuelles Passwort ändern möchte, können Sie dies \nunter diesem Punkt erledigen.");
    cp.add(jHilfeBeschreibungPasswortAendernScrollPane);
    jHilfeBeschreibungSonstigesScrollPane.setBounds(1000, 1000, 425, 35);
    jHilfeBeschreibungSonstigesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungSonstigesScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeBeschreibungSonstiges.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeBeschreibungSonstiges.setText("Sie haben noch weitere Fragen?\nBitte wenden Sie sich zum Administrator Ihres Unternehmens. ");
    jHilfeBeschreibungSonstiges.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(jHilfeBeschreibungSonstigesScrollPane);
    
    bHilfeZurueckzumProfil.setBounds(1000, 1000, 150, 40);
    bHilfeZurueckzumProfil.setText("zurück zum Profil");
    bHilfeZurueckzumProfil.setMargin(new Insets(2, 2, 2, 2));
    bHilfeZurueckzumProfil.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHilfeZurueckzumProfil_ActionPerformed(evt);
      }
    });
    cp.add(bHilfeZurueckzumProfil); 
    
    //Anfang Roman Hilfe auf Startseite Komponenten
    lStartseiteHilfe.setBounds(1000, 1000, 121, 49);
    lStartseiteHilfe.setText("Hilfe");
    lStartseiteHilfe.setFont(new Font("Dialog", Font.BOLD, 30));
    cp.add(lStartseiteHilfe);
    bHilfeZurueckzumStartseite.setBounds(352, 8, 140, 40);
    bHilfeZurueckzumStartseite.setText("zurück zum Startseite");
    bHilfeZurueckzumStartseite.setMargin(new Insets(2, 2, 2, 2));
    bHilfeZurueckzumStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHilfeZurueckzumStartseite_ActionPerformed(evt);
      }
    });
    cp.add(bHilfeZurueckzumStartseite);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setBounds(1000, 1000, 300, 30);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setText("auf Eigene Dateien und Ordner zugreifen");
    lHilfeAufEigeneDateienundOrdnerzugreifen.setHorizontalAlignment(SwingConstants.LEFT);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setHorizontalTextPosition(SwingConstants.CENTER);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 13));
    lHilfeAufEigeneDateienundOrdnerzugreifen.setBackground(new java.awt.Color(255, 255, 255, 0));
    cp.add(lHilfeAufEigeneDateienundOrdnerzugreifen);
    jHilfeEigeneDateienBeschreibungScrollPane.setBounds(1000, 1000, 481, 49);
    jHilfeEigeneDateienBeschreibung.setText("Falls Sie auf Ihre Dateien und Ordner zugreifen möchten, können Sie es unter \ndiesem Punkt erledigen. Des Weiteren können Sie auch auf \ngeteilte Dateien und Ordner zugreifen.");
    jHilfeEigeneDateienBeschreibungScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeEigeneDateienBeschreibung.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeEigeneDateienBeschreibungScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeEigeneDateienBeschreibung.setEditable(false);
    jHilfeEigeneDateienBeschreibung.setEnabled(true);
    cp.add(jHilfeEigeneDateienBeschreibungScrollPane);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setBounds(1000, 1000, 300, 30);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setText("auf das eigene Profil zugreifen");
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 13));
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setHorizontalTextPosition(SwingConstants.CENTER);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setBackground(new java.awt.Color(255, 255, 255, 0));
    cp.add(lHilfeStartseiteAufdaseigeneProfilzugreifen);
    jHilfeAufProfilZugreifenBeschreibungScrollPane.setBounds(1000, 1000, 481, 49);
    jHilfeAufProfilZugreifenBeschreibung.setText("Falls Sie auf Ihr Profil zugreifen möchten, um dort zum Beispiel \nIhr Passwort zu ändern oder Ihr Profil zu löschen, können Sie dies unter \ndiesem Punkt erledigen.");
    jHilfeAufProfilZugreifenBeschreibungScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeAufProfilZugreifenBeschreibungScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeAufProfilZugreifenBeschreibung.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeAufProfilZugreifenBeschreibung.setEditable(false);
    cp.add(jHilfeAufProfilZugreifenBeschreibungScrollPane);
    jHilfeStartseiteWeitereFragenScrollPane.setBounds(1000, 1000, 481, 33);
    jHilfeStartseiteWeitereFragen.setText("Sie haben noch weitere Fragen?\nBitte wenden Sie sich zum Administrator Ihres Unternehmens.");
    jHilfeStartseiteWeitereFragenScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jHilfeStartseiteWeitereFragenScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jHilfeStartseiteWeitereFragen.setFont(new Font("Dialog", Font.BOLD, 12));
    jHilfeStartseiteWeitereFragen.setBackground(new java.awt.Color(255, 255, 255, 0));
    jHilfeStartseiteWeitereFragen.setEditable(false);
    cp.add(jHilfeStartseiteWeitereFragenScrollPane);
    
    //Ende Roman Hilfe auf Startseite 
    
    bFilterZurueck.setBounds(1000, 1000, 81, 25);
    bFilterZurueck.setText("Zurueck");
    bFilterZurueck.setMargin(new Insets(2, 2, 2, 2));
    bFilterZurueck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFilterZurueck_ActionPerformed(evt);
      }
    });
    cp.add(bFilterZurueck);
    
    // Neue Datei/ Ordner Knopf erstellen  ANFANG
    tfNamehierEingeben.setBounds(1000, 1000, 209, 41);
    tfNamehierEingeben.setText("Name hier Eingeben");
    tfNamehierEingeben.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(tfNamehierEingeben);
    lDatei.setBounds(1000, 1000, 65, 41);
    lDatei.setText("Datei");
    lDatei.setFont(new Font("Dialog", Font.PLAIN, 24));
    cp.add(lDatei);
    lOrdner.setBounds(1000, 1000, 80, 41);
    lOrdner.setText("Ordner");
    lOrdner.setFont(new Font("Dialog", Font.PLAIN, 24));
    cp.add(lOrdner);
    checkboxOrdner.setBounds(1000, 1000, 17, 17);
    checkboxOrdner.setLabel("");
    checkboxOrdner.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        checkboxOrdner_ItemStateChanged(evt);
      }
    });
    cp.add(checkboxOrdner);
    
    checkboxDatei.setBounds(1000, 1000, 17, 17);
    checkboxDatei.setLabel("");
    checkboxDatei.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        checkboxDatei_ItemStateChanged(evt);
      }
    });
    cp.add(checkboxDatei);
    bErstellen.setBounds(1000, 1000, 113, 33);
    bErstellen.setLabel("Erstellen");
    bErstellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bErstellen_ActionPerformed(evt);
      }
    });
    cp.add(bErstellen);
    
    lAusgewaehlteDatei.setBounds(1000, 1000, 409, 41);
    lAusgewaehlteDatei.setText("                              Ausgewählte Datei");
    lAusgewaehlteDatei.setFont(new Font("Dialog", Font.BOLD, 22));
    cp.add(lAusgewaehlteDatei);
    
    //Admin Ansicht
    bZurAdminansicht.setBounds(1000, 1000, 160, 70);
    bZurAdminansicht.setText("Zur Adminansicht");
    bZurAdminansicht.setMargin(new Insets(2, 2, 2, 2));
    bZurAdminansicht.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZurAdminansicht_ActionPerformed(evt);
      }
    });
    cp.add(bZurAdminansicht);
    bAdminZurueckzurStartseite.setBounds(1000, 1000, 160, 70);
    bAdminZurueckzurStartseite.setText("Zurück zur Startseite");
    bAdminZurueckzurStartseite.setMargin(new Insets(2, 2, 2, 2));
    bAdminZurueckzurStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAdminZurueckzurStartseite_ActionPerformed(evt);
      }
    });
    cp.add(bAdminZurueckzurStartseite);
    lAdminansichtAdminAnsicht.setBounds(555, 328, 150, 50);
    lAdminansichtAdminAnsicht.setText("Admin-Ansicht");
    lAdminansichtAdminAnsicht.setHorizontalAlignment(SwingConstants.CENTER);
    lAdminansichtAdminAnsicht.setHorizontalTextPosition(SwingConstants.CENTER);
    lAdminansichtAdminAnsicht.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(lAdminansichtAdminAnsicht);
    lWasmoechtenSietun.setBounds(555, 392, 150, 50);
    lWasmoechtenSietun.setText("Was moechten Sie tun?");
    lWasmoechtenSietun.setHorizontalAlignment(SwingConstants.CENTER);
    lWasmoechtenSietun.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lWasmoechtenSietun);
    bAbteilungbearbeiten.setBounds(555, 472, 150, 70);
    bAbteilungbearbeiten.setText("Abteilung bearbeiten");
    bAbteilungbearbeiten.setMargin(new Insets(2, 2, 2, 2));
    bAbteilungbearbeiten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAbteilungbearbeiten_ActionPerformed(evt);
      }
    });
    bAbteilungbearbeiten.setHorizontalAlignment(SwingConstants.CENTER);
    bAbteilungbearbeiten.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(bAbteilungbearbeiten);
    bAdminansichtZurueckZurStartseite.setBounds(555, 568, 150, 70);
    bAdminansichtZurueckZurStartseite.setText("Zurück zur Startseite");
    bAdminansichtZurueckZurStartseite.setMargin(new Insets(2, 2, 2, 2));
    bAdminansichtZurueckZurStartseite.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAdminansichtZurueckZurStartseite_ActionPerformed(evt);
      }
    });
    cp.add(bAdminansichtZurueckZurStartseite);
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setBounds(1000, 1000, 350, 80);
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setText("Welche Abteilung moechten Sie bearbeiten?");
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setFont(new Font("Dialog", Font.BOLD, 15));
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten);
    jAbteilungBearbeitenComboBox1.setModel(jAbteilungBearbeitenComboBox1Model);
    jAbteilungBearbeitenComboBox1.setBounds(1000, 1000, 250, 30);
    cp.add(jAbteilungBearbeitenComboBox1);
    lMoechtenSieeineneueAbteilungerstellen.setBounds(97, 632, 350, 80);
    lMoechtenSieeineneueAbteilungerstellen.setText("Möchten Sie eine neue Abteilung erstellen?");
    lMoechtenSieeineneueAbteilungerstellen.setFont(new Font("Dialog", Font.BOLD, 15));
    lMoechtenSieeineneueAbteilungerstellen.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lMoechtenSieeineneueAbteilungerstellen);
    jAbteilungBearbeitenTextField1.setBounds(1000, 1000, 250, 30);
    cp.add(jAbteilungBearbeitenTextField1);
    lWelcheOperationenmoechtenSieausfuehren.setBounds(105, 424, 350, 80);
    lWelcheOperationenmoechtenSieausfuehren.setText("Welche Operationen möchten Sie ausführen?");
    lWelcheOperationenmoechtenSieausfuehren.setFont(new Font("Dialog", Font.BOLD, 15));
    lWelcheOperationenmoechtenSieausfuehren.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lWelcheOperationenmoechtenSieausfuehren);
    bAbteilungBearbeitenEntfernen.setBounds(1000, 1000, 120, 60);
    bAbteilungBearbeitenEntfernen.setText("entfernen");
    bAbteilungBearbeitenEntfernen.setMargin(new Insets(2, 2, 2, 2));
    bAbteilungBearbeitenEntfernen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAbteilungBearbeitenEntfernen_ActionPerformed(evt);
      }
    });
    cp.add(bAbteilungBearbeitenEntfernen);
    bAbteilungBearbeitenUmbennen.setBounds(1000, 1000, 120, 60);
    bAbteilungBearbeitenUmbennen.setText("umbennen");
    bAbteilungBearbeitenUmbennen.setMargin(new Insets(2, 2, 2, 2));
    bAbteilungBearbeitenUmbennen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAbteilungBearbeitenUmbennen_ActionPerformed(evt);
      }
    });
    cp.add(bAbteilungBearbeitenUmbennen);
    bAbteilungBearbeitenHinzufuegen.setBounds(1000, 1000, 120, 30);
    bAbteilungBearbeitenHinzufuegen.setText("hinzufügen");
    bAbteilungBearbeitenHinzufuegen.setMargin(new Insets(2, 2, 2, 2));
    bAbteilungBearbeitenHinzufuegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAbteilungBearbeitenHinzufuegen_ActionPerformed(evt);
      }
    });
    cp.add(bAbteilungBearbeitenHinzufuegen);
    bZurueckzurAdminAnsicht.setBounds(1000, 1000, 300, 40);
    bZurueckzurAdminAnsicht.setText("Zurueck zur Admin-Ansicht");
    bZurueckzurAdminAnsicht.setMargin(new Insets(2, 2, 2, 2));
    bZurueckzurAdminAnsicht.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZurueckzurAdminAnsicht_ActionPerformed(evt);
      }
    });
    cp.add(bZurueckzurAdminAnsicht);
    
    
    setVisible(true);
    // Ende Komponenten
    
  } // end of public Programm
  
  // Anfang Methoden
  public static void main(String[] args) {
    //Das Hauptprogamm wird aufgerufen 
    new Programm();
  } 
  public void clear(){         
    //Methode um GUI Freizuräumen für eine neue Seite
    //Einlogg Menü wird gelöscht
    lEinloggen.setBounds(1000,1000, 122, 33);
    tfNutzername.setBounds(1000, 1000, 241, 33);
    tfPasswort.setBounds(1000, 1000, 241, 33);        
    bEinloggen.setBounds(1000, 1000, 153, 33);
    bRegistrieren.setBounds(1000, 1000, 105, 25);
    
    //Register Menü wird entfernt
    tfPassworterneuteingeben.setBounds(1000, 1000, 241, 33);
    tfEMailAdresse.setBounds(1000, 1000, 241, 33);
    tfPassworterneuteingeben.setBounds(1000, 1000, 241, 33);
    tfVorname.setBounds(1000, 1000, 241, 33);  
    tfNachname.setBounds(1000, 1000, 241, 33);
    //jComboBox1.setBounds(1000, 1000, 241, 33);
    bZurueckRegistrierung.setBounds(1000, 1000, 89, 25);
    bRegistrierungBestaetigen.setBounds(1000, 1000, 241, 33); 
    
    //Datei Menü wird entfernt 
    lEigeneDateienundOrdner.setBounds(1000, 1000, 289, 57);
    //bAuswaehlen1.setBounds(1000, 1000, 297, 41);  
    bInvite.setBounds(1000, 1000, 89, 41); 
    bDelete.setBounds(1000, 1000, 89, 41); 
    bUmbennen.setBounds(1000, 1000, 89, 41); 
    bOpen.setBounds(1000, 1000, 89, 41); 
    bNew.setBounds(1000, 1000, 89, 41);                               
    jEigeneDateienUndOrdner.setBounds(1000, 1000, 537, 409);
    bDateiMenueZurueck.setBounds(1000,1000, 89, 41);
    jDateien.setBounds(1000,1000,1,1);
    checkboxComboOrdner.setBounds(1000, 1000, 17, 17);
    checkboxComboDatei.setBounds(1000, 1000, 17, 17);
    lMenueOrdner.setBounds(1000, 1000, 17, 17);
    lMenueDatei.setBounds(1000, 1000, 17, 17);
     bEingeladeneDateien.setBounds(1000,1000,10,10);
    
    
    //Einladungs Menue
    bFilterbestaetigen.setBounds(1000, 1000, 110, 20);
    bEinladenbestaetigen.setBounds(1000, 1000, 150, 20);
    jComboBoxEinladen.setBounds(1000, 1000, 150, 20);
    jComboBoxFilter.setBounds(1000, 1000, 150, 20);
    lEinladen.setBounds(1000, 1000, 78, 20);
    
    // Startseite aus dem sichtbaren Bereich entfernen 
    buttonAufEigeneDateienundOrdnerzugreifen.setBounds(1000, 1000, 300, 80);
    buttonAufaufdaseigeneProfilzugreifen.setBounds(1000, 1000, 300, 80);
    buttonAusloggenStartseite.setBounds(1000, 1000, 129, 33);
    buttonHilfeStartseite.setBounds(1000, 1000, 129, 33);
    labelWilkommenzuIhrerStartseite.setBounds(1000, 1000, 400, 50);
    labelWasmoechtenSietun.setBounds(1000, 1000, 300, 50);
    
    // Profil aus dem sichtbaren Bereich entfernen
    buttonProfilLoeschen.setBounds(1000, 1000, 145, 49);
    buttonHilfe.setBounds(1000, 1000, 145, 49);
    buttonPasswortAendern.setBounds(1000, 1000, 145, 49);
    buttonAusloggenProfil.setBounds(1000, 1000, 145, 49);
    buttonProfilLoeschen.setBounds(1000, 1000, 145, 49);
    buttonPasswortAendern.setBounds(1000, 1000, 145, 49);
    buttonAusloggenProfil.setBounds(1000, 1000, 145, 49);
    labelEigenerName.setBounds(1000, 1000, 300, 63);
    labelEigeneEmail.setBounds(1000, 1000, 300, 45);
    labelZugeteilteAbteilungen.setBounds(1000, 1000, 120, 40);
    labelAbteilungsbeispiel.setBounds(1000, 1000, 300, 41);
    buttonZurueckzurStartseite.setBounds(1000, 1000, 137, 60);
    
    //Hilfe auf Profil aus dem sichtbaren Bereich entfernen
    lHilfeUeberschrift.setBounds(1000, 1000, 78, 57);
    lHilfeZurueckZurStartseite.setBounds(1000, 1000, 185, 49);
    jHilfeBeschreibungStartseiteScrollPane.setBounds(1000, 1000, 425, 35);
    lHilfeProfilLoeschen.setBounds(1000, 1000, 185, 49);
    jHilfeBeschreibungProfilLoeschenScrollPane.setBounds(1000, 1000, 425, 50);
    lHilfePasswortaendern.setBounds(1000, 1000, 185, 49);
    jHilfeBeschreibungPasswortAendernScrollPane.setBounds(1000, 1000, 425, 35);
    jHilfeBeschreibungSonstigesScrollPane.setBounds(1000, 1000, 425, 35);
    bHilfeZurueckzumProfil.setBounds(1000, 1000, 150, 40);
    
    //Invite Menue wird aus dem sichtbaren Bereich entfernt
    lEinladen.setBounds(1000, 1000, 105, 44);
    bEinladenbestaetigen.setBounds(1000, 1000, 131, 57);
    bFilterbestaetigen.setBounds(1000, 1000, 131, 25);
    jComboBoxEinladen.setBounds(1000, 1000, 174, 60);
    jComboBoxFilter.setBounds(1000, 1000, 174, 60);
    bFilterZurueck.setBounds(1000, 1000, 81, 25);
    
    //Neue Datei/ Ordner erstellen Layout
    bErstellen.setBounds(1000, 1000, 113, 33);
    tfNamehierEingeben.setBounds(1000, 1000, 209, 41);
    lDatei.setBounds(1000, 1000, 65, 41);
    lOrdner.setBounds(1000, 1000, 80, 41);
    checkboxOrdner.setBounds(1000, 1000, 17, 17);  
    checkboxDatei.setBounds(1000, 1000, 17, 17);
    
    // Admin Ansicht wird aus dem sichtbaren Bereich entfernt
    
    bZurAdminansicht.setBounds(1000, 1000, 160, 70);
    bAdminZurueckzurStartseite.setBounds(1000, 1000, 160, 70);
    lAdminansichtAdminAnsicht.setBounds(1000, 1000, 150, 50);
    lWasmoechtenSietun.setBounds(1000, 1000, 150, 50);
    bAdminansichtZurueckZurStartseite.setBounds(1000, 1000, 150, 70);
    bAbteilungbearbeiten.setBounds(1000, 1000, 150, 70);
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setBounds(1000, 1000, 350, 80);
    jAbteilungBearbeitenComboBox1.setBounds(1000, 1000, 250, 30);
    lWelcheOperationenmoechtenSieausfuehren.setBounds(1000, 1000, 350, 80);
    bAbteilungBearbeitenEntfernen.setBounds(1000, 1000, 120, 60);
    bAbteilungBearbeitenUmbennen.setBounds(1000, 1000, 120, 60);
    lMoechtenSieeineneueAbteilungerstellen.setBounds(1000, 1000, 350, 80);
    bAbteilungBearbeitenHinzufuegen.setBounds(1000, 1000, 1000, 30);
    bZurueckzurAdminAnsicht.setBounds(1000, 1000, 1000, 1000);
    jAbteilungBearbeitenTextField1.setBounds(1000, 1000, 250, 30);
    lAusgewaehlteDatei.setBounds(1000, 1000, 409, 41);  
    
    //Hilfeseite auf Startseite wird aus dem sichtbaren Bereich entfernt
    lStartseiteHilfe.setBounds(1000, 1000, 121, 49);
    bHilfeZurueckzumStartseite.setBounds(1000, 1000, 140, 40);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setBounds(1000, 1000, 300, 30);
    jHilfeEigeneDateienBeschreibungScrollPane.setBounds(1000, 1000, 481, 49);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setBounds(1000, 1000, 300, 30);
    jHilfeAufProfilZugreifenBeschreibungScrollPane.setBounds(1000, 1000, 481, 49);
    jHilfeStartseiteWeitereFragenScrollPane.setBounds(1000, 1000, 481, 33);

  }
  
  public void bEinloggen_ActionPerformed(ActionEvent evt) {
    //Knopf um sich im Login Menü einzuloggen, durch Methodenaufruf
    einloggen();
  } 
  
  // ANFANG ROMAN ANMELDUNG / REGISTRIERUNGS FUNKTIONEN
  public void registrierungFreigeben() {  
            
    
    if (registrieren() == 1) {
      JOptionPane.showMessageDialog(null, "Sie haben zwei verschiedene Passwoerter angegeben.");
    }
    
      else if (registrieren() == 2) {
        JOptionPane.showMessageDialog(null, "Dieser Nutzername ist bereits vergeben.");
      }
      
        else if (registrieren() == 3) {
          JOptionPane.showMessageDialog(null, "Diese E-Mail ist bereits vergeben.");
        }
        
          else if (registrieren() == 99) {
            nutzerAnlegen();
            
          }
  }
  public void bRegistrierungBestaetigen_ActionPerformed(ActionEvent evt){
    //Nach Knopfdruck wird die Methode registrierungFreigeben gestartet
    registrierungFreigeben();
  }
  public void bRegistrieren_ActionPerformed(ActionEvent evt) {
    //Knopf um ins Registrierungsmenü zu kommen, durch Methodenaufruf
    registrierMenue();
  } 
  public void nutzerAnlegen() {
    //Methode zum Anlegen eines Nutzers mit Date, Nutzername, Nachname, Vorname, Email, Passwort, Abteilung
    //Bei der Anlegung eines Nutzers, wird direkt ein Ordner angelegt, der die Email-Adresse als
    //Namen hat und eine CSV.-Datei beinhaltet, welche die zukünftigen Pfade dessen Ordner beinhaltet, zu denen er eingeladen wurde
    
    java.util.Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
    String strDate = dateFormat.format(date);
    String standartAbteilung = "Keine Abteilung";
    String zuUeberpruefenderNutzername = tfNutzername.getText();
    String zuUeberpruefenderNachname = tfNachname.getText();
    String zuUeberpruefenderVorname = tfVorname.getText();
    String zuUeberpruefendeEmail = tfEMailAdresse.getText();
    String zuUeberpruefendesPasswort1 = tfPasswort.getText();
    
    
    String anzulegenderNutzername = replaceUmlaut(zuUeberpruefenderNutzername);
    String anzulegenderNachname = replaceUmlaut(zuUeberpruefenderNachname);
    String anzulegenderVorname = replaceUmlaut(zuUeberpruefenderVorname);
    String anzulegendesPasswort = replaceUmlaut(zuUeberpruefendesPasswort1);
    String anzulegendeEmail = replaceUmlaut(zuUeberpruefendeEmail);
    String anzulegendesRegistrierungsdatum = strDate;
    
    String filepath = kundenListenPfad;
    
    try {
      FileWriter fw= new FileWriter(filepath, true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      
      pw.println(anzulegenderNutzername + ";" + anzulegenderNachname + ";" + anzulegenderVorname + ";" + anzulegendesPasswort + ";" + standartAbteilung + ";" + anzulegendeEmail + ";" + anzulegendesRegistrierungsdatum );
      pw.flush();
      pw.close();
      JOptionPane.showMessageDialog(null, "Sie haben sich registriert. Melden Sie sich bitte neu an.");
      
    
      String dirName = tfEMailAdresse.getText();
      
      File dir = new File(serverPfad + dirName);
        
      if (dir.mkdir()) {
        System.out.println("Ordner erstellt fuer: " + tfNutzername.getText()); 
        File neuExcel = new File(serverPfad+tfEMailAdresse.getText()+"\\Eingeladen von.csv");
        try {
          neuExcel.createNewFile();
        }catch (Exception e) {
          System.out.println("Fehler beim Eingeladen Datei erstellen");
        }
        if (dir.mkdir()) {
        System.out.println("Ordner wurde erfolgreich erstellt");
      } else {
        System.out.println(dir + " Ordner existiert bereits");
      } 
      }  
        loginMenue();
      
      }catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Es ist etwas schief gelaufen.");
      }
  }
  public int registrierungNutzernameUeberpruefen(String NUTZERNAME) {
    //Methode zur Überprüfung des Nutzernamens
    String path = kundenListenPfad;
    String line = "";
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      
      while((line = br.readLine()) != null) {
        String [] values = line.split(";");
        String tempNutzername = values [0];
        
        
        if (tempNutzername.equals(NUTZERNAME))   {
          return 0;
        }
      }  
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return 5;
  }
  public int registrierungEmailUeberpruefen(String EMAIL) {
    //Methode zur Überprüfung der Email
    String path = kundenListenPfad;
    String line = "";
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      
      while((line = br.readLine()) != null) {
        String [] values = line.split(";");
        
        String tempEmail = values [4];
        
        
        if (tempEmail.equals(EMAIL)) {
          return 0;
        }
        
      }
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return 5;
  }
  public int registrieren() {
    //Methode, welche bei der Registrierung, nach Umlauten schaut, als auch nach Fehlern wie z.B. ob ein Benutzer mit den Daten schon existiert
    String zuUeberpruefenderNutzername = tfNutzername.getText();
    String zuUeberpruefendeEmail = tfEMailAdresse.getText();
    String zuUeberpruefendesPasswort1 = tfPasswort.getText();
    String zuUeberpruefendesPasswort2= tfPassworterneuteingeben.getText();
    String zuUeberpruefenderVorname = tfVorname.getText();
    String zuUeberpruefenderNachname = tfNachname.getText();
    
    String zuUeberpruefenderNutzernameOhneUmlaute = replaceUmlaut(zuUeberpruefenderNutzername);
    String zuUeberpruefendeEmailOhneUmlaute = replaceUmlaut(zuUeberpruefendeEmail);
    String zuUeberpruefendesPasswort1OhneUmlaute = replaceUmlaut(zuUeberpruefendesPasswort1);
    String zuUeberpruefendesPasswort2OhneUmlaute = replaceUmlaut(zuUeberpruefendesPasswort2);
    
    if (zuUeberpruefendesPasswort1OhneUmlaute.equals(zuUeberpruefendesPasswort2OhneUmlaute) == false) {
      return 1;
    } else if (registrierungNutzernameUeberpruefen(zuUeberpruefenderNutzernameOhneUmlaute) == 0) {
        return 2;
      } else if (registrierungEmailUeberpruefen(zuUeberpruefendeEmailOhneUmlaute) == 0) {
          return 3;
        } else if ((zuUeberpruefendesPasswort1OhneUmlaute.equals(zuUeberpruefendesPasswort2OhneUmlaute) == true ) && (registrierungNutzernameUeberpruefen(zuUeberpruefenderNutzernameOhneUmlaute) == 5) && (registrierungEmailUeberpruefen(zuUeberpruefendeEmailOhneUmlaute) == 5)) {
            return 99;
          }
    return 10000;
  }
  
  public String replaceUmlaut(String input) {
    
    //replace all lower Umlauts
    String output = input.replace("ü", "ue")
    .replace("ö", "oe")
    .replace("ä", "ae")
    .replace("ß", "ss");
    
    //first replace all capital umlaute in a non-capitalized context (e.g. Übung)
    output = output.replaceAll("Ü(?=[a-zäöüß ])", "Ue")
    .replaceAll("Ö(?=[a-zäöüß ])", "Oe")
    .replaceAll("Ä(?=[a-zäöüß ])", "Ae");
    
    //now replace all the other capital umlaute
    output = output.replace("Ü", "UE")
    .replace("Ö", "OE")
    .replace("Ä", "AE");
    
    return output;
  }
  public void registrierMenue(){
    //Registrierungsmenü wird erstellt  
    clear();
    
    lEinloggen.setText("Registrieren");
    lEinloggen.setBounds(86, 24, 150, 33);
    bEinloggen.setVisible(false);
    tfPassworterneuteingeben.setVisible(true);
    
    tfEMailAdresse.setBounds(32, 272, 241, 33);
    tfNutzername.setBounds(32, 72, 241, 33);
    tfPasswort.setBounds(32, 112, 241, 33);
    tfPassworterneuteingeben.setBounds(32, 152, 241, 33);
    tfVorname.setBounds(32, 192, 241, 33);  
    tfNachname.setBounds(32, 232, 241, 33);
    tfEMailAdresse.setBounds(32, 272, 241, 33);
    bZurueckRegistrierung.setBounds(25, 368, 89, 25);
    bRegistrierungBestaetigen.setBounds(120, 368, 160, 25);
    
    
    setSize(324,450);
  }
  
  
  // ENDE ROMAN ANMELDUNG / REGISTRIERUNGS FUNKTIONEN
  public void einloggen(){
    //Überprüfung der Nutzerdaten und ggf. Weiterleitung zur Methode "eingeloggt"
    //return: Bei falschem Input kommt eine Fehlermeldung
    String zuUeberpruefenderNutzername = tfNutzername.getText().toString();
    String zuUeberpruefendesPasswort = tfPasswort.getText().toString();
    if ((anmeldeÜberprüfung(zuUeberpruefenderNutzername, zuUeberpruefendesPasswort)) == 1) {
      //Labels werden dem Namen, der Abteilung und der Email angepasst
      String nachnameTeil = angemeldeterNutzer.getNachname();
      String vornameTeil = angemeldeterNutzer.getVorname();
      String kompletterName = nachnameTeil + " " + vornameTeil;
      labelEigenerName.setText(kompletterName);
      labelEigeneEmail.setText(angemeldeterNutzer.getEMail());
      labelAbteilungsbeispiel.setText(angemeldeterNutzer.getAbteilung());
      eingeloggt();
    } else { 
      JOptionPane.showMessageDialog(null,"Die angegebene Nutzername- und Passwortkombination ist uns nicht bekannt.");
    }
  }
    
  
  public void bEigeneDateienZurueck_ActionPerformed(ActionEvent evt) {
    //Von Eigenen Dateien auf Startseite zurück
    clear();
    loginMenue();
    
  } 
  
  public void eingeloggt() {
    //Von Einlogfenster auf Startseite
    clear();
    startseiteOeffnen(); 
   
    
  }
  
  public void loginMenue(){
    //Login Menü wird erstellt  
    clear();
    
    setSize(322,292);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    lEinloggen.setText("Einloggen");
    lEinloggen.setBounds(96, 24, 122, 33);
    bEinloggen.setVisible(true);
    bEinloggen.setBounds(72, 160, 153, 33);
    bRegistrieren.setBounds(96, 200, 105, 25);
    tfNutzername.setBounds(32, 72, 241, 33);
    tfPasswort.setBounds(32, 112, 241, 33);
    
  }
  public void hilfeStartseite() {
    //Startseite wird als Layout/ View erstellt
    int frameWidth = 518; 
    int frameHeight = 407;
    setSize(frameWidth, frameHeight);
    lStartseiteHilfe.setBounds(8, 8, 121, 49);
    bHilfeZurueckzumStartseite.setBounds(352, 8, 140, 40);
    lHilfeAufEigeneDateienundOrdnerzugreifen.setBounds(8, 96, 300, 30);
    jHilfeEigeneDateienBeschreibungScrollPane.setBounds(8, 128, 481, 49);
    lHilfeStartseiteAufdaseigeneProfilzugreifen.setBounds(8, 184, 300, 30);
    jHilfeAufProfilZugreifenBeschreibungScrollPane.setBounds(8, 216, 481, 49);
    jHilfeStartseiteWeitereFragenScrollPane.setBounds(8, 304, 481, 33);
  }
    
  public void dateiMenue() {
    //Menü für Eigene Dateien und Ordner wird erstellt und die Comboboxen mit den Inhalten des Aktuellen Benutzers bestückt
    //Weiterhin werden die Listen geleert und der Variable zur Kontrolle, ob man auf die Eigenen Dateien oder die zu denen man Eingeladen wurde auf false gesetzt (true = Eingeladene, false = Eigene Dateien)
    
    //
    clear();
    setSize(710,500);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    //bAuswaehlen1.setBounds(176, 504, 297, 41);   
    
    bInvite.setBounds(592, 320, 89, 41); 
    bDelete.setBounds(592, 272, 89, 41); 
    bUmbennen.setBounds(592, 224, 89, 41); 
    bOpen.setBounds(592, 176, 89, 41); 
    bNew.setBounds(592, 128, 89, 41);
    bDateiMenueZurueck.setBounds(592,368, 89, 41);
    jEigeneDateienUndOrdner.setBounds(40, 80, 500, 150);
    jDateien.setBounds(40,270 , 500, 170);
    bEingeladeneDateien.setBounds(592,10,89,89);
    Gedrueckt= false;
    checkboxComboOrdner.setBounds(540, 140, 50, 60);
    checkboxComboDatei.setBounds(540,330 , 50, 60);
    lEigeneDateienundOrdner.setBounds(190, 0, 289, 57);
    lMenueOrdner.setBounds(40, 40, 500, 50);
    lMenueDatei.setBounds(40, 225, 289, 50);
    String[] leerListe = new String[] {};
    DefaultComboBoxModel model3 = new DefaultComboBoxModel(leerListe);
    jDateien.setModel(model3);
         
    aktuellerPfad= serverPfad+ "\\" + angemeldeterNutzer.EMail;
    System.out.println("Aktueller Pfad im Dateimenue: "+ aktuellerPfad);
     
       File file = new File(aktuellerPfad);
      try {
       String[] directories = file.list(new FilenameFilter() {
      @Override
      public boolean accept(File current, String name) {
      return new File(current, name).isDirectory();
      }
      });
      System.out.println("HIER:" +Arrays.toString(directories));
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>(directories));
      
    } catch(Exception e) {
         System.out.println("ORDNER LEER");
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>());
      
      System.out.println("Catch beim Auslesen im Dateimenue: " + aktuellerPfad);
    } 
        }

      
  
  private void bDateiMenueZurueck_ActionPerformed(ActionEvent evt) {             
    clear();
    startseiteOeffnen();
  }
  public void bInvite_ActionPerformed(ActionEvent evt) {
    //Auf Knopfdruck wird das Einlade Layout geöffnet
    clear();
    setSize(222,377);
    bEinladenbestaetigen.setBounds(39, 241, 131, 57);
    lEinladen.setBounds(49, 18, 105, 44);
    bFilterbestaetigen.setBounds(39, 144, 131, 25);
    jComboBoxEinladen.setBounds(16, 77, 174, 60); 
    jComboBoxFilter.setBounds(16, 176, 174, 60);  
    bFilterZurueck.setBounds(64, 304, 81, 25);    
  } 

  public void bEinladenbestaetigen_ActionPerformed(ActionEvent evt) {
    //Einlade funktion, welche zuerst Kontrolliert ob man eine Person in den Eigenen Überordner einladen will (sollte nicht möglich sein)
    // Es wird weiterhin überprüft, ob man eine Person bereits eingeladen hat oder sich selbst Einladen will
    // Jeder Nutzer hat seine eigene CSV-Datei, in der die Pfade der Ordner sind, zu dem er eingeladen wurde
    // Weiterhin befindet sich in jedem Ordner eine Datei, mit den Email-Adressen, derjenigen die man zu dem Ordner eingeladen hat, damit im Nachhinein 
    // keiner Doppelt eingeladen werden kann, bzw. ausgeladen werden kann.
    if(aktuellerPfad.equals(serverPfad + "\\" + angemeldeterNutzer.getEMail())) {
      JOptionPane.showMessageDialog(null, "Auf dem ausgewählten Ordner kann keine Einladung stattfinden");
      return;
    }
    
    String filter = jComboBoxEinladen.getSelectedItem().toString();
    String einzuladender = jComboBoxFilter.getSelectedItem().toString();
    String filepath = aktuellerPfad + "\\Eingeladen.csv";
    
    if(filter == "Benutzer") {
      boolean semaphore = false;
      //Test: Nutzer ist noch nicht eingeladen
      if(einzuladender.equals(angemeldeterNutzer.getNutzername())){
        JOptionPane.showMessageDialog(null, "Man kann sich nicht selbst einladen.");
          return;
      }
      try{
        BufferedReader br = new BufferedReader(new FileReader(filepath));
      String line = br.readLine();
          String [] values = line.split(";");
          for(int i = 0; i < values.length; i++) {
              if(values[i].equals(einzuladender)) {
                return;
              }
          }
          br.close();
      }catch(Exception e) {
        semaphore = true;
      }
        
        //funktionaler Code
      try {
        FileWriter fw= new FileWriter(filepath, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        if(semaphore) {
          pw.print(einzuladender + ";");
        }else {
          pw.print(";" + einzuladender);
        }
        JOptionPane.showMessageDialog(null, "Benutzer wurde eingeladen.");
        
        pw.flush();
        pw.close();
        
        BufferedReader br2 = new BufferedReader(new FileReader(kundenListenPfad));
      String line="";
      
        while((line = br2.readLine()) != null) {
          String [] values = line.split(";");
          if(values[0].equals(einzuladender)) {
                FileWriter fwe= new FileWriter(serverPfad + values[5] + "\\Eingeladen von.csv", true);
                  BufferedWriter bwe = new BufferedWriter(fwe);
                  PrintWriter pwe = new PrintWriter(bwe);
                  BufferedReader br3 = new BufferedReader(new FileReader(serverPfad + values[5] + "\\Eingeladen von.csv"));
              String line3 = br3.readLine();
              br3.close();
              if(line3 == null) {
                pwe.print(aktuellerPfad);
              }else {
                pwe.print(";" + aktuellerPfad);
              }
                    
                  pwe.flush();
                pwe.close();
          }
        }
        br2.close();
        
        
        }catch(Exception e) {
          JOptionPane.showMessageDialog(null, "Es ist etwas schief gelaufen.");
        return;
        }
    }
    else if(filter == "Abteilung"){
      try {
        BufferedReader br = new BufferedReader(new FileReader(kundenListenPfad));
        String line="";
        
        FileWriter fw= new FileWriter(filepath, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        while((line = br.readLine()) != null) {
          boolean semaphore = false;
            String [] values = line.split(";");
            if(values[4].equals(einzuladender)) {
            //Test: Nutzer ist noch nicht eingeladen
              int checkDoubles = 0;
              
              if(values[4].equals(angemeldeterNutzer.getNutzername())){
                continue;
              }
              
              try{
              BufferedReader br2 = new BufferedReader(new FileReader(filepath));
            String line2 = br2.readLine();
            br2.close();
                String [] values2 = line2.split(";");
                  for(int i = 0; i < values2.length; i++) {
                    if(values2[i].equals(values[0])) {
                        checkDoubles++;
                    }
                  }
            }catch(Exception e) {
            semaphore = true;
            }
              
              if(checkDoubles == 0) {
                if(semaphore) {
                  pw.print(values [0]);
                }else{
                  pw.print(";" + values [0]);
                }

                FileWriter fwe= new FileWriter(serverPfad + values[5] + "\\Eingeladen von.csv", true);
                    BufferedWriter bwe = new BufferedWriter(fwe);
                    PrintWriter pwe = new PrintWriter(bwe);
                                  
                    BufferedReader br3 = new BufferedReader(new FileReader(serverPfad + values[5] + "\\Eingeladen von.csv"));
              String line3 = br3.readLine();
              br3.close();
              if(line3 == null) {
                pwe.print(aktuellerPfad);
              }else {
                pwe.print(";" + aktuellerPfad);
              }
              
                  pwe.flush();
                pwe.close();
              }
            }
          }
        JOptionPane.showMessageDialog(null, "Abteilung wurde eingeladen.");
              
        pw.flush();
        pw.close();
        br.close();
        
        }catch(Exception e) {
          JOptionPane.showMessageDialog(null, "Es ist etwas schief gelaufen.");
        return;
        }
    } else {
      JOptionPane.showMessageDialog(null, "Bitte wählen sie einen Filter aus.");
    }
  } 

  /* Eine Methode, welche im Einladen-Fenster dafür sorgt, dass der ausgewählte
   * Filter aus der Combobox "jComboBoxEinladen" ausgelesen wird und in
   * Abhängigkeit vom Inhalt wird die "jComboBoxFilter" angepasst.
   */
   
     
  public void buttonAufEigeneDateienundOrdnerzugreifen_ActionPerformed(ActionEvent evt) {
    //Knopf auf Startseite um auf eigene Dateien und Ordner zuzugreifen,durch Methodenaufruf
    
    clear();
    dateiMenue();  
  } 
  
  public void buttonAufaufdaseigeneProfilzugreifen_ActionPerformed(ActionEvent evt) {
    //Knopf auf Startseite um auf das eigene Profil zuzugreifen, durch Methodenaufruf    
    clear();
    profilOeffnen();
  }
  
  public void profilOeffnen() {
    //Methode für den Profil Aufruf  
    int frameWidth = 550; 
    int frameHeight = 550;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    
    // Profil in den sichtbaren Bereichen bewegen
    buttonProfilLoeschen.setBounds(16, 464, 150, 40);
    buttonHilfe.setBounds(8, 8, 150, 40);
    buttonPasswortAendern.setBounds(192, 464, 150, 40);
    buttonAusloggenProfil.setBounds(368, 464, 150, 40);
    buttonProfilLoeschen.setBounds(16, 464, 150, 40);
    buttonPasswortAendern.setBounds(192, 464, 150, 40);
    labelEigenerName.setBounds(125, 86, 300, 63);
    labelEigeneEmail.setBounds(125, 148, 300, 45);
    labelZugeteilteAbteilungen.setBounds(200, 266, 150, 40);
    buttonZurueckzurStartseite.setBounds(376, 8, 150, 40);
    labelAbteilungsbeispiel.setBounds(125, 300, 300, 41);
    
  } 
  
  public void buttonProfilLoeschen_ActionPerformed(ActionEvent evt) {
    //Knopf um nach Nachfrage den Nutzer aus der Kundenliste
Object[] options = {"Yes", "No"};
      int ret = JOptionPane.showOptionDialog(this, "Sind sie sich sicher, dass sie Ihr Profil löschen möchten?", "Sicherheitswarnung", 
      JOptionPane.YES_NO_OPTION, 
      JOptionPane.WARNING_MESSAGE,null, 
      options, options[0]);

      File ordner = new File(serverPfad + angemeldeterNutzer.getEMail());
      if (ret == JOptionPane.YES_OPTION) {
          deletedir(ordner);
          System.out.println(serverPfad + angemeldeterNutzer.getEMail());
          removeRecord(kundenListenPfad, angemeldeterNutzer.getNutzername());
          ausloggen();

          }
  }
  
  
  public void buttonHilfeProfil_ActionPerformed(ActionEvent evt) {
    //Knopf um zurueck zum Profil zu gelangen
    clear();
    profilHilfe();
    
  } 
  
  public void buttonPasswortAendern_ActionPerformed(ActionEvent evt) {
    //Nach einer Sicherheitsfrage, wird das Passwort nach wunsch geändert  
   
   Object[] options = {"Yes", "No"};
     int ret = JOptionPane.showOptionDialog(this, "Sicher das sie das Passwort ändern wollen?", "Sicherheitswarnung", 
     JOptionPane.YES_NO_OPTION, 
     JOptionPane.WARNING_MESSAGE,null, 
     options, options[0]);
      
     if (ret == JOptionPane.YES_OPTION) {
     String m = JOptionPane.showInputDialog("Wie soll Ihre neues Passwort lauten?");
     if ((m.length() < 6)) {
       JOptionPane.showMessageDialog(null, "Das neue Passwort darf nicht leer sein. Es muss aus mindestens 6 Zeichen bestehen.");
     }
     else if ((editRecord(kundenListenPfad, angemeldeterNutzer.getNutzername(), m)) == 1 ){
     JOptionPane.showMessageDialog(null, "Ihr Passwort wurde erfolgreich geändert.");
      }
      }
  } 
  
  public void buttonAusloggenProfil_ActionPerformed(ActionEvent evt) {
    //Knopf um die Methode aufzurufen, welche das Programm beendet
    ausloggen(); 
  } 
  
  public void ausloggen() {
    //Funktion um das Programm sicher zu beenden
    System.exit(0);
  }
     
  public void buttonZurueckzurStartseite_ActionPerformed(ActionEvent evt) {
    //Knopf auf Profil um zurück auf Startseite zu kommen, durch Methodenaufruf   
    clear();
    startseiteOeffnen();         
  } 
  private void bHilfeZurueckzumStartseite_ActionPerformed(ActionEvent evt) {
    //Knopf um von der Hilfe zurück zur Startseite zu gelangen
    clear();
    startseiteOeffnen();
  }
  
  public void startseiteOeffnen() {
    //Methode die die Startseite generiert wird 
    int frameWidth = 600; 
    int frameHeight = 550;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    
    // Startseite in den sichtbaren Bereich bewegen
    buttonAufEigeneDateienundOrdnerzugreifen.setBounds(150, 184, 300, 80);
    buttonAufaufdaseigeneProfilzugreifen.setBounds(150, 288, 300, 80);
    buttonAusloggenStartseite.setBounds(440, 424, 129, 33);
    buttonHilfeStartseite.setBounds(440, 464, 129, 33);
    labelWilkommenzuIhrerStartseite.setBounds(100, 33, 400, 50);
    labelWasmoechtenSietun.setBounds(150, 104, 300, 50);
    bZurAdminansicht.setBounds(225, 385, 160, 70);
  }
  
  public void buttonAusloggenStartseite_ActionPerformed(ActionEvent evt) {
    //Knopf um das Programm zu beenden  bzw. die Methode aufzurufen, welche dies tut
    ausloggen();
    
  } 
  
  public void buttonHilfeStartseite_ActionPerformed(ActionEvent evt) {
    //Knopf um zum Hilfelayout in der Startseite zu gelangen
    clear();
    hilfeStartseite();
    
  }
  //Ende Roman Startseite und Profil Methoden
  
  //Anfang Roman Hilfe auf Profil Methoden
  public void bHilfeZurueckzumProfil_ActionPerformed(ActionEvent evt) {
    //Knopf um von der Hilfe Ansicht zum Profil zurückzukehren
    clear();
    zurueckVonHilfeZuProfil();
  } 
  
  public void profilHilfe(){
    //Methode die die Hilfeseite im Profil erstellt
    clear();
    int frameWidth = 455; 
    int frameHeight = 550;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    //Hilfeseite in den sichtbaren Bereich bewegen  
    lHilfeUeberschrift.setBounds(8, 8, 78, 57);
    lHilfeZurueckZurStartseite.setBounds(8, 80, 185, 49);
    jHilfeBeschreibungStartseiteScrollPane.setBounds(8, 136, 425, 35);
    lHilfeProfilLoeschen.setBounds(8, 176, 185, 49);
    jHilfeBeschreibungProfilLoeschenScrollPane.setBounds(8, 232, 425, 50);
    lHilfePasswortaendern.setBounds(8, 288, 185, 49);
    jHilfeBeschreibungPasswortAendernScrollPane.setBounds(8, 344, 425, 35);
    jHilfeBeschreibungSonstigesScrollPane.setBounds(8, 424, 425, 35);
    bHilfeZurueckzumProfil.setBounds(282, 8, 150, 40);
  }
    
  public void zurueckVonHilfeZuProfil() {
    //Knopf zum Öffnen des Profils
    clear();
    profilOeffnen();
  }
  //Ende Roman Hilfe auf Profil Methoden
  //Anfang Roman Anmeldeanfrage Überprüfen 
  
  public int anmeldeÜberprüfung(String NUTZERNAME, String PASSWORT) {
    //Methode zur Überprüfung der Anmelde Daten (Nutzername Passwort)
   //Wenn Nutzername und Passwort stimmen wird eine Instanz der Klasse Nutzer erstellt, welche alle Attribute des jeweilligen Nutzers bekommt
    
    String path = kundenListenPfad;
    String line = "";
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      
      while((line = br.readLine()) != null) {
        String [] values = line.split(";");
        String tempNutzername = values [0];
        String tempNachname = values [1];
        String tempVorname = values [2];
        String tempPasswort = values [3];
        String tempAbteilung = values [4]; 
        String tempEmail = values [5];
        String tempRegistrierungsdatum = values [6];
        
        if (tempNutzername.equals(NUTZERNAME)) {
          if (tempPasswort.equals(PASSWORT)) {
            
            angemeldeterNutzer.setNutzername(tempNutzername);
            angemeldeterNutzer.setNachname(tempNachname);
            angemeldeterNutzer.setVorname(tempVorname);
            angemeldeterNutzer.setPasswort(tempPasswort);
            angemeldeterNutzer.setEMail(tempEmail);
            angemeldeterNutzer.setAbteilung(tempAbteilung);
            angemeldeterNutzer.setRegistrierungszeitpunkt(tempRegistrierungsdatum);
            
            return 1;
          }
          else {
            return 0;
          }
        }  
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return 99;
    
  }
  
  //Anfang Roman Anmeldeanfrage Überprüfen 
  public void bFilterZurueck_ActionPerformed(ActionEvent evt) {
    //Knopf um aus der Filter funktion zurück zur Dateimenue zurückzukehren
    
    clear();
    dateiMenue();
  } 
  
  public void bNew_ActionPerformed(ActionEvent evt) {
    //Layout bzw. View fürs Neuerstellen eines Ordners oder einer Datei wird geöffnet 
    clear();
    setSize(241,245);
    tfNamehierEingeben.setBounds(8, 96, 209, 41);
    lDatei.setBounds(24, 32, 65, 41);
    lOrdner.setBounds(120, 32, 80, 41);
    checkboxDatei.setBounds(48, 72, 17, 17);
    checkboxOrdner.setBounds(160, 72, 17, 17);
    bErstellen.setBounds(56, 144, 113, 33);
    
    
    
  } 
  public void checkboxDatei_ItemStateChanged(ItemEvent evt) {
    //Checkbox, welche aus Knopfdruck die andere Deaktiviert, damit nicht beide gleichzeitig aktiv sind
    checkboxOrdner.setState(false);
  } // end of checkbox3_ItemStateChanged
  public void checkboxOrdner_ItemStateChanged(ItemEvent evt) {
    //Checkbox, welche aus Knopfdruck die andere Deaktiviert, damit nicht beide gleichzeitig aktiv sind
    checkboxDatei.setState(false);
  } // end of checkbox3_ItemStateChanged

  public void bOpen_ActionPerformed(ActionEvent evt) {
    //Oeffnen des Ausgewhälten Ordners
        open_ordner();
        
  }
  public void bErstellen_ActionPerformed(ActionEvent evt) {
    //Button zur Erstellung eines Ordners oder einer Datei, jenachdem welche Funktion man mit der Checkbox ausgewählt hat
   
    String Name = tfNamehierEingeben.getText();
    String path = aktuellerPfad; 
    System.out.println("Aktueller Pfad beim Neuerstellen: "+ aktuellerPfad);
    File file = new File(path);
    if (checkboxDatei.getState()) {
      try {
        //File f = new File(serverPfad+angemeldeterNutzer.getEMail()+"\\"+Name+".txt");
        File f = new File(aktuellerPfad+"//"+Name+".txt");
        if(!f.exists()){
          f.createNewFile();
          
          clear();
          dateiMenue();    
        }else{
          System.out.println("File already exists");
          jMeldung.showMessageDialog(this, "Bitte einen anderen Namen verwenden", "Datei bereits vorhanden.", JOptionPane.WARNING_MESSAGE);
        }
      
        
      }catch(Exception e) {
        System.out.println("File erstellen fehlgeschlagen");
      }
      return ;      
    } // end of if
    
    if (checkboxOrdner.getState()) {
      String dirName = Name;
      File dir = new File(path+"\\"+dirName);
      if (dir.mkdir()) {
        System.out.println("Ordner erstellt: " + Name); 
        File neuExcel = new File(path+"\\"+Name+"\\Eingeladen.csv");
        try {
          neuExcel.createNewFile();
        }catch (Exception e) {
          System.out.println("Fehler beim Eingeladen Datei erstellen");
        }
        
        clear();
        dateiMenue();
        
      } else {
        System.out.println(dir + " Order konnte nicht erstellt werden (existiert schon)");
        jMeldung.showMessageDialog(this, "Bitte einen anderen Namen verwenden", "Datei bereits vorhanden.", JOptionPane.WARNING_MESSAGE);
      } 
      
    } // end of if
    clear();
    dateiMenue();
    
  } // end of bErstellen_ActionPerformed
  
  public void bUmbennen_ActionPerformed(ActionEvent evt) {
    //Button zum Umbennen, von der Datei/Ordner, die sich in den Comboboxen befinden, je nachdem Ob sie mit der Checkbox ausgewählt wurden
    String s = JOptionPane.showInputDialog( "Neuer Name hier eingeben: " );
     System.out.println( "Du hast es so gennant: " + s + "Pfad: "+aktuellerPfad);
    if (checkboxComboOrdner.isSelected()) {
     File file = new File(aktuellerPfad+"//"+ jEigeneDateienUndOrdner.getSelectedItem());
       file.renameTo(new File(aktuellerPfad+"//"+s));
    } if (checkboxComboDatei.isSelected()) {
      File file = new File(aktuellerPfad+"//"+ jDateien.getSelectedItem());   
      file.renameTo(new File(aktuellerPfad+"//"+s));
      } 
     
     
    
    JOptionPane.showMessageDialog(null,"Erfolgreich in: "+ s+ " umbenannt. ");
    clear();
    dateiMenue();
  }
  
  public void bDelete_ActionPerformed(ActionEvent evt) {
    //Button zum Löschen, mit Sicherheitsnachfrage
    //Bei Ja -> wird die deletedir Methode aufgerufen und bekommt, den Pfad übergeben als File
    Object[] options = {"Yes", "No"};
                int ret = JOptionPane.showOptionDialog(this, "Sind sie sich sicher, dass sie den gesamten Inhalt löschen wollen?", "Sicherheitswarnung", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE,null, 
                options, options[0]);
                
                if (ret == JOptionPane.YES_OPTION) {
                  
                
      File index = new File(aktuellerPfad+ "//"+ jEigeneDateienUndOrdner.getSelectedItem());
      System.out.println("Jetzt wird gelöscht an der Stelle: "+ aktuellerPfad+"//"+ jEigeneDateienUndOrdner.getSelectedItem());
   deletedir(index);

      clear();
    dateiMenue();    
            }
            }
  
   public void checkboxComboDatei_ItemStateChanged(ItemEvent evt) {
    //Funktion setzt die Checkbox für die Ordner auf aus, damit immer nur eine gelichzeitig Aktiv ist
    checkboxComboOrdner.setSelected(false);
    
  } // end of checkbox3_ItemStateChanged
  public void checkboxComboOrdner_ItemStateChanged(ItemEvent evt) {
    //Funktion setzt die Checkbox für die Dateien auf aus, damit immer nur eine gelichzeitig Aktiv ist
    checkboxComboDatei.setSelected(false);
    
  } // end of checkbox3_ItemStateChanged  
  
  public void AdminAnsichtMenue() {
    int frameWidth = 300; 
    int frameHeight = 400;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    lAdminansichtAdminAnsicht.setBounds(75, 24, 150, 50);
    lWasmoechtenSietun.setBounds(75, 88, 150, 50);
    bAdminansichtZurueckZurStartseite.setBounds(75, 264, 150, 70);
    bAbteilungbearbeiten.setBounds(75, 168, 150, 70);
    jAbteilungBearbeitenComboBox1.setBounds(155, 392, 250, 30);
    
  }
  public void AbteilungBearbeiten ()  {
    
    int frameWidth = 400; 
    int frameHeight = 550;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    lAbteilungBearbeitenWelcheAbteilungmoechtenSiebearbeiten.setBounds(25, 8, 350, 80);
    jAbteilungBearbeitenComboBox1.setBounds(75, 88, 250, 30);
    lWelcheOperationenmoechtenSieausfuehren.setBounds(25, 120, 350, 80);
    bAbteilungBearbeitenEntfernen.setBounds(72, 200, 120, 60);
    bAbteilungBearbeitenUmbennen.setBounds(200, 200, 120, 60);
    lMoechtenSieeineneueAbteilungerstellen.setBounds(25, 264, 350, 80);
    bAbteilungBearbeitenHinzufuegen.setBounds(140, 376, 120, 30);
    bZurueckzurAdminAnsicht.setBounds(50, 440, 300, 40);
    jAbteilungBearbeitenTextField1.setBounds(75, 330, 250, 30);
    
  }
  public void bZurAdminansicht_ActionPerformed(ActionEvent evt) {
    //Knopf um die Methode aufzurufen, welche zur Adminansicht führt
    clear();
    AdminAnsichtMenue();
    
  } // end of bZurAdminansicht_ActionPerformed

  public void bAdminZurueckzurStartseite_ActionPerformed(ActionEvent evt) {
    //Knopf um aus der Admin Ansicht zurück zur Startseite zu kommen
    clear();
    startseiteOeffnen();
    
  } // end of bAdminZurueckzurStartseite_ActionPerformed

  public void bAbteilungbearbeiten_ActionPerformed(ActionEvent evt) {
    //Knopf zum Öffnen des Menues Abteilung Bearbeiten
    clear();
    AbteilungBearbeiten();
    
  } // end of bAbteilungbearbeiten_ActionPerformed

  public void bAdminansichtZurueckZurStartseite_ActionPerformed(ActionEvent evt) {
    //Zurück Knopf zur Startseite 
    clear();
    startseiteOeffnen();
    
  } // end of bAdminansichtZurueckZurStartseite_ActionPerformed

  public void bAbteilungBearbeitenEntfernen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bAbteilungBearbeitenEntfernen_ActionPerformed

  public void bAbteilungBearbeitenUmbennen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bAbteilungBearbeitenUmbennen_ActionPerformed

  public void bAbteilungBearbeitenHinzufuegen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bAbteilungBearbeitenHinzufuegen_ActionPerformed

  public void bZurueckzurAdminAnsicht_ActionPerformed(ActionEvent evt) {
    //ruft die Methode AdminAnsichtMenue auf
    clear();
    AdminAnsichtMenue();
    
  } // end of bZurueckzurAdminAnsicht_ActionPerformed
  public void bFilterbestaetigen_ActionPerformed(ActionEvent evt) {
    //Knopfdruck führt zum lesen der Abteilungstabelle und fügt jenachdem, ob Filtern nach Abteilung oder nach Benutzer ausgewählt wurde,
    //dies in die Combobox ein
    //return : Gibt eine Fehlermeldung aus, wenn z.B. die Person schon eingeladen wurde  (kein richtiger return)
    String filter = jComboBoxEinladen.getSelectedItem().toString();
    if(filter == "Benutzer"){
      String path = kundenListenPfad;
      String line = "";
      String[] tempNutzers = new String[] {};
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                
                
                while((line = br.readLine()) != null) {
                  String [] values = line.split(";");
                  int l = tempNutzers.length;
                  String [] tempString = new String[l+1];
                  for(int i = 0; i < l; i++) {
                    tempString[i] = tempNutzers[i];
                  }
                  tempString[l] = values [0];
                  tempNutzers = tempString;
                }
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            }    
        String comboBox2Liste1[] = tempNutzers;
        DefaultComboBoxModel model2 = new DefaultComboBoxModel(comboBox2Liste1);
        jComboBoxFilter.setModel(model2);
      }
      else if(filter == "Abteilung") {
        String path = serverPfad + "\\Abteilung.csv";
          String line = "";
          String[] tempAbteilungen = new String[] {};
                try {
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    
                    line = br.readLine();
                    tempAbteilungen = line.split(";");
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        DefaultComboBoxModel model3 = new DefaultComboBoxModel(tempAbteilungen);
        jComboBoxFilter.setModel(model3);
      } else {
        JOptionPane.showMessageDialog(null, "Bitte wählen sie einen Filter aus.");
      }
  }
  
  public void auslesen(String pfad) {
    //input pfad, sollte dieser nicht äquivalent zum aktuellen Pfad sein
    //Ähnlich wie die eingeladene Dateien funktion, durchsucht sie den Ordner, jedoch nur nach den Ordnern und gibt diese in der jEigeneDateienUndOrdner (Combobox) wieder.
    //startet die Durchsuchung nach Dateien mit dem Methodenaufruf  findAllFilesInFolder(file)
    System.out.println("Aktueller Pfad während auslesen: "+ aktuellerPfad);
      if (String.valueOf(jEigeneDateienUndOrdner.getSelectedItem())== "null") {
      System.out.println(" IST LEER");                                                     
         } // end of if
      else {
       if (Gedrueckt) {
      aktuellerPfad = String.valueOf(jEigeneDateienUndOrdner.getSelectedItem());
        pfad = aktuellerPfad;
      System.out.println("Beim auslesen beim nachschauen der Eigenen Dateien: " + aktuellerPfad);
    } // end of if   
     else {
      aktuellerPfad= aktuellerPfad+"\\"+String.valueOf(jEigeneDateienUndOrdner.getSelectedItem());
      } // end of if-else
      System.out.println(" Auslesen else: "+ aktuellerPfad);
         File file = new File(aktuellerPfad);
      try {
       String[] directories = file.list(new FilenameFilter() {
      @Override
      public boolean accept(File current, String name) {
      return new File(current, name).isDirectory();
      }
      });
      //System.out.println("HIER:" +Arrays.toString(directories));
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>(directories));
      
    } catch(Exception e) {
         System.out.println("ORDNER LEER");
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>());
      
      System.out.println("Catch beim Auslesen: " + pfad);
    }
    
      findAllFilesInFolder(file);
      }
   } // end of if
  
  public void deletedir(File file) {
    //Rekursive lösch funktion eines gesamten Ordners mitsamt inhalt
      File[] contents = file.listFiles();
    if (contents != null) {
        for (File f : contents) {
            if (! Files.isSymbolicLink(f.toPath())) {
                deletedir(f);
            }
        }
    }
    file.delete();
  }
  public void open_ordner() {
    //Eine Funktion zur Überprüfung der Comboboxen im Dateimenue, danach ob sie leer sind, damit keine durchsuchung stattfindet
  System.out.println("open gedrückt: "+ aktuellerPfad );
    
    if (String.valueOf(jEigeneDateienUndOrdner.getSelectedItem())== "null") {
      aktuellerPfad = aktuellerPfad ;
      System.out.println("Open: ES WIRD IF nichts passiert: " + aktuellerPfad);
     // auslesen(aktuellerPfad+ "\\");
    } // end of if
    else {
      
      //aktuellerPfad = aktuellerPfad +  jEigeneDateienUndOrdner.getSelectedItem();
      System.out.println("Open: ES WIRD ELSE: "+ aktuellerPfad);
      lMenueOrdner.setText(String.valueOf(jEigeneDateienUndOrdner.getSelectedItem()));
      auslesen(aktuellerPfad);
    } // end of if-else  
    
    
        }
     
    public void findAllFilesInFolder(File folder) {
    //Input: Datei (Pfad) als File
    //Durchsucht den Ordner nach Dateien, überspringt die Dateien, welche unabhängige Funktionen im Programm haben. (Bsp: Eingeladen) 
    // Kein return
     System.out.println("Jetzt werden die Dateien gesucht");
    try {
    List<String> liste = new ArrayList<String>();
      for (File file : folder.listFiles()) {
        if (!file.isDirectory()) {
        if ("Eingeladen von.csv".equals(String.valueOf(file.getName()))) {
          System.out.println("Eingeladen von: wird nicht hinzugefügt");
        } // end of if
        else if ("Eingeladen.csv".equals(String.valueOf(file.getName()))) {
          System.out.println("Eingeladen: wird nicht hinzugefügt");
        } // end of if
            else {
            System.out.println("Datei enddeckt!: "+file.getName());
            liste.add(file.getName());
            } // end of if-else
        } else {
          System.out.println("huch ordner: "+ file.getName());
        
        }
      }
    System.out.println("Liste: "+ liste);
     String[] ArrayListe = new String[liste.size()]; 
     for(int i = 0; i < liste.size(); i++) {
       ArrayListe[i] = liste.get(i);
       }        
      jDateien.setModel(new DefaultComboBoxModel<String>(ArrayListe));
        } catch(Exception e) {
          System.out.println("Keine Daten enthalten");
      }
    }   
  

  public int removeRecord(String filepath, String nutzer) {
    //removeTerm ist der Nutzername bei dem etwas geändert werden soll
    
        ArrayList<String> tempArray = new ArrayList<>();
      
        
          try {
            FileReader fr = new FileReader(filepath);
            Scanner reader = new Scanner(fr);
            String line;
            String[] lineArr;
            
            while ((line = reader.nextLine()) != null) {
              lineArr = line.split(";");
              if(lineArr[0].equals(nutzer)) {
                tempArray.remove(line);
              } else {          
                tempArray.add(line);
              }
            }
            fr.close();
            reader.close();
          } catch (Exception e) {
          }
          try (PrintWriter pr = new PrintWriter(filepath)){
              for (String str : tempArray) {
                pr.println(str);
              }
              pr.close();
            } catch (Exception e) { 
            } 
          return 1;
        }
  
  public int editRecord(String filepath, String nutzer, String newPasswort){
    //removeTerm ist der Nutzername bei dem etwas geändert werden soll
    String removeTerm = nutzer;
    String neuesPasswort = newPasswort;
    
    ArrayList<String> tempArray = new ArrayList<>();
  
    
      try {
        FileReader fr = new FileReader(filepath);
        Scanner reader = new Scanner(fr);
        String line;
        String[] lineArr;
        
        while ((line = reader.nextLine()) != null) {
          lineArr = line.split(";");
          if(lineArr[0].equals(removeTerm)) {
            tempArray.add (
                lineArr[0] + ";"+ //0 = Nutzername
                lineArr[1] + ";"+ //1 = Nachname .... usw.
                lineArr[2] +";"+
                neuesPasswort + ";"+
                lineArr[4] + ";"+
                lineArr[5] + ";"+
                lineArr[6]);            
          } else {                
            tempArray.add(line);
          }
        }
        fr.close();
        reader.close();
      } catch (Exception e) {
      }
      try (PrintWriter pr = new PrintWriter(filepath)){
          for (String str : tempArray) {
            pr.println(str);
          }
          pr.close();
        } catch (Exception e) { 
        } 
      return 1;
    }  
  
  public void dateiGrößeBestimmen(String DateiPFAD) {
    File f = new File(DateiPFAD); 
        double fileSize = f.length() / 1024d;
        System.out.println(fileSize + "kb");  //ansatt Print später mit return
  }
  
  public void countKunden(String KundenlistenPFAD) throws IOException{
  
    BufferedReader bufferedReader = new BufferedReader(new FileReader(KundenlistenPFAD));
      String input;
      int count = 0;
      while((input = bufferedReader.readLine()) != null)
      {
          count++;
      }
  
      System.out.println("Count : "+count); //ansatt Print später mit return
      bufferedReader.close();
  }
  
  public void ordnerGrößeBestimmen(String OrdnerPFAD) {
    String dirName = "TestOrdner"; //Hier Ordnerpfad angeben
        File dir = new File(dirName);
        if(!dir.exists()) {
            System.err.println(dir + " existiert nicht! - Abbruch"); //Falls Ordner nicht vorhanden
        }
        else {
          long fileSize = readDir(dir, 0);
            System.out.println(fileSize / 1024d + "kb");
        }
  }
  
  private long calculateFileSize(File f) {
        if (!f.exists()) {
            return 0;
        }
        return f.length();
    }
  
  private long readDir(File dir, long l) {
        System.out.println("reading directory " + dir.toString());
        File[] files = dir.listFiles();
        for(File f : files) {
            if(f.isDirectory()) {
                readDir(f, l); //rekursiver Aufruf falls ein Ordner einen weiteren Ordner besitzt
            }else{
                long fSize = calculateFileSize(f);
                System.out.println("\t" + f.toString() + " -> " + fSize);
                l += fSize;
            }
        }
        return l;
        }
    
    
  private void bEingeladeneDateien_ActionPerformed(ActionEvent evt) { 
    //Dieser Knopf verändert das Dateimenue zum Einlademenue, zeigt nur die Buttons, die man nutzen kann wenn man eingeladen wurde
    //Jenachdem ob der Knopf bereits gedrückt wurde ,wechselt das Programm auf den anderen Zustand   
      if (Gedrueckt) {
      Gedrueckt = false;           
      bEingeladeneDateien.setText("Eingeladene Dateien");
      lEigeneDateienundOrdner.setText("Eigene Dateien und Ordner");
      lMenueOrdner.setText("Eigene Ordner");
      dateiMenue();  
      } // end of if
    else {
      String[] leerListe = new String[] {};
    DefaultComboBoxModel model3 = new DefaultComboBoxModel(leerListe);
    jDateien.setModel(model3);
       Gedrueckt=true;
      bInvite.setBounds(1000, 1000, 89, 41); 
    bDelete.setBounds(1000, 1000, 89, 41); 
    bOpen.setBounds(592, 176, 89, 41); 
    bNew.setBounds(592, 128, 89, 41);
    bDateiMenueZurueck.setBounds(592,368, 89, 41);
    jEigeneDateienUndOrdner.setBounds(40, 80, 500, 150);
    jDateien.setBounds(40,270 , 500, 170);
    bEingeladeneDateien.setText("Eigene Dateien");
    checkboxComboOrdner.setBounds(540, 140, 50, 60);
    checkboxComboDatei.setBounds(540,330 , 50, 60);
    lEigeneDateienundOrdner.setBounds(40, 0, 500, 57);
    lMenueOrdner.setText("Ordner");
      
      lEigeneDateienundOrdner.setText("Eingeladene Ordner ");
      
      eingeladeneDateienAnzeigen();
    } // end of if-else
             
  }
  public void eingeladeneDateienAnzeigen() {
     // Auf Knopfdruck wird diese Methode aufgerufen.
    //Diese Methode fügt in die Combobox, die Ordner ein, zu denen der Nutzer eingeladen wurde.
   String eingeladenPfad= "Server\\nutzer@gmail\\Ordner1"; 
    System.out.println(eingeladenPfad); 
    aktuellerPfad= eingeladenPfad;
        System.out.println("Aktueller Pfad von Eingeladenen: "+ aktuellerPfad);
     
       File file = new File(aktuellerPfad);
      try {
       String[] directories = file.list(new FilenameFilter() {
      @Override
      public boolean accept(File current, String name) {
      return new File(current, name).isDirectory();
      }
      });
      System.out.println("HIER:" +Arrays.toString(directories));
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>(directories));
      
    } catch(Exception e) {
         System.out.println("ORDNER LEER");
      jEigeneDateienUndOrdner.setModel(new DefaultComboBoxModel<String>());
      
      System.out.println("Catch beim Auslesen von Eingeladenen Dateien : " + aktuellerPfad);
    }
    
    String path = "Server\\"+angemeldeterNutzer.EMail+"\\Eingeladen von.csv";
          String line = "";
          String[] eingeladenePfade = new String[] {};
                try {
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    
                    line = br.readLine();
                    eingeladenePfade = line.split(";");
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        DefaultComboBoxModel model3 = new DefaultComboBoxModel(eingeladenePfade);
        jEigeneDateienUndOrdner.setModel(model3);
        
    
    
      }   
  public void AdminCheck() {
     String[] arr = new String[10];
    arr[0]="peik@gmail.com";
   // if (angemeldeterNutzer.EMail ) {
      
  //  } // end of if
    
  }
  }

  
    
// Ende Methoden    


