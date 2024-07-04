import java.sql.*;

class UpdateTable {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/javadb";
        String sql = "UPDATE info SET address='Kalanki' WHERE name='Shyam'";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate(sql);
            if (rowsAffected > 0) {
                System.out.println("Update Successful");
            } else {
                System.out.println("No records updated");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
