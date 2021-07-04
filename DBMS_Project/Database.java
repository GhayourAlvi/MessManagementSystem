/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	static Connection con;
        static Statement stmt;
        static ResultSet rs;
	Database(){
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			

			//step2 create  the connection object  
			con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","51214110");  
			

			//step3 create the statement object  
			stmt=con.createStatement();  
			

			// insert query
			 

			// select query  
			  
			}
			catch(Exception e){ System.out.println(e);}  
	}

}
