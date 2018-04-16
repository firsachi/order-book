package ua.kyiv.order_book.dao.impl;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import ua.kyiv.order_book.ConnectorMySQL;
import ua.kyiv.order_book.dao.BidsAsкsDao;
import ua.kyiv.order_book.dao.OrderBookDao;
import ua.kyiv.order_book.entities.BidsAsкs;
import ua.kyiv.order_book.entities.OrderBook;

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
		BidsAsкsDao bidsAsкsDao = new BidsAsкsDaoImpl();
		for(BidsAsкs bidsAsкs: orderBook.getListBidsAsкs()) {
			bidsAsкs.setOrderBookId(orderBook.getId());
			bidsAsкsDao.save(bidsAsкs);
		}
	}

}
