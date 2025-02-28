package edu.poo.actividad_puntos_extras.process;

public class Division extends Resta {


    /**
     * Metodo que se encarga de dividir
     */
    @Override
    public int apply(int a, int b){
        if (b == 0){
            throw new ArithmeticException("No se puede dividir entre 0: ");
        }
        int resultado = a;
        while (resultado >= b) {
            resultado = super.apply(resultado, b);
        }
        return resultado;

    }
    
    

}
