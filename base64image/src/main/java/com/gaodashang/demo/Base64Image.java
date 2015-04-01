package com.gaodashang.demo;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;

public class Base64Image {

	public static void main(String[] args) throws IOException {

		String imagePath = "C:\\Users\\Administrator\\Desktop\\p1\\p0.png";
		Base64Image base64Image = new Base64Image();
		String base64Str = base64Image.encodeImage(imagePath);
		System.out.println(base64Str);
	}
	
	public String encodeImage(String imagePath) throws IOException {
		FileInputStream fis;
		byte[] data = null;

		fis = new FileInputStream(imagePath);
		data = new byte[fis.available()];
		fis.read(data);
		fis.close();

		BASE64Encoder encoder = new BASE64Encoder();
		String base64Str = encoder.encode(data);
		return base64Str;
	}
	

}
