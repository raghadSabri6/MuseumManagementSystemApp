//Recepition and Main in the same class 
public class Employee extends Person{
	private int employment_id;
	private Date hireDate;
	public Employee( String name, int id, Date dob , int employment_id, Date hireDate) {
		super(name, id, dob);
		this.employment_id = employment_id;
		this.hireDate = hireDate;
	}
	public Employee(String name, int id, Date dob) {
		super(name, id, dob);
	}
	public int getEmployment_id() {
		return employment_id;
	}
	public void setEmployment_id(int employment_id) {
		this.employment_id = employment_id;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [employment_id=" + employment_id + ", hireDate=" + hireDate + "]";
	}
}
