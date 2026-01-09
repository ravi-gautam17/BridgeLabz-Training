package com.day5.loanbuddy;

public interface IApprovable {
	void approveLoan(Applicant applicant);
    double calculateEMI(double principal, double rateOfInterest, int term);
}
