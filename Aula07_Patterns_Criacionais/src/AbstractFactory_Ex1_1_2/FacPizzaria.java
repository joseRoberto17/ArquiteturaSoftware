package AbstractFactory_Ex1_1_2;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class FacPizzaria implements FactoryPizzaria{
	String m;
	
	@Override
	public String funcionarioP() {
		
		return  m = "**********************************\nIngredientes:\n -- queijo\n -- calabresa\n -- tomate\n **********************************";
	}
	
	@Override
	public String funcionarioS() {
		
		return  m = "**********************************\nIngredientes:\n -- queijo\n -- presunto\n -- tomate\n **********************************";
	}

}
