package de.jgrades;

import java.util.ArrayList;

public class DemoData {

    private ArrayList<Student> demoStudents;
    private ArrayList<SchoolClass> demoClasses;
    private ArrayList<Subject> demoSubjects;

    private Settings demoSettings;

    public DemoData() {
        this.demoStudents = new ArrayList<>();
        this.demoStudents.add(new Student("Markus", "Hillmeier", 'm'));
        this.demoStudents.add(new Student("Georg", "Hillmeier", 'm'));
        this.demoStudents.add(new Student("Lena", "Feuchtgruber", 'w'));

        this.demoClasses = new ArrayList<>();
        this.demoClasses.add(new SchoolClass("5a", this.demoStudents));
        this.demoClasses.add(new SchoolClass("5a", this.demoStudents));

        this.demoSubjects = new ArrayList<>();
        this.demoSubjects.add(new Subject("WG", "Werken und Gestalten"));

        this.demoSettings = new Settings("Marina", "Feuchtgruber", "MS Alfonsstraße", "2019/2020");
    }


    public ArrayList<Student> getDemoStudents() {
        return demoStudents;
    }

    public void setDemoStudents(ArrayList<Student> demoStudents) {
        this.demoStudents = demoStudents;
    }

    public ArrayList<SchoolClass> getDemoClasses() {
        return demoClasses;
    }

    public void setDemoClasses(ArrayList<SchoolClass> demoClasses) {
        this.demoClasses = demoClasses;
    }

    public ArrayList<Subject> getDemoSubjects() {
        return demoSubjects;
    }

    public void setDemoSubjects(ArrayList<Subject> demoSubjects) {
        this.demoSubjects = demoSubjects;
    }

    public Settings getDemoSettings() {
        return demoSettings;
    }

    public void setDemoSettings(Settings demoSettings) {
        this.demoSettings = demoSettings;
    }
}