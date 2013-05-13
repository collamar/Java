package de.fhe.prg4.db.model;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/** */
@Entity
public class Veranstalter
{
    /** */
	@Id
    private int m_ID;
    
    /** */
    private String m_Name;
    
    /** */
    private String m_Steuernummer;
    
    /** */
    private String m_Kontonummer;
    
    /** */
    private String m_BLZ;
    
    @ManyToOne(mappedBy = "m_Veranstalter")
    private List<Veranstaltung> m_VeranstaltungsListe;
    
    /** */
    @OneToOne
    private Adresse m_Adresse;

	public Adresse getAdresse() {
		return m_Adresse;
	}

	public void setAdresse(Adresse m_Adresse) {
		this.m_Adresse = m_Adresse;
	}

	public String getBLZ() {
		return m_BLZ;
	}

	public void setBLZ(String m_BLZ) {
		this.m_BLZ = m_BLZ;
	}

	public String getKontonummer() {
		return m_Kontonummer;
	}

	public void setKontonummer(String m_Kontonummer) {
		this.m_Kontonummer = m_Kontonummer;
	}

	public String getSteuernummer() {
		return m_Steuernummer;
	}

	public void setSteuernummer(String m_Steuernummer) {
		this.m_Steuernummer = m_Steuernummer;
	}

	public String getName() {
		return m_Name;
	}

	public void setName(String m_Name) {
		this.m_Name = m_Name;
	}

	public int getID() {
		return m_ID;
	}

	public void setID(int m_ID) {
		this.m_ID = m_ID;
	}
}
