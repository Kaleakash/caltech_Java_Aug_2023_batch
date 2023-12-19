package com.zumba.service;

import com.zumba.bean.Participant;
import com.zumba.dao.ParticipantsDao;

public class ParticipantsService {

	ParticipantsDao pd = new ParticipantsDao();
	
	public String storeParticipatns(Participant participant) {
		if(pd.addParticipants(participant)>0) {
			return "Participants details added successfully";
		}else {
			return "Participant details didn't add";
		}
	}
}
