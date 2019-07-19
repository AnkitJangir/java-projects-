

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.RowSetMetaData;

import com.mysql.jdbc.ResultSetMetaData;





/**
 * Servlet implementation class showmalllist
 */
public class showmalllist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showmalllist() {
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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/emp","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from adata1 where ptype=?" );
			ps.setString(1,"Malls");
			
			
			
			
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
			out.print("</tr>");
			
			/* Printing result */
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
				
			}
			out.print("</table>");
			out.print("<form action='searchpage.jsp'>");
			out.print("<input type='submit' name='Submit' value='BACK'/");
			out.print("</form>");
			
			System.out.println("bye");
			
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
