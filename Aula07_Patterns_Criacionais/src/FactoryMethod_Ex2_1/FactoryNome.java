package FactoryMethod_Ex2_1;
/**
 * 
 * @author Jos� Roberto Xavier da Silva
 * 			816113694
 *
 */
public class FactoryNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
