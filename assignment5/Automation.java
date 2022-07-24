package assignment5;

public class Automation extends MultipleLangauge implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation aobj = new Automation();
		aobj.java();
		aobj.selenium();
		aobj.ruby();
		aobj.python();
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Implemented here : I am from selenium class");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Implemented here : I am from Java class");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Implemented here : I am from ruby class");
	}

}
