package com.day5.loanbuddy;

public class LoanApplication {
	protected String loanType;
	private int term;             		// ( duration )in month
	private double interestRate;
	
	LoanApplication(String loanType, int term, double interestRate){
		this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		return interestRate;
	}
}
