package de.fhe.prg4.db.model;
import java.util.List;

import javax.persistence.*;


/** */
@Entity
public class Mitarbeiter extends Benutzer {
	
	/** */
	//@OneToMany
	private List<Veranstaltung> m_Veranstaltung;
	private Benutzer m_Benutzer;
	public Mitarbeiter() {
		super();
	}
	public Mitarbeiter(
			long Id, 
			String Benutzername, 
			String Passwort,
			String Nachname, 
			String Vorname, 
			String Telefonnummer, 
			String Email)
	{
		
		super(Id, Benutzername, Passwort, Nachname, Vorname, Telefonnummer, Email);
		// TODO Auto-generated constructor stub
	}

	public List<Veranstaltung> getVeranstaltung(){
		return m_Veranstaltung;
	}

	public void setVeranstaltung(List<Veranstaltung> m_Veranstaltung) {
		this.m_Veranstaltung = m_Veranstaltung;
	}

	public Benutzer getBenutzer() {
		return m_Benutzer;
	}

	public void setBenutzer(Benutzer m_Benutzer) {
		this.m_Benutzer = m_Benutzer;
	}

	
	
	

	
}
