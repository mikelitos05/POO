package edu.poo.actividad4.ui;

import edu.poo.actividad4.models.Professor;
import edu.poo.actividad4.process.ProfessorManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {

    static Language language = new Language();

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

                    System.out.print("Ingrese el salario por hora: ");
                    double hourlySalary = scanner.nextDouble();

                    System.out.println("Ingrese el numero de materias que tendra el profesor: ");
                    int amountOfSubjects = scanner.nextInt();

                    // Create Professor object
                    Professor professor = new Professor(name, hourlySalary, amountOfSubjects);

                    // Calculate salary
                    double totalSalary = ProfessorManager.calculateSalary(professor);

                    // Display result
                    System.out.println("El salario total del profesor " + professor.getName() + " es: " + totalSalary);

                    scanner.nextLine(); // Consume the newline left by nextInt()
                    break;





            }


        }

        runApp();
     
        

    }



//lista de materias, salario predefinido para lala
}
