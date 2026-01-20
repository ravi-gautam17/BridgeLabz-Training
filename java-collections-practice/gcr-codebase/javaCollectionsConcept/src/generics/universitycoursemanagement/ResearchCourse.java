package generics.universitycoursemanagement;

public class ResearchCourse extends CourseType{
	
	public ResearchCourse() {
		super("Research project");
	}

	@Override
	public String getEvaluationType() {
		// TODO Auto-generated method stub
		return "Research-based";
	}
	
}
