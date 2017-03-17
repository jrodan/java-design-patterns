package com.prodyna.td.mvc;

import java.io.File;

//MVC Pattern
public interface Image {
	
	File getFile();
	String getName();
	String getFileSize();
	String doView();
	void setFileSize(String fileSize);
	void setFile(File file);
	void setName(String name);
}
