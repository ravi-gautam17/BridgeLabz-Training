import java.util.HashSet;

public class OTPProgram {

    public static void main(String[] args) {
        // Create an array to save the OTP numbers generated 10 times
        int[] otpStorage = new int[10];

        System.out.println("Generating 10 OTPs...");
        System.out.println("-----------------------");

        // Generate 10 OTPs and store them
        for (int i = 0; i < otpStorage.length; i++) {
            otpStorage[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpStorage[i]);
        }

        // Validate uniqueness
        boolean unique = checkUniqueness(otpStorage);

        System.out.println("-----------------------");
        if (unique) {
            System.out.println("Validation Success: All generated OTPs are unique.");
        } else {
            System.out.println("Validation Failed: Duplicate OTPs found!");
        }
    }

    /**
     * Method to generate a 6-digit OTP number using Math.random()
     * Range: 100000 to 999999
     */
    public static int generateOTP() {
        // Math.random() returns a double between 0.0 and 1.0
        // Formula: (Math.random() * (max - min + 1)) + min
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    /**
     * Method to ensure that the OTP numbers generated are unique.
     * Create a hashset to check uniqueness
     */
    public static boolean checkUniqueness(int[] otps) {
        HashSet<Integer> hs=new HashSet<>();
        for (int otp: otps) {
            if(hs.contains(otp)){
                return false;
            }      
            hs.add(otp);
        }
        return true;
    }
}