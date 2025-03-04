package edu.poo.actividad4.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.poo.actividad4.models.Course;
import edu.poo.actividad4.models.Professor;
import edu.poo.actividad4.models.Subject;
import edu.poo.actividad4.process.CourseManager;
import edu.poo.actividad4.process.ProfessorManager;
import edu.poo.actividad4.process.StudentManager;
import edu.poo.actividad4.process.SubjectManager;

public class CLI {

    static Language language = new Es();
    static List<Professor> professors = new ArrayList<>();

    /**
     * Método que muestra el menú.
     */
    public static void showMenu(){
        System.out.println(language.MENU_OPC1);
        System.out.println(language.MENU_OPC2);
        System.out.println(language.MENU_OPC3);
        System.out.println(language.MENU_OPC4);
        System.out.println(language.MENU_OPC5);
        System.out.println(language.MENU_OPC6);
        System.out.println(language.MENU_OPC7);
        System.out.println(language.MENU_OPC8);
        System.out.println(language.MENU_OPC9);
    }

    /**
     * Método que muestra las materias.
     */
    public static void showSubjects(SubjectManager subjectManager){
        System.out.println(language.SUBJECTS_HEADER);
        for(int i = 0; i < subjectManager.getSubjects().size(); i++){
            System.out.println(language.SUBJECT_SEPARATOR);
            System.out.println(language.SUBJECT_NAME_LABEL + subjectManager.getSubjects().get(i).getName());
            System.out.println(language.SUBJECT_CREDITS_LABEL + subjectManager.getSubjects().get(i).getCredits());
            System.out.println(language.SUBJECT_HOURS_LABEL + subjectManager.getSubjects().get(i).getHours());
            System.out.println(language.SUBJECT_STUDENTS_LABEL + subjectManager.getSubjects().get(i).getStudents().size());
            System.out.println(language.SUBJECT_SEPARATOR);
        }
    }

    /**
     * Método que muestra los cursos.
     */
    public static void showCourses(CourseManager courseManager){
        int creditos;
        System.out.println(language.COURSES_HEADER);
        
        for(int i = 0; i < courseManager.getCourses().size(); i++){
            creditos = 0;
            System.out.println(language.COURSE_SEPARATOR);
            System.out.println(language.COURSE_ID_LABEL + courseManager.getCourses().get(i).getIdCourse());
            System.out.println(language.COURSE_SUBJECTS_LABEL);
            for(int j = 0; j < courseManager.getCourses().get(i).getSubjects().size(); j++){
                System.out.println(language.SUBJECT_NAME_LABEL + courseManager.getCourses().get(i).getSubjects().get(j).getName());
                System.out.println(language.SUBJECT_CREDITS_LABEL + courseManager.getCourses().get(i).getSubjects().get(j).getCredits());
                creditos += courseManager.getCourses().get(i).getSubjects().get(j).getCredits();
                System.out.println(language.SUBJECT_HOURS_LABEL + courseManager.getCourses().get(i).getSubjects().get(j).getHours());
            }
            System.out.println(language.COURSE_SEPARATOR);
            System.out.println(language.COURSE_TOTAL_CREDITS_LABEL + creditos);
            System.out.println(language.COURSE_SEPARATOR);
        }
    }

    public static String normalizeString(String input) {
        return input.toLowerCase();
    }

