package generics.ResumeScreeningSystem;

public class DataScientist extends JobRole{

	public DataScientist(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println(name+ " is eveluated for datascientist role");
	}

}
