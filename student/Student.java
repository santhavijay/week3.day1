package student;

import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student sobj =  new Student();
sobj.collegeName();
sobj.collegeName();
sobj.collegeRank();
sobj.departmentName();
sobj.studentDept();
sobj.studentId();
sobj.studentName();
	}
public void studentName()
{
	System.out.println("Student name is Santhakumari");
}

public void studentDept()
{
	System.out.println("student department name is ECE");
}

public void studentId()
{
	System.out.println("Student id is 001");
}
}
