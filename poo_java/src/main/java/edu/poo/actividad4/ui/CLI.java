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

    static Language language = new Language();
    static List<Professor> professors = new ArrayList<>();

    /**
     * Metodo que se encarga de mostrar el menu
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
     * Metodo que se encarga de mostrar las materias
     */
    public static void showSubjects(SubjectManager subjectManager){
        System.out.println("Materias: ");
        for(int i = 0; i < subjectManager.getSubjects().size(); i++){
            System.out.println("==========================================================================================");
            System.out.println("Nombre de la materia: " + subjectManager.getSubjects().get(i).getName());
            System.out.println("Numero de creditos de la materia: " + subjectManager.getSubjects().get(i).getCredits());
            System.out.println("Numero de horas de la materia: " + subjectManager.getSubjects().get(i).getHours());
            System.out.println("Numero de alumnos inscritos en la materia: " + subjectManager.getSubjects().get(i).getStudents().size());
            System.out.println("==========================================================================================");
        }
    }

    /**
     * Metodo que se encarga de mostrar los cursos
     */
    public static void showCourses(CourseManager courseManager){
        int creditos = 0;
        System.out.println("Cursos: ");
        
        for(int i = 0; i < courseManager.getCourses().size(); i++){
            System.out.println("==========================================================================================");
            System.out.println("ID del curso: " + courseManager.getCourses().get(i).getIdCourse());
            System.out.println("Materias del curso: ");
            for(int j = 0; j < courseManager.getCourses().get(i).getSubjects().size(); j++){
                System.out.println("Nombre de la materia: " + courseManager.getCourses().get(i).getSubjects().get(j).getName());
                System.out.println("Numero de creditos de la materia: " + courseManager.getCourses().get(i).getSubjects().get(j).getCredits());
                creditos += courseManager.getCourses().get(i).getSubjects().get(j).getCredits();
                System.out.println("Numero de horas de la materia: " + courseManager.getCourses().get(i).getSubjects().get(j).getHours());
            }
            System.out.println("==========================================================================================");
            System.out.println("Numero de creditos totales del curso: " + creditos);
            System.out.println("==========================================================================================");
        }
    }



    public static String normalizeString(String input) {
        return input.toLowerCase();
    }

    /**
     * Metodo que se encarga de correr la aplicacion
     */
    public static void runApp(){
        SubjectManager subjectManager = new SubjectManager();
        CourseManager courseManager = new CourseManager();
        StudentManager studentManager = new StudentManager();
        subjectManager.preloadSubjects();
        courseManager.preloadCourses();

        language = new Es();
        Scanner scanner = new Scanner(System.in);



        int opcMenu = 0;
        while(opcMenu != 8){
            showMenu();
            try{
                opcMenu = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.out.println(language.INVALID_OPTION);
                scanner.nextLine();
            }

            switch(opcMenu){
                case 1:
                    System.out.println("Ingrese el nombre del profesor: ");
                    String name = scanner.nextLine();

                    double hourlySalary = 10;

                    System.out.println("Ingrese el numero de materias que tendra el profesor: ");
                    int amountOfSubjects = scanner.nextInt();

                    // Create Professor object
                    Professor professor = new Professor(name, hourlySalary, amountOfSubjects);

                    // Calculate salary
                    double totalSalary = ProfessorManager.calculateSalary(professor);

                    // Add professor to the list
                    professors.add(professor);

                    // Display result
                    System.out.println("El salario total del profesor " + professor.getName() + " es: " + totalSalary);

                    scanner.nextLine(); 
                    break;
                case 2:
                    System.out.println("Ingrese la matricula del alumno: ");
                    String matricula = scanner.nextLine();
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nomAlumno = scanner.nextLine();
                    System.out.println("Ingrese la edad del alumno: ");
                    int edadAlumno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre curso del alumno: ");
                    showCourses(courseManager);
                    String cursoAlumno = scanner.nextLine();
                    Course curso = courseManager.getCourseById(cursoAlumno);
                    if (curso != null) {
                        List<Subject> materiasAlumno = curso.getSubjects();
                        studentManager.addStudent(matricula, nomAlumno, edadAlumno, curso, materiasAlumno);
                        System.out.println("Alumno registrado exitosamente.");
                    } else {
                        System.out.println("El curso no existe.");
                    }
                    break;
                case 3:
                    if(subjectManager.getSubjects().size() >= 3){
                        System.out.print("\nIngrese la clave del curso: ");
                        String idCurso = scanner.nextLine();
                        showSubjects(subjectManager);
                        ArrayList<Subject> subjects = new ArrayList<>();
                        
                        for (int i = 1; i <= 3; i++) {
                            System.out.print("Ingrese el nombre de la materia " + i + ": ");
                            String subjectName = scanner.nextLine();
                            String normalizedSubjectName = normalizeString(subjectName);

                            while (subjects.contains(normalizedSubjectName) || subjectManager.subjectValidator(normalizedSubjectName)) {
                                System.out.println("La materia ya ha sido seleccionada o no existe. Por favor, elija otra materia.");
                                System.out.print("Ingrese el nombre de la materia " + i + ": ");
                                subjectName = scanner.nextLine();
                                normalizedSubjectName = normalizeString(subjectName);

                            }
                            subjects.add(subjectManager.getSubjectByName(normalizedSubjectName));
                        }
                        courseManager.addCourse(idCurso, subjects,null);
                        System.out.println("Curso agregado exitosamente.");
                    }
                    else{
                        System.out.println("Hay menos de 3 materias registradas");
                    }



                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la materia: ");
                    String nameSubject = scanner.nextLine();
                    System.out.println("Ingrese el numero de creditos de la materia: ");
                    int numCredits = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el numero de horas de la materia: ");
                    int numHours = scanner.nextInt();
                    scanner.nextLine();

                    subjectManager.addSubject(nameSubject, numHours, numCredits,null);

                    break;
                case 5:
                    showCourses(courseManager);
                    break;
                case 6:
                    showSubjects(subjectManager);
                break;
                case 7:
                    if (professors.isEmpty()) {
                        System.out.println("No hay profesores registrados.");
                    } else {
                        for (Professor p : professors) {
                            double salary = ProfessorManager.calculateSalary(p);
                            System.out.println("Nombre: " + p.getName() + ", Salario por hora: " + p.getHourlySalary() + ", Numero de materias: " + p.getSubjects() + ", Salario semanal: " + salary);
                        }
                    }
                    break;

                default:
                    System.out.println(language.INVALID_OPTION);
                    break;


            }


        }





    }



}