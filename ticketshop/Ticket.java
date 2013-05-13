package de.fhe.prg4.db.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;




/** */
public class Ticket
{
    /** */
	@Id
    private int m_ID;
    
    /** */
    private int m_TicketNr;
    
    /** */
    @OneToOne
    private Platz m_Platz;
    
    @ManyToOne
    private Auftrag m_Auftrag;

    ////////////////////////////////////////////////////////////
    //Set Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
    public void setID(int iD) {
		m_ID = iD;
	}
    
    public void setTicketNr(int ticketNr) {
		m_TicketNr = ticketNr;
	}
    
	public void setPlatz(Platz platz) {
		m_Platz = platz;
	}
	
	public void setAuftrag(Auftrag auftrag) {
		this.m_Auftrag = auftrag;
	}
    ////////////////////////////////////////////////////////////
    //Get Methoden//////////////////////////////////////////////
    ////////////////////////////////////////////////////////////
	public int getID() {
		return m_ID;
	}

	public int getTicketNr() {
		return m_TicketNr;
	}

	public Platz getPlatz() {
		return m_Platz;
	}
 
	public Auftrag getAuftrag() {
		return m_Auftrag;
	}

}
