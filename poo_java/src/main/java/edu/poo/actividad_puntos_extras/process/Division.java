package edu.poo.actividad_puntos_extras.process;

public class Division extends Resta {

    @Override
    public int apply(int a, int b){
        int iter = a;
        int resultado = -1;
        for (resultado = -1; iter >= 0; resultado++){
            iter = super.apply(iter, b);
        }
        return resultado;

    }
    
    

}
