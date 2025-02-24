package edu.poo.actividad_puntos_extras.process;

public class Raiz extends Multiplicacion {

    @Override
    public int apply(int a, int b) {
        int resultado = 0;
        int contador = 1;
        while (resultado != b && resultado < b) {
            if (contador < b) {
                contador++;
            }
            resultado = super.apply(contador, contador);
        }
        return contador;
    }

}
