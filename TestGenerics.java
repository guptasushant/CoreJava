package collection;

public class TestGenerics extends Generics
{
	public static void main(String[] args) 
	{
		Generics <Integer>  g =new Generics();
		g.displayObject();
		System.out.println(g.getGenericsObject());
		
		Generics<String>g1=new Generics();
		g1.displayObject();
		System.out.println(g1.getGenericsObject());
		
		Generics<Double>g2=new Generics();
		g2.displayObject();
		System.out.println(g2.getGenericsObject());
	}
}
