class Laptop 
{
	int ram;
	int rom;
	double ps;

	Laptop(int x,int y,double z)
	{
	  ram=x;
	  rom=y;
	  ps=z;
	}
}

class Driver4
{
	public static void main(String[] args)
	{
		Laptop l=new Laptop(4,250,2.3);
		System.out.println(l.ram);
		System.out.println(l.rom);
		System.out.println(l.ps);
	}
}