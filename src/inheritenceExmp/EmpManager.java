package inheritenceExmp;

public class EmpManager 
{
	int mId;
	
	public void addEmp()
	{
		System.out.println("Hello Manager.....");
	}
	
	public EmpManager(int id)
	{
		mId = id;
		System.out.println("Manager ID is Initialized....."+ mId);
	}
	
}
