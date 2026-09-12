package br.com.cesar.dj;

public class Instrumento implements Runnable {
    private String nome;
    private String som;
    private int bpm;
    private EstadoFaixa estado;
    private Thread thread;

    public Instrumento(String nome, String som, int bpm) {
        this.nome = nome;
        this.bpm = bpm;
        this.som = som;
        this.estado = EstadoFaixa.PARADO;
        
    }

    public void iniciar() {
        this.estado = EstadoFaixa.TOCANDO;

    }

    public void run() {
        while(estado == EstadoFaixa.TOCANDO) {
            try {
                Thread novaThread = new Thread();
                System.out.println(nome + som);
                Thread.sleep(1000);
                novaThread.sleep(1000);
            } catch(InterruptedException e) {
                estado = EstadoFaixa.PARADO;
                System.out.println("A thread foi interrompida");
            }
        };

    }
}
