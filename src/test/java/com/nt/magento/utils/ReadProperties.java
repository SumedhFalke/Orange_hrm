package com.nt.magento.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public ReadProperties() {
		System.out.println("ReadProp");
	}
	// This class will have method to read data from property file

	public static String readData(String filename, String propertyName) {
		System.out.println("readData");
		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config\\" + filename);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(propertyName);
	}

}
