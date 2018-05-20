package info.mypackage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import info.mypackage.model.Cart;

public class CartDAO {

	public static void save(Cart cart) {
		String sql = "INSERT INTO carts(create_time) VALUES(?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionToDB.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setLong(1, cart.getCreateTime());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
