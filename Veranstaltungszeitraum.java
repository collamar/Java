package de.fhe.prg4.db.model;

import javax.persistence.*;


/** */
@Entity
public class Veranstaltungszeitraum
{
    /** */
    private int m_Veranstaltungszeitpunkt;
    
    /** */
    @Id
    private int m_ID;

	public int getVeranstaltungszeitpunkt() {
		return m_Veranstaltungszeitpunkt;
	}

	public void setVeranstaltungszeitpunkt(int m_Veranstaltungszeitpunkt) {
		this.m_Veranstaltungszeitpunkt = m_Veranstaltungszeitpunkt;
	}

	public int getID() {
		return m_ID;
	}

	public void setID(int m_ID) {
		this.m_ID = m_ID;
	}
}
