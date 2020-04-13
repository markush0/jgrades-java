package de.jgrades;

public class Settings {
    private String firstName;
    private String lastName;
    private String schoolName;
    private String year;

    public Settings(String firstName, String lastName, String schoolName, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
