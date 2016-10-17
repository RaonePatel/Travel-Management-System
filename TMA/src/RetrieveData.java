import java.sql.*;
import java.util.ArrayList;

public class RetrieveData {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

   //  Database credentials
   static final String USER = "username";	
   static final String PASS = "password";
   
   //String name=null;
   //String password=null;
   ArrayList emailId=new ArrayList();
   ArrayList password=new ArrayList();
   
   public static void main(String[] args) {
   
}//end main
//end RetrieveData

public void method()
{
	Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();

	      String sql = "SELECT emailId,password from userlogin";
	      ResultSet rs = stmt.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         /*name  = rs.getString("name");
	         password = rs.getString("password");*/
	    	  
	    	  emailId.add(rs.getString("emailId"));
	    	  password.add(rs.getString("password"));
	        
	         //Display values
	         //System.out.print("Name: " + name);
	         //System.out.print(", Password: " + password + "\n");
	      }
	      
	      rs.close();
	      
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	}
}