package edu.poo.actividad_puntos_extras.process;

public class DivisionModulo extends Resta {


    public int dividirModulo(int a, int b){
        int resultado = 0;
        for (resultado = 0; resultado <= b; resultado = resultado + a)
        if (resultado == b){
            return 0;
        }
        return restar(resultado,b);
        

    } 

}
