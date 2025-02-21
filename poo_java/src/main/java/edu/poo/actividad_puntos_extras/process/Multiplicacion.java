package edu.poo.actividad_puntos_extras.process;

public class Multiplicacion extends Suma {

    

    public int multplicar(int a, int b) {
        if (a >= 0){
            int resultado = 0;
            for (int i = 0; i < a; i = sumar(i,1)){
                resultado = sumar(resultado,b);
            }
            return resultado;
        }else{
            int resultado = 0;
            for (int i = a; i < 0; i = sumar(i,1)){
                resultado = sumar(resultado,b);
            }
            return resultado;
        }
    }

}
