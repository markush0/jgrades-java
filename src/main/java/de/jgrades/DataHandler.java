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
            this.classSelected = "";

            if (this.classSelected.equals("")) {
                this.classSelected = this.classes.get(0).getClassName();
            }
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

    public String getClassSelected() {
        return classSelected;
    }

    public void setClassSelected(String classSelected) {
        this.classSelected = classSelected;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<SchoolClass> classes) {
        this.classes = classes;
    }

    public ArrayList<String> getClassesString() {
//        return classes;
        ArrayList<String> clString = new ArrayList<>();

        Iterator<SchoolClass> iterator = this.classes.iterator();
        while (iterator.hasNext()) {
            SchoolClass cl = iterator.next();
            clString.add(cl.getClassName());
        }

        return clString;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

}
