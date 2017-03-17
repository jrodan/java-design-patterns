package com.prodyna.td.mvc;

import com.prodyna.td.iterator.ImageIterator;
import com.prodyna.td.iterator.ImageRepository;

// MVC Pattern, Iterator Pattern, Proxy Pattern
public class ImageController {

	private ImageRepository imageRepo;
	private ImageView view;
	
	public ImageController(ImageView view) {
		imageRepo = new ImageRepository();
		this.view = view;
		updateView();
	}
	
	public void updateView() {
		
		System.out.println("updateView");
		ImageIterator it = this.imageRepo.getIterator();
		while(it.hasNext()) {
			this.view.doView(it.next());
		}
		
	}

	public ImageRepository getImageRepo() {
		return imageRepo;
	}

	public void setImageRepo(ImageRepository imageRepo) {
		this.imageRepo = imageRepo;
	}


}
