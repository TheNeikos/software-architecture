
import swa.runningeasy.dtos.*;
import java.util.Date;

class Adresse {
    public String strasse;
    public String plz;
    public String ort;
    public String land;
    public Adresse(
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
    public String      name;
    public String      vorname;
    public char        geschlecht;
    public Integer     geburtsjahr;
    public Verein      vereinszugehoerigkeit;
    public String      email;
    public String      sms;
    public Adresse     addr;
    public Laeufer(LaeuferDTO dto)
    {
        this.name                   = dto.getName();
        this.vorname                = dto.getVorname();
        this.geschlecht             = dto.getGeschlecht();
        this.geburtsjahr            = dto.getGeburtsjahr();
        this.email                  = dto.getEmail();
        this.sms                    = dto.getSms();
        this.addr                   = new Adresse(
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
    public void setVereinszugehoerigkeit(Verein v) {
        this.vereinszugehoerigkeit = v;
    }
    public Listeneintrag[] getListeneintraege() {
        return null;
    }
    public Laeufer[] erstelleStartliste() {
        return null;
    }
    public Listeneintrag[] erstelleErgebnisliste() {
        return null;
    }
    public LaeuferDTO toDTO() {
        return new LaeuferDTO(this.name,
            this.vorname,
            this.geburtsjahr,
            this.geschlecht,
            this.email,
            this.sms,
            this.addr.getStrasse(),
            this.addr.getPlz(),
            this.addr.getOrt(),
            this.addr.getLand()
        );
    }
}

class Verein {
    public String name;
    public Adresse addr;
    public Laeufer[] lauefer;

    public Verein(VereinDTO dto) {
        this.name = dto.getName();
        this.addr = new Adresse(
            dto.getStrasse(),
            dto.getPlz(),
            dto.getOrt(),
            dto.getLand()
        );
    }
    public void addLaeufer(Laeufer l) {
        l.setVereinszugehoerigkeit(this);
    }
}

class Anmeldung {
    public Boolean bezahlt;
    public Integer startnummer;
    public Verein verein;
    public Laeufer laeufer;

    public Anmeldung(AnmeldungDTO dto) {
		this.laeufer       = new Laeufer(dto.getLaeufer());
		this.bezahlt       = dto.getBezahlt();
		this.veranstaltung = dto.getVeranstaltung();
		this.verein        = new Verein(dto.getVerein());
		this.startnummer   = dto.getStartnummer();
    }
}

class Laufveranstaltung {
    public String name;
    public Date datum;
    public Date anmeldeschluss;
    public Integer startgebuehr;
    public float distanz;
    public Listeneintrag[] eintraege;
    public Laufveranstaltung(VeranstaltungDTO dto) {
        this.name           = dto.getName();
        this.datum          = dto.getDatum();
        this.anmeldeschluss = dto.getAnmeldeschluss();
        this.startgebuehr   = dto.getStartgebuehr();
        this.distanz        = dto.getDistanz();
    }
    public void anmelden(Laeufer lauf) {
        this.eintraege.add(new Listeneintrag(lauf, this));
    }
    public void disqualifizieren(Laeufer lauf) {
    }
    public Listeneintrag[] ergebnislisteErstellen() {
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
    public Integer startnummer;
    public Date laufzeit;
    public String veranstaltung;
    public Laufzeit(LaufzeitDTO dto) {
		this.startnummer    = dto.getStartnummer();
		this.laufzeit       = dto.getLaufzeit();
		this.veranstaltung  = dto.getVeranstaltung();
    }
}

class Listeneintrag {
    public String name;
    public String vorname;
    public Integer geburtsjahr;
    public char geschlecht;
    public String verein;
    public Integer startnummer;
    public Integer platzierung;
    public Date laufzeit;
    public Laeufer laeufer;
    public Laufveranstaltung veranstaltung;

    public Listeneintrag(Laeufer lauf, Laufveranstaltung ver) {
        this.laeufer = lauf;
        this.veranstaltung = ver;
    }

    public Listeneintrag(ListeneintragDTO dto) {
		this.name           = dto.getName();
		this.vorname        = dto.getVorname();
		this.geburtsjahr    = dto.getGeburtsjahr();
		this.geschlecht     = dto.getGeschlecht();
		this.verein         = dto.getVerein();
		this.startnummer    = dto.getStartnummer();
		this.platzierung    = dto.getPlatzierung();
		this.laufzeit       = dto.getLaufzeit();
    }
}

class Bank {
    public Boolean hatUeberwiesen(Laufveranstaltung ver,Laeufer lauf) {
        return null;
    }
}

class Zeitmesssystem {
    public Date gibZeit(Laeufer lauf) {
        return null;
    }
}





