import java.sql.*;
public class maxmarks {
    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydb","root","1234");  
            //here root is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs1=stmt.executeQuery("select * from mark");  
            while(rs1.next())  
            System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3));
            ResultSet rs=stmt.executeQuery("SELECT name,marks FROM mark WHERE marks = (SELECT MAX(marks) FROM mark)");  
            while(rs.next())  
            System.out.println("Maximum marks obtained by Name: " + rs.getString("name") + ", Marks: " + rs.getInt("marks")); 
             
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
    
}
