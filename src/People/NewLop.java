package People;
import java.io.PrintStream;
import java.util.ArrayList;

public class NewLop {
	ArrayList<Person> list = new ArrayList<Person>();
	
	public void add(Person p) {
		list.add(p);
	}
	public void remove(Person p) {
		list.remove(p);
	}
	public Person find(String name) {
		for(Person people:list) {
			if(people.getName().equals(name)) return people;
		}
		return null;
	}
	public void print(PrintStream ps) {
		for(Person people:list) {
			people.print(System.out);
			System.out.println();
		}
	}
	
}
