package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.resource.DbResource;

public class BatchDao {

	public int addBatch(Batch batch) {
		try {
		Connection con = DbResource.getDbConnection();	
		PreparedStatement pstmt = con.prepareStatement("insert into batch values(?,?,?)");
		pstmt.setInt(1, batch.getBatchid());
		pstmt.setString(2, batch.getTypeofbatch());
		pstmt.setString(3, batch.getTime());
		return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
	
	public List<Batch> getAllBatchDetails() {
		List<Batch> lisOfBatch = new ArrayList<>();
		try {
			Connection con = DbResource.getDbConnection();	
			PreparedStatement pstmt = con.prepareStatement("select * from batch");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Batch batch = new Batch();
				batch.setBatchid(rs.getInt(1));
				batch.setTypeofbatch(rs.getString(2));
				batch.setTime(rs.getString(3));
				lisOfBatch.add(batch);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
		return lisOfBatch;
	}
}
