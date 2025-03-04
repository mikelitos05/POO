package edu.poo.actividad4.models;

import java.util.List;


public class Course {

    private String idCourse;
    private List<Subject> subjects;
    private List<Student> students;



    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Metodo constructor de curso
     */
    public Course(String idCourse, List<Subject> subjects,List<Student> students) {
        this.idCourse = idCourse;
        this.subjects = subjects;
        this.students = students;
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
