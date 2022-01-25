package program.java.filehandling;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[45];
		
		try {
			FileReader input = new FileReader("F://EclipseFile.txt");
			Scanner sc = new Scanner(input);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
			input.read(array);
			
			input.close();
			sc.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
