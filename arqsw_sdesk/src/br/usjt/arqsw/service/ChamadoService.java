package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.dao.ChamadoDAO;

/**
 * 
 * @author José Roberto Xavier da Silva
 * 		   816113694
 *         Si3AN-MCA2
 *         ArqSw
 */

public class ChamadoService {
	 private ChamadoDAO dao;
	
	public ChamadoService() {
		dao = new ChamadoDAO();
	}
	
	public int criar(Chamado c) throws IOException {
		return dao.criar(c);
	}
	
	
	public ArrayList<Chamado> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	public Chamado carregar(int id) throws IOException{
		
		Chamado ch = new Chamado();
		ch.getId();
		ch.getDescricao();
		ch.getDtAbertura();
		ch.getDtFechamento();
		ch.getIdFila();
		ch.getStatus();
		
		return ch;
	}
	
	
}




