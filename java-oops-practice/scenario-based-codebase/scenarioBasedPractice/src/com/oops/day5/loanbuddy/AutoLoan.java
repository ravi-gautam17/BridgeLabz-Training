package com.day5.loanbuddy;

public class AutoLoan extends LoanApplication implements IApprovable {
	
	public AutoLoan(int term, double interestRate) {
		super("Auto Loan", term, interestRate);
	}
	
	@Override
    public void approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650) {
            System.out.println("Auto Loan Approved for " + applicant.getName());
        } else {
            System.out.println("Auto Loan Rejected for " + applicant.getName());
        }
    }
	
	@Override
	public double calculateEMI(double principle, double rateOfInterest, int term) {
		double emiN = (principle * rateOfInterest * (Math.pow(1+rateOfInterest, term)));
		double emiD = Math.pow(1+rateOfInterest, term) - 1;
		return emiN / emiD;
	}
}
