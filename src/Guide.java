//Recepition and Main in the same class 
import java.util.Arrays;
import java.util.ArrayList;
public class Guide extends Employee{
	private int toursPerDay;
	private Date date;
	private int count;
	private ArrayList<Languages> languages = new ArrayList<Languages>();
	private ArrayList<MuseumWorkingDays> MWD = new ArrayList<MuseumWorkingDays>();
	
	public Guide(String name, int id, Date dob, int employment_id, Date hireDate, int toursPerDay, Date date, int count,
			ArrayList<Languages> languages, ArrayList<MuseumWorkingDays> mWD) {
		super(name, id, dob, employment_id, hireDate);
		this.toursPerDay = toursPerDay;
		this.date = date;
		this.count = count;
		this.languages = languages;
		MWD = mWD;
	}

	public Guide(String name, int id, Date dob, int employment_id, Date hireDate) {
		super(name, id, dob, employment_id, hireDate);
	}
	
	public Guide(String name, int id, Date dob, int employment_id, Date hireDate, int toursPerDay, Date date,
			ArrayList<Languages> languages, ArrayList<MuseumWorkingDays> mWD) {
		super(name, id, dob, employment_id, hireDate);
		this.toursPerDay = toursPerDay;
		this.date = date;
		this.languages = languages;
		this.MWD = mWD;
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList<MuseumWorkingDays> getMWD() {
		return MWD;
	}

	public void setMWD(ArrayList<MuseumWorkingDays> mWD) {
		this.MWD = mWD;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Languages> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<Languages> languages) {
		this.languages = languages;
	}

	public int getToursPerDay() {
		return toursPerDay;
	}
	public void setToursPerDay(int toursPerDay) {
		this.toursPerDay = toursPerDay;
		this.count = toursPerDay;
	}

	@Override
	public String toString() {
		return super.toString() + "Guide [toursPerDay=" + toursPerDay + ", date=" + date + ", languages=" + languages + ", Working Days=" + MWD
				+ "]";
	}
	
	
	
}
