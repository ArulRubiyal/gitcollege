package org.college;

public class Student extends Hostel {
	public void studentName() {
        System.out.println("Student Name is Ruby");

	}
	public void studentDept() {
		System.out.println("Student Dept is EEE");
		

	}
public void studentId() {
	System.out.println("Student Id is 71776");

}
public static void main(String[] args) {
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	s.hotelName();
	s.deptName();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
}
}
