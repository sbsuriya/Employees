package suriyastasks;

public class Main extends employee {

	public Main(String name, int empId) {
		super(name, empId);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		manager manager = new manager("Jayapradha", 123,"B.Tech");
              manager.display();
              
       technician technician = new  technician("JAYA", 147, "Java");
              technician.display();
	}

}