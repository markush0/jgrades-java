package de.jgrades;


class Grades {
    /**
     *
     */

    private String date;
    private int value;
    private int weight;
    private String text;
    private int group;
    private Subject subject;

    Grades(String date, int value, int weight, String text, int group, Subject subject) {
        this.date = date;
        this.value = value;
        this.weight = weight;
        this.text = text;
        this.group = group;
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "date='" + date + '\'' +
                ", value=" + value +
                ", text='" + text + '\'' +
                ", group=" + group +
                '}';
    }
}
