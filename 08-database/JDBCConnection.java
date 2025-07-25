import java.sql.*;

public class JDBCConnection {

    // Database credentials
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/test_db"; // Modify if necessary
    static final String JDBC_USER = "test01"; // Your MySQL username
    static final String JDBC_PASSWORD = "test@123"; // Your MySQL password

    public static void main(String[] args) {
        // Declare connection objects
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL JDBC driver

            // Step 2: Open a connection
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Step 3: Create a statement
            stmt = conn.createStatement();

            // Step 4: Execute a query
            String sql = "SELECT id, name, email FROM users";
            rs = stmt.executeQuery(sql);

            // Step 5: Extract data from the result set
            System.out.println("ID\tName\t\tEmail");
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                // Display the results
                System.out.println(id + "\t" + name + "\t" + email);
            }
        } catch (SQLException se) {
            // Handle JDBC errors
            se.printStackTrace();
        } catch (Exception e) {
            // Handle other errors
            e.printStackTrace();
        } finally {
            // Step 6: Clean up
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

