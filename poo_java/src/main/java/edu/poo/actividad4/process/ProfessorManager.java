package edu.poo.actividad4.process;

import edu.poo.actividad4.models.Professor;
import java.util.ArrayList;

/**
 * La clase {@code ProfessorManager} proporciona funcionalidad para calcular el salario de un profesor
 * en función del número de materias que enseña y su salario por hora.
 */


public class ProfessorManager {
    /**
    Calcula el salario de un profesor en función del número de materias que enseña y su salario por hora.
    El salario se calcula utilizando un multiplicador dependiendo del número de materias
    * @param professor El profesor cuyo salario se necesita calcular.
    * @return El salario calculado del profesor.
    */

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
