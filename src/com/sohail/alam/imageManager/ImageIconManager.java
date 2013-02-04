/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.imageManager;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author sohail.alam
 */
public class ImageIconManager {

	/**
	 * Resize an image and return as ImageIcon
	 *
	 * @param source
	 * @param maxHeight
	 * @param maxWidth
	 * @return ImageIcon
	 * @throws Exception  
	 */
	public ImageIcon rescaleImage(File source, int maxHeight, int maxWidth) throws Exception {
		int newHeight = 0, newWidth = 0;        // Variables for the new height and width
		int priorHeight = 0, priorWidth = 0;
		BufferedImage image = null;
		ImageIcon sizeImage;

		try {
			image = ImageIO.read(source);        // get the image
		} catch (Exception e) {
			throw e;
		}

		sizeImage = new ImageIcon(image);

		if (sizeImage != null) {
			priorHeight = sizeImage.getIconHeight();
			priorWidth = sizeImage.getIconWidth();
		}

		// Calculate the correct new height and width
		if ((float) priorHeight / (float) priorWidth > (float) maxHeight / (float) maxWidth) {
			newHeight = maxHeight;
			newWidth = (int) (((float) priorWidth / (float) priorHeight) * (float) newHeight);
		} else {
			newWidth = maxWidth;
			newHeight = (int) (((float) priorHeight / (float) priorWidth) * (float) newWidth);
		}


		// Resize the image

		// 1. Create a new Buffered Image and Graphic2D object
		BufferedImage resizedImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = resizedImg.createGraphics();

		// 2. Use the Graphic object to draw a new image to the image in the buffer
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(image, 0, 0, newWidth, newHeight, null);
		g2.dispose();

		// 3. Convert the buffered image into an ImageIcon for return
		return (new ImageIcon(resizedImg));
	}
}
