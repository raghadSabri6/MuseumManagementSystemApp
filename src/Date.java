//Recepition and Main in the same class 
public class Date {
	private int day;
	private int month;
	private int year;
	private static final int [] daypermonth= {0,31,28,31,30,31,30,31,30,31,30,31,30};
	
	public Date() {
		super();
	}
	public Date(int day, int month , int year) {
		set ( day, month , year);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void set(int day, int month , int year) {
		if(month>0 && month<13) 
			this.month =month;
		else 
			this.month =1;
		
		if(day>0 &&(day<=daypermonth[month] && !(month==2 && day==29))) 
			this.day =day;
		else
			this.day =1;
		
		this.year =year;
		//System.out.printf("the date is : %d/%d/%d%n", this.day , this.month , this.year);
		//System.out.printf("the date is : %s%n", this);

		//System.exit(0);
	}
	public String toString() {
		return day+"/"+month+"/"+year+"\n";
	}
	public String toString(Date d) {
		return d.day+"/"+ d.month+"/"+ d.year+"\n";
	}
}
