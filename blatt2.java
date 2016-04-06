
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
    public Laeufer(LaeuferDTO dto)
    {
        this.name                   = dto.getName();
        this.vorname                = dto.getVorname();
        this.geschlecht             = dto.getGeschlecht();
        this.geburtsjahr            = dto.getGeburtsjahr();
        this.email                  = dto.getEmail();
        this.sms                    = dto.getSms();
        this.addr                   = new Address(
                dto.getStrasse(),
                dto.getPlz(),
                dto.getOrt(),
                dto.getLand()
                );
    }
    public String getName() {
        return name;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVereinszugehoerigkeit(String v) {
        this.vereinszugehoerigkeit = v;
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
        return new LaeuferDTO(this.name,
            this.vorname,
            this.geschlecht,
            this.geburtsjahr,
            this.email,
            this.sms,
            this.addr.getStrasse(),
            this.addr.getPlz(),
            this.addr.getOrt(),
            this.land.getLand()
        );
    }
}

class Verein {
    private String name;
    private Adresse addr;
    private Laeufer[] lauefer;

    public Verein(VereinDTO dto) {
        this.name = dto.getName();
        this.addr = new Address(
            dto.getStrasse(),
            dto.getPlz(),
            dto.getOrt(),
            dto.getLand()
        );
    }
    public void addLaeufer(Laeufer l) {
        l.setVereinszugehoerigket(this.name);
    }
}

class Anmeldung {
    private Boolean bezahlt;
    private Integer startnummer;
    private Verein verein;

    public Anmeldung(AnmeldungDTO dto) {
		this.laeufer = Laeufer(dt.getLaeufer());
		this.bezahlt = dto.getBezahlt;
		this.veranstaltung = dto.getVeranstaltung;
		this.verein = dto.getVerein;
		this.startnummer = dto.getStartnummer;
    }
}

class Laufveranstaltung {
    private String name;
    private Date datum;
    private Date anmeldeschluss;
    private Integer startgebuehr;
    private float distanz;
    public Laufveranstaltung(VeranstaltungDTO dto) {
        return null;
    }
    public void anmelden(Laeufer lauf) {
    }
    public void disqualifizieren(Laeufer lauf) {
    }
    public Laufergebnis[] ergebnislisteErstellen() {
        return null;
    }
    public Laeufer[] listLaeufer() {
        return null;
    }
    public void anmeldungZurueckziehen(Laeufer lauf) {
    }
    public Laeufer[] erstelleAufgegebenenListe() {
        return null;
    }
}

class Laufzeit {
    private Integer startnummer;
    private Date laufzeit;
    private String veranstaltung;
    public Laufzeit(LaufzeitDTO dto) {
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
    public Listeneintrag(ListeneintragDTO dto) {
    }
}

class Laufergebnis {
    private Date endzeit;
    private Date zwischenzeit;
    public Laufergebnis(Date anfag, Date ende) {
    }
    public void setEndzeit(Date ende) {
    }
    public void setZwischenzeit(Date zwischenzeit) {
    }
    public void SMSsenden() {
    }
}

class Bank {
    public Boolean hatUeberwiesen(Laufveranstaltung ver,Laeufer lauf) {
        return null;
    }
}

class Zeitmesssystem {
    public Laufergebnis gibZeitLaeufer(Laeufer lauf) {
        return null;
    }
}


