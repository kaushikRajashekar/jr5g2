package abstractsample;

public class AbstractEx extends Sample{

	public static void main(String[] args) {
		Sample s=new AbstractEx();
		s.display();
		s.show();
	}

	@Override
	void show() {
		System.out.println("this is abstract method");
		
	}

}
