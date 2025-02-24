package edu.poo.actividad_puntos_extras.process;

public class Potencia extends Multiplicacion{

    @Override
    public int apply(int a, int b) {
        int resultado = 1;
        for (b = b; b > 0; b--){
            resultado = super.apply(resultado, a);
        }
        return resultado;
    }


    



}
