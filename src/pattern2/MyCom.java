package pattern2;

public class MyCom implements Command{
	String name;
	public void set_name(String name) {
		this.name = name;
	}

	public void execute(int n) {
		System.out.println("names: "+name+" "+n);
	}
	
}
