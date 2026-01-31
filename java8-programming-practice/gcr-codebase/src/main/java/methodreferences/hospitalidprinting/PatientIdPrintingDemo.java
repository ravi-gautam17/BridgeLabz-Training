package methodreferences.hospitalidprinting;

import java.util.List;

public class PatientIdPrintingDemo {

    public static void main(String[] args) {

        List<Patient> patients = List.of(
                new Patient(101, "Amit"),
                new Patient(102, "Riya"),
                new Patient(103, "John"),
                new Patient(104, "Sara")
        );

        //  Print all patient IDs using method references
        patients.stream()
                .map(Patient::getPatientId)   // method reference
                .forEach(System.out::println); // method reference
    }
}

