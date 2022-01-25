package program.java.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f = new FileWriter("F://EclipseFile.txt");
			
			f.write("Hello My name is Abhishek. \nasbddjddbiwdsshuc");
			System.out.println("data is written");
			f.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
