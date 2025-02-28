package edu.poo.actividad_puntos_extras.process;

public class DivisionModulo extends Resta {

    /**
     * Metodo que se encarga de sacar el modulo de la division
     */
    @Override
    public int apply(int b, int a){
        int resultado = b;
        while(true){
            if(super.apply(resultado,a) < 0){
                return resultado;
            }

            resultado = super.apply(resultado,a);
            
            if (resultado == 0){
                return resultado;
            }
            
        }

    } 

}
