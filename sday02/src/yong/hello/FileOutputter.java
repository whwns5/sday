package yong.hello;

import java.io.*;

public class FileOutputter implements Outputter {

	private String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void output(String msg) throws Exception {
		// TODO Auto-generated method stub
		// FileInputStream 1바이트 체계
		// FileWriter 2바이트 체계
		FileWriter fw = new FileWriter(this.filename);
		fw.write(msg);
		fw.close();
	}

}
