package de.jgrades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class SchoolClass {
    private StringProperty className;
    private ArrayList<Student> listStudent;
    private ArrayList<Subject> listSubjects;

    public SchoolClass(String className, ArrayList<Student> listStudent) {
        this.className = new SimpleStringProperty(className);
        this.listStudent = listStudent;

    }

    public StringProperty classNameProperty() {
        return this.className;
    }

    public SchoolClass(String className) {
        this.className = new SimpleStringProperty(className);
    }

    public SchoolClass(String className, ArrayList<Student> listStudent, ArrayList<Subject> listSubjects) {
        this.className = new SimpleStringProperty(className);
        this.listStudent = listStudent;
        this.listSubjects = listSubjects;
    }

    public String getClassName() {
        return className.get();
    }

    public void setClassName(String className) {
        this.className.set(className);
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Subject> getListSubjects() {
        return listSubjects;
    }

    public void setListSubjects(ArrayList<Subject> listSubjects) {
        this.listSubjects = listSubjects;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "className='" + className.get() + '\'' +
                '}';
    }
}
