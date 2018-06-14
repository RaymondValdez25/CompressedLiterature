//Raymond Valdez
import java.util.PriorityQueue;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
	
	//the main method outputs the map of codes into 'MyCodes'
	//and outputs the compressed file into 'MyEncoded'
	public static void main(String []args) throws IOException{
		
		long startTime = System.nanoTime();	
		long endTime = System.nanoTime();
		
		PrintStream out = new PrintStream(new FileOutputStream("MyCodes.txt"));
		PrintStream out2 = new PrintStream(new FileOutputStream("MyEncoded.txt"));
		
		
		
		Scanner scanner = new Scanner(Paths.get("WarAndPeace.txt"), StandardCharsets.UTF_8.name());
		String content = scanner.useDelimiter("\\A").next();
		scanner.close();
		
		
		
		
		//other testing file, uncomment to compress Napolean
		///////////////////////////////////////////////////////////////////////////////
		//File file = new File("Napoleon.txt");
		//String content = new Scanner(new File("Napoleon.txt")).useDelimiter("\\Z").next();
		////////////////////////////////////////////////////////////////////////////
		
		File file = new File("WarAndPeace.txt");
		double initialSize = file.length() /1024;
		
		CodingTree(content, out, out2); //coding tree
		
		File outfile = new File("myEncoded.txt");
		
		double finalSize = outfile.length() /1024;
		
		
		//testCodingTree(out, out2); //tester method for coding tree with a short simple phrase
		
		//display statistics of the program
		endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		double milliseconds = totalTime/(Math.pow(10,6));
		System.out.println("initial size: " + (initialSize + 1)); //the file won't display the correct size unless I add a 1 to it
		System.out.println("output size: " + (finalSize + 1)); //the file won't display the correct size unless I add a 1 to it
		System.out.println("ratio: " + (finalSize+1)/(initialSize+1) * 100 + "%");
		System.out.println("the code takes " + milliseconds + " milliseconds to complete");
		
	}
	
	static void CodingTree(String content, PrintStream out, PrintStream out2){
		
		CodingTree testTree = new CodingTree(content,out, out2);
	
		
		
	}
	
	//this tester method will test a short string inputted
	static void testCodingTree(PrintStream out, PrintStream out2){
		
		String Sally = "Sally sells sea shells by the sea shore. \n she sells alot";
		
		CodingTree testTree = new CodingTree(Sally, out, out2);
		
	}
	

}
