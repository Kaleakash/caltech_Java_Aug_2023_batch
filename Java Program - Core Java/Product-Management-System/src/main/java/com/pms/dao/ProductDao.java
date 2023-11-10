package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pms.bean.Product;
import com.pms.resource.DbConnection;

public class ProductDao {
	
	public int storeProduct(Product product) {
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		pstmt.setInt(1, product.getPid());
		pstmt.setString(2, product.getPname());
		pstmt.setFloat(3, product.getPrice());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateProductPrice(Product product) {
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
		pstmt.setFloat(1, product.getPrice());
		pstmt.setInt(2, product.getPid());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	
	public int deleteProduct(int pid) {
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
		pstmt.setInt(1, pid);
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
