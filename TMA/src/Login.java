

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
			Statement stmt=con.createStatement();			
			
			String emailId= request.getParameter("emailId");
			String password = request.getParameter("password");
			
			String query = "select emailId from userLogin where emailId='" + emailId + "' and password='" + password +"'";
			
			System.out.println("sdadadads");
			
			ResultSet rs=stmt.executeQuery(query);
			boolean st=rs.next();
			
			if(st)
			{
				System.out.print("Success");
				System.out.println();
			}
			else
			{
				System.out.print("Aa to na thyu");
			}
			
			
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		    rd.forward(request, response); 
			
			
			
			System.out.println("done");
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();	
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
