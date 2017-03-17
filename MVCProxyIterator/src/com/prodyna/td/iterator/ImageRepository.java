package com.prodyna.td.iterator;

import com.prodyna.td.mvc.Image;
import com.prodyna.td.util.ImageFactory;

// Iterator Pattern
public class ImageRepository implements ImageContainer {
	
	private Image[] images;
	
	@Override
	public ImageIterator getIterator() {
		return new ImageIteratorImpl();
	}
	
	public ImageRepository() {
		
		Image i1 = ImageFactory.createRandomImage();
		Image i2 = ImageFactory.createRandomImage();
		Image i3 = ImageFactory.createRandomImage();
		
		images = new Image[]{i1,i2,i3};
	}
	
	private class ImageIteratorImpl implements ImageIterator {
		
		int index = 0;
		
		@Override
		public boolean hasNext() {
			return images.length > index;
		}

		@Override
		public Image next() {
			return images[index++];
		}
	}

}
