/*This is Robert Gross' project written on July 4th, 2023. The purpose of the project is to use a 
 * set of different classes, in order to create a program that displays two workers information,
 *  as well as one supervisor, and whether they recieve a bonus or not for their work. It does so with 
 *  minimal code use in the main method, and uses lots of constructors in order to display the information
 * 
 */

package GrossInheritance;

import java.util.Scanner;

//Testing class
public class GrossInheritanceTest {

	public static void main(String[] args) {

		int supervisorSalary = 75000;
		double supervisorBonus = supervisorSalary * .08;

		Scanner scan = new Scanner(System.in); // create scanner
//creating ProductionWorker 
		GrossProductionWorker worker1 = new GrossProductionWorker("Carlo", "123A", "11-NOV-2003", 1, 12);
//create supervisor
		GrossShiftSupervisor supervisor = new GrossShiftSupervisor("Robert Gross", "222-D", "02/Feb/2004",
				supervisorSalary, supervisorBonus);
//request all worker2 details from user
		System.out.println("Please Enter the Name of the production worker.");
		String worker2Name = scan.nextLine();
		System.out.println("Please Enter the Number of the production worker.");
		String worker2Number = scan.nextLine();
		System.out.println("Please Enter the date the production worker started.");
		String worker2Date = scan.nextLine();
		System.out.println("Please Enter the shift of the production worker. 1 for day, 2 for night.");
		int worker2Shift = scan.nextInt();
		System.out.println("Please Enter the wage of the production worker.");
		double worker2Pay = scan.nextDouble();
//create worker2
		GrossProductionWorker worker2 = new GrossProductionWorker(worker2Name, worker2Number, worker2Date, worker2Shift,
				worker2Pay);
//print to console
		System.out.print(worker1.toString());
		System.out.println("\n");
		System.out.print(worker2.toString());
		System.out.println("\n");
		System.out.print(supervisor.toString());
		scan.close();
	}
	
}