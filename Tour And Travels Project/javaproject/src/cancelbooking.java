

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

import com.mysql.jdbc.ResultSet;
import java.sql.*;
/**
 * Servlet implementation class cancelbooking
 */
public class cancelbooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cancelbooking() {
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
		String n=request.getParameter("name");
		String p=request.getParameter("phoneno");
		String e=request.getParameter("age");
		String f=request.getParameter("emailid");
		String d=request.getParameter("busno");
		String c=request.getParameter("seatno");
		String b=request.getParameter("to");
		String a=request.getParameter("from");
			
		System.out.println("rrr");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			PreparedStatement ps = conn.prepareStatement("delete  from user where uname=? and uphoneno=? and uage=? and uemailid=? and busid=? and seatno=? and uto=? and ufrom=?");
			//PreparedStatement ps = conn.prepareStatement("select * from stud where name=? and pass=?");
			ps.setString(1, n);
			ps.setString(2,p);
			ps.setString(3,e);
			ps.setString(4, f);
			ps.setString(5,d);
			ps.setString(6,c);
			
			ps.setString(7, b);
			ps.setString(8, a);
			
			
			
			System.out.println("rrr");
			
		int i=ps.executeUpdate();
		//	ResultSet rs =(ResultSet) ps.executeQuery();
			//if(rs.next()){
			//	pw.print("You are successfully Login");
			//}else{
			//	pw.print("Sorry !! Register first");
			//}
			
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement("update seat set seatstatus=? where busno=? and seatno=?");
			stmt.setString(1,"f");
			stmt.setString(2,d);
			stmt.setString(3,c);
			int k=stmt.executeUpdate();
			System.out.println(k+" records updated");

			conn.close();

			if(i>0)
			{	
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
