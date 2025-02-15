package edu.poo.actividad4.process;

import java.util.ArrayList;
import java.util.List;

import edu.poo.actividad4.models.Course;

public class CourseManager {
    ArrayList<Course> course;

    public CourseManager() {
        this.course = new ArrayList<>();
    }

    public void addCourse(String idCourse, List subjects) {
        Course course = new Course(idCourse, subjects);
    }

    public List<Course> getCourses() {
        return course;
    }

    
}
