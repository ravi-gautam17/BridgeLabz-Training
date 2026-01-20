package generics.ResumeScreeningSystem;
import java.util.List;

public class ScreeningPipeline {
	public static void screenAllResumes(List<? extends JobRole> roles) {
        System.out.println("AI Screening Pipeline Started...");
        for (JobRole role : roles) {
            role.evaluate();
        }
    }
}
