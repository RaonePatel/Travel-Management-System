

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class stud_reg
 */
@WebServlet("/stud_reg")
public class inser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
				String n;
				out.println("Driver Connected ");
		
		
		try
		{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Connected ");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temp1","root","root");
			System.out.println("database Connected ");
			Statement stmt=con.createStatement();
			/*n=request.getParameter("name");
			String sql="insert into my(name)values('"+n+"')";
			stmt.executeUpdate(sql);*/
			out.println("data inserted Connected ");
			
			String name1=request.getParameter("name");
			String password=request.getParameter("password");
			String sql2="insert into table1 (name,password) values ('"+name1+"', '"+password+"')";
			stmt.executeUpdate(sql2);
			
			String retrive="select * from table1;";
			System.out.println(retrive);
			
			}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
