package de.jgrades;

import java.util.ArrayList;

public class DemoData {

//    private ArrayList<Student> demoStudents;
    private ArrayList<SchoolClass> demoClasses;
//    private ArrayList<Subject> demoSubjects;

    private Settings demoSettings;
    private boolean demo;

    public DemoData() {
        this.demo = true;

        ArrayList<Student> demoStudents = new ArrayList<>();
        demoStudents.add(new Student("Markus", "Hillmeier", "m"));
        demoStudents.add(new Student("Georg", "Hillmeier", "m"));

        ArrayList<Subject> demoSubjects = new ArrayList<>();
        demoSubjects.add(new Subject("WG", "Werken und Gestalten"));
        demoSubjects.add(new Subject("SO", "Soziales"));



        this.demoClasses = new ArrayList<>();
        this.demoClasses.add(new SchoolClass("5a", demoStudents, demoSubjects));

        demoStudents = new ArrayList<>();
        demoStudents.add(new Student("Markus", "Hillmeier", "m"));
        demoStudents.add(new Student("Markus", "Hillmeier", "m"));
        demoStudents.add(new Student("Lena", "Feuchtgruber", "w"));


        demoSubjects = new ArrayList<>();
        demoSubjects.add(new Subject("Tast", "Tastschreiben"));
        this.demoClasses.add(new SchoolClass("5c", demoStudents, demoSubjects));

        this.demoSettings = new Settings("Marina", "Feuchtgruber", "MS Alfonsstraße", "2019/2020");
    }


//    public ArrayList<Student> getDemoStudents() {
//        return demoStudents;
//    }

//    public void setDemoStudents(ArrayList<Student> demoStudents) {
//        this.demoStudents = demoStudents;
//    }

    public ArrayList<SchoolClass> getDemoClasses() {
        return demoClasses;
    }

    public void setDemoClasses(ArrayList<SchoolClass> demoClasses) {
        this.demoClasses = demoClasses;
    }

//    public ArrayList<Subject> getDemoSubjects() {
//        return demoSubjects;
//    }

//    public void setDemoSubjects(ArrayList<Subject> demoSubjects) {
//        this.demoSubjects = demoSubjects;
//    }

    public Settings getDemoSettings() {
        return demoSettings;
    }

//    public void setDemoSettings(Settings demoSettings) {
//        this.demoSettings = demoSettings;
//    }

    public boolean isDemo() {
        return demo;
    }
}
