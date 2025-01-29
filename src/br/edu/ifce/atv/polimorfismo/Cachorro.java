package br.edu.ifce.atv.polimorfismo;

public class Cachorro extends Animal{ 
	
private String raca;


public Cachorro(String nome, int idade, String raca) {
    super(nome, idade);
    this.raca = raca;
}


public String getRaca() {
    return raca;
}

public void setRaca(String raca) {
    this.raca = raca;
}




public void latir() {
    System.out.println("Au Au!");
}

public void latir(int vezes) {
    for (int i = 0; i < vezes; i++) {
        System.out.println("Au Au!");
    }
}

public void latir(String intensidade) {
    System.out.println("Au Au! (" + intensidade + ")");
}


@Override
public void fazerBarulho() {
    System.out.println("O cachorro late: Au Au!");
}
}
	


