package edu.poo.actividad4.ui;

import edu.poo.actividad4.models.Professor;
import edu.poo.actividad4.process.ProfessorManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
    
    }


    public static void runApp(){
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
            }

            switch(opcMenu){
                case 1:
                    System.out.println("Ingrese el nombre del profesor: ");
                    String name = scanner.nextLine();

                    System.out.println("Ingrese el numero de materias que tendra el profesor: ");
                    int amountOfSubjects = scanner.nextInt();

                    double hourlySalary = 10;
                    Professor professor = new Professor(name, hourlySalary, amountOfSubjects);

                    professors.add(professor);
                    double totalSalary = ProfessorManager.calculateSalary(professor);

                    System.out.println("El salario total del profesor " + professor.getName() + " es: " + totalSalary + "\n\n\n");

                    scanner.nextLine();
                    break;
                case 6:
                for(Professor p : professors){
                    System.out.println("Nombre: " + p.getName() + ", Salario por hora: " + p.getHourlySalary() + ", Numero de materias: " + p.getSubjects() + ", Salario semanal: " + ProfessorManager.calculateSalary(p));
                }
                break;



            }
        }
    }
}
