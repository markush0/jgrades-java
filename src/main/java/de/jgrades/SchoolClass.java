package de.jgrades;

import java.util.ArrayList;

class SchoolClass {
    private String className;
    private ArrayList<Student> listStudent;
    private ArrayList<Subject> listSubjects;

    SchoolClass(String className, ArrayList<Student> listStudent) {
        this.className = className;
        this.listStudent = listStudent;

    }

    SchoolClass(String className) {
        this.className = className;
    }

    public SchoolClass(String className, ArrayList<Student> listStudent, ArrayList<Subject> listSubjects) {
        this.className = className;
        this.listStudent = listStudent;
        this.listSubjects = listSubjects;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
                "className='" + className + '\'' +
                '}';
    }
}
