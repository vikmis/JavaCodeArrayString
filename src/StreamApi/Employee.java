package StreamApi;

public class Employee {
	
	private String name;
	private int sal;
	
	
	Employee(String name,int sal){
		this.name=name;
		this.sal=sal;

	}
	
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return name+ ":$"+ sal;
	}
	
	
	

}
