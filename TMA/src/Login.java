

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RetrieveData obj1 = new RetrieveData();
       
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
			String emailId = null;
			String password = null;
			
			try{
				emailId = request.getParameter("emailId");
				password = request.getParameter("password");
				
				obj1.method();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			int ans = 0;
			String databaseEmailId[] = new String[obj1.emailId.size()];
			String databasePassword[] = new String[obj1.password.size()];
			
			for(int i=0; i<obj1.emailId.size(); i++){
				databaseEmailId[i] = (String)obj1.emailId.get(i);
				databasePassword[i] = (String)obj1.password.get(i);
				
				if(databaseEmailId[i].equals(emailId) && databasePassword[i].equals(password)){
					ans = 1;
					break;
				}
				else{
					ans = 2;
					continue;
				}
			}
			if(ans == 1){
				//System.out.println(" Login Successful");
				RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
			}
			else if(ans == 2){
				System.out.println(" Login Unsuccessful.. Try Again.");
				System.exit(ans);
			}
			else if(ans == 0){
				System.out.println(" Connection Unssuccful");
				System.exit(ans);
			}
			else{
				System.out.println(" Something else Occured");
				System.exit(ans);
			}
			System.out.println(" Done Comparison");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
