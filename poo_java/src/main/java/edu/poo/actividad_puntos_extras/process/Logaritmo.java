package edu.poo.actividad_puntos_extras.process;

public class Logaritmo extends Division {

    @Override
    public int apply(int a, int b) {
    

        int resultado = 0;
        for(int i = b; i > 1;i = super.apply(i,a)){
            resultado ++;
        }
        return resultado;
    }





}
