package GrossInheritance;

public class GrossShiftSupervisor extends GrossEmployee {

// Declare private instance variables
	private double supervisorSalary;
	private double supervisorBonus;

// Zero argument constructor
	public GrossShiftSupervisor() {

	}

// Parameterized constructor
	public GrossShiftSupervisor(String name, String number, String date, double salary,
		double bonus) {
		super(name, number, date);
		this.supervisorSalary = salary;
		this.supervisorBonus = bonus;
		}

// create getters and setters
	public double getSalary() {
		return supervisorSalary;
		}

	public void setSalary(double salary) {
		this.supervisorSalary = salary;
		}

	public double getBonus() {
		return supervisorBonus;
		}

	public void setBonus(double bonus) {
		this.supervisorBonus = bonus;
		}

// toString method is used to display contents to console
	
	public String toString() {
		return super.toString() + "\nsalary = " + supervisorSalary + "\nbonus = " + supervisorBonus;
		}

}
