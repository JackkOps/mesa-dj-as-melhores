package br.com.cesar.dj;

public class Exemplo {
    public static void main(String[] args) {
        ExemploStatic ex1 = new ExemploStatic();
        ExemploStatic ex2 = new ExemploStatic();

        ex1.setValor(100.00);
        ex2.setValor(50.00);

        System.out.println("Ex1 valor: " +ex1.getValor());
        System.out.println("Ex2 valor: " +ex2.getValor());

        ex1.setRotulo("Abacate");
        ex2.setRotulo("Laranja");

        System.out.println("Ex1 rotulo: " +ex1.getRotulo());
        System.out.println("Ex2 rotulo: " +ex2.getRotulo());
    }
}