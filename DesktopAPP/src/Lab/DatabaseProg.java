package Lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseProg {

    private static final String URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USER = "yourusername";
    private static final String PASSWORD = "yourpassword";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. TestDB");
            System.out.println("2. ExecSQL");
            System.out.println("3. QueryTest");
            System.out.println("4. ViewDB");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    testDB();
                    break;
                case 2:
                    System.out.println("Enter SQL statement to execute:");
                    String sql = scanner.nextLine();
                    execSQL(sql);
                    break;
                case 3:
                    System.out.println("Enter SQL query to execute:");
                    String query = scanner.nextLine();
                    queryTest(query);
                    break;
                case 4:
                    viewDB();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void testDB() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (connection != null) {
                System.out.println("Database connection successful!");
            } else {
                System.out.println("Database connection failed!");
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }

    private static void execSQL(String sql) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute(sql);
            System.out.println("SQL statement executed successfully!");

        } catch (SQLException e) {
            System.out.println("Failed to execute SQL statement.");
            e.printStackTrace();
        }
    }

    private static void queryTest(String query) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                // Assuming the query returns a table with a single column named "column1"
                System.out.println(resultSet.getString("column1"));
            }

        } catch (SQLException e) {
            System.out.println("Failed to execute query.");
            e.printStackTrace();
        }
    }

    private static void viewDB() {
        // Example: Show tables in the database
        String query = "SHOW TABLES";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("Tables in the database:");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)); // Column index for table name
            }

        } catch (SQLException e) {
            System.out.println("Failed to view database.");
            e.printStackTrace();
        }
    }
}
