package dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.BidsAsкsDao;
import entities.BidsAsкs;
import ua.kyiv.order_book.connectorsdb.ConnectorMySQL;

public class BidsAsкsDaoImpl implements BidsAsкsDao{

	@Override
	public void save(BidsAsкs bidsAsкs) {
		String sql = "INSERT INTO bids_asкs (bird,ask,timestamp) VALUES (?,?,?)";
		try (PreparedStatement pr = ConnectorMySQL.getConnect().prepareStatement(sql);) {
			pr.setFloat(1, bidsAsкs.getBids());
			pr.setFloat(2, bidsAsкs.getAsks());
			pr.setInt(3, bidsAsкs.getOrderBookId());
			pr.executeUpdate();
		}catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
