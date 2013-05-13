package de.fhe.prg4.db.model;
import java.util.List;

import javax.persistence.*;

/** */
@Entity
public class Adresse
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long m_ID;
    
	
	/** */
	
    private long m_KundenID;
    
    /** */
    private String m_StrasseHnr;
    
    /** */
    private String m_Ort;
    
    /** */
    private String m_Postleitzahl;
    
    /** */
    private String m_Land;
    
   // private char m_AdressArt; // Liefer (l) oder Rechnungsadresse(r) 
    
  
    
    public Adresse(
    		long id,
    		String StrasseHnr,
    		String Ort, 
    		String Plz, 
    		String Land, 
    		char Art)
    {
    	this.m_KundenID 	= id;
    	this.m_StrasseHnr 	= StrasseHnr;
    	this.m_Postleitzahl = Plz;
    	this.m_Ort 			= Plz;
    	this.m_Land 		= Land;
    	//this.m_AdressArt 	= Art;
    
    }
    
    public Adresse()
    {
    	
    	this.m_StrasseHnr 	= " ";
    	this.m_Postleitzahl = " ";
    	this.m_Ort 			= " ";
    	this.m_Land			= " ";
    	//this.m_AdressArt 	= ' ';
    
    }

	public long getID() {
		return m_KundenID;
	}

	public void setID(long m_ID) {
		this.m_KundenID = m_KundenID;
	}

	public String getStrasseHnr() {
		return m_StrasseHnr;
	}

	public void setStrasseHnr(String m_StrasseHnr) {
		this.m_StrasseHnr = m_StrasseHnr;
	}

	public String getOrt() {
		return m_Ort;
	}

	public void setOrt(String m_Ort) {
		this.m_Ort = m_Ort;
	}

	public String getPostleitzahl() {
		return m_Postleitzahl;
	}

	public void setPostleitzahl(String m_Postleitzahl) {
		this.m_Postleitzahl = m_Postleitzahl;
	}

	public String getLand() {
		return m_Land;
	}

	public void setLand(String m_Land) {
		this.m_Land = m_Land;
	}
}
