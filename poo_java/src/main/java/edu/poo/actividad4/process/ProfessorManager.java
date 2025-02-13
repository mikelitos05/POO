package edu.poo.actividad4.process;

import edu.poo.actividad4.models.Professor;

public class ProfessorManager {
    public static double calculateSalary(Professor professor) {
        double multiplier;

        switch (professor.getSubjects()) {
            case 1:
                multiplier = 1.0;
                break;
            case 2:
                multiplier = 1.25;
                break;
            case 3:
                multiplier = 1.5;
                break;
            case 4:
                multiplier = 1.75;
                break;
            default:
                multiplier = 1.75;
                break;
        }

        return professor.getHourlySalary() * professor.getSubjects() * multiplier;
    }
}
