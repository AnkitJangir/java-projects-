

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class suggestion
 */
public class suggestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suggestion() {
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
		
		PrintWriter out =  response.getWriter();
		
		String u=request.getParameter("name");
		String v=request.getParameter("suggestion");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			PreparedStatement ps = conn.prepareStatement("insert into suggestion(qname,qsuggestion)values(?,?)");
			//PreparedStatement ps = conn.prepareStatement("select * from stud where name=? and pass=?");
			ps.setString(1, u);
			ps.setString(2,v);
			
			System.out.println("rrr");
			
			int i=ps.executeUpdate();
			//ResultSet rs =ps.executeQuery();
			//if(rs.next()){
			//	pw.print("You are successfully Login");
			//}else{
			//	pw.print("Sorry !! Register first");
			//}
			System.out.println(i);
			
			if(i>0){
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			}
			
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
