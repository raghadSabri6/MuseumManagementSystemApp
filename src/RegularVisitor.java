//Recepition and Main in the same class 
public class RegularVisitor extends Visitor{

	public RegularVisitor(String name, int id, Date dob) {
		super(name, id, dob);
		// TODO Auto-generated constructor stub
	}
	public RegularVisitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bookTour() {
		// TODO Auto-generated method stub
		System.out.println("your information :");
		System.out.println(super.toString());
		System.out.println("hava a nice day");
	}
	@Override
	public String toString() {
		return super.toString() +"RegularVisitor []";
	}
	
}
