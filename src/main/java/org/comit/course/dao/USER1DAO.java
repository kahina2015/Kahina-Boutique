package org.comit.course.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;


import org.comit.course.controller.USER1;

@Repository
public class USER1DAO {
	
public List<USER1> getdata() {
		
		List<USER1> users= new ArrayList<>(); 
		//the link for our bd with java or javaeclips
String dbUrl="jdbc:mysql://localhost:3306/mydb";
//SQL statments
String dbUsername= "root";
String dbpassword= "Melina2015";
//connection1 as an example of connection with DB
String sql = "select * from USER1";

//try with resources which will close automaticaly without close or finally bloc
try(Connection con=DriverManager.getConnection(dbUrl,dbUsername, dbpassword);
		// to run un sql-statmenet we should creat an object statmenet example st.
Statement st= con.createStatement();) {
    System.out.println("the connection was successful");
   ResultSet rs= st.executeQuery(sql);// the st object need a ResultSet to recieve a result of the query.
   
   while (rs.next()) {
	   int idUser= rs.getInt("ID_USER");
	   String firstName = rs.getString("FIRST_NAME");
	   String lastName  = rs.getString("LAST_NAME");
	   String name      = rs.getString("USERNAME");
	   Date birth       = rs.getDate("BIRTH");
	   String status    = rs.getString ("STATUS");
	   //show the information from database
	   System.out.println(idUser + " " + firstName + " " + name +" "+birth + " "+ status );

	   //after cerating a data we are going to put them in the user bean
	   
	   USER1 user = new USER1();
	   user.setIdUser(idUser);
	   user.setFirstName(firstName);
	   user.setLastName(lastName);
	   user.setName(name);
	   user.setStatus(status);
	   users.add(user);
	    
	   System.out.println(user);   	   
   }
}
catch (SQLException e) {
	e.printStackTrace();
}
  users.forEach(System.out:: print);
  
  return users;
}

}
