package GrossInheritance;

public class GrossProductionWorker extends GrossEmployee {
//attributes to store shift number and hourly pay rate
	private int employeeShift;
	private double employeeRate;

//default constructor
	public GrossProductionWorker() {
		super();
	}
	
	
	
	
	
//parameterized constructor
	public GrossProductionWorker(String employeeName, String employeeNumber, String employeeDate, int employeeShift, double employeeRate) {
//calling parent class Employee constructor
		super(employeeName, employeeNumber, employeeDate);
		this.employeeShift = employeeShift;
		this.employeeRate = employeeRate;
	}
		

//getter for employeeShift
	public int getShift() {
		return employeeShift;
	}

//setter for employeeShift
	public void setShift(int employeeShift) {
		this.employeeShift = employeeShift;
	}

//getter for employeeRate
	public double getRate() {
		return employeeRate;
	}

//setter for employeeRate
	public void setRate(double employeeRate) {
		this.employeeRate = employeeRate;
	}
// toString() method which displays the contents of an Object inside it.
	
	public String toString() {
		super.toString();
		System.out.println("Hourly Pay Rate =" + employeeRate);
		if(getShift()==1)
			System.out.println("Shift = Day");
		else if(getShift()==2)
			System.out.println("Shift = Night");
	return "";
	}
}