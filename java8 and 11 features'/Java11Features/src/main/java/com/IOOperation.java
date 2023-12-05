package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOOperation {

	public static void main(String[] args) throws Exception{
	// Write operation 
//	Path filePath = Paths.get("demo.txt");
//	String msg ="welcome to java 11 features";
//	Files.writeString(filePath, msg);
//	System.out.println("Data stored in file successfully");
	// Read Operation 
	Path filePath = Paths.get("demo.txt");
	String data = Files.readString(filePath);
	System.out.println(data);
	}

}
