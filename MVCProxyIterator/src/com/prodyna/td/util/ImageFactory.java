package com.prodyna.td.util;

import com.prodyna.td.mvc.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Factory Pattern
public class ImageFactory {

	public static File createRandomPhysicalImage() {

		// image dimension
		int width = 640;
		int height = 320;
		// create buffered image object img
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		// file object
		File f = null;
		// create random image pixel by pixel
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int a = (int) (Math.random() * 256); // alpha
				int r = (int) (Math.random() * 256); // red
				int g = (int) (Math.random() * 256); // green
				int b = (int) (Math.random() * 256); // blue

				int p = (a << 24) | (r << 16) | (g << 8) | b; // pixel

				img.setRGB(x, y, p);
			}
		}
		// write image
		try {
			new File("images").mkdir();
			f = new File("images/"+(Math.random() * 256)+".png");
			ImageIO.write(img, "png", f);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		//Image image = new Image();
		return f;
	}
	
	public static Image createRandomImage() {
		// TODO 
		return null;
	}

}
