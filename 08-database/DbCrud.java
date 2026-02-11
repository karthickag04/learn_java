import java.sql.*;
import java.util.Random;

public class DbCrud {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/schooldb";
    private static final String JDBC_USER = "test01";
    private static final String JDBC_PASSWORD = "Test@123p";

    // Helper method to get a connection
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    // Create: Add a new student
    public void addStudent(String name, String email) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Student added successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
    }

    // Read: Get all students
    public void getAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- Student List ---");
            System.out.printf("%-5s %-20s %-30s%n", "ID", "Name", "Email");
            System.out.println("----------------------------------------------");
            boolean hasRecords = false;
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-30s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
                hasRecords = true;
            }
            if (!hasRecords) {
                System.out.println("No records found.");
            }
            System.out.println("----------------------------------------------\n");

        } catch (SQLException e) {
            System.err.println("Error fetching students: " + e.getMessage());
        }
    }

    // Update: Modify an existing student
    public void updateStudent(int id, String name, String email) {
        String sql = "UPDATE students SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
        }
    }

    // Delete: Remove a student
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }
    }

    // Utility: Add a random student for testing
    public void addRandomStudent() {
        String[] names = { "John Doe", "Jane Smith", "Alice Brown", "Bob White", "Charlie Green" };
        String[] domains = { "gmail.com", "yahoo.com", "outlook.com", "example.com" };
        Random random = new Random();

        String randomName = names[random.nextInt(names.length)] + " " + (100 + random.nextInt(900));
        String randomEmail = randomName.toLowerCase().replace(" ", ".") + "@" + domains[random.nextInt(domains.length)];

        System.out.println("Adding random student: " + randomName + " (" + randomEmail + ")");
        addStudent(randomName, randomEmail);
    }
}
