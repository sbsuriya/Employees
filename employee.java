package suriyastasks;

public class employee{
	private String name;
	private int empid;
	public employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void display() {
		System.out.println("Name :" + getName());
		System.out.println("EmpId  :" + getEmpid());
		System.out.println("---------------------------");
	}
}
