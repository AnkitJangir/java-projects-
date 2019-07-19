

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * Servlet implementation class mylistner
 */
public class mylistener implements ServletContextListener
{
	public void ContextIntialized(ServletContextEvent arg0)
	{
		int status=0;
		try
		{
			System.out.println("project running");
		Class.forName("com.mysqljdbc.Driver");	
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
		
		PreparedStatement stmt = con.prepareStatement("create table entry(eid varchar(45),ename varchar(45),epass varchar(45),email varchar(45))");
		int t=stmt.executeUpdate();	
		PreparedStatement stmu = con.prepareStatement("create table seat(sid varchar(45),busno varchar(45),seatno varchar(45),seatstatus varchar(45))");
		int u=stmu.executeUpdate();

		PreparedStatement stmv = con.prepareStatement("create table service(sid varchar(45),sfrom varchar(45),sto varchar(45),sfare varchar(45),stime varchar(45),sstatus varchar(45),stype varchar(45),)");
		int v=stmv.executeUpdate();
		PreparedStatement stmx = con.prepareStatement("create table suggestion(qid varchar(45),qname varchar(45),qsuggestion varchar(45))");
		int x=stmx.executeUpdate();
		
		PreparedStatement stmy = con.prepareStatement("create table usre(uid varchar(45),uname varchar(45),uphoneno varchar(45),uage varchar(45),uemailid varchar(45),busid varchar(45),seatno varchar(45),uto varchar(45))");
		int y=stmy.executeUpdate();
		
		PreparedStatement stmz = con.prepareStatement("create table vehicle(vid varchar(45),vtype varchar(45),vowner varchar(45),vstatus varchar(45),vseat varchar(45))");
		int z=stmz.executeUpdate();
		con.close();
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
	}
		public void ContextDestroyed(ServletContextEvent arg0)
		{
			System.out.println("project undeployed");
		}
		@Override
		public void contextDestroyed(ServletContextEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void contextInitialized(ServletContextEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}


//public class mylistner extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  //  public mylistner() {
    //    super();
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

//}
