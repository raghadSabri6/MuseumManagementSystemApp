//Recepition and Main in the same class 
import java.util.Arrays;
import java.util.ArrayList;
abstract public class Visitor extends Person {

	private int record_id =0;
	private int visits_count =0;
	private ArrayList<VisitorRecord> VR = new ArrayList<VisitorRecord>();
	private ArrayList<Languages> languages = new ArrayList<Languages>();
	public Visitor() {
		super();
	}
	public Visitor(String name, int id, Date dob, int record_id, int visits_count, ArrayList<VisitorRecord> vR,
			ArrayList<Languages> languages) {
		super(name, id, dob);
		this.record_id = record_id;
		this.visits_count = visits_count;
		VR = vR;
		this.languages = languages;
	}
	public ArrayList<Languages> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<Languages> languages) {
		this.languages = languages;
	}

	public Visitor(String name, int id, Date dob) {
		super(name, id, dob);
	}

	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	
	public ArrayList<VisitorRecord> getVR() {
		return VR;
	}
	public void setVR(ArrayList<VisitorRecord> vR) {
		this.VR = vR;
	}
	public int getVId() {
		return super.getId();
	}
	public void setVId(int id) {
	    super.setId(id);
	}
	public int getVisits_count() {
		return visits_count;
	}
	public void setVisits_count(int visits_count) {
		this.visits_count = visits_count;
	}
	abstract public void bookTour();
    
	@Override
	public String toString() {
		for(VisitorRecord vr : VR)
			System.out.println( vr.toString());
		System.out.println("languages");
		for(Languages l : languages)
			System.out.println(l.toString());
		return "Visitor [record_id=" + record_id + ", visits_count=" + visits_count +"]";
	}	
}
