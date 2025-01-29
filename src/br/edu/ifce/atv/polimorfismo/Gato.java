package br.edu.ifce.atv.polimorfismo;

public class Gato extends Animal {
	private String cor;

 
    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

   
    public void miar() {
        System.out.println("Miau");
    }

    public void miar(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Miau");
        }
    }

    public void miar(String intensidade) {
        System.out.println("Miau (" + intensidade + ")");
    }

    
    
    @Override
    public void fazerBarulho() {
        System.out.println("O gato mia: Miau!");
    }
}


