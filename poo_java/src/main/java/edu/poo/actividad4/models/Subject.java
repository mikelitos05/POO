package edu.poo.actividad4.models;

import java.util.List;

public class Subject {
    private String name;
    private int credits;
    private int hours;
    private List<Student> students;

    /**
     * metodo constructor de la clase Subject
     * @param name
     * @param credits
     * @param hours
     * @param students
     */
    public Subject(String name, int credits, int hours, List<Student> students) {
        this.name = name;
        this.credits = credits;
        this.hours = hours;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getHours() {
        return hours;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}