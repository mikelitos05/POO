package edu.poo.actividad4.models;

public class Professor {
    private String name;
    private double hourlySalary;
    private int subjects;

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor
     *
     * @param name
     * @param hourlySalary
     * @param subjects
     */

    public Professor(String name, double hourlySalary, int subjects) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.subjects = subjects;

    }
}

