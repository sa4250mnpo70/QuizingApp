/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.fileManager;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author sohail.alam
 */
public class Tests {
	public static void main(String args[]){
		BufferedImage buffImage = null;
		try {
			buffImage = ImageIO.read(new File("D:/image.jpg"));
			ImageIO.write(buffImage, "jpg", new File("D:/test.jpg"));
		} catch (Exception e) {
		}
	}
}
