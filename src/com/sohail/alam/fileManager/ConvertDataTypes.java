/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sohail.alam.fileManager;

/**
 *
 * @author sohail.alam
 */
public class ConvertDataTypes {

	public ConvertDataTypes() {
	}
	
	/**
	 * Convert byte array to string
	 * @param byteArray
	 * @return 
	 */
	public String toString(byte[] byteArray){
		String string = null;
		string = new String(byteArray);
		return string;
	}
	
	/**
	 * Convert string to byte array
	 * @param string
	 * @return 
	 */
	public byte[] toByteArray(String string){
		byte[] byteArray = null;
		byteArray = string.getBytes();
		return byteArray;
	}
}
