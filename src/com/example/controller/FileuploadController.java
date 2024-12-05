package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.example.service.fileUploadService;

@Controller
public class FileuploadController {

	
	@Autowired
	private fileUploadService fus;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUploadForm() {
        return "index";
    }
	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public String uploadFileData(@RequestPart MultipartFile file) {
		
	fus.uploadFileService(file);
		return "login";
	}
}
