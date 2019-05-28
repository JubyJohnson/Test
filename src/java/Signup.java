
import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.enterprise.credential.Password;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Email;


public class Signup extends HttpServlet{
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      //  MyDb db = new MyDb();

        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root"); 
            Statement stmt = (Statement) con.createStatement();
//           String First_Name= request.getParameter("t1");
//           String Last_Name= request.getParameter("t2");
//           String Email= request.getParameter("t3");
//           String Password= request.getParameter("t4");
          // ResultSet rs=stmt.executeUpdate("insert into user (uname,upass,email)values('"+First_Name+"','"+Last_Name+"','"+Email+"',"+Password+"')");
                String query = " insert into users (First_Name,Last_Name,Email,Password)"+ " values (?, ?, ?, ?)";
        

               
          
        } catch (SQLException ex) {
             Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
