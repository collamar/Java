package de.fhe.prg4.db.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Abfrage {
	
	

	    /**
	     * @param args the command line arguments
	     */
		 public static void main(String[] args)
	    {
	        // TODO code application logic here
	        Connection con = null;
	   
	        Class c;// = Class.forName("com.mysql.jdbc.Driver").newInstance();
	        
	        try{
	       /* con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketshop","root","");
	        Statement st = (Statement)con.createStatement();*/
	        
	        EntityManagerFactory factory = 
	        Persistence.createEntityManagerFactory( "my_unit" );
	        EntityManager em = factory.createEntityManager();
	        	
	        Kunde k = new Kunde(1,"n","p","Prahl","Nadja","0212 12 12","norma@web.de");
	       /* ResultSet res = st.executeQuery("select * from Personen");
	        while( res.next() ) System.out.println( res.getString( "Vorname" ) ); */
	        
	        }catch (Exception e) { e.printStackTrace(); }
	        finally{
	            
	             if( con != null )
		            {
		                try { con.close(); }
		                catch (SQLException e) { e.printStackTrace(); }
		            }
	        }
	     }
	        
	        
	        
	    
	
}
