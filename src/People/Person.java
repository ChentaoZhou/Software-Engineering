package People;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;

public class Person implements Cloneable{
	private String name;
	private Date date;
	
	/*
	 * we use clone method to clone the date object to a new object then store it to
	 * the Person object, so when there is something changed of the original Date
	 * object, it will not modify the date of Person.
	 */
	public Person(String name,Date date) {
		this.name = name;
		Date newDate;
		try {
			newDate = (Date)date.clone();
			this.date = newDate;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public void print(PrintStream ps) {
		ps.print(String.format("name: %8s, day:%2d month:%2d year:%4d", name,date.getDay(),date.getMonth(),date.getYear()));
	}
	public String getName() {
		return name;
	}
	public int getAge(Date d) {
		if(d.getYear()<=date.getYear()) return 0;
		else return date.diffInYears(d);	
	}
	
	
//	public static void main(String[] args) {
//		Date d1 = new Date(25,6,1996);
//		Person p1 = new Person("Chentao",d1);
//		Date d2 = new Date(20,1,2020);
//		System.out.println(p1.getAge(d2));
//		p1.print(System.out);
//	}
	
	
	
	
}
