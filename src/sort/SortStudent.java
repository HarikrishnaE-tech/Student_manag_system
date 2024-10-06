package sort;

import java.util.Comparator;

import entity.Student;

public class SortStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	return	o1.getStdname().compareTo(o2.getStdname());
		
	}

	

}
