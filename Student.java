package collection;

	public class Student 
{
	int id;
	String name;
	char div;
	int std;
	Student(int id,String name,char div,int std)
	{
		this.id=id;
		this.name=name;
		this.div=div;
		this.std=std;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", div=" + div + ", std=" + std + "]";
	}
	
}
