import java.io.PrintStream;

public class Person {
	private String name;
	private Date date;
	public int arrayLocation;
	
	public Person(String name,Date date) {
		this.name = name;
		this.date = date;
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
