package edu.poo.actividad_puntos_extras.process;

public class Division extends Resta {


    public int dividir(int a, int b){
        int iter = a;
        int resultado = -1;
        for (resultado = -1; iter >= 0; resultado++){
            iter = restar(iter, b);
        }
        return resultado;

    }
    
    

}
