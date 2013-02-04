/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.fileManager;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sohail.alam
 */
public class ReadWriteFile {

	public ReadWriteFile() {
	}

	/**
	 * Read a file and return a byte array
	 *
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public byte[] readFile(File filename) throws Exception {
		byte[] fileByte;
		FileInputStream is;
		try {
			is = new FileInputStream(filename);
			fileByte = new byte[is.available()];
			is.read(fileByte);
		} catch (Exception e) {
			throw e;
		}
		return fileByte;
	}
	
	/**
	 * 
	 * @param filepath
	 * @return
	 * @throws Exception 
	 */
	public byte[] readFile(String filepath) throws Exception {
		byte[] fileByte;
		FileInputStream is;
		try {
			is = new FileInputStream(filepath);
			fileByte = new byte[is.available()];
			is.read(fileByte);
		} catch (Exception e) {
			throw e;
		}
		return fileByte;
	}

	/**
	 * Save a byte array as a file to a given path
	 * @param fileBytes
	 * @param pathToSaveFile
	 * @throws Exception 
	 */
	public void writeFile(byte[] fileBytes, String pathToSaveFile) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(pathToSaveFile);
			bos.write(fileBytes);
			fos.write(bos.toByteArray());
		} catch (FileNotFoundException ex) {
			throw ex;
		} finally {
			bos.close();
			fos.close();
		}
	}
}
