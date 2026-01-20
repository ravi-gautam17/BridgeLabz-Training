package generics.ResumeScreeningSystem;

public class ProductManager extends JobRole{

	public ProductManager(String name) {
		super(name);
	}

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println(name+" is eveluated for ProductManager role");
		
	}

}
