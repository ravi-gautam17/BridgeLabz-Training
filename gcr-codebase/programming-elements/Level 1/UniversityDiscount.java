// write a program to find the discounted amount and discounted price the student will pay for the course
public class UniversityDiscount {
    public static void main(String[] args) {
        // create a variable to initialize fee,discount percent
        int fee=125000;
        double discountPercent=10;

        //calculate the discount amount and fees to be payed
        double discountAmount=(discountPercent*fee)/100;
        double feesToBePayed=fee-discountAmount;

        //printing the discount amount and final discounted free
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+feesToBePayed);


    }
}
