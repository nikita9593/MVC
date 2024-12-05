package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.example.dao.fileUploadDAO;
import com.example.service.fileUploadService;

public class fileUploadImpl implements fileUploadService{

	@Autowired
	private fileUploadDAO exdao;

	@Override
	public void uploadFileService(MultipartFile file) {
		
		exdao.uploadFileInDao(file);
		
	}
	
	
	
}
