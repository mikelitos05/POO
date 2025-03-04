package edu.poo.actividad4.models;

import java.util.List;

public class Student {

    private String id;
    private String name;
    private int age;
    private Course course;
    private List<Subject> subjects;

    /**
     * Metodo constructor de estudiante
     * @param id del estudiante
     * @param name del estudiante
     * @param age del estudiante
     * @param course No puede ser null
     * @param subjects No puede ser null
     */
    public Student(String id, String name, int age, Course course, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}