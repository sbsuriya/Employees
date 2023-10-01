package suriyastasks;

public class technician extends employee{
	
	private String specialization;

	public technician(String name, int empid, String specialization) {
		super(name, empid);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public void display() {
		  System.out.println("Technician Details :");
		  super.display();
	  }
	
}