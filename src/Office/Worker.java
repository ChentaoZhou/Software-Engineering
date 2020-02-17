package Office;
import java.io.PrintStream;

import People.Date;
import People.Person;

public class Worker extends Person{
	private Boss b;
	
	/*
	 * compare with the parent class Person, the Worker need a new parameter Boss
	 * Object, pass it in the constructor.
	 */
	public Worker(String name, Date date,Boss b) {
		super(name, date);
		this.b=b;
		b.add_worker(this);
	}
	
	/*
	 * Here satisfied the Atomic Operation, combine the sub_worker and add_worker
	 * method into one new_boss method, complete the operation within one step.
	 * solve routine coupling
	 */
	public void new_boss(Boss boss) {
		b.sub_worker(this);
		boss.add_worker(this);
		b = boss;
	}
	public Boss get_boss() {
		return b;
	}
	public void print(PrintStream ps) {
		super.print(ps);
		ps.print(String.format("  Boss is: %10s",b.getName()));
		ps.println();
	}

}
