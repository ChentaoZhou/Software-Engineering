import java.io.PrintStream;

public class Lop {
	Person[] list = new Person[20];
	int index = 0;
	public Lop() {
		
	}
	
	public void add(Person p) {
		list[index] = p;
		p.arrayLocation = index;
		index++;
	}
	public void remove(Person p) {
		list[p.arrayLocation] = null;
	}
	public Person find(String name) {
		for(int i=0;i<list.length;i++) {
			try {
				if(list[i].getName().equals(name)) return list[i];
			}catch(Exception e) {
				
			}
		}
		return null;
	}
	
	public void print(PrintStream ps) {
		for(int i=0;i<list.length;i++) {
			if(list[i]!=null) {
				list[i].print(System.out);
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Date d1 = new Date(25,6,1996);
		Person p1 = new Person("Chentao",d1);
		Person p2 = new Person("Yirong",d1);
		Person p3 = new Person("Fangji",d1);
		Person p4 = new Person("Tuanzhai",d1);
		Person p5 = new Person("Yi",d1);
		Person p6 = new Person("Maokai",d1);
		
		Lop list = new Lop();
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);list.add(p6);
		//list.find("Chentao").print(System.out);
		list.remove(p5);
		list.print(System.out);
	}
	
	
	
	
	
}
