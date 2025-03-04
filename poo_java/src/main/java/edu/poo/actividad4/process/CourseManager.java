package edu.poo.actividad4.process;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.poo.actividad4.models.Course;
import edu.poo.actividad4.models.Student;
import edu.poo.actividad4.models.Subject;

public class CourseManager {
    ArrayList<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }
    /**
     * Metodo que se encarga de agregar un curso
     */
    public void addCourse(String idCourse, ArrayList<Subject> subjects, ArrayList<Student> students) {
        Course course = new Course(idCourse, subjects,students);
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Metodo que se encarga de precargar cursos
     */
    public void preloadCourses() {
        Course mapsCourse = new Course("maps", new ArrayList<>(Arrays.asList(
            new Subject("matematicas", 40, 4, new ArrayList<>()),
            new Subject("fisica", 35, 3, new ArrayList<>())
        )), new ArrayList<>());

        courses.add(mapsCourse);

        mapsCourse.getStudents().addAll(Arrays.asList(
            new Student("1", "Juan", 20, mapsCourse, new ArrayList<>()),
            new Student("2", "Pedro", 21, mapsCourse, new ArrayList<>())
        ));
    }

    /**
     * Metodo que se encarga de obtener un curso por su id
     * @param name
     * @return
     */
    public Course getCourseById(String name) {
        for (Course course : courses) {
            if (course.getIdCourse().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }
    
}
