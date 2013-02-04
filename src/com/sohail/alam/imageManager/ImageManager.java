/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.imageManager;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author sohail.alam
 */
public class ImageManager {

	public ImageManager() {
	}
	
	/**
	 *
	 * @param source
	 * @return
	 * @throws Exception
	 */
	public BufferedImage readImageFromFile(File source) throws Exception {
		BufferedImage image = null;
		try {
			image = ImageIO.read(source);        // get the image
		} catch (Exception e) {
			throw e;
		}
		return image;
	}

	/**
	 *
	 * @param isSource
	 * @return
	 * @throws Exception
	 */
	public BufferedImage readImageFromInputStream(InputStream isSource) throws Exception {
		BufferedImage image = null;
		try {
			image = ImageIO.read(isSource);        // get the image
		} catch (Exception e) {
			throw e;
		}
		return image;
	}

	/**
	 *
	 * @param issSource
	 * @return
	 * @throws Exception
	 */
	public BufferedImage readImageFromImageInputStream(ImageInputStream issSource) throws Exception {
		BufferedImage image = null;
		try {
			image = ImageIO.read(issSource);        // get the image
		} catch (Exception e) {
			throw e;
		}
		return image;
	}

	public BufferedImage readImageFromURL(URL urlSource) throws Exception {
		BufferedImage image = null;
		try {
			image = ImageIO.read(urlSource);        // get the image
		} catch (Exception e) {
			throw e;
		}
		return image;
	}

	/**
	 *
	 * @param buffImage
	 * @param maxHeight
	 * @param maxWidth
	 * @return
	 * @throws Exception
	 */
	public BufferedImage rescaleImage(BufferedImage buffImage, int maxHeight, int maxWidth) throws Exception {
		int newHeight = 0, newWidth = 0;        // Variables for the new height and width
		int priorHeight = 0, priorWidth = 0;
		ImageIcon sizeImage;

		sizeImage = new ImageIcon(buffImage);

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
		g2.drawImage(buffImage, 0, 0, newWidth, newHeight, null);
		g2.dispose();

		// 3. return the Buffered Image
		return resizedImg;
	}

	/**
	 *
	 * @param source
	 * @param maxHeight
	 * @param maxWidth
	 * @return
	 * @throws Exception
	 */
	public BufferedImage rescaleImageFromFile(File source, int maxHeight, int maxWidth) throws Exception {
		try {
			BufferedImage buffImage = readImageFromFile(source);
			return rescaleImage(buffImage, maxHeight, maxWidth);
		} catch (Exception e) {
			throw e;
		}

	}

	/**
	 *
	 * @param buffImage
	 * @param imageFormat
	 * @param imageFileName
	 * @throws Exception
	 */
	public void writeImage(BufferedImage buffImage, String imageFormat, File imageFileName) throws Exception {
		try {
			ImageIO.write(buffImage, imageFormat, imageFileName);
		} catch (IOException ex) {
			throw ex;
		}
	}

	public BufferedImage fromByteArray(byte[] byteArray, int height, int width) {

		//the DataBuffer
		DataBufferByte db = new DataBufferByte(byteArray, byteArray.length);

		//the Raster
		int[] bandOffsets = new int[]{1, 2, 3, 0};
		WritableRaster raster = Raster.createInterleavedRaster(
			db, width, height, width * 4, 4, new int[]{0, 1, 2, 3}, null);

		//the ColorModel
		ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
		int[] nBits = {8, 8, 8, 8};
		ColorModel colorModel = new ComponentColorModel(cs, nBits, true, false,
			Transparency.TRANSLUCENT,
			DataBuffer.TYPE_BYTE);

		//the BufferedImage
		BufferedImage theImage = new BufferedImage(colorModel, raster, false, null);

		return theImage;
	}
}
