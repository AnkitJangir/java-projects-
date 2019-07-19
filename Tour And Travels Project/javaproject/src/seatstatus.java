

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class seatstatus
 */
public class seatstatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public seatstatus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from seat ");
			out.print("<table width=50% border=1>");
			out.print("<caption>Result:</caption>");
			ResultSet rs=(ResultSet) ps.executeQuery();
			
			/* Printing column names */
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			int total=rsmd.getColumnCount();
			out.print("<tr>");
			for(int i=1;i<=total;i++)
			{
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");
				
			}
			/* Printing result */
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getInt(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
				
			}
			out.print("</table>");
			out.print("</tr>");
			out.print("<form action='home.jsp'>");
			out.print("<input type='submit' name='submit' value='OKAY'>");
			out.print("</form>");
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
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
		// TODO Auto-generated method stub
	}

}
