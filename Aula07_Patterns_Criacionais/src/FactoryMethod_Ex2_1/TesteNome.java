package FactoryMethod_Ex2_1;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class TesteNome {

	public static void main(String[] args) {
		FactoryNome fn = new FactoryNome();
		
		String nome = "José";
		String sobrenome = "Roberto";
		
		fn.getNome(nome, sobrenome);

	}

}
