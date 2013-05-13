package de.fhe.prg4.db.model;
import java.util.List;

import javax.persistence.*;


/** */
@Entity
public class Kunde extends Benutzer{
	/** */
	
	private Benutzer m_Benutzer;
	
	/** */
	//private IZahlung m_Zahlungsart;
	
	/** */
	//@Transient // Wert soll nicht in die Datenbank geschrieben
	//@OneToMany
	private List<Auftrag> m_Auftrag;

	/** */
	public Kunde(
			long Id, 
			String Benutzername, 
			String Passwort, 
			String Nachname, 
			String Vorname,
			String Telefonnummer,
			String Email
			)
	{
		super(Id,Benutzername,Passwort,Nachname,Vorname,Telefonnummer,Email);
			
	}
	public Kunde()
	{
		super();
			
	}
	
	public Kunde(
			long Id, 
			String Benutzername, 
			String Passwort, 
			String Nachname, 
			String Vorname,
			String Telefonnummer,
			String Email,
			String StrasseHnr,
			String Ort,
			String PlZ,
			String Land
			)
	{
		super(	Id,
				Benutzername,
				Passwort,
				Nachname,
				Vorname,
				Telefonnummer,
				Email,
				StrasseHnr, 
				Ort, 
				PlZ, 
				Land);
			
	}
	 
	public Benutzer getBenutzer() {
		return m_Benutzer;
	
	}
	
	public Benutzer setBenutzer() {
		return m_Benutzer;
	
	}
	
	public List<Auftrag> getAuftrag() {
		return m_Auftrag;
	}
	
	public void setAuftrag(List<Auftrag> m_Auftrag) {
		this.m_Auftrag = m_Auftrag;
	}
}
