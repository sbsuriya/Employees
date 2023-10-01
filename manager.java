package suriyastasks;

public class manager extends employee{
    private String dept;

	public manager(String name, int empId, String dept) {
		super(name, empId);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void diplay() {
		System.out.println("Manager Details :");
		super.display();
	}
}
