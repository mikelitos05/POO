package edu.poo.actividad_puntos_extras.process;

public class Raiz extends Multiplicacion {

    /**
     * Metodo que se encarga de calcular la raiz
     */
    @Override
    public int apply(int a, int b) {
        int resultado = 0;
        int contador = 0;
        while (resultado <= b) {
            if (contador < b) {
                contador++;
            }
            resultado = super.apply(contador, contador);
        }
        return contador - 1;
    }

}
