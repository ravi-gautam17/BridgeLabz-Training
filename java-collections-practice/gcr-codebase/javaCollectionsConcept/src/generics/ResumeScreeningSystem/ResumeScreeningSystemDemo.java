package generics.ResumeScreeningSystem;
import java.util.*;

public class ResumeScreeningSystemDemo {
	public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("Alice"));

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("Bob"));

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("Charlie"));

        r1.processResume();
        r2.processResume();
        r3.processResume();

        r1.addAIComment("Strong in Java and DSA");
        r2.addAIComment(4.5); 

        List<JobRole> candidates = new ArrayList<>();
        candidates.add(new SoftwareEngineer("David"));
        candidates.add(new DataScientist("Eva"));
        candidates.add(new ProductManager("Frank"));

        ScreeningPipeline.screenAllResumes(candidates);
    }
}
