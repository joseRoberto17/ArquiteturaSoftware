package FactoryMethod_Ex2_2;

import javax.swing.JOptionPane;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class TesteTexto {

	public static void main(String[] args) {
		FactoryTexto ft = new FactoryTexto();
		
		String men, texto;
		
		texto = JOptionPane.showInputDialog(null, "Digite a informação");
		ft.getTexto(texto);
		
		men = JOptionPane.showInputDialog(null, "Digite a senha para criar o arquivo\n***Obs: publico ou confidencial");
		
		if(men.equals("publico")){
			
			ft.publico(texto);
			JOptionPane.showMessageDialog(null, "Arquivo Criado com Sucesso"); 
		}
		else if(men.equals("desi gnpatt er ns")){
			ft.confidencial(texto);
			JOptionPane.showMessageDialog(null, "Arquivo Criado com Sucesso"); 
		}
		else{
			JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
		}
		
		System.exit(0);
	}
	

}
