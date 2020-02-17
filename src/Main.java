import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	public static void main(String[] args) {
		NewLop list = new NewLop();
		Boss b1 = new Boss("Chentao", new Date(25,6,1996));
		Boss b2 = new Boss("Yirong", new Date(25,10,1997));
		Worker w1 = new Worker("Ron", new Date(26,9,2012), b1);
		Worker w2 = new Worker("Jim", new Date(13,7,1998), b1);
		w2.new_boss(b2);
		Worker w3 = new Worker("chou", new Date(12,7,1998), b1);
		
		list.add(b1);
		list.add(b2);
		list.add(w1);
		list.add(w2);
		list.add(w3);
		
		list.print(System.out);
		System.out.println("-----------------------------");
		b1.next().print(System.out);
		b1.next().print(System.out);
		b1.reset();
		b1.next().print(System.out);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12412);
		al.add(343251);
		java.util.Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}

	}
}
