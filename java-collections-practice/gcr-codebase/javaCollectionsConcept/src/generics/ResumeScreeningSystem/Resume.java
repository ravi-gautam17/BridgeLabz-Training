package generics.ResumeScreeningSystem;

public class Resume <T extends JobRole>{
	private T jobRole;
	
	public Resume(T jobRole) {
		this.jobRole = jobRole;
	}
	public void processResume() {
        System.out.println("Processing resume...");
        jobRole.evaluate();
    }

    public <U> void addAIComment(U comment) {
        System.out.println("AI Comment: " + comment);
    }
	
}
