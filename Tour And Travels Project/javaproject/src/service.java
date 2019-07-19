

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
 * Servlet implementation class service
 */
public class service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public service() {
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
		
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","root");
			PreparedStatement stmt = conn.prepareStatement("insert into service(sfrom,sto,sfare,stime.sstatus,stype)values(?,?,?,?,?,?)");
		//	PreparedStatement ps = conn.prepareStatement("select * from stud where name=? and pass=?");
		
			System.out.println("rrr");
			
			//int i=ps.executeUpdate();
			//ResultSet rs =ps.executeQuery();
			//if(rs.next()){
			//	pw.print("You are successfully Login");
			//}else{
			//	pw.print("Sorry !! Register first");
			//}
			//System.out.println(i);
			
			//if(i>0){
			//questDispatcher rd=request.getRequestDispatcher("search.html");
			//rd.forward(request, response);
			//}
			
	

		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int i=stmt.executeUpdate();		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int j=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int k=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int r=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int u=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int s=stmt.executeUpdate();
		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int a=stmt.executeUpdate();		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int b=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int c=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int d=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int ef=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int f=stmt.executeUpdate();

		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"3:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int g=stmt.executeUpdate();		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"3:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int h=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"3:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int l=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"3:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int m=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"4:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int ab=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"4:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int o=stmt.executeUpdate();

		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int pac=stmt.executeUpdate();		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int q=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int t=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int v=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int x=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int w=stmt.executeUpdate();

		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int y=stmt.executeUpdate();		
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Ajmer");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int z=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int A=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Pilani");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int B=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int C=stmt.executeUpdate();
		stmt.setString(1,"Jaipur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jodhpur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int D=stmt.executeUpdate();

		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int AI=stmt.executeUpdate();		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int AH=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int AG=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int AF=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int AE=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int AD=stmt.executeUpdate();
		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int AC=stmt.executeUpdate();		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int AB=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int Z=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 am");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int Y=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int X=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 am");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int W=stmt.executeUpdate();

		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"3:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int V=stmt.executeUpdate();		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"3:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int U=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"3:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int T=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"3:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int S=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"4:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int R=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"4:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int Q=stmt.executeUpdate();

		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int P=stmt.executeUpdate();		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"7:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int O=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int N=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"7:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int M=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int L=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"8:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int K=stmt.executeUpdate();

		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int J=stmt.executeUpdate();		
		stmt.setString(1,"Ajmer");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,100);
		stmt.setString(4,"10:00 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int I=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int G=stmt.executeUpdate();
		stmt.setString(1,"Pilani");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,215);
		stmt.setString(4,"10:15 pm");
		stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int H=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"bus");
		int F=stmt.executeUpdate();
		stmt.setString(1,"Jodhpur");//1 specifies the first parameter in the query
		stmt.setString(2,"Jaipur");
		stmt.setInt(3,200);
        stmt.setString(4,"11:15 pm");
    	stmt.setString(5,"Running");
		stmt.setString(6,"car");
		int E=stmt.executeUpdate();
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
