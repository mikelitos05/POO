package edu.poo.actividad4.process;

import java.util.ArrayList;
import java.util.List;

import edu.poo.actividad4.models.Student;
import edu.poo.actividad4.models.Subject;

public class SubjectManager {

    ArrayList<Subject> subjects;

    public SubjectManager() {
        this.subjects = new ArrayList<>();
    }

    /**
     * Metodo para agregar una materia
     * @param name
     * @param hours
     * @param credits
     * @param students
     */
    public void addSubject(String name, int hours, int credits,List<Student> students) {
        Subject subject = new Subject(name, hours, credits,students);
        subjects.add(subject);
    }

    /**
     * Metodo para validar si la materia ya existe
     * @param name
     * @return
     */
    public boolean subjectValidator(String name){
        for(Subject subject : subjects){
            if(subject.getName().equals(name)){
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para obtener una materia por nombre
     * @param name
     * @return
     */
    public Subject getSubjectByName(String name) {
        for (Subject subject : subjects) {
            if (subject.getName().equalsIgnoreCase(name)) {
                return subject;
            }
        }
        return null;
    }


    /**
     * Metodo para precargar materias
     */
    public void preloadSubjects() {
        addSubject("matematicas", 40, 4, new ArrayList<>());
        addSubject("fisica", 35, 3, new ArrayList<>());
        addSubject("quimica", 30, 3, new ArrayList<>());
        addSubject("historia", 25, 2, new ArrayList<>());
        addSubject("literatura", 20, 2, new ArrayList<>());
    }


    public List<Subject> getSubjects() {
        return subjects;
    }

    

}
