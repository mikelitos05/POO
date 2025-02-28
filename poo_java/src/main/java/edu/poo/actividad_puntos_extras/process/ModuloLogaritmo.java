package edu.poo.actividad_puntos_extras.process;

public class ModuloLogaritmo extends Division{


/**
 * Metodo que se encarga de sacar el modulo del logaritmo
 */
    @Override
    public int apply(int a, int b) {
       
        int result = a;
        while (result >= b) {
            result = super.apply(result, b);
        }
        return result;

        


        }
    }



    



