package calci;

class Employee {
	public void eat() {
		System.out.println("Eat your lunch on time");
	}
	public void dotask() {
		System.out.println("Do your task properly");
	}

	/*public static void main(String[] args) {
		Employee employee = new Employee();
		employee.dotask();
		employee.eat();

	}*/

}
public class ITemployee extends Employee
{
	public void code1() {
		System.out.println("codde method");
	}
	
	public static void main (String[]args) {
		ITemployee employee1=new ITemployee();
		employee1.dotask();
		employee1.eat();
		employee1.code1();	}
}
