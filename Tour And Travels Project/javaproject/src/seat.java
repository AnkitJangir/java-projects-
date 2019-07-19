

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
 * Servlet implementation class seat
 */
public class seat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public seat() {
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
			PreparedStatement stmt = conn.prepareStatement("insert into seat(busno,seatno,seatstatus)values(?,?,?)");
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
			
	

		stmt.setInt(1,1);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int a=stmt.executeUpdate();
		stmt.setInt(1,1);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int b=stmt.executeUpdate();
		stmt.setInt(1,1);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int c=stmt.executeUpdate();
		stmt.setInt(1,2);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int d=stmt.executeUpdate();
		stmt.setInt(1,2);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int e=stmt.executeUpdate();
		stmt.setInt(1,2);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int f=stmt.executeUpdate();
		stmt.setInt(1,2);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int g=stmt.executeUpdate();
		stmt.setInt(1,3);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int h=stmt.executeUpdate();
		stmt.setInt(1,3);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int i=stmt.executeUpdate();
		stmt.setInt(1,3);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int j=stmt.executeUpdate();
		stmt.setInt(1,4);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int k=stmt.executeUpdate();
		stmt.setInt(1,4);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int l=stmt.executeUpdate();
		stmt.setInt(1,4);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int m=stmt.executeUpdate();
		stmt.setInt(1,4);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int n=stmt.executeUpdate();
		stmt.setInt(1,4);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int o=stmt.executeUpdate();
		stmt.setInt(1,5);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int p=stmt.executeUpdate();
		stmt.setInt(1,5);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int q=stmt.executeUpdate();
		stmt.setInt(1,5);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int r=stmt.executeUpdate();
		stmt.setInt(1,6);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int s=stmt.executeUpdate();
		stmt.setInt(1,6);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int t=stmt.executeUpdate();
		stmt.setInt(1,6);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int u=stmt.executeUpdate();
		stmt.setInt(1,6);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int v=stmt.executeUpdate();
		stmt.setInt(1,6);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int w=stmt.executeUpdate();
		stmt.setInt(1,7);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int x=stmt.executeUpdate();
		stmt.setInt(1,7);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int y=stmt.executeUpdate();
		stmt.setInt(1,7);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int z=stmt.executeUpdate();
		stmt.setInt(1,7);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int A=stmt.executeUpdate();
		stmt.setInt(1,8);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int B=stmt.executeUpdate();
		stmt.setInt(1,8);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int C=stmt.executeUpdate();
		stmt.setInt(1,8);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int D=stmt.executeUpdate();
		stmt.setInt(1,9);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int E=stmt.executeUpdate();
		stmt.setInt(1,9);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int F=stmt.executeUpdate();
		stmt.setInt(1,9);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int G=stmt.executeUpdate();
		stmt.setInt(1,9);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int H=stmt.executeUpdate();
		stmt.setInt(1,10);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int I=stmt.executeUpdate();
		stmt.setInt(1,10);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int J=stmt.executeUpdate();
		stmt.setInt(1,10);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int K=stmt.executeUpdate();
		stmt.setInt(1,11);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int L=stmt.executeUpdate();
		stmt.setInt(1,11);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int M=stmt.executeUpdate();
		stmt.setInt(1,11);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int N=stmt.executeUpdate();
		stmt.setInt(1,11);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int O=stmt.executeUpdate();
		stmt.setInt(1,12);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int P=stmt.executeUpdate();
		stmt.setInt(1,12);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int Q=stmt.executeUpdate();
		stmt.setInt(1,13);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int R=stmt.executeUpdate();
		stmt.setInt(1,13);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int S=stmt.executeUpdate();
		stmt.setInt(1,13);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int T=stmt.executeUpdate();
		stmt.setInt(1,13);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int U=stmt.executeUpdate();
		stmt.setInt(1,13);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int V=stmt.executeUpdate();
		stmt.setInt(1,14);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int W=stmt.executeUpdate();
		stmt.setInt(1,14);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int X=stmt.executeUpdate();
		stmt.setInt(1,14);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int Y=stmt.executeUpdate();
		stmt.setInt(1,15);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int Z=stmt.executeUpdate();
		stmt.setInt(1,15);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int ab=stmt.executeUpdate();
		stmt.setInt(1,15);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int ac=stmt.executeUpdate();
		stmt.setInt(1,15);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int ad=stmt.executeUpdate();
		stmt.setInt(1,15);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int ae=stmt.executeUpdate();
		stmt.setInt(1,16);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int af=stmt.executeUpdate();
		stmt.setInt(1,16);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int ag=stmt.executeUpdate();
		stmt.setInt(1,16);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int ah=stmt.executeUpdate();
		stmt.setInt(1,16);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int ai=stmt.executeUpdate();
		stmt.setInt(1,17);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int aj=stmt.executeUpdate();
		stmt.setInt(1,17);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int ak=stmt.executeUpdate();
		stmt.setInt(1,17);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int al=stmt.executeUpdate();
		stmt.setInt(1,17);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int am=stmt.executeUpdate();
		stmt.setInt(1,18);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int an=stmt.executeUpdate();
		stmt.setInt(1,18);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int ao=stmt.executeUpdate();
		stmt.setInt(1,18);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int ap=stmt.executeUpdate();
		stmt.setInt(1,18);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int aq=stmt.executeUpdate();
		stmt.setInt(1,18);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int ar=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int as=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int at=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int au=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int av=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int aw=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,6);
		stmt.setString(3,"f");
		int ay=stmt.executeUpdate();
		stmt.setInt(1,19);//1 specifies the first parameter in the query
		stmt.setInt(2,7);
		stmt.setString(3,"f");
		int az=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,1);
		stmt.setString(3,"f");
		int aa=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,2);
		stmt.setString(3,"f");
		int ba=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,3);
		stmt.setString(3,"f");
		int bb=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,4);
		stmt.setString(3,"f");
		int bc=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,5);
		stmt.setString(3,"f");
		int bd=stmt.executeUpdate();
		stmt.setInt(1,20);//1 specifies the first parameter in the query
		stmt.setInt(2,6);
		stmt.setString(3,"f");
		int be=stmt.executeUpdate();

		
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
