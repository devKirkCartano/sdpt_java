package main;

public class Student {

    String firstName, lastName, year, course;
    char section;
    double midtermGrade, finalGrade;

    Student(String firstName, String lastName, String year, String course, char section, double midtermGrade, double finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduceSelf() {
        System.out.println("Name      : " + firstName + " " + lastName);
        System.out.println("Course    : " + course);
        System.out.println("Year      : " + year);
        System.out.println("Section   : " + section);
    }

    void evaluateGrade() {
        double average = (midtermGrade + finalGrade) / 2;
        System.out.println("Name      : " + firstName + " " + lastName);
        System.out.println("Average   : " + average);
        String remark;
        if (average >= 90) {
            remark = "Excellent";
        } else if (average >= 80) {
            remark = "Very Good";
        } else if (average >= 70) {
            remark = "Good";
        } else if (average >= 60) {
            remark = "Fair";
        } else {
            remark = "Failed";
        }
    System.out.println("Remark    : " + remark);

    }
}

