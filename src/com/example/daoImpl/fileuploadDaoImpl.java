package com.example.daoImpl;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.example.dao.fileUploadDAO;
import com.example.model.document;

public class fileuploadDaoImpl implements fileUploadDAO {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void uploadFileInDao(MultipartFile file) {
		
		
		try {
			
			Session session= sf.openSession();
		document doc =new document();
		doc.setFileName(file.getOriginalFilename());
		doc.setFileUploadTime(new Date());
		doc.setFileData(file.getBytes());
		
		session.save(doc);
		session.beginTransaction().commit();
		System.out.println("file uploaded");
		}catch (Exception e) {
		System.out.println(e);
		}
	}

}
