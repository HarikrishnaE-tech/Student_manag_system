package sort;

import java.util.Comparator;

import entity.Student;

public class Sortstudclass implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		 return o1.getStdclass()-o2.getStdclass();
	
	}

}
