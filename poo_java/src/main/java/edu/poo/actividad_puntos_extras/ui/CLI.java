package edu.poo.actividad_puntos_extras.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.poo.actividad_puntos_extras.process.Division;
import edu.poo.actividad_puntos_extras.process.DivisionModulo;
import edu.poo.actividad_puntos_extras.process.Logaritmo;
import edu.poo.actividad_puntos_extras.process.ModuloLogaritmo;
import edu.poo.actividad_puntos_extras.process.ModuloRaiz;
import edu.poo.actividad_puntos_extras.process.Multiplicacion;
import edu.poo.actividad_puntos_extras.process.Potencia;
import edu.poo.actividad_puntos_extras.process.Raiz;
import edu.poo.actividad_puntos_extras.process.Resta;
import edu.poo.actividad_puntos_extras.process.Suma;



public class CLI {


    /**
     * Metodo que se encargara de mostrar el menu
     */
    public static void mostrarMenu(){
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz");
        System.out.println("7. Logaritmo");
        System.out.println("8. Salir");

    }

    /**
     * Metodo que se encarga de validar que el usuario ingrese un numero
     * @param scanner va a ser el scanner que se va a utilizar para leer el numero
     * @param mensaje Va a ser el mensaje que se le va a dar al usuario antes de que ingrese el numero
     * @return
     */
     private static int leerNumero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); 
            }
        }
        return numero;
    }


    /**
     * Metodo que se encargara de correr la aplicacion
     */
    public static void correrAplicacion(){
        Scanner scanner = new Scanner(System.in);

        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();
        DivisionModulo divisionModulo = new DivisionModulo();
        Potencia potencia = new Potencia();
        Logaritmo logaritmo = new Logaritmo();
        Raiz raiz = new Raiz();
        ModuloRaiz moduloRaiz = new ModuloRaiz();
        ModuloLogaritmo moduloLogaritmo = new ModuloLogaritmo();


        int opcion = 0;


        while (opcion != 8){
            mostrarMenu();
            try{
                opcion = scanner.nextInt();
                scanner.nextLine();
            }catch(Exception e){
                opcion = 0;
                scanner.nextLine();
            }
            int num1 = 0;
            int num2 = 0;

            switch(opcion){
                case 1:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println(num1 +" + "+ num2 + " = " + suma.apply(num1, num2));
                break;
                case 2:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println(num1 +" - "+ num2 + " = " + resta.apply(num1, num2));
                break;
                case 3:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println(num1 +" \u00D7 "+ num2 + " = " + multiplicacion.apply(num1, num2));
                break;
                case 4:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    try {
                        System.out.println(num1 +" / "+ num2 + " = " + division.apply(num1, num2) + "\nModulo: " + divisionModulo.apply(num1, num2));   
                    } catch (ArithmeticException e) {
                        System.out.println(e.getLocalizedMessage());
                    }
                break;
                case 5:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println(num1 +" elevado a "+ num2 + " es igual a: " + potencia.apply(num1, num2));
                break;
                case 6:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println("La raiz de "+ num2 + " con radicando de " + num1 + " = " + raiz.apply(num1, num2) + "\nEl modulo de la raiz es: " + moduloRaiz.apply(num1, num2));
                break;
                case 7:
                    num1 = leerNumero(scanner, "Ingrese el primer numero: ");
                    num2 = leerNumero(scanner, "Ingrese el segundo numero: ");
                    System.out.println("Log(" + num1 + ")" + num2 + " = " + logaritmo.apply(num1, num2)+"\nEl modulo de el logaritmo es: "+ moduloLogaritmo.apply(num1, num2));

                break;
                default:
                    System.out.println("Ingrese una opcion valida: ");
                break;

            }


        }

        
        




    }


}
