package edu.poo.actividad_puntos_extras.process;

public class ModuloRaiz extends Multiplicacion{


    /**
     * Metodo que se encarga de sacar el modulo de la raiz
     */
    @Override
    public int apply(int a, int b) {
        
        //b = 5

        int potencia = 1;
        int potenciasig = 2;
        while(true){
            //resultado = 4
            int resultado = super.apply(potencia, potencia);

            if(resultado == b){
                return 0;
            }


            if (super.apply(potenciasig,potenciasig)  > b){
                resultado = b- resultado;
                return resultado;
            }
            potencia++;
            potenciasig++;
            
        }

    }








}
