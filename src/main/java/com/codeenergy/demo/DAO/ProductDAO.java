package com.codeenergy.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.codeenergy.demo.DTO.Product;

public class ProductDAO {
	public DataSource dataSource;
	
	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// data access methods...
	public Product getProduct(int primaryKey) {
		Connection connection;
		try {
			connection = dataSource.getConnection();
			String sql = "SELECT * FROM Product WHERE id = ?";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setInt(1, primaryKey);
			ResultSet resultSet = stm.executeQuery();
			if(resultSet.next()){
				Product product = new Product(
						resultSet.getInt(1),
						resultSet.getString(2),
						resultSet.getFloat(3),
						resultSet.getString(4)
						);
				return product;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}