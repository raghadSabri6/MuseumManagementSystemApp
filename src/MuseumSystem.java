//Recepition and Main in the same class 
import java.util.ArrayList;
import java.util.Arrays;
public class MuseumSystem {
	private ArrayList<Visitor> visitors = new ArrayList<Visitor>();
	private ArrayList<Guide> guides = new ArrayList<Guide>();
	public MuseumWorkingDays MWD;
	public MuseumSystem(ArrayList<Visitor> visitors, ArrayList<Guide> guides, MuseumWorkingDays mWD) {
		super();
		this.visitors = visitors;
		this.guides = guides;
		this.MWD = mWD;
	}
	public MuseumSystem() {
		super();
	}
	public ArrayList<Visitor> getVisitors() {
		return visitors;
	}
	public void setVisitors(ArrayList<Visitor> visitors) {
		this.visitors = visitors;
	}
	public ArrayList<Guide> getGuides() {
		return guides;
	}
	public void setGuides(ArrayList<Guide> guides) {
		this.guides = guides;
	}
	static boolean flag = true;
	public ArrayList<Guide> getAvailableGuides (Date v , ArrayList<Languages> l){
		ArrayList<Guide> g = new ArrayList<Guide>();
		for(Guide guide : guides) {
			if(guide.getDate().equals(v))
				while(flag) { 
				  for(Guide G : guides) {
					for (Languages a : G.getLanguages())
					for (Languages b : l)	
					if(a.equals(b))
					{
						if(guide.getCount()>0)
						g.add(g.size(), guide);
						guide.setCount(guide.getCount()-1);
						flag = false;
					}
				  }
				  flag = false;
				}
		}
		return g;
	}
	public ArrayList<Guide> getAvailableGuides (Languages l , MuseumWorkingDays WD){
		ArrayList<Guide> g = new ArrayList<Guide>();
		for(Guide guide : guides) {
		 flag = true;
		 for(MuseumWorkingDays d : guide.getMWD()) {
			if(d.equals(WD))
			  for (Languages a : guide.getLanguages()) {
				if(a.equals(l)) {
				if(guide.getCount()>0) {
				g.add(g.size(), guide);
				guide.setCount(guide.getCount()-1);
			    flag = false;
				}
			   }
			  if(flag == false)
				break;
			   }
		if(flag == false)
			break;
		}
	   }
	   return guides;
	}
	public ArrayList<Guide> getAvailableGuides (Languages l){
	ArrayList<Guide> g = new ArrayList<Guide>();
	for(Guide guide : guides) {
	    flag = true;
		for (Languages a : guide.getLanguages()) {
		    if(a.equals(l)) {
			  g.add(g.size(), guide);
			  flag = false;
			}
			if(flag == false)
				break;
	    }
	}
	return guides;
	}
	public ArrayList<Guide> getAvailableGuides ( MuseumWorkingDays WD){
	ArrayList<Guide> g = new ArrayList<Guide>();
	for(Guide guide : guides) {
    flag = true;
	for(MuseumWorkingDays d : guide.getMWD()) {
		if(d.equals(WD)) {
		   g.add(g.size(), guide);
		   flag = false;
		}   
		if(flag == false)
		   break;
		}
    }
	return guides;
	}
	public ArrayList<Visitor> search_for_visitor(String nameV){
		ArrayList<Visitor> v = new ArrayList<Visitor>();
		for(Visitor p : visitors) {
			if(p.getName().equals(nameV))
				   v.add(v.size(), p);

		}
		return v;
		
	}
	
	public void addVisitor(Visitor visitor) {
		this.visitors.trimToSize();
		for ( Visitor v: visitors) {
		 if (v.equals(visitor))
				return;
		 this.visitors.add(visitor);
		}
	}
	public void addGuide(Guide guide) {
		this.guides.trimToSize();
		for ( Guide g: guides) {
			 if (g.equals(guide))
					return;
		this.guides.add(guide);
		}
	}
	
}
