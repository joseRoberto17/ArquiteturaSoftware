package FactoryMethod_Ex2_2;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class Info extends Texto{
	
	public Info(){
		
	}
	public Info(String texto){
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
}
