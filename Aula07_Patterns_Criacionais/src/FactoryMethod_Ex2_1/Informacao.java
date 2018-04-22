package FactoryMethod_Ex2_1;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class Informacao extends Nome{
	
	public Informacao(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println(nome + " " + sobrenome + "\n" + sobrenome + ", " + nome);
	}
	
}
