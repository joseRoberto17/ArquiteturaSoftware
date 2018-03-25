package br.usjt.sdesk.model.dao;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.usjt.sdesk.model.entity.Chamado;
import br.usjt.sdesk.model.entity.Fila;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
@Repository
public class ChamadoDAO {
	EntityManager manager;
	
	@Autowired
	public ChamadoDAO(EntityManager manager) throws IOException{
		this.manager = manager;
	}
	
	public void inserirChamado(Chamado chamado) throws IOException {
		manager.persist(chamado);
	}
	
	public Chamado selecionar(int id){
		return manager.find(Chamado.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Chamado> listarChamadosAbertos() throws IOException{
		
		
		String query = "select c.id_chamado, c.descricao, c.dt_abertura, f.nm_fila "+
				"from chamado c, fila f where c.id_fila = f.id_fila and c.id_fila=? "+
				"and c.dt_fechamento is null";
		return manager.createQuery(query).getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Chamado> listarChamados(){
		
		String query = "select c.id_chamado, c.descricao, c.dt_abertura, f.nm_fila, "+
				"c.dt_fechamento, c.status "+ 
				"from chamado c, fila f where c.id_fila = f.id_fila and c.id_fila=?";
	return manager.createQuery(query).getResultList();	
	}

	public void fecharChamados(Chamado chamado) throws IOException{
		manager.remove(chamado);			
	}


}
