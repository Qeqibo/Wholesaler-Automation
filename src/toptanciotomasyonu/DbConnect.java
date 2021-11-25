package toptanciotomasyonu;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Habib
 */
public class DbConnect {
    
    	//  String serverip="127.0.0.1";
      //String serverport="1433";
    //String windowsurl="jdbc:sqlserver://localhost\\SQLEXPRESS:1433; databasename=ToptanciOtomasyon; integratedsecurity=true";
	
	String url="jdbc:sqlserver://.\\SQLEXPRESS:1433; databasename=ToptanciOtomasyon;";//BURADAKİ PROVİDER ADI 1433 sqlserverın erişim yaptığı porttur
	String username="sa";
	String password="blp123";
	 Connection con=null;
         public  DbConnect(){
         try 
		{
		//Connection con=DriverManager.getConnection(windowsurl);		
		 con=DriverManager.getConnection(url, username, password);
		} 
		catch (SQLException e)
		{
		JOptionPane.showMessageDialog(null, "Bağlantı Başarısız  !!!\n"+ e.toString());
			
		}
}
}
