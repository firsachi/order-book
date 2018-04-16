package dao.impl;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.OrderBookDao;
import entities.OrderBook;
import ua.kyiv.order_book.connectorsdb.ConnectorMySQL;

public class OrderBookDaoImpl implements OrderBookDao{
	
	@Override
	public void save(OrderBook orderBook) {
		String sql = "INSERT INTO order_book (timestamp) VALUES (?) ";
		try (PreparedStatement pr = ConnectorMySQL.getConnect().prepareStatement(sql)){
			pr.setString(1, orderBook.getTimestamp());
			int id = pr.executeUpdate();
			orderBook.setId(id);
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
