

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class trip
 */
public class trip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public trip() {
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
		
		String selectTrip = request.getParameter("selectTrip");
		
		if(selectTrip.equals("Bus"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Bus.jsp");
		    rd.forward(request, response); 
		}
		else if(selectTrip.equals("Train"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Train.jsp");
		    rd.forward(request, response); 
		}
		else if(selectTrip.equals("Airline"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("Airline.jsp");
		    rd.forward(request, response); 
		}
	}

}
