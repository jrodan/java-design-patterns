package com.prodyna.td.proxy;

import com.prodyna.td.mvc.Image;
import com.prodyna.td.mvc.ImageImpl;
import com.prodyna.td.util.ImageFactory;

import java.io.File;

// Proxy Interface
public class ImageProxyImpl extends ImageImpl implements Image  {
	
	private Image imageReal;
	private String absolutePath;
	
	private Image getImageReal() {
		if(imageReal == null) {
			this.imageReal = ImageFactory.getRandomImageFromFileSystem(absolutePath);
		}
		return imageReal;
	}
	
	public ImageProxyImpl(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	
	@Override
	public File getFile() {
		return getImageReal().getFile();
	}

	@Override
	public String getName() {
		return getImageReal().getName();
	}

	@Override
	public String getFileSize() {
		return getImageReal().getName();
	}

	@Override
	public String doView() {
		return "name: "+getImageReal().getName()+" file: "+this.absolutePath+" fileSize: "+getImageReal().getName();
	}


}
