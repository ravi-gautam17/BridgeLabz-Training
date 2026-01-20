package generics.ResumeScreeningSystem;

public abstract class JobRole {
	
	public String name;
	
	public JobRole(String name) {
		this.name = name;
	}
	
	public abstract void evaluate();
}
