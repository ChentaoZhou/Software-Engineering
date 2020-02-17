import java.io.PrintStream;

public class Worker extends Person{
	private Boss b;
	
	public Worker(String name, Date date,Boss b) {
		super(name, date);
		this.b=b;
		b.add_worker(this);
	}
	
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
