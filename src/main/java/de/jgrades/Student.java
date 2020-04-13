package de.jgrades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.ArrayList;


public class Student {
    private final StringProperty studentFirst;
    private final StringProperty studentLast;
    private final StringProperty studentSex;
    private LocalDate studentBirthday;
    private ArrayList<Grades> listGrades;

    public Student(String studentFirst, String studentLast, String studentSex, LocalDate studentBirthday) {
        this.studentFirst = new SimpleStringProperty(studentFirst);
        this.studentLast = new SimpleStringProperty(studentLast);
        this.studentSex = new SimpleStringProperty(studentSex);
        this.studentBirthday = studentBirthday;
    }

    public Student(String studentFirst, String studentLast, String studentSex) {
        this.studentFirst = new SimpleStringProperty(studentFirst);
        this.studentLast = new SimpleStringProperty(studentLast);
        this.studentSex = new SimpleStringProperty(studentSex);
    }

    public StringProperty studentFirstProperty() {
        return studentFirst;
    }

    public StringProperty studentLastProperty() {
        return studentLast;
    }

    public StringProperty studentSexProperty() {
        return studentSex;
    }

    public String getStudentFirst() {
        return studentFirst.get();
    }

    public void setStudentFirst(String studentFirst) {
        this.studentFirst.set(studentFirst);
    }

    public String getStudentLast() {
        return studentLast.get();
    }

    public void setStudentLast(String studentLast) {
        this.studentLast.set(studentLast);
    }

    public String getStudentSex() {
        return studentSex.get();
    }

    public void setStudentSex(String studentSex) {
        this.studentSex.set(studentSex);
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
                studentFirst.get() + ' ' +
                studentLast.get() +
                " }";
    }

    public String getFullName() {
        return this.studentFirst.get() + ' ' + this.studentLast.get();
    }
}
