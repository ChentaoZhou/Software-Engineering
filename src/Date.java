import java.io.PrintStream;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public void print(PrintStream ps) {
		ps.print(String.format("day: %2d  month: %2d  year: %4d", day,month,year));
	}
	
//	public int diffInYears(Date d) {
//		if(this.year == d.getYear()) return 0;
//		Date d1;
//		Date d2;
//		if(this.year > d.getYear()) {
//			d1 = this;
//			d2 = d;
//		}else {
//			d1 = d;
//			d2 = this;
//		}
//		int diffyear = d1.getYear()-d2.getYear();
//		int diffmonth = d1.getMonth() - d2.getMonth();
//		int diffday = d1.getDay() - d2.getDay();
//		
//		if(diffmonth > 0) return diffyear;
//		else if(diffmonth <0) return diffyear -1;
//		else {
//			if(diffday >= 0) return diffyear;
//			else return diffyear -1;
//		}
//	}
	
	public int diffInYears(Date d) {
		if(d.month<this.month ||(d.month == this.month&& d.day < this.day))
			return d.year - this.year -1;
		else {return d.year - this.year;}
		
	}
	
	public static void main(String[] args) {
		Date d1 = new Date(25,6,1996);
		Date d2 = new Date(25,6,1994);
		System.out.println(d2.diffInYears(d1));
		d1.print(System.out);
	}
	
	
	
	
	
	
	
	
	
}
