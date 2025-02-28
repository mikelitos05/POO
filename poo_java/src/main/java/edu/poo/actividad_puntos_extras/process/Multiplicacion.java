package edu.poo.actividad_puntos_extras.process;

public class Multiplicacion extends Suma {

    /**
     * Metodo que se encarga de multiplicar
     */
    
    @Override
    public int apply(int a, int b) {
        if (a >= 0){
            int resultado = 0;
            for (int i = 0; i < a; i = super.apply(i,1)){
                resultado = super.apply(resultado,b);
            }
            return resultado;
        }else{
            int resultado = 0;
            for (int i = a; i < 0; i = super.apply(i,1)){
                resultado = super.apply(resultado,b);
            }
            return resultado;
        }
    }

}
