package calci;

class Employee1 {
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
public class ITemployee1 extends Employee1
{
	public void code1() {
		System.out.println("codde method");
	}
	
	public static void main (String[]args) {
		ITemployee1 employee1=new ITemployee1();
		employee1.dotask();
		employee1.eat();
		employee1.code1();	
		}
}
