/**
 * 
 */
package ua.kyiv.order_book.connectorsdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author firsov
 *
 */
public final class ConnectorMySQL {
	
	private static Connection connection;
	private static ConnectorMySQL connectorMySQL;
	
	private ConnectorMySQL() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/task?user=sa&password=1q2w3e4r");
		}catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public static Connection getConnect(){
		if (null == connectorMySQL) {
			connectorMySQL = new ConnectorMySQL();
			return connection;
		}
		return connection;
	}
}
