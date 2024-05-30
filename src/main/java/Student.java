import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	private double gpa;
	private String name;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public Student(Student other){
		this.gpa = other.gpa;
		this.name = other.name;
	}

	public void setGpa(double grade){
		this.gpa = grade;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getGpa(){
		return this.gpa;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public double compareTo(Student s2){
		if (this.gpa < s2.gpa){
			return s2.gpa - this.gpa;
		}
		return this.gpa - s2.gpa;
	}

	@Override
	public Student clone(){
		return new Student(this);
	}
}
