package org.system;

public class Desktop extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Desktop dobj = new Desktop();
dobj.computerModel();
dobj.desktopSize();
System.out.println("Can see parent and child methods in child class using inheritance");
	}
public void desktopSize()
{
	System.out.println("From desktopsize method");
	System.out.println("desktop size is mini");
}
}
