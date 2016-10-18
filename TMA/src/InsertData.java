

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Request;

import com.ibm.security.tools.parseCert;
import com.ibm.xtq.bcel.generic.LASTORE;

/**
 * Servlet implementation class InsertData
 */
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_mng","root","root");
		Statement stmt=con.createStatement();
		
		String p_id= request.getParameter("p_id");
		String first_name= request.getParameter("first_name");
		String middle_name= request.getParameter("middle_name");
		String surnmae= request.getParameter("surname");
		String address= request.getParameter("address");
		String city= request.getParameter("city");
		String state= request.getParameter("state");
		long pincode= Integer.parseInt(request.getParameter("pincode"));
		long contact_no= Integer.parseInt(request.getParameter("contact_no"));
		String email_Id= request.getParameter("email_id");
		String data_of_birth =request.getParameter("data_of_birth");
		int age= Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		
		
		
		System.out.println(p_id);
		System.out.println(first_name);
		System.out.println(middle_name);
		System.out.println(surnmae);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(pincode);
		System.out.println(contact_no);
		System.out.println(email_Id);
		System.out.println(data_of_birth);
		System.out.println(age);
		System.out.println(gender);
	
	

		
		try {
			String sql="insert into passenger_master values('"+p_id+"', '" +first_name+"',' "+ middle_name+" ', '"+surnmae+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"', '"+contact_no+"', '"+email_Id+"', '"+age+"', '"+gender+"');";
			ResultSet rs=stmt.executeQuery(sql);
			boolean st=rs.next();
			if(st)
			{
				System.out.println("Successfully Done");
			}
			else
			{
				System.out.println("Erro Somewhere");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		} catch (ClassNotFoundException e1) {		
			e1.printStackTrace();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

}
