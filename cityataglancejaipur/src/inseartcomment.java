

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inseartcomment
 */
public class inseartcomment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inseartcomment() {
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
		String c=request.getParameter("comment");
		String n=request.getParameter("name");
		String e=request.getParameter("emailid");
		System.out.println(c);
		System.out.println(n);
		System.out.println(e);
		
		//	Cookie cl[]=request.getCookies();
		//System.out.print("Hello "+cl[0].getValue());
		//String email=cl[0].getValue();
		//System.out.println(email);
		
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
			Connection conn = DriverManager.getConnection(url,user,serverpass);
			/*PreparedStatement ps=conn.prepareStatement("select * from user where name=? and email=?");
			ps.setString(1, n);
			ps.setString(2, e);
			ResultSet rs=(ResultSet) ps.executeQuery();
			*/
			PreparedStatement stmt=conn.prepareStatement("insert into comment (uname, uemail, ucomment)values(?,?,?)");
			
			stmt.setString(1,n);
			stmt.setString(2,e);
			stmt.setString(3,c);
			
			//stmt.setString(3,pot);
			int i=stmt.executeUpdate();
			if(i>0){
				RequestDispatcher rd=request.getRequestDispatcher("commentshow");
				rd.forward(request, response);
			}

			

			}catch(Exception e1){ System.out.println(e1);}
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
