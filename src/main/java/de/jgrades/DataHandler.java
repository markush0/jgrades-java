package de.jgrades;

import java.util.ArrayList;
import java.util.Iterator;

public class DataHandler {
    private static DataHandler instance;

    private Settings settings;
    private ArrayList<SchoolClass> classes;

    private String classSelected;

    private DataHandler() {
        DemoData demo = new DemoData();
        if (demo.isDemo()) {
            this.classes = demo.getDemoClasses();
            this.settings = demo.getDemoSettings();
            this.classSelected = "5c";
        } else {

        }
    }

    public static synchronized DataHandler getInstance() {
        if (DataHandler.instance == null) {
            DataHandler.instance = new DataHandler();
        }
        return DataHandler.instance;
    }

    public SchoolClass getSchoolClass() {
        Iterator<SchoolClass> iterator = this.classes.iterator();
        while (iterator.hasNext()) {
            SchoolClass cl = iterator.next();
            if (cl.getClassName().equals(this.classSelected)) {
                return cl;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        SchoolClass cl = this.getSchoolClass();
        if (cl != null) return cl.getListStudent();
        return null;
    }

    public ArrayList<Subject> getSubjects() {
        SchoolClass cl = this.getSchoolClass();
        if (cl != null) return cl.getListSubjects();
        return null;
    }

    public void setClassSelected(String classSelected) {
        this.classSelected = classSelected;
    }

    public String getClassSelected() {
        return classSelected;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<SchoolClass> classes) {
        this.classes = classes;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

}
