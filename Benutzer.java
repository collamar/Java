package de.fhe.prg4.db.model;
import javax.persistence.*;


/** */
@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Benutzer {
	/** */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long m_ID;
	
	/** */
	private String m_Benutzername;
	
	/** */
	private String m_Passwort;
	
	/** */
	private String m_Nachnamen;
	
	/** */
	private String m_Vornamen;
	
	/** */
	private String m_Telefonnummer;
	
	/** */
	private String m_Email;
	
	/** */
	@OneToOne
	private Adresse m_Adresse;
	
	
	
	public Benutzer() {
		super();
	}
	
	public Benutzer(
			long Id, 
			String Benutzername, 
			String Passwort, 
			String Nachname, 
			String Vorname,
			String Telefonnummer,
			String Email
			)
	{
		this.m_ID 			= Id;		
		this.m_Benutzername = Benutzername;		
		this.m_Passwort 	= Passwort;		
		this.m_Nachnamen 	= Nachname;
		this.m_Vornamen 	= Vorname;
		this.m_Telefonnummer= Telefonnummer;
		this.m_Email 		= Email;
		this.m_Adresse.setID(Id);
		
	}
	public Benutzer(
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
		this.m_ID 			= Id;		
		this.m_Benutzername = Benutzername;		
		this.m_Passwort 	= Passwort;		
		this.m_Nachnamen 	= Nachname;
		this.m_Vornamen 	= Vorname;
		this.m_Telefonnummer= Telefonnummer;
		this.m_Email 		= Email;
		this.m_Adresse.setID(Id);
		this.m_Adresse.setStrasseHnr(StrasseHnr);
		this.m_Adresse.setPostleitzahl(PlZ);
		this.m_Adresse.setOrt(Ort);
		this.m_Adresse.setLand(Land);
		
	}
	

	public long getID() {
		return m_ID;
	}

	public void setID(long m_ID) {
		this.m_ID = m_ID;
	}

	public String getBenutzername() {
		return m_Benutzername;
	}

	public void setBenutzername(String m_Benutzername) {
		this.m_Benutzername = m_Benutzername;
	}

	public String getPasswort() {
		return m_Passwort;
	}

	public void setPasswort(String m_Passwort) {
		this.m_Passwort = m_Passwort;
	}

	public String getNachnamen() {
		return m_Nachnamen;
	}

	public void setNachnamen(String m_Nachnamen) {
		this.m_Nachnamen = m_Nachnamen;
	}

	public String getVornamen() {
		return m_Vornamen;
	}

	public void setVornamen(String m_Vornamen) {
		this.m_Vornamen = m_Vornamen;
	}

	public String getTelefonnummer() {
		return m_Telefonnummer;
	}

	public void setTelefonnummer(String m_Telefonnummer) {
		this.m_Telefonnummer = m_Telefonnummer;
	}

	public String getEmail() {
		return m_Email;
	}

	public void setEmail(String m_Email) {
		this.m_Email = m_Email;
	}

	public Adresse getAdresse() {
		return m_Adresse;
	}

	public void setAdresse(Adresse m_Adresse) {
		this.m_Adresse = m_Adresse;
	}
	

}
