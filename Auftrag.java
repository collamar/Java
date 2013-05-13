package de.fhe.prg4.db.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import java.util.List;
import java.util.ArrayList;

/** */
@Entity
public class Auftrag
{
    /** */
	@Id
    private int m_ID;
    
    /** */
    private int m_Auftrageseingang;
    
    /** */
    @OneToMany ( mappedBy = "m_Auftrag")
    private List<Ticket> m_Tickets;
    
    /** */
    @OneToOne
    public Rechnung m_Rechnung;
    
    /** */
    @ManyToOne
    public Kunde m_Kunde;
    
    /** */
    ////////////////////////////////////////////////////////////
    //Set Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void setID(int id) {
		this.m_ID = id;
	}
    
    public void setAuftrageseingang(int auftrageseingang) {
		this.m_Auftrageseingang = auftrageseingang;
	}
   
    public void setKunde(Kunde kunde) {
		this.m_Kunde = kunde;
	}
    
    public void setRechnung(Rechnung rechnung) {
		this.m_Rechnung = rechnung;
	}
    
    public void setTicket(List<Ticket> ticket) {
		this.m_Tickets = ticket;
	}
  
    ////////////////////////////////////////////////////////////
    //Get Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public int getID() {
		return m_ID;
	}
    
    public int getAuftrageseingang() {
		return m_Auftrageseingang;
	}
    
    public Kunde getKunde() {
    	 return m_Kunde;
	}
    
    public Rechnung getRechnung() {
		return m_Rechnung;
	}
    
    public List<Ticket> getTicket() {
		return m_Tickets;
	}
    
    public double getSumTicket(){
		return m_Auftrageseingang;
    
    }
    
}
