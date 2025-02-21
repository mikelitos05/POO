package edu.poo.actividad4.ui;

public class Es extends Language {

    public Es(){
        MENU_OPC1 = "1. Dar de alta al profesor";
        MENU_OPC2 = "2. Dar de alta al alumno";
        MENU_OPC3 = "3. Dar de alta al curso";
        MENU_OPC4 = "4. Dar de alta materia";
        MENU_OPC5 = "5. Mostrar cursos";
        MENU_OPC6 = "6. Mostrar materia y número de alumnos";
        MENU_OPC7 = "7. Mostrar profesor y salario semanal";
        MENU_OPC8 = "8. Cambiar idioma";
        MENU_OPC9 = "9. Salir";
        INVALID_OPTION = "Opción inválida";

        SUBJECTS_HEADER = "Materias: ";
        SUBJECT_SEPARATOR = "==========================================================================================";
        SUBJECT_NAME_LABEL = "Nombre de la materia: ";
        SUBJECT_CREDITS_LABEL = "Número de créditos de la materia: ";
        SUBJECT_HOURS_LABEL = "Número de horas de la materia: ";
        SUBJECT_STUDENTS_LABEL = "Número de alumnos inscritos en la materia: ";

        COURSES_HEADER = "Cursos: ";
        COURSE_SEPARATOR = "==========================================================================================";
        COURSE_ID_LABEL = "ID del curso: ";
        COURSE_SUBJECTS_LABEL = "Materias del curso: ";
        COURSE_TOTAL_CREDITS_LABEL = "Número de créditos totales del curso: ";

        ENTER_PROFESSOR_NAME = "Ingrese el nombre del profesor: ";
        ENTER_PROFESSOR_SUBJECT_COUNT = "Ingrese el número de materias que tendrá el profesor: ";
        PROFESSOR_SALARY_RESULT = "El salario total del profesor %s es: %.2f";

        ENTER_STUDENT_ID = "Ingrese la matrícula del alumno: ";
        ENTER_STUDENT_NAME = "Ingrese el nombre del alumno: ";
        ENTER_STUDENT_AGE = "Ingrese la edad del alumno: ";
        ENTER_STUDENT_COURSE = "Ingrese el nombre del curso del alumno: ";
        STUDENT_REGISTER_SUCCESS = "Alumno registrado exitosamente.";
        COURSE_DOES_NOT_EXIST = "El curso no existe.";

        ENTER_COURSE_ID = "Ingrese la clave del curso: ";
        ENTER_SUBJECT_FOR_COURSE = "Ingrese el nombre de la materia ";
        SUBJECT_ALREADY_SELECTED_OR_NOT_EXIST = "La materia ya ha sido seleccionada o no existe. Por favor, elija otra materia.";
        COURSE_ADDED_SUCCESS = "Curso agregado exitosamente.";
        NOT_ENOUGH_SUBJECTS = "Hay menos de 3 materias registradas.";

        ENTER_SUBJECT_NAME = "Ingrese el nombre de la materia: ";
        ENTER_SUBJECT_CREDITS = "Ingrese el número de créditos de la materia: ";
        ENTER_SUBJECT_HOURS = "Ingrese el número de horas de la materia: ";

        NO_PROFESSORS = "No hay profesores registrados.";
        PROFESSOR_DETAILS = "Nombre: %s, Salario por hora: %.2f, Número de materias: %d, Salario semanal: %.2f";

        LANGUAGE_SELECTION_PROMPT = "Seleccione el idioma: 1. Español, 2. English";
        LANGUAGE_OPTION_SPANISH = "Español";
        LANGUAGE_OPTION_ENGLISH = "English";
    }
}