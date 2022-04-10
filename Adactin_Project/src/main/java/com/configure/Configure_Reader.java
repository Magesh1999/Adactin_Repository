package com.configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configure_Reader {

	public Properties p;
	private void configuration_reader() throws IOException {
		File file = new File("C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Configure\\configure.properties");
		FileInputStream fis = new FileInputStream(file);
		p = new Properties();
		p.load(fis);
	}

	private String con_url() {
		String url = p.getProperty("url");
		return url;
	}



}
