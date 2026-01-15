package com.day3.examproctor;

public class ExamProctorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proctor exam = new Proctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.lastVisitedQuestion();
        exam.submitExam();
	}

}
