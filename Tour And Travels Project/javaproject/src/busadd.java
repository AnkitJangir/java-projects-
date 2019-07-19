

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class busadd
 */
public class busadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public busadd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		
		String typea=request.getParameter("type");
		String ownera=request.getParameter("owner");
		String statusa=request.getParameter("status");
		String seata=request.getParameter("seat");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			PreparedStatement ps = con.prepareStatement("insert into vehicle (vtype, vowner, vstatus, vseat) values(?,?,?,?)");
			//PreparedStatement ps=con.prepareStatement("select * from service where sto=? && sfrom=? && stype=?");
			ps.setString(1,typea);
			ps.setString(2,ownera);
			ps.setString(3,statusa);
			ps.setString(4,seata);
			//out.print("<table width=50% border=1>");
			//out.print("<caption>Result:</caption>");
			
			int i= ps.executeUpdate();
			if(i>0){
				RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
				}
				
          
			
			/*	//ResultSet rs=(ResultSet) ps.executeQuery();
		 Printing column names 
			//ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			//int total=i.getColumnCount();
			out.print("<tr>");
			
			for(int k=1;i<=total;i++)
			{
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");
				
			}
			out.print("</tr>");
			System.out.println("hey");
			/* Printing resul
			while(rs.next())
			{
				out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td></tr>");
				
			}
			out.print("</table>");
			*/
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
