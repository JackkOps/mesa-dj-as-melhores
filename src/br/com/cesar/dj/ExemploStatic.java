package br.com.cesar.dj;

public class ExemploStatic {
    private double valor;
    private static String rotulo;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void setRotulo(String rot){
        rotulo = rot;
    } 
    public static String getRotulo(){
        return rotulo;
    }
}