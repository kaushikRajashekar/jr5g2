package abstractsample;

public abstract class Shape 
{
	protected int radius;
	protected int length;
	protected int breadth;
	protected int area;
	
	public Shape(int radius)
	{
		this.radius=radius;
		
	}
	
	public Shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	abstract void findArea();
}

