package edu.poo.actividad4.process;

import java.util.ArrayList;
import java.util.List;

import edu.poo.actividad4.models.Subject;

public class SubjectManager {

    ArrayList<Subject> subjects;

    public SubjectManager() {
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String name, int hours, int credits) {
        Subject subject = new Subject(name, hours, credits);
        subjects.add(subject);
    }

    public boolean subjectValidator(String name){
        for(Subject subject : subjects){
            if(subject.getName().equals(name)){
                return false;
            }
        }
        return true;
    }

    public void preloadSubjects() {
        addSubject("Matemáticas", 40, 4);
        addSubject("Física", 35, 3);
        addSubject("Química", 30, 3);
        addSubject("Historia", 25, 2);
        addSubject("Literatura", 20, 2);
    }


    public List<Subject> getSubjects() {
        return subjects;
    }

    

}
