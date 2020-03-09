package pattern2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Invoker {
	Command command;
	
	public void register(Command command) {
		this.command = command;
	}
	public void run() {
		while(true) {
			String content = JOptionPane.showInputDialog("input something");
			char[] contents = content.toCharArray();
			if(content.charAt(0)=='1') {
				command.execute(1); 
				System.out.print(Arrays.toString(contents));
			}
			if(content.charAt(0)=='2') {
				command.execute(2);
				System.out.print(Arrays.toString(contents));
			}
			if(content.charAt(0)=='q') {
				System.out.print(Arrays.toString(contents));
				break;
			}
		}
	}
}