    /**
     * Método que corre la aplicación.
     */
    public static void runApp(){
        SubjectManager subjectManager = new SubjectManager();
        CourseManager courseManager = new CourseManager();
        StudentManager studentManager = new StudentManager();
        subjectManager.preloadSubjects();
        courseManager.preloadCourses();

        language = new Es(); // idioma por defecto
        Scanner scanner = new Scanner(System.in);

        int opcMenu = 0;
        while(opcMenu != 9){
            showMenu();
            try{
                opcMenu = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.out.println(language.INVALID_OPTION);
                scanner.nextLine();
                continue;
            }

            switch(opcMenu){
                case 1:
                    System.out.println(language.ENTER_PROFESSOR_NAME);
                    String name = scanner.nextLine();

                    double hourlySalary = 10;

                    System.out.println(language.ENTER_PROFESSOR_SUBJECT_COUNT);
                    int amountOfSubjects = scanner.nextInt();
                    scanner.nextLine();

                    Professor professor = new Professor(name, hourlySalary, amountOfSubjects);
                    double totalSalary = ProfessorManager.calculateSalary(professor);
                    professors.add(professor);
                    System.out.println(String.format(language.PROFESSOR_SALARY_RESULT, professor.getName(), totalSalary));
                    break;
                case 2:
                    System.out.println(language.ENTER_STUDENT_ID);
                    String matricula = scanner.nextLine();
                    System.out.println(language.ENTER_STUDENT_NAME);
                    String nomAlumno = scanner.nextLine();
                    System.out.println(language.ENTER_STUDENT_AGE);
                    int edadAlumno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(language.ENTER_STUDENT_COURSE);
                    showCourses(courseManager);
                    String cursoAlumno = scanner.nextLine();
                    Course curso = courseManager.getCourseById(cursoAlumno);
                    if (curso != null) {
                        List<Subject> materiasAlumno = curso.getSubjects();
                        studentManager.addStudent(matricula, nomAlumno, edadAlumno, curso, materiasAlumno);
                        System.out.println(language.STUDENT_REGISTER_SUCCESS);
                    } else {
                        System.out.println(language.COURSE_DOES_NOT_EXIST);
                    }
                    break;
                case 3:
                    if(subjectManager.getSubjects().size() >= 3){
                        System.out.print(language.ENTER_COURSE_ID);
                        String idCurso = scanner.nextLine();
                        showSubjects(subjectManager);
                        ArrayList<Subject> subjects = new ArrayList<>();
                        
                        for (int i = 1; i <= 3; i++) {
                            System.out.print(language.ENTER_SUBJECT_FOR_COURSE + i + ": ");
                            String subjectName = scanner.nextLine();
                            String normalizedSubjectName = normalizeString(subjectName);

                            while (subjects.contains(subjectManager.getSubjectByName(normalizedSubjectName)) ||
                                   subjectManager.subjectValidator(normalizedSubjectName)) {
                                System.out.println(language.SUBJECT_ALREADY_SELECTED_OR_NOT_EXIST);
                                System.out.print(language.ENTER_SUBJECT_FOR_COURSE + i + ": ");
                                subjectName = scanner.nextLine();
                                normalizedSubjectName = normalizeString(subjectName);
                            }
                            subjects.add(subjectManager.getSubjectByName(normalizedSubjectName));
                        }
                        courseManager.addCourse(idCurso, subjects, null);
                        System.out.println(language.COURSE_ADDED_SUCCESS);
                    }
                    else{
                        System.out.println(language.NOT_ENOUGH_SUBJECTS);
                    }
                    break;
                case 4:
                    System.out.println(language.ENTER_SUBJECT_NAME);
                    String nameSubject = scanner.nextLine();
                    System.out.println(language.ENTER_SUBJECT_CREDITS);
                    int numCredits = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(language.ENTER_SUBJECT_HOURS);
                    int numHours = scanner.nextInt();
                    scanner.nextLine();

                    subjectManager.addSubject(nameSubject, numHours, numCredits, null);
                    break;
                case 5:
                    showCourses(courseManager);
                    break;
                case 6:
                    showSubjects(subjectManager);
                    break;
                case 7:
                    if (professors.isEmpty()) {
                        System.out.println(language.NO_PROFESSORS);
                    } else {
                        for (Professor p : professors) {
                            double salary = ProfessorManager.calculateSalary(p);
                            System.out.println(String.format(language.PROFESSOR_DETAILS, 
                                    p.getName(), p.getHourlySalary(), p.getSubjects(), salary));
                        }
                    }
                    break;
                case 8:
                    System.out.println(language.LANGUAGE_SELECTION_PROMPT);
                    int langChoice = scanner.nextInt();
                    scanner.nextLine();
                    if(langChoice == 1) {
                        language = new Es();
                    } else if(langChoice == 2) {
                        language = new En();
                    } else {
                        System.out.println(language.INVALID_OPTION);
                    }
                    break;
                case 9:
                    System.out.println(language.MENU_OPC9);
                    break;
                default:
                    System.out.println(language.INVALID_OPTION);
                    break;
            }
        }
    }
}