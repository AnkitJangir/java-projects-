

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vehicle
 */
public class vehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vehicle() {
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
		PrintWriter pw = response.getWriter();
		
		
		
		
		System.out.println("rrr");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			PreparedStatement stmt = conn.prepareStatement("insert into vehicle(vtype,vowner,vstatus,vseat)values(?,?,?,?)");
			stmt.setString(1,"car");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int a=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int b=stmt.executeUpdate();

			stmt.setString(1,"car");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int c=stmt.executeUpdate();

			stmt.setString(1,"bus");
			stmt.setString(2,"mr. abc");
			stmt.setString(3,"running");
			stmt.setInt(4,5);
			int d=stmt.executeUpdate();

			stmt.setString(1,"bus");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int f=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,5);
			int g=stmt.executeUpdate();

			stmt.setString(1,"bus");
			stmt.setString(2,"mr xyz");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int h=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"mr aaa");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int i=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int j=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"mr aaa");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int k=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int l=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,2);
			int m=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"mr aaa");
			stmt.setString(3,"running");
			stmt.setInt(4,5);
			int n=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"mr ccc");
			stmt.setString(3,"running");
			stmt.setInt(4,3);
			int o=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"mr aaa");
			stmt.setString(3,"running");
			stmt.setInt(4,5);
			int p=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"mr aaa");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int q=stmt.executeUpdate();
			stmt.setString(1,"car");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,4);
			int r=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"mr abb");
			stmt.setString(3,"running");
			stmt.setInt(4,5);
			int s=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"self");
			stmt.setString(3,"running");
			stmt.setInt(4,7);
			int t=stmt.executeUpdate();
			stmt.setString(1,"bus");
			stmt.setString(2,"mr abc");
			stmt.setString(3,"running");
			stmt.setInt(4,6);
			int u=stmt.executeUpdate();

			conn.close();

		}catch(Exception ef){ System.out.println(ef);}


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
