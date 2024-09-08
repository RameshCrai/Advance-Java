package Lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseTest {

	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/databaseprog";
	private static String USERNAME = "root";
	private static String PASSWORD = "admin";

	private static Scanner scanner;

	public static void main(String[] args) {
		while (true) {
			System.out.println(".....Select Menu .........");
			System.out.println("1) -> DB TEST ");
			System.out.println("2) -> CREATE TABLE ");
			System.out.println("3) -> INSERT DATA  ");
			System.out.println("4) -> SELECT DATA ");
			System.out.println("5) -> DELETE DATA ");

			scanner = new Scanner(System.in);
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				dbTest();
				break;
			case 2:
				createTable();
				break;
			case 3:
				scanner = new Scanner(System.in);
				String name = scanner.nextLine();
				insertData(name);
				break;
			case 4:
				selectData();
				break;
			case 5:
				scanner = new Scanner(System.in);
				int deleteid = scanner.nextInt();
				deleteData(deleteid);
				break;
			default:
				System.out.println("Please Enter Only Valid Number ??");

			}
		}

	}

	public static void dbTest() {
		try {
			Class.forName(DRIVER);
			try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
				System.out.println("Database Connect Successfuly ?? \n \n");

			} catch (SQLException s) {
				s.printStackTrace();
				System.out.println("Connection Failed ??");
			}

		} catch (ClassNotFoundException L) {
			L.printStackTrace();
			System.out.println("Driver manager not found ??");

		}
	}

	public static void createTable() {
		try {
			Class.forName(DRIVER);
			try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {

				Statement stm = con.createStatement();

				String sql = "CREATE TABLE IF NOT EXISTS student(id int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30))";
				stm.executeUpdate(sql);

				System.out.println("Database Table Create Successfuly");

			} catch (SQLException s) {
				s.printStackTrace();
				System.out.println("Connection Failed ??");
			}
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			System.out.println("Driver class not found ??");
		}

	}

	public static void insertData(String name) {
		String sql = "INSERT INTO student(name)VALUES(?)";
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			int isInsert = pstm.executeUpdate();
			if (isInsert > 0) {
				System.out.println("Data Insert Successfuly ??");
			} else {
				System.out.println("Data Insert Failed ??");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection Failed ???");
		}

	}

	public static void selectData() {
		String sql = "SELECT *FROM student";
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				System.out.println("Id = " + id + " Name= " + name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed to connect DB");
		}
	}

	public static void deleteData(int id) {
		String sql = "DELETE FROM student where id =?";
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);

			int rowDeleted = pstm.executeUpdate();
			if (rowDeleted > 0) {
				System.out.println("ID =" + id + " Deleted Successfuly ??");
			} else {
				System.out.println("Delete Failed ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
