package streamapi.hospitaldoctoravailability;

import java.util.*;
import java.util.stream.Collectors;

public class HospitalApp {
	 public static void main(String[] args) {

	        List<Doctor> doctors = Arrays.asList(
	            new Doctor("Dr Smith", "Cardiology", true),
	            new Doctor("Dr Alice", "Neurology", false),
	            new Doctor("Dr John", "Orthopaedics", true),
	            new Doctor("Dr Emma", "Dermatology", true),
	            new Doctor("Dr Bob", "Neurology", true)
	        );
	        
	        List<Doctor> weekendDoctorsSortedBySpecialty =
	                doctors.stream()
	                       .filter(Doctor::isAvailableOnWeekend)   // 1️⃣ filter weekend doctors
	                       .sorted(Comparator.comparing(Doctor::getSpecialty)) // 2️⃣ sort by specialty
	                       .collect(Collectors.toList());

	        weekendDoctorsSortedBySpecialty.forEach(System.out::println);
	    }
	}



