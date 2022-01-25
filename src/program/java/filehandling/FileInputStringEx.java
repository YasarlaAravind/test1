package program.java.filehandling;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStringEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("F://day2.txt");
		int ch;
		while((ch=fin.read())!=-1)
			System.out.println((char)ch);
	
	fin.close();
		

	}

}
