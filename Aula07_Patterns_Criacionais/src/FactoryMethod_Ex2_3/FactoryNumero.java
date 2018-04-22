package FactoryMethod_Ex2_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JOptionPane;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class FactoryNumero {
	
	public String contar(){
		String j = "";
		for(int i = 0; i <= 10; i++){
			j += i + " ";
		}
		
		return j;
	}
	
	public void mostrar(String men){
		if(men.equals("console")){
			System.out.print(contar());
		}
		
		else if(men.equals("log")){
			try {
			      PrintStream out = new PrintStream(new FileOutputStream(
			          "log.txt"));
			 
			        out.println(" Este arquivo é um log\n**** " + contar());

			      out.close();

			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			    }
			System.out.printf("Sucesso");
		}
		else{
			JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
		}
		
	}

}
