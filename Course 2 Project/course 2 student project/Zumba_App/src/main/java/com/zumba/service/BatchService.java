package com.zumba.service;

import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.dao.BatchDao;

public class BatchService {

	BatchDao bd = new BatchDao();
	
	public String storeBatch(Batch batch) {
		if(bd.addBatch(batch)>0) {
			return "Batch details added successfully";
		}else {
			return "Batch details didn't add";
		}
	}
	
	public List<Batch> allBatchDetails() {
		return bd.getAllBatchDetails();
	}
}
