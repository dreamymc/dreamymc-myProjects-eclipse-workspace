import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class removeUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\user\\eclipse-workspace\\SQLLite\\src\\com\\database\\databaseTEST.db";

		System.out.print("Username you want to delete: ");
		String username = scan.nextLine();
		System.out.print("enter the password: ");
		String password = scan.nextLine();

        try {
        	Connection connection = DriverManager.getConnection(jdbcUrl);
            PreparedStatement ps = connection.prepareStatement("DELETE FROM `test` WHERE `username` = ? AND `password`=? ");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            System.out.println("Deleted Successfully");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

	}

}
