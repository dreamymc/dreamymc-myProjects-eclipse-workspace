import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class updateConfirm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\user\\eclipse-workspace\\SQLLite\\src\\com\\database\\databaseTEST.db";

		System.out.print("Username: ");
		String username = scan.nextLine();

		System.out.print("Password: ");
		String password = scan.nextLine();

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			PreparedStatement PS = connection
					.prepareStatement("SELECT * FROM test WHERE username = ? AND password = ?");

			PS.setString(1, username);
			PS.setString(2, password);
			ResultSet rs = PS.executeQuery();
			System.out.println("Connected Succesfuly");
			if (!rs.next()) {
				System.out.println("Incorrect username or password");
			}else {
				System.out.print("Update Password: ");
				String updatePassword = scan.nextLine();

				try {
					Connection connection1 = DriverManager.getConnection(jdbcUrl);
					PreparedStatement PS1 = connection.prepareStatement("UPDATE `test` SET `password`= ? WHERE `username` = ? AND `password` = ?");
					PS1.setString(1, updatePassword);
					PS1.setString(2, username);
					PS1.setString(3, password);
					PS1.executeUpdate();
					System.out.println("Updated Successfully");
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("User not found.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
}
