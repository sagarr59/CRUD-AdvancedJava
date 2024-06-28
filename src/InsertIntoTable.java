
import java.sql.*;
class InserIntoTable{
    public static void main(String[] args) {
        String name="root";
        String pass="";
        String url="jdbc:mysql://localhost:3306/javadb";
        String sql="insert into info(id,name,address) values('1','Sagar','kalanki'),('2','Shyam','thapathali')";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Inserted Success");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}