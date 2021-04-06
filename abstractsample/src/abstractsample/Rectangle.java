package abstractsample;

public class Rectangle extends Shape{


	public Rectangle(int length, int breadth) {
		super(length,breadth);
	}

	public static void main(String[] args) {
		Shape s=new Rectangle(5,7);
		s.findArea();
	}

	@Override
	void findArea() {
		area=length*breadth;
		System.out.println("area of rectangle: "+area);
	}

}
