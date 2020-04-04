package de.jgrades;

import java.time.LocalDate;
import java.util.ArrayList;


class Student {
    private String studentFirst;
    private String studentLast;
    private char studentSex;
    private LocalDate studentBirthday;
    private ArrayList<Grades> listGrades;

    Student(String studentFirst, String studentLast, char studentSex, LocalDate studentBirthday) {
        this.studentFirst = studentFirst;
        this.studentLast = studentLast;
        this.studentSex = studentSex;
        this.studentBirthday = studentBirthday;
    }

    public Student(String studentFirst, String studentLast, char studentSex) {
        this.studentFirst = studentFirst;
        this.studentLast = studentLast;
        this.studentSex = studentSex;
    }

    public String getStudentFirst() {
        return studentFirst;
    }

    public void setStudentFirst(String studentFirst) {
        this.studentFirst = studentFirst;
    }

    public String getStudentLast() {
        return studentLast;
    }

    public void setStudentLast(String studentLast) {
        this.studentLast = studentLast;
    }

    public char getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(char studentSex) {
        this.studentSex = studentSex;
    }

    public LocalDate getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(LocalDate studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public ArrayList<Grades> getListGrades() {
        return listGrades;
    }

    public void setListGrades(ArrayList<Grades> listGrades) {
        this.listGrades = listGrades;
    }

    @Override
    public String toString() {
        return "Student{ " +
                studentFirst + ' ' +
                studentLast +
                " }";
    }

    public String getFullName() {
        return this.studentFirst + ' ' + this.studentLast;
    }
}
