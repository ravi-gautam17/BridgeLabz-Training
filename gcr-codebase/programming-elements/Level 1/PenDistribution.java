public class PenDistribution {
    //this is the program the pen per student and also remaining pens that will not be distributed
    public static void main(String[] args) {
        int numberOfPens=14;
        int eachStudentPenQuantity=3;
        int numberOfStudentWithPens=numberOfPens/eachStudentPenQuantity;
        int remainingNumOfStudents=numberOfPens%eachStudentPenQuantity;
        //print the number of students with equal pens and remaining students number without pen
        System.out.println("The pen per student is "+numberOfStudentWithPens+" and the remaining pen not distributed is "+remainingNumOfStudents);
    }
}
