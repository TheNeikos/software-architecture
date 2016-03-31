
import swa.runningeasy.dtos.*;
import java.util.Date;

enum Geschlecht {
    Maennlich, Weiblich
}

class Adresse {
    private String strasse;
    private String plz;
    private String ort;
    private String land;
    public void Adresse(
            String strasse,
            String plz,
            String ort,
            String land)
    {
        this.strasse = strasse;
        this.plz     = plz;
        this.ort     = ort;
        this.land    = land;
    }
    public String getStrasse() {
        return this.strasse;
    }
    public String getPlz() {
        return this.plz;
    }
    public String getOrt() {
        return this.ort;
    }
    public String getLand() {
        return this.land;
    }
}

class Laeufer {
    private String      name;
    private String      vorname;
    private Geschlecht  geschlecht;
    private Integer     geburtsjahr;
    private String      vereinszugehoerigkeit;
    private String      email;
    private String      sms;
    private Adresse     addr;
    public Laeufer Laeufer(LaeuferDTO param0) {
        return null;
    }
    public String getName() {
        return null;
    }
    public String getVorname() {
        return null;
    }
    public void setVereinszugehoerigkeit(String param0) {
    }
    public Laufergebnis[] getLaufergebnisse() {
        return null;
    }
    public Laeufer[] erstelleStartliste() {
        return null;
    }
    public Laufergebnis[] erstelleErgebnisliste() {
        return null;
    }
    public LaeuferDTO toDTO() {
        return null;
    }
}

class Verein {
    private String name;
    private Adresse addr;
    public Verein Verein(VereinDTO param0) {
        return null;
    }
    public void addLaeufer(Laeufer param0) {
    }
}

class Anmeldung {
    private Boolean bezahlt;
    private Integer startnummer;
    public Anmeldung Anmeldung(AnmeldungDTO param0) {
        return null;
    }
}

class Laufveranstaltung {
    private String name;
    private Date datum;
    private Date anmeldeschluss;
    private Integer startgebuehr;
    private float distanz;
    public Laufveranstaltung Laufveranstaltung(VeranstaltungDTO param0) {
        return null;
    }
    public void anmelden(Laeufer param0) {
    }
    public void disqualifizieren(Laeufer param0) {
    }
    public Laufergebnis[] ergebnislisteErstellen() {
        return null;
    }
    public Laeufer[] listLaeufer() {
        return null;
    }
    public void anmeldungZurueckziehen(Laeufer param0) {
    }
    public Laeufer[] erstelleAufgegebenenListe() {
        return null;
    }
}

class Laufzeit {
    private Integer startnummer;
    private Date laufzeit;
    private String veranstaltung;
    public void Laufzeit(LaufzeitDTO param0) {
    }
}

class Listeneintrag {
    private String name;
    private String vorname;
    private Integer geburtsjahr;
    private char geschlecht;
    private String verein;
    private Integer startnummer;
    private Integer platzierung;
    private Date laufzeit;
    public void Listeneintrag(ListeneintragDTO param0) {
    }
}

class Laufergebnis {
    private Date endzeit;
    private Date zwischenzeit;
    public void Laufergebnis(Date param0,Date param1) {
    }
    public void setEndzeit(Date param0) {
    }
    public void setZwischenzeit(Date param0) {
    }
    public void SMSsenden() {
    }
}

class Bank {
    public Boolean hatUeberwiesen(Laufveranstaltung param0,Laeufer param1) {
        return null;
    }
}

class Zeitmesssystem {
    public Laufergebnis gibZeitLaeufer(Laeufer param0) {
        return null;
    }
}


