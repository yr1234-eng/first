package Iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("F:\\JAVA¡∑œ∞”√\\a.txt");
	FileOutputStream fos = new FileOutputStream ("F:\\JAVA¡∑œ∞”√\\b.txt");
	byte by [] =  new  byte[1024];
	int len;
	while ((len=fis.read(by))!=-1) {
		fos.write(by);
	}
	System.out.println(new String(by, 0, len));
	
}
}
