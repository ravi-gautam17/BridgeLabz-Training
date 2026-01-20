package generics.ResumeScreeningSystem;

public class SoftwareEngineer extends JobRole {

	public SoftwareEngineer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void evaluate() {
		System.out.println(name+ " is evaluated for software engineer role");
	}
	
}
