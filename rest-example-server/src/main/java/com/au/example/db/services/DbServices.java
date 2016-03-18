package com.au.example.db.services;

import java.util.List;

import com.au.example.db.model.Data;




public interface DbServices {

	void createData(Data data);
	
	Data findById(Integer id);
	
	List<?> getAllAuditData();
	
	List<Data> getAuditData(Integer id);
	
	List<Data> getAuditDataUseDataDetialId(Integer dataDetialId);

}
