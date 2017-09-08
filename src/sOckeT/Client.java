package sOckeT;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
public static void main(String[] args) {
	try{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Socket soc = new Socket("127.0.0.1",8080);
		DataInputStream din=new DataInputStream(soc.getInputStream());
		DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
		 System.out.println("Enter the logical address(ip):");
		 String str=in.readLine();
		 dout.writeBytes("The physical addres is:"+str);
		 soc.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
}
