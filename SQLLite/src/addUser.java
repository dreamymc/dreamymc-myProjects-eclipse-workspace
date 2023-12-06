import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Username: ");
		String username = new java.util.Scanner(System.in).nextLine();

		System.out.print("Password: ");
		String password = new java.util.Scanner(System.in).nextLine();

		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\user\\eclipse-workspace\\SQLLite\\src\\com\\database\\databaseTEST.db";

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			System.out.println("Connected Succesfuly");

			PreparedStatement PS = connection.prepareStatement("INSERT INTO `test`(`username`, `password`) VALUES (?,?)");
			PS.setString(1, username);
			PS.setString(2, password);
			PS.executeUpdate();
			System.out.println("User added.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
