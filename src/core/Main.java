package core;

import java.util.Scanner;

import com.Studentsystem.StudentManagementSystemimp;

import exception.InvalidChoiceException;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StudentManagementSystemimp sms=new StudentManagementSystemimp();
	while(true) {
		
		System.out.println("--------STUDENT MANAGEMENT SYSTEM-------");
		System.out.println("---------------MENU---------------------");
		System.out.println("1.ADD STUDENT \n2.DISPLAY STUDENT");
		System.out.println("3.DISPLAY ALL STUDENT\n4.REMOVE STUDENT");
		System.out.println("5.REMOVE ALL STUDENT\n6.UPDATE STUDENT INFORMATION");
		System.out.println("7.COUNT THE STUDENT\n8.SORT STUDENT LIST");
		System.out.println("9.STUDENT WITH HIGHEST MARK\n10.STUDENT WITH LOWEST MARK");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			sms.addstudentinform();
			break;
		case 2:
			sms.displaystudentinform();
			break;
		case 3:
			sms.displayallstudentinform();
			break;
		case 4:
			sms.removestudentinform();
			break;
		case 5:
			sms.removeallstudentinform();
			break;
		case 6:
			sms.updatestudentinform();
			break;
		case 7:
			sms.countthestudent();
			break;
		case 8:
			sms.sortstudentlist();
			break;
		case 9:
			sms.studentwithhighestmark();
			break;
		case 10:
			sms.studentwithlowestmark();
			break;
		default:
			String message="----INVALID NUMBER----";
			try {
				throw new InvalidChoiceException(message);
			}
			catch(InvalidChoiceException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
