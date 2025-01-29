package br.edu.ifce.atv.polimorfismo;

public class Teste { 
public static void main(String[] args) {
	

Cachorro cachorro = new Cachorro("Ton", 3, "vira-lata");
System.out.println("Cachorro: " + cachorro.getNome() + ", Idade: " + cachorro.getIdade() + ", Raça: " + cachorro.getRaca());
cachorro.fazerBarulho(); 
cachorro.latir(); 
cachorro.latir(3); 
cachorro.latir("alto"); 


Gato gato = new Gato("Flin", 2, "Laranja");
System.out.println("Gato: " + gato.getNome() + ", Idade: " + gato.getIdade() + ", Cor: " + gato.getCor());
gato.fazerBarulho(); 
gato.miar(); 
gato.miar(2); 
gato.miar("baixo"); 

}
}
