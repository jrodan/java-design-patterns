package com.prodyna.td;

import com.prodyna.td.mvc.ImageController;
import com.prodyna.td.mvc.ImageView;

public class Starter {
	
	public static void main(String[] args) {
		
		// init
		ImageController ic = new ImageController(new ImageView());
		
		// update 1
		ic.updateView();
		
		// update 2
		ic.updateView();
		
	}

}
