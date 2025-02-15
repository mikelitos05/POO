package edu.poo.actividad4.models;

import java.util.List;


public class Course {

    private String idCourse;
    private List<Subject> subjects;

    /**
     * Metodo constructor de curso
     */
    public Course(String idCourse, List<Subject> subjects) {
        this.idCourse = idCourse;
        this.subjects = subjects;
    }

    public String getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }




}
