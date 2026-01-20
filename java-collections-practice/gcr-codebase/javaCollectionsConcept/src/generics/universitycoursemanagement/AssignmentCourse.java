package generics.universitycoursemanagement;

public class AssignmentCourse extends CourseType{
	public AssignmentCourse() {
		super("Assignments");
	}

	@Override
	public String getEvaluationType() {
		// TODO Auto-generated method stub
		return "Assignment-based";
	}
	
}
