package com.day5.loanbuddy;

public class LoanBuddyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Applicant applicant = new Applicant("Vedansh", 720, 50000, 800000);

	        IApprovable autoLoan = new AutoLoan(60, 0.09);
	        autoLoan.approveLoan(applicant);
	        System.out.println("Auto Loan EMI: ₹" +
	                autoLoan.calculateEMI(applicant.getLoanAmount(), 0.09, 60));

	        System.out.println("---------------------------");

	        IApprovable homeLoan = new HomeLoan(120, 0.07);
	        homeLoan.approveLoan(applicant);
	        System.out.println("Home Loan EMI: ₹" + homeLoan.calculateEMI(applicant.getLoanAmount(), 0.07, 120));
	}

}
