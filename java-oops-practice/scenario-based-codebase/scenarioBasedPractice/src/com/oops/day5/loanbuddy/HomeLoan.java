package com.day5.loanbuddy;

public class HomeLoan extends LoanApplication implements IApprovable{
	 public HomeLoan(int term, double interestRate) {
	        super("Home Loan", term, interestRate);
	    }

	 @Override
	 public void approveLoan(Applicant applicant) {
		 if (applicant.getCreditScore() >= 700 && applicant.getIncome() > 30000) {
			 System.out.println("Home Loan Approved for " + applicant.getName());
		 } 
		 else {
			 System.out.println("Home Loan Rejected for " + applicant.getName());
		 }
	 }
	
	@Override
	public double calculateEMI(double principle, double rateOfInterest, int term) {
		double emiN = (principle * rateOfInterest * (Math.pow(1+rateOfInterest, term)));
		double emiD = Math.pow(1+rateOfInterest, term) - 1;
		return emiN / emiD;
	}
}
