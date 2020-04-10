package de.jgrades;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class Subject {
    private StringProperty subShort  = new SimpleStringProperty();;
    private StringProperty subLong  = new SimpleStringProperty();;
//    private final StringProperty subShortProp = new SimpleStringProperty();

    Subject(String subShort, String subLong) {
        this.subShort.set(subShort);
        this.subLong.set(subLong);
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
