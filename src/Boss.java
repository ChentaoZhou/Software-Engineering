import java.io.PrintStream;
import java.util.ArrayList;

public class Boss extends Person {
	ArrayList<Worker> workers = new ArrayList<Worker>();
	private int index = 0;

	public Boss(String name, Date date) {
		super(name, date);
		// TODO Auto-generated constructor stub
	}

	
	public void add_worker(Worker w) {
		workers.add(w);
	}

	public void sub_worker(Worker w) {
		workers.remove(w);
	}

	public Worker next() {
		if (index <= workers.size()) {
			Worker w = workers.get(index++);
			return w;
		} else {
			System.out.println("There is no more worker in your list");
			return null;
		}
	}

	public void reset() {
		index = 0;
	}

	public void print(PrintStream ps) {
		super.print(ps);
		for (Worker w : workers) {
			ps.print(String.format("  *Worker: name: %5s", w.getName()));
		}
		

	}

}
