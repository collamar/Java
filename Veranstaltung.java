package de.fhe.prg4.db.model;

import javax.persistence.*;

/** */
@Entity
public class Veranstaltung
{
    /** */
	@Id
    private int m_ID;
    
    /** */
    private String m_Art;
    
    /** */
    private String m_Name;
    
    /** */
    private Gebaeude m_Gebaeude;
    
    /** */
    @OneToMany
    private Veranstalter m_Veranstalter;
    
    @OneToOne
    private Veranstaltungszeitraum m_Veranstaltungszeitraum;

	public int getID() {
		return m_ID;
	}

	public void setID(int m_ID) {
		this.m_ID = m_ID;
	}

	public String getArt() {
		return m_Art;
	}

	public void setArt(String m_Art) {
		this.m_Art = m_Art;
	}

	public String getName() {
		return m_Name;
	}

	public void setName(String m_Name) {
		this.m_Name = m_Name;
	}

	public Gebaeude getGebaeude() {
		return m_Gebaeude;
	}

	public void setGebaeude(Gebaeude m_Gebaeude) {
		this.m_Gebaeude = m_Gebaeude;
	}

	public Veranstalter getVeranstalter() {
		return m_Veranstalter;
	}

	public void setVeranstalter(Veranstalter m_Veranstalter) {
		this.m_Veranstalter = m_Veranstalter;
	}
    
   
}
