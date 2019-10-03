package oopsconcept;

class employee1 {
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
public class ITEmployee1 extends employee1
{
	public void code1() {
		System.out.println("codde method");
	}
	
	public static void main (String[]args) {
		ITEmployee1 employee=new ITEmployee1();
		employee.dotask();
		employee.eat();
		employee.code1();	
		}
}
