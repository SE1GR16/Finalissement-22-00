
// Notwendige Packages importieren
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
* Eine Klasse für die Protokollierung. 
* Welcher Nutzer hat wann welche Operation mit welcher Datei bzw. mit welchem Verzeichnis ausgefuhrt,
* sind in einer csv Datei gespeichert.
*/
public class Log {
    /**
     *  Eine Variable für die Pfade der csv Datei, wo alle Informationen gespeichert werden.
     */
    public String filePath;
    /**
     *  Eine Methode, die die Pfade der Datei definiert
     * @param filePath wo die Protokollierung speichert ist
     */
    public Log(String filePath) {
        this.filePath = filePath;
    }
    /**
     *  Eine Methode, die Benutzername, die Dateiname und die Funktion protokolliert
     * @param username die Benutzername
     * @param filename die Dateiname
     * @param Funktion welche Operation hat der Benutzer ausgeführt
     */
    public void Logchange(String username, String filename, String Funktion) {
        // Getter für Datum und Zeit 
    	java.util.Date date = Calendar.getInstance().getTime(); 
    	// Format für die Zeit definieren
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss z");  
        // Format anwenden
        String time = dateFormat.format(date);
        //Ein Filewriter erstellen, sodass alle Information in einer Datei speichert sind
        try {
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            // Print die Benutzername, Dateiname, Funktion und die Zeit
            pw.println(username + ";" + filename + ";" + Funktion + ";" + time);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
