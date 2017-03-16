package com.prodyna.td.iterator;

import com.prodyna.td.mvc.Image;

// Iterator Pattern
public class ImageRepository implements ImageContainer {
	
	private Image[] images;
	
	@Override
	public ImageIterator getIterator() {
		return new ImageIteratorImpl();
	}
	
	public ImageRepository() {
		// TODO Auto-generated constructor stub
	}
	
	private class ImageIteratorImpl implements ImageIterator {
		
		int index;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Image next() {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
