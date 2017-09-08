package io;

import java.io.FileWriter;

public class Writer1 {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
