

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;;

/**
 * Servlet implementation class serviceupdate
 */
public class serviceupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serviceupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	//public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	//}

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
		PrintWriter pw = response.getWriter();
		
	
		
		String c=request.getParameter("time");
		String c1=request.getParameter("type");
		
		//String j=request.getParameter("from1");
	//	String i=request.getParameter("to1");
		String h=request.getParameter("fare1");
		String g=request.getParameter("time1");
		String f=request.getParameter("status1");
		String d=request.getParameter("type1");
		System.out.println("hey");
		//int h1=Integer.valueOf(h);
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			System.out.println("after con");

			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement("update service set  sfare=?, stime=?, sstatus=?, stype=? where stime=?  and stype=?");
			/*stmt.setString(1,n);
			stmt.setString(2,p);
			stmt.setInt(3,e1);
			stmt.setString(4,c);
			stmt.setString(5,a);
		//	stmt.setString(6,b);
			stmt.setString(7,j);
			stmt.setString(8,i);
			stmt.setInt(9,h1);
			stmt.setString(10,g);
			stmt.setString(11,f);
			stmt.setString(12,d);*/
			
			//stmt.setString(1,j);
			//stmt.setString(2,i);
			stmt.setString(1,h);
			stmt.setString(2,g);
			stmt.setString(3,f);
			stmt.setString(4,d);
			stmt.setString(5,c);
			stmt.setString(6,c1);
			System.out.println("inside try");
			
			
			int k=stmt.executeUpdate();
			System.out.println(k+" records updated");
			System.out.println("bye");
			pw.print("<form action='home.jsp'>");
			pw.print("<input type='submit' name='submit' value='OKAY'>");
			pw.print("</form>");

			conn.close();
		}
			catch(Exception ea){ System.out.println(ea);}

		
		

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
