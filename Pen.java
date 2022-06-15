class Pen
{
	String color;
	int length;
	
	public void set(String x,int y)
	{
	color=x;
	length=y;
	}

	public void print()
	{
	System.out.println(color);
	System.out.println(length);
	}
}

class Driver3
{
	public static void main(String[] args)
	{
		Pen p=new Pen();
		p.set("Blue",3);
		p.print();

		Pen p1=new Pen();
		p1.set("Black",2);
		p1.print();
	}
}