package assignment3;

public class Axisbank extends Bankinfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Axisbank aobj = new Axisbank();
aobj.deposit();
	}
public void deposit()
{
	System.out.println("I am overriding deposit() method from super class");
}
}
