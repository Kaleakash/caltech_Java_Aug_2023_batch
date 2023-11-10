package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
			System.err.println(e);
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
			System.err.println(e);
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
			System.err.println(e);
			return 0;
		}
	}
	
	// in this method we need to convert all query into object ie Product 
	// 1, tv, 56000 
	// 2, mobile, 34000
	public List<Product> findAllProduct() {
		List<Product> listOfProduct = new ArrayList<>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product pp = new Product();
				pp.setPid(rs.getInt(1));
				pp.setPname(rs.getString(2));
				pp.setPrice(rs.getFloat(3));
				
				listOfProduct.add(pp);	// tv, mobile 
			}
			
			} catch (Exception e) {
				System.err.println(e);
			
			}
		return listOfProduct;		// store all product details in list 
	}
}
