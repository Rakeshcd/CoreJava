abstract class Area1
{
	abstract int area();
}

class Circle extends Area1
{
	double radius;

	Circle(double radius)
	{
		this.radius=radius;
	}

	public int area()
	{
		return (int)(3.14*radius*radius);
	}
}

class Square extends Area1
{
	double side;
	
	Square(double side)
	{
		this.side=side;
	}

	public int area()
	{
	return (int)(side*side);
	}

}