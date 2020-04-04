package de.jgrades;

public class Settings {
    private String firstName;
    private String lastName;
    private String schoolName;
    private String firstYear;
    private String lastYear;

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

    public String getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(String firstYear) {
        this.firstYear = firstYear;
    }

    public String getLastYear() {
        return lastYear;
    }

    public void setLastYear(String lastYear) {
        this.lastYear = lastYear;
    }

    public Settings(String firstName, String lastName, String schoolName, String firstYear, String lastYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.firstYear = firstYear;
        this.lastYear = lastYear;
    }
}
