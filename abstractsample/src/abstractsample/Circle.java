package abstractsample;

public class Circle extends Shape{


	public Circle(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Shape s=new Circle(2);
		s.findArea();

	}

	@Override
	void findArea() {
		area=(int) (3.14*radius*radius);
		System.out.println("area of circle: "+area);
		
	}

}
