/*
 영구직(Permanent)과 임시직(PartTime) 관리를 위한 프로그
 */

package chap05;

import java.util.*;

abstract class Employee{
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public abstract int getPay();
}


class Permanent extends Employee{
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	public int getPay() {
		return this.salary;
	}
}

class PartTime extends Employee{
	private int time;
	private int pay;
	
	public PartTime(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
	}
	
	public int getPay() {
		return this.time * this.pay;
	}
}

class Department{
	private Vector empVector = new Vector();
	
	public void addEmployee(Employee p) {
		this.empVector.add(p);
	}
	
	public void showEmployee() {
		for( int i=0; i<empVector.size(); i++ ) {
			Employee p = (Employee)empVector.elementAt(i);
			System.out.println(p.getName()+":"+p.getPay());
		}
	}
	
}




public class PolymorphismMain2 {

	public static void main(String[] args) {
		Department depart = new Department();
		depart.addEmployee(new Permanent("KIM",1000));
		depart.addEmployee(new Permanent("LEE",1000));
		
		depart.addEmployee(new PartTime("GO",10,200));
		depart.addEmployee(new PartTime("Choi",10,170));
		
		depart.showEmployee();
	}

}

/*
KIM:1000
LEE:1000
GO:2000
Choi:1700
*/


