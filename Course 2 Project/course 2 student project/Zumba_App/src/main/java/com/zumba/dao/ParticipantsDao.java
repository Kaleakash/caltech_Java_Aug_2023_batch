package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.zumba.bean.Participant;
import com.zumba.resource.DbResource;

public class ParticipantsDao {

	public int addParticipants(Participant participant) {
		try {
		Connection con = DbResource.getDbConnection();	
		PreparedStatement pstmt = con.prepareStatement("insert into participants values(?,?,?,?,?)");
		pstmt.setInt(1, participant.getParticipantid());
		pstmt.setString(2, participant.getPname());
		pstmt.setInt(3, participant.getAge());
		pstmt.setString(4, participant.getPhonenumber());
		pstmt.setInt(5, participant.getBatchid());
		return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
}
