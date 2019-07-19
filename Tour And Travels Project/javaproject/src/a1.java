import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 * Servlet implementation class a1
 */
public class a1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintStream out;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public a1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out =  response.getWriter();
		
		String u=request.getParameter("username");
		String v=request.getParameter("password");
		
		System.out.println(u);
	    System.out.println(v);
		
		ServletContext sc= getServletContext();
		
		String login=sc.getInitParameter("username");
		String apass=sc.getInitParameter("pass");
		
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String user=sc.getInitParameter("user");
		String serverpass=sc.getInitParameter("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(serverpass);
		
		
		System.out.println(login);
		System.out.println(apass);
		
		try{
			
			if(u.equals(login)&& v.equals(apass) )
			{
				//System.out.println("for admin");
				System.out.println("hiii");
				RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
				rd.forward(request,response);
			}
				Class.forName(driver);
				Connection conn = DriverManager.getConnection(url,user,serverpass);
				PreparedStatement ps = conn.prepareStatement("select * from entry where ename=? and epass=?");
				
				ps.setString(1, u);
				ps.setString(2,v);
				System.out.println("hello");
				ResultSet rs= ps.executeQuery();
				System.out.println("before if");
				if(rs.next())
				{
					System.out.println("after if");
					RequestDispatcher rd=request.getRequestDispatcher("search.jsp");
					rd.forward(request,response);
				}	
				else{
					out.print("SORRY WRONG USERNAME OR PASSWORD");
					
					RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
					rd.include(request,response);
					
				}
				
		}
				catch(Exception ea){ 
					ea.printStackTrace();
					System.out.println(ea);}
							
					
				
			
			
		
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
