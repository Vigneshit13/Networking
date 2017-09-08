package io;

import java.io.FileReader;
import java.io.FileWriter;

public class Writer1 {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("hi buddy");
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Exception"+e);
			// TODO: handle exception
			
		}
		
try {
	FileReader fr = new  FileReader("sample.txt");
 char []a=new char[50];
 fr.read(a);
 for(char c:a){
	 System.out.println(c);
 }
} catch (Exception e) {
	// TODO: handle exception
}	}
}

