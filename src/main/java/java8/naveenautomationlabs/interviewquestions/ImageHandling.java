package java8.naveenautomationlabs.interviewquestions;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	/*
	 * Image Format Conversion in Java (JPG to PNG/BMP/GIF Files)
	 * 
	 */
	public static void main(String[] args) {

		try {
//			Reading or taking image from url
//			URL url = new URL("path of image url");
//			BufferedImage bf = ImageIO.read(url);	

//			Reading or taking image from File system		
			File file = new File("path of image");
			BufferedImage bf = ImageIO.read(file);

			ImageIO.write(bf, "jpg", new File("path where u want to store image after conversion"));
			ImageIO.write(bf, "gif", new File("path where u want to store image after conversion"));
			ImageIO.write(bf, "png", new File("path where u want to store image after conversion"));
			ImageIO.write(bf, "bmp", new File("path where u want to store image after conversion"));

			System.out.println("----Done------");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
