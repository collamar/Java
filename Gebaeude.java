package de.fhe.prg4.db.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
/** */

import java.util.List;
import java.util.ArrayList;

@Entity
public class Gebaeude
{
    
	/** */
	@Id
	private int m_ID;
	
	/** */
	private int m_Nr;
    
    /** */
	@OneToOne
    private Adresse m_Adresse;
    
    /** */
    @OneToMany( mappedBy = "m_Gebaeudenummer")
    private List<Platz> m_Plaetze;
    
    ////////////////////////////////////////////////////////////
    //Set Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////

    public void setID(int GebaeudeID) {
		this.m_ID = GebaeudeID;
	}
    
    public void setGebaudeNummer(int GebaudeNummer) {
		this.m_Nr = GebaudeNummer;
	}

    public void setPlaetze(List<Platz> Plaetze) {
		this.m_Plaetze = Plaetze;
	}
    
    public void setGebaeudeAdresse(Adresse GebaeudeAdresse) {
		this.m_Adresse = GebaeudeAdresse;
	}
    
    ////////////////////////////////////////////////////////////
    //Get Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
   
    
    public int getID() {
		return m_ID;
	}
    
    public int getGebaudeNummer(){
    	return m_Nr;
    }
    
    public List<Platz> getPlaetze() {
    	return m_Plaetze;
    }
    
    public Adresse getGebaeudeAdresse() {
		return m_Adresse;
	}
}
