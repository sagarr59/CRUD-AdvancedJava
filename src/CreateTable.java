
import java.sql.*;
class CreateTable{
    public static void main(String[] args) {
        String name="root";
        String pass="";
        String url="jdbc:mysql://localhost:3306/javadb";
        String sql="Create table info(id int,name varchar(200),address varchar(200))";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Table Created Success");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}