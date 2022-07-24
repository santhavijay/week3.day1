package assignment4;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=1;
		long phoneNumber = 994382727;
		String myname = "Santha";
		String mailId = "santha1.vijay@gmail.com";
		
		
Students sobj = new Students();
sobj.getStudentInfo();
sobj.getStudentInfo(id);
sobj.getStudentInfo(id, myname, mailId, phoneNumber);
	}
public void getStudentInfo()
{
	System.out.println("I am not having any arguments in my method");
}

public void getStudentInfo(int id)
{
	System.out.println(" Passing ID alone : " + id);
}

public void getStudentInfo(int id,String name,String mail,long phoneNumber)
{
	System.out.println(" My details are : " + " " + id + " " + name + " " + mail + " " + phoneNumber);
}
}
