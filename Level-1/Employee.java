public class Employee {
	private String Ename;
	private int id;
	private int salary;
	
	public Employee(String Ename, int id, int salary){
		this.Ename = Ename;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails(){
		System.out.println("Employee Name - " + Ename);
		System.out.println("Employee ID - " + id);
		System.out.println("Employee Salary - " + salary);
	}
	public static void main(String args[]) {
		Employee e1 = new Employee("Hemant",234,30000);
		Employee e2 = new Employee("Khajan",235,30000);
		System.out.println("Employee 1 Details - ");
		e1.displayDetails();
		System.out.println("Employee 2 Details - ");
		e2.displayDetails();
	}
}