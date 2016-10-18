import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

public class RetrieveData {
	public RetrieveData() {
	
	}
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

   //  Database credentials
   static final String USER = "username";	
   static final String PASS = "password";
   
   
   
   public static void main(String[] args) {
	   RetrieveData rd=new RetrieveData();
	   rd.method();
   
}//end main
//end RetrieveData

public void method()
{
	String arr[]=new String[12];
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

	      //String sql = "SELECT emailId,password from userlogin";
	      String sql= " select p_id,first_name,middle_name,last_name,address,city,state,pincode,contact_no,emailId, data_of_birth,age from passenger_master;";
	      		//" where p_id='"+p_id+"';";
	      
	      ResultSet rs = stmt.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         /*name  = rs.getString("name");
	         password = rs.getString("password");*/
	    	   
	    	System.out.println("\n\n");
	    	String str;
	    	for(int i=1;i<12;i++)
	    	{
	    		arr[i]=rs.getString(i);
	    		
	    	}
	        
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
	//return arr;
	   
	   //return str;
	}
}