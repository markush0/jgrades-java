package de.jgrades;

class Subject {
    private String fachKurz;
    private String fachLang;

    Subject(String fachKurz, String fachLang) {
        this.fachKurz = fachKurz;
        this.fachLang = fachLang;
    }

    public String getFachKurz() {
        return fachKurz;
    }

    public void setFachKurz(String fachKurz) {
        this.fachKurz = fachKurz;
    }

    public String getFachLang() {
        return fachLang;
    }

    public void setFachLang(String fachLang) {
        this.fachLang = fachLang;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "fachKurz='" + fachKurz + '\'' +
                ", fachLang='" + fachLang + '\'' +
                '}';
    }

}
