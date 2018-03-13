/*
 영구직(Permanent) 관리를 위한 프로그램  
 */

package chap05;
import java.util.*;

class Permanent{
	private String name;
	private int salary;
	
	public Permanent(String name, int salary){
		this.name = name;
		this.salary = salary;	
	}//매개변수 있는 생성자
	
	
	
	public String getName(){
		return this.name;
	}
	
	public int getPay(){
		return this.salary;
	}
	
}


class Department{
	private Vector empVector = new Vector();
	public void addEmployee(Permanent p){
		this.empVector.add(p);	
	}
	
	public void showEmployee(){
		for(int i=0; i<empVector.size(); i++){
			Permanent p = (Permanent) empVector.elementAt(i);
			System.out.println(p.getName()+":"+p.getPay());
		}
	}
	
}




public class PolymorphismMain {

	public static void main(String[] args) {
		Department depart = new Department();
		depart.addEmployee(new Permanent("KIM",1000));
		depart.addEmployee(new Permanent("LEE",1500));
		depart.addEmployee(new Permanent("choi",2000));
		depart.showEmployee();
	}

}


/*

KIM:1000
LEE:1500
choi:2000
*/














