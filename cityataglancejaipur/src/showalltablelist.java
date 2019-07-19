


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class showalltablelist
 */
public class showalltablelist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showalltablelist() {
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
		
		ServletContext sc = getServletContext();
		
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String serverpass = sc.getInitParameter("password");
	
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(serverpass);		
		
		System.out.println("1");
		try{
			Class.forName(driver);
			Connection con=(Connection) DriverManager.getConnection(url,user,serverpass);
			System.out.println("2");	
			PreparedStatement ps=con.prepareStatement("select * from adata1");
		//	ps.setString(1, "Historicalplaces");
			//ps.setInt(1,roll);
			System.out.println("3");
			out.print("<table width=100% border=1>");
			out.print("<caption>Result:</caption>");
			ResultSet rs=(ResultSet) ps.executeQuery();
			
			/* Printing column names */
			//ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			//int total=rsmd.getColumnCount();
			System.out.println("4");
			out.print("<tr>");
			
				out.println("<th>"+"pname"+"</th>");
				out.println("<th>"+"\t ptype"+"</th>");
				out.println("<th>"+"\t address"+"</th>");
				out.println("<th>"+"\t OT"+"</th>");
				out.println("<th>"+"\t CT"+"</th>");
				//out.println("<th>"+"\t description"+"</th>");
			
			out.print("</tr>");
			
			/* Printing result */
			while(rs.next())
			{
				out.print("<tr>" +
						"<td>"+rs.getString(2)+"</td>" +
					    "<td>"+rs.getString(3)+"</td>"+
					    "<td>"+rs.getString(4)+"</td>"+
					    "<td>"+rs.getString(5)+"</td>"+
					    "<td>"+rs.getString(6)+"</td>"+
					   // "<td>"+rs.getString(7)+"</td>"+
					    "</tr>");
				
			}
			out.print("</table>");
			
			out.print("<form action='admin.jsp'>");
			out.print("<input type='submit' name='Submit' value='BACK'/");
			out.print("</form>");
		}catch (Exception e2) {e2.printStackTrace();}
		
		finally{out.close();}
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
