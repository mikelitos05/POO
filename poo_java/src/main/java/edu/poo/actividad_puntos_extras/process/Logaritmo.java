package edu.poo.actividad_puntos_extras.process;

public class Logaritmo extends Division {


    /**
     * Metodo que se encarga de sacar el logaritmo
     */
    @Override
    public int apply(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException ("");
        }
        if(b <= 1){
            throw new IllegalArgumentException("La base debe de ser mayor que 1");
        }
        int resultado = 0;
        int num = a;
        while (num >= b) {
            num = super.apply(num, b); 
            resultado++; 
        }
        
        return resultado; 
    }





}
