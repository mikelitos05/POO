package edu.poo.actividad4.process;

import java.util.ArrayList;
import java.util.List;

import edu.poo.actividad4.models.Course;
import edu.poo.actividad4.models.Student;
import edu.poo.actividad4.models.Subject;

public class StudentManager {

    ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    /**
     * Metodo para agregar un estudiante
     * @param id
     * @param name
     * @param age
     * @param course
     * @param subjects
     */
    public void addStudent(String id, String name, int age, Course course, List<Subject> subjects) {
        Student student = new Student(id, name, age, course, subjects);
        students.add(student);

        for (Subject subject : subjects) {
            subject.getStudents().add(student);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}