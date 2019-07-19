

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insearttable
 */
public class insearttable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insearttable() {
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
		PrintWriter pw = response.getWriter();
		
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/emp","root","root");
			PreparedStatement stmt = conn.prepareStatement("insert into adata1(pname,ptype,address,OT,CT)values(?,?,?,?,?)");
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
			
	

		stmt.setString(1,"hawa mahal");//1 specifies the first parameter in the query
		stmt.setString(2,"historical place");
		stmt.setString(3,"next to city place");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		int i=stmt.executeUpdate();		
		stmt.setString(1,"jantar mantar");//1 specifies the first parameter in the query
		stmt.setString(2,"historical place");
		stmt.setString(3,"next to city place");
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"10pM");
		
		int j=stmt.executeUpdate();
		stmt.setString(1,"Nahargarh fort");//1 specifies the first parameter in the query
		stmt.setString(2,"historical place");
		stmt.setString(3,"Northwest of jaipur");
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"10PM");
		
		int k=stmt.executeUpdate();
		stmt.setString(1,"Monkey temple");//1 specifies the first parameter in the query
		stmt.setString(2,"historical place");
		stmt.setString(3,"outside galta pole");
		stmt.setString(4,"7:15 am");
		stmt.setString(5,"10PM");
		
		int l=stmt.executeUpdate();
		stmt.setString(1,"city place");//1 specifies the first parameter in the query
		stmt.setString(2,"historical place");
		stmt.setString(3,"chokri shaid old city jaipur");
        stmt.setString(4,"8:15 am");
    	stmt.setString(5,"10PM");
		
		int m=stmt.executeUpdate();
		
		stmt.setString(1,"Crystal palm");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"Near Bias godam");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int n=stmt.executeUpdate();		
		stmt.setString(1,"Crystal court");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"Malviya nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int o=stmt.executeUpdate();
		stmt.setString(1,"Silver square");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"Bhagvan das road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int p=stmt.executeUpdate();
		stmt.setString(1,"Apex mall");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"C sceme");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int q=stmt.executeUpdate();
		stmt.setString(1,"Saraogi mansion");//1 specifies the first parameter in the query
		stmt.setString(2," Malls");
		stmt.setString(3," c sceme");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int r=stmt.executeUpdate();
		
			
		stmt.setString(1,"World trade park");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"near malviya nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int s=stmt.executeUpdate();
		stmt.setString(1,"Golcha Trade park");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"Ml road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int t=stmt.executeUpdate();
		stmt.setString(1,"City palse");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"malviya nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int u=stmt.executeUpdate();
		stmt.setString(1,"Vaibhav tower");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"C sceme");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int v=stmt.executeUpdate();
		
		
		stmt.setString(1,"The triton");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"near jhotwara park");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		int w=stmt.executeUpdate();
		stmt.setString(1,"Jalsa mall");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"malviya nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		int x=stmt.executeUpdate();
		
			
		stmt.setString(1,"Gaurav tower");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"malviya nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		int y=stmt.executeUpdate();
		stmt.setString(1,"mgf mall");//1 specifies the first parameter in the query
		stmt.setString(2,"Malls");
		stmt.setString(3,"bias godam");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		int z=stmt.executeUpdate();
		stmt.setString(1,"ganpati plaza");//1 specifies the first parameter in the query

		stmt.setString(2,"Malls");
		stmt.setString(3,"Ml road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		

		
		int a=stmt.executeUpdate();
		stmt.setString(1,"Babylon children hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		int b=stmt.executeUpdate();		
		stmt.setString(1,"Delhi eye hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3, "Adarsh nagar");
		stmt.setString(4,"7:00 am");
		stmt.setString(5,"10pM");
		
		
		
		int c=stmt.executeUpdate();
		stmt.setString(1,"Happy nursing home & Gen hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		int d=stmt.executeUpdate();
		stmt.setString(1,"Jolly clink");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");

		
		
		
		int e=stmt.executeUpdate();
		stmt.setString(1,"Madan parnami Memoral hospital");//1 specifies the first parameter in the query
		stmt.setString(2," hospital");
		stmt.setString(3," Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int f=stmt.executeUpdate();
		
			
		stmt.setString(1,"Manglam Hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		
		
		int g=stmt.executeUpdate();
		stmt.setString(1,"Mental hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		
		int h=stmt.executeUpdate();
		stmt.setString(1,"Parvahi bihari lal Memoral hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		
		int a1=stmt.executeUpdate();
		stmt.setString(1,"Suraj hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar");
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int b1=stmt.executeUpdate();
		
		
		stmt.setString(1,"Jian Eye clinic hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Adarsh nagar MD road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int c1=stmt.executeUpdate();
		stmt.setString(1,"Chiktasa jagat");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Agra road");
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int d1=stmt.executeUpdate();
		
			
		stmt.setString(1,"Sagan hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"Agra road");
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int e1=stmt.executeUpdate();
		stmt.setString(1,"Agrawal hospital & infertility hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"ajmer road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int f1=stmt.executeUpdate();
		stmt.setString(1,"Anita children hospital");//1 specifies the first parameter in the query
		stmt.setString(2,"hospital");
		stmt.setString(3,"ajmer road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		int g1=stmt.executeUpdate();
		stmt.setString(1,"Agrawal college");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		stmt.setString(3,"agra road");//1 specifies the first parameter in the query
	    stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int h1=stmt.executeUpdate();		
		stmt.setString(1,"Baba ram mirdha Institute technology");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"Agra road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int i1=stmt.executeUpdate();
		stmt.setString(1,"Commerse college");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"Adarsh road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int j1=stmt.executeUpdate();
		stmt.setString(1,"Commerse institut of Information ");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"bias gogam road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int k1=stmt.executeUpdate();
		stmt.setString(1,"IHM jaipur");//1 specifies the first parameter in the query
		stmt.setString(2," colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"Agra road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int l1=stmt.executeUpdate();
		
			
		stmt.setString(1,"Jaipur Institute of Engineering & technology");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"mansarovar road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int m1=stmt.executeUpdate();
		stmt.setString(1,"Jaipur national university");//1 specifies the first parameter in the query
		
		stmt.setString(2,"colleges");//1 specifies the first parameter in the query
		stmt.setString(3,"Agra road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int n1=stmt.executeUpdate();
		stmt.setString(1,"JECRC");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		stmt.setString(3,"sitapura");//1 specifies the first parameter in the query
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int o1=stmt.executeUpdate();
		stmt.setString(1,"Lal bhadur shastri college");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		stmt.setString(3,"tilak nagar");//1 specifies the first parameter in the query
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int p1=stmt.executeUpdate();
		
		
		stmt.setString(1,"Mahrsri arvind management & technology");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"Agra road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int q1=stmt.executeUpdate();
		stmt.setString(1,"Poornima college & engineering");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		stmt.setString(3,"sitapura ricco industrial area");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		int o2=stmt.executeUpdate();
		
		
		stmt.setString(1,"Agrawal college");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		stmt.setString(3,"tilak nagar");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int r1=stmt.executeUpdate();
		
			
		stmt.setString(1,"Rajasthan college og Engineering & technology");//1 specifies the first parameter in the query
		stmt.setString(2,"colleges");
		//1 specifies the first parameter in the query
		stmt.setString(3,"Agra road");
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		
		int s1=stmt.executeUpdate();
		stmt.setString(1,"Subhod college");
		stmt.setString(2,"colleges");//1 specifies the first parameter in the query
		stmt.setString(3,"Malviya nagar");
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int v1=stmt.executeUpdate();
		stmt.setString(1,"BKBIT");
		stmt.setString(2,"colleges");//1 specifies the first parameter in the query
		stmt.setString(3,"ajmer road");
		
		stmt.setString(4,"8.00AM");
		stmt.setString(5,"9.00PM");
		
		
		int z1=stmt.executeUpdate();
		
		
		
		
		
		
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
