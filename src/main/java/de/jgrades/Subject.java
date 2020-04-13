package de.jgrades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Subject {
    private final StringProperty subShort;
    private final StringProperty subLong;
//    private final StringProperty subShortProp = new SimpleStringProperty();

    public Subject(String subShort, String subLong) {
        this.subShort = new SimpleStringProperty(subShort);
        this.subLong = new SimpleStringProperty(subLong);
    }

    public StringProperty subShortProperty() {
        return this.subShort;
    }

    public StringProperty subLongProperty() {
        return this.subLong;
    }

    public String getSubShort() {
        return subShort.get();
    }

    public void setSubShort(String subShort) {
        this.subShort.set(subShort);
    }

    public String getSubLong() {
        return subLong.get();
    }

    public void setSubLong(String subLong) {
        this.subLong.set(subLong);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subShort='" + subShort.get() + '\'' +
                ", subLong='" + subLong.get() + '\'' +
                '}';
    }

}
