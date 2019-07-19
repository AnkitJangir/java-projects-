

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
 * Servlet implementation class updateinfo
 */
public class updateinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateinfo() {
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
		
		System.out.println("inside service");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String pn=request.getParameter("pname");
		String pt=request.getParameter("ptype");
		String pot=request.getParameter("OT");
		String pct=request.getParameter("CT");
		System.out.println(pn);
		System.out.println(pot);
		System.out.println(pct);
	    out.println("hey");
		
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

			PreparedStatement stmt=con.prepareStatement("update adata1 set OT=?,CT=? where pname=? and ptype=?");
			
			stmt.setString(1,pot);
			stmt.setString(2,pct);
			stmt.setString(3,pn);
			stmt.setString(4,pt);
			int i=stmt.executeUpdate();
			if(i>0){
				RequestDispatcher rd=request.getRequestDispatcher("showalltablelist");
				rd.forward(request, response);
			}

			}catch(Exception e){ System.out.println(e);}

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
