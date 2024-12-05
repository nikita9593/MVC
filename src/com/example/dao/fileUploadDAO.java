package com.example.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface fileUploadDAO {

	void uploadFileInDao(MultipartFile file);

}
