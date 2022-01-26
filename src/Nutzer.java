/**
 *
 * Mit der Nutzer Klasse kann man Nutzer Objekte erstellen. Die Eigenschaften vom Nutzer sind folgendes: Nutzername,
 * Nachname, Vorname, Passwort, EMail, Abteilung, Registrierungszeitpunkt. Alle Eigenschaften sind String Wert
 *
 * @version 1.0
 * @author SE16
 */

public class Nutzer {
  
  // Anfang Attribute
  public String Nutzername;
  public String Nachname;
  public String Vorname;
  public String Passwort;
  public String EMail;
  public String Abteilung;
  public String Registrierungszeitpunkt;
  // Ende Attribute
  
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man den Nutzername bekommen
   * @return String Wert Nutzername
   */
  public String getNutzername() {
	  return Nutzername;
  } 
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert vom Nutzername definieren
   * @param NutzernameNeu Ein String Wert vom neuen Nutzername
   */
  public void setNutzername(String NutzernameNeu) {
	  Nutzername = NutzernameNeu;
	  
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man den Nachname bekommen
   * @return String Wert Nachname
   */
  public String getNachname() {
    return Nachname;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert vom Nachname definieren
   * @param NachnameNeu Ein String Wert vom neuen Nachname
   */
  public void setNachname(String NachnameNeu) {
    Nachname = NachnameNeu;
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man den Vorname bekommen
   * @return String Wert Vorname
   */
  public String getVorname() {
    return Vorname;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert vom Vorname definieren
   * @param VornameNeu Ein String Wert vom neuen Vorname
   */
  public void setVorname(String VornameNeu) {
    Vorname = VornameNeu;
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man das Passwort bekommen
   * @return String Wert Passwort
   */
  public String getPasswort() {
    return Passwort;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert vom Passwort definieren
   * @param PasswortNeu Ein String Wert vom neuen Passwort
   */
  public void setPasswort(String PasswortNeu) {
    Passwort = PasswortNeu;
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man die Email Adresse bekommen
   * @return String Wert Email Adresse
   */
  public String getEMail() {
    return EMail;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert von der Email Adresse definieren
   * @param EMailNeu Ein String Wert von der neuen Email Adresse
   */
  public void setEMail(String EMailNeu) {
    EMail = EMailNeu;
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man die Abteilung bekommen
   * @return String Wert Abteilung
   */
  public String getAbteilung() {
    return Abteilung;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert von der Abteilung definieren
   * @param AbteilungNeu Ein String Wert von der neuen Abteilung
   */
  public void setAbteilung(String AbteilungNeu) {
    Abteilung = AbteilungNeu;
  }
  /**
   * Eine Getter Methode, die einen String Wert zurückgibt. Mit dieser Methode kann man den Registrierungszeitpunkt bekommen
   * @return String Wert Registrierungszeitpunkt
   */
  public String getRegistrierungszeitpunkt() {
    return Registrierungszeitpunkt;
  }
  /**
   * Eine Setter Methode, die einen String Wert erwartet. Mit dieser Methode kann man den String Wert vom Registrierungszeitpunkt definieren
   * @param RegistrierungszeitpunktNeu Ein String Wert vom Registrierungszeitpunkt
   */
  public void setRegistrierungszeitpunkt(String RegistrierungszeitpunktNeu) {
    Registrierungszeitpunkt = RegistrierungszeitpunktNeu;
  }

  // Ende Methoden
} // end of Nutzerdaten

