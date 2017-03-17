package com.prodyna.td.mvc;

import java.io.File;

//MVC Pattern
public class ImageImpl implements Image {
	
	private File file;
	private String name;
	private String fileSize;
	
	public void setFile(File file) {
		this.file = file;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public File getFile() {
		return file;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getFileSize() {
		return fileSize;
	}

	@Override
	public String doView() {
		return "name: "+name+" file: "+file.getAbsolutePath()+" fileSize: "+fileSize;
	}

}
