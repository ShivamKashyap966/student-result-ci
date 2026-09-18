package com.shivam.studentresult;

public class StudentResult {

    public int calculateTotal(int math, int science, int computer) {
        return math + science + computer;
    }

    public double calculateAverage(int math, int science, int computer) {
        return calculateTotal(math, science, computer) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 75) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassed(int math, int science, int computer) {
        return math >= 40 && science >= 40 && computer >= 40;
    }
}