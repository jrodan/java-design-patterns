package com.prodyna.td.mvc;

import com.prodyna.td.iterator.ImageRepository;

// MVC Pattern, Iterator Pattern, Proxy Pattern
public class ImageController {

	private ImageRepository imageRepo;
	private ImageView view;
	
	public ImageController() {
		// TODO generate imageIterator with ProxyImages
	}
	
	public void updateView() {
		// TODO 
		// this.view do sth - sysout
	}

	public ImageRepository getImageRepo() {
		return imageRepo;
	}

	public void setImageRepo(ImageRepository imageRepo) {
		this.imageRepo = imageRepo;
	}


}
