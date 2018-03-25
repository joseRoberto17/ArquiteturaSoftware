package br.usjt.sdesk.model.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.sdesk.model.dao.ChamadoDAO;
import br.usjt.sdesk.model.entity.Chamado;
import br.usjt.sdesk.model.entity.Fila;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
@Service
public class ChamadoService {
	ChamadoDAO dao;
	
	@Autowired
	public ChamadoService(ChamadoDAO dao){
		this.dao = dao;
	}
	
	public void novoChamado(Chamado chamado) throws IOException{
		chamado.setDataAbertura(new Date());
		chamado.setDataFechamento(null);
		chamado.setStatus(Chamado.ABERTO);
		
		dao.inserirChamado(chamado);
	}
	
	public List<Chamado> listarChamadosAbertos(Fila fila) throws IOException{
		return dao.listarChamadosAbertos();
	}
	
	public List<Chamado> listarChamados(Fila fila) throws IOException{
		return dao.listarChamados();
	}

	public void fecharChamados(Chamado chamado) throws IOException {
		dao.fecharChamados(chamado);
	}

}
