import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class login {

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
            PreparedStatement PS = connection.prepareStatement("SELECT * FROM test WHERE username = ? AND password = ?");

            PS.setString(1, username);
            PS.setString(2, password);
            ResultSet rs = PS.executeQuery();
            if (rs.next()) {
                System.out.println("You have successfully logged in.");
            } else {
                System.out.println("login failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
