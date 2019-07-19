


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registeration
 */
public class registeration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registeration() {
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
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletContext sc = getServletContext();
		
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String serverpass = sc.getInitParameter("password");
	
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(serverpass);		
		
			String n=req.getParameter("name");
		String mn=req.getParameter("middlename");
		String ln=req.getParameter("lastname");
		String dob=req.getParameter("bday");
		String e=req.getParameter("email");
		String p=req.getParameter("pwd");
		String mob=req.getParameter("mob");
		String g=req.getParameter("Gender");
		
		try
		{
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,serverpass);
			PreparedStatement ps = conn.prepareStatement("insert into admin1 (name,Middlename,lastname,DOB,Email,Password,mob,Gender)values(?,?,?,?,?,?,?,?)");
			//PreparedStatement ps = conn.prepareStatement("select * from stud where name=? and pass=?");
			ps.setString(1, n);
			ps.setString(2,mn);
			ps.setString(3,ln);
			ps.setString(4,dob);
			ps.setString(5,e);
			ps.setString(6,p);
			ps.setString(7,mob);
			ps.setString(8,g);
			
			
			int i=ps.executeUpdate();
			//ResultSet rs =ps.executeQuery();
			//if(rs.next()){
			//	pw.print("You are successfully Login");
			//}else{
			//	pw.print("Sorry !! Register first");
			//}
			if(i>0){
				RequestDispatcher rd=req.getRequestDispatcher("registeroutput.jsp");
				rd.forward(req, res);
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
