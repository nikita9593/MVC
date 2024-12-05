package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface fileUploadService {

	void uploadFileService(MultipartFile file);

	

}
