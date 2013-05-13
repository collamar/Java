package de.fhe.prg4.db.model;



/** */
public class Rechnung
{
    /** */
    private int m_ID;
    
    /** */
    private Auftrag m_Auftrag;
    
    /** */
    public void printrechnung()
    {
    
    }

	public int getID() {
		return m_ID;
	}

	public void setID(int m_ID) {
		this.m_ID = m_ID;
	}

	public Auftrag getAuftrag() {
		return m_Auftrag;
	}

	public void setAuftrag(Auftrag m_Auftrag) {
		this.m_Auftrag = m_Auftrag;
	}
}
