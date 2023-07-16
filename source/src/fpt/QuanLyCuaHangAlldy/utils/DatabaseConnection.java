package fpt.QuanLyCuaHangAlldy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection con = null;
	private static DatabaseConnection instance = new DatabaseConnection();

	public static DatabaseConnection getInstance() {
		return instance;
	}

	public static void connect() {
		String url = Config.DB_URL;
		String user = Config.USER;
		String password = Config.PASSWORD;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public static void disconnect() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static Connection getConnection() {
		connect();
		return con;
	}
}
