package AbstractFactory_Ex1_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class FactorySaudacao implements FactoryOla{

	@Override
	public Ola criarOla() {
		return new Ola (System.out.printf("Ola, Mundo"));
	}
	
	@Override
	public void outOla() {
	try {
	      PrintStream out = new PrintStream(new FileOutputStream(
	          "OutFile.txt"));
	 
	        out.println("Ola, Mundo");

	      out.close();

	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	
	}

}
