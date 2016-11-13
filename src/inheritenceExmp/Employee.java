package inheritenceExmp;

public class Employee extends EmpManager
{
	int id;
	
	public void addEmp()
	{
		System.out.println("Hello Employee.....");
		super.addEmp();
	}
	
	public Employee(int eId)
	{
		super(500);
		id = eId;
		System.out.println("Employee ID is Initialized...."+id);
	}
	
	public static void main(String[] args) 
	{
		Employee e = new Employee(201);
		e.addEmp();

	}

}
