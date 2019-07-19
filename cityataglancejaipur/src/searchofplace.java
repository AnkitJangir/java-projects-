


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
 * Servlet implementation class searchofplace
 */
public class searchofplace extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchofplace() {
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
		String pn=request.getParameter("pname");
		
		System.out.println(pn);
		
		ServletContext sc = getServletContext();
		
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String serverpass = sc.getInitParameter("password");
	
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(serverpass);		
		
		try{
			Class.forName(driver);

			Connection con=DriverManager.getConnection(url,user,serverpass);
			PreparedStatement ps=con.prepareStatement("select * from adata1 where pname=?");
			System.out.println("inside try");
			
			ps.setString(1,pn);
			
			ResultSet rs=ps.executeQuery();
			
			out.print("<table width=100% border=1>");
			out.print("<caption>Result:</caption>");
			out.print("<tr>");
			
			out.println("<th>"+"pname"+"</th>");
			out.println("<th>"+"\t ptype"+"</th>");
			out.println("<th>"+"\t address"+"</th>");
			out.println("<th>"+"\t OT"+"</th>");
			out.println("<th>"+"\t CT"+"</th>");
			
			out.print("</tr>");
		
		while(rs.next())
		{
			System.out.println("Inside while");
			out.print("<tr>" +
					"<td>"+rs.getString(2)+"</td>" +
				    "<td>"+rs.getString(3)+"</td>"+
				    "<td>"+rs.getString(4)+"</td>"+
				    "<td>"+rs.getString(5)+"</td>"+
				    "<td>"+rs.getString(6)+"</td>"+
				   
				    "</tr>");
			
		}
		out.print("</table>");
		
		out.print("<form action='searchpage.jsp'>");
		out.print("<input type='submit' name='Submit' value='BACK'/");
		out.print("</form>");
		
		System.out.println("bye");
			}catch(Exception e){ 
				System.out.println(e);
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
