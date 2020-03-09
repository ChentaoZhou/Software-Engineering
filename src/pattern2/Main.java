package pattern2;

public class Main {
	public static void main(String[] args) {
	Invoker invoker = new Invoker();
	MyCom m = new MyCom();
	
	m.set_name("Tuanzai");
	invoker.register(m);
	invoker.run();
	m.set_name("baobei");
	invoker.run();
	}
}

