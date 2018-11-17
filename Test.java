package JavaDay2;

public class Test {
	public static void main(String[] args) {
	Manager manager=new Manager("swati",1324,10);
	int result=manager.totalSalary(20000);
	System.out.println("Manager Salary:"+result);
	System.out.println("===============");
	
	Labour labour=new Labour("someone",45474,10,true);
	int result1=labour.totalSalary(10000);
	System.out.println("Labour Salary:"+result1);
	
}
}
