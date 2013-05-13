package de.fhe.prg4.db.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
/** */
public class Platz
{
    /** */
	@Id
	
	private int m_ID;
    
    /** */
    private int m_Nr;
    
    /** */
    private double m_Preis;
    
    /** */
    private int m_Reihe;
    
    /** */
    private short m_Raumnummer;
    
    @ManyToOne
    private Gebaeude m_Gebaeudenummer;
    
    @OneToOne
    private Ticket m_Ticket;

    ////////////////////////////////////////////////////////////
    //Set Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    
    public void setID(int m_ID) {
		this.m_ID = m_ID;
	}
    
    public void setPlatzNummer(int PlatzNummer) {
		this.m_Nr = PlatzNummer;
	}
    
    public void setRaumnummer(short m_Raumnummer) {
		this.m_Raumnummer = m_Raumnummer;
	}
    
	public void setReihe(int m_Reihe) {
		this.m_Reihe = m_Reihe;
	}

	public void setPreis(double m_Preis) {
		this.m_Preis = m_Preis;
	}
	
	public void setGebaeudenummer(Gebaeude Gebaeudenummer) {
		this.m_Gebaeudenummer = Gebaeudenummer;
	}
	
	public void setTicket(Ticket m_Ticket) {
		this.m_Ticket = m_Ticket;
	}
    ////////////////////////////////////////////////////////////
    //Get Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
	public int getID() {
		return m_ID;
	}
    
	public int getPlatzNummer() {
		return m_Nr;
	}
	
	public short getRaumnummer() {
		return m_Raumnummer;
	}

	public int getReihe() {
		return m_Reihe;
	}

	public double getPreis() {
		return m_Preis;
	}
	
	public Gebaeude getGebaeudenummer() {
		return m_Gebaeudenummer;
	}
	
	public Ticket getTicket() {
		return m_Ticket;
	}

}

