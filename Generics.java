package collection;

public class Generics<M>{

	M obj;
	public void Generics(M obj) {
		this.obj=obj;		
	}
	 public  M getGenericsObject()
	{
		return obj;
	}
	 public void displayObject() {
		 System.out.println("The object is : "+" "+obj.getClass().getName());
	 }

}
