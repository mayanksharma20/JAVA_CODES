
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CollegeEventsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String clas = request.getParameter("class");
        String gender = request.getParameter("gender");
        String activity = request.getParameter("activity");
        
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
        Connection con=DriverManager.getConnection
                       ("jdbc:mysql://localhost:3306/collegeevent","root","root");

        PreparedStatement ps=con.prepareStatement
                  ("insert into eventdata values(?,?,?,?)");

        ps.setString(1,name);
        ps.setString(2,clas);
        ps.setString(3,gender);
        ps.setString(4,activity);
        
        int i=ps.executeUpdate();
        
        if(i>0)
        {
        out.println("<b>Data has been saved successfully!</b>");
        }
        
        }
        catch(Exception se)
        {
        out.println(se);
        }
	
    }
}
