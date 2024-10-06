package sort;

import java.util.Comparator;

import entity.Student;

public class Sortstudage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStdage()-o2.getStdage();
	}

}
