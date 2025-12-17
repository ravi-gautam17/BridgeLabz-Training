public class SamAverageMarks {
    public static void main(String[] args) {

        int mathsMarks=94;
        int physicsMarks=95;
        int chemistryMarks=96;
        int total_marks=100;
        //calculate the sum of marks of all three subjects
        int sumOfMarks=mathsMarks+physicsMarks+chemistryMarks;
        //calculate the maximum marks possible
        int totalSumOfMarks=3*100;
        //calculate the percentage of marks
        double averageOfMarks= (double) sumOfMarks /totalSumOfMarks;
        System.out.println("Sam's average mark in PCM is "+averageOfMarks);
    }
}
