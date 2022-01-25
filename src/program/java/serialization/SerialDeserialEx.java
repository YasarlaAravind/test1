package program.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserialEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student obj = new Student(101, 25, "Chaitanya", "Agra", 6);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;


		try {
		fos = new FileOutputStream("student.ser");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Serialization is done...!!");
		}catch(IOException e)
		{
		e.printStackTrace();
		}
		finally {
		fos.close();
		oos.close();
		}
		
		//Desrialization

		Student o = null;

		try {
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		o=(Student) ois.readObject();
		ois.close();
		fis.close();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		return;

		}catch(ClassNotFoundException cnfe)
		{
		System.out.println("ClassNotFoundException occured");
		cnfe.printStackTrace();
		return;
		}
		System.out.println("Student name : "+ o.getStuName());
		System.out.println("Student age : "+ o.getStuAge());
		System.out.println("Student roll : "+ o.getStuRollNum());
		System.out.println("Student height : "+ o.getStuHeight());
		System.out.println("Student addr : " + o.getStuAddress());

	}

}


//---------------------------------------------------------
class Student implements java.io.Serializable {
	
	public int stuRollNum;
	public int stuAge;
	public String stuName;
	public String stuAddress;
	private int stuHeight;
	
	public Student(int roll, int age, String name, String address, int height) {
		this.stuRollNum = roll;
		this.stuAge = age;
		this.stuName = name;
		this.stuAddress = address;
		this.stuHeight = height;
	}

	public int getStuRollNum() {
		return stuRollNum;
	}

	public void setStuRollNum(int stuRollNum) {
		this.stuRollNum = stuRollNum;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}
	
}