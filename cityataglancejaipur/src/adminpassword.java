

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
 * Servlet implementation class adminpassword
 */
public class adminpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminpassword() {
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
		String l=req.getParameter("loginid");
		String p=req.getParameter("password");
		
		System.out.println(l);
		System.out.println(p);
		
		
		ServletContext sc = getServletContext();
		String li = sc.getInitParameter("login");
		String pwd = sc.getInitParameter("apass");
		
		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String pass = sc.getInitParameter("password");
		
		System.out.println("driver====>"+driver);
		System.out.println("url====>"+url);
		System.out.println("user====>"+user);
		System.out.println("pass====>"+pass);
	
		try
		{
			
			if(l.equals(li) && p.equals(pwd)){
				RequestDispatcher rd=req.getRequestDispatcher("admin.jsp");
				rd.forward(req, res);
			}
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			//PreparedStatement ps = conn.prepareStatement("insert into emp ()values(?,?,?,?,?,?,?)");
			PreparedStatement ps = conn.prepareStatement("select * from admin1 where Email=? and Password=?");
			ps.setString(1, l);
			ps.setString(2,p);
			
			System.out.println("hey");
	//int i=ps.executeUpdate();
	ResultSet rs =ps.executeQuery();
	System.out.println("rs");
	
	if(rs.next()){
		//pw.print("You are successfully Login");
		RequestDispatcher rd=req.getRequestDispatcher("searchpage.jsp");
		rd.forward(req, res);

	}
	else
	{
		//pw.print("Sorry !! Register first");
		out.print("<div id=header style=background-color:#EAEAF6;> <h4 style=margin-left:700;>" +
				  " Sorry username or password error!<br>Or you should sign up first!!</h4></div>");
		out.print("Sorry username or password error!");
        RequestDispatcher rd=req.getRequestDispatcher("mainpage.jsp");
		rd.include(req, res);

	}
	//if(i>0)
	//  out.print("You are successfully registered...");
	
	
} catch (Exception ex) {
	ex.printStackTrace();}
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
