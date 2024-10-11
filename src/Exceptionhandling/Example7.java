package Exceptionhandling;
import java.io.*;
import java.io.FileNotFoundException;
public class Example7 {
	public static void fileHndling() throws FileNotFoundException
	{
		new FileInputStream("abc.text");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		try
		{
			fileHndling();
		}catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
		}
	}
}
