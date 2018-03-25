package br.usjt.sdesk.model.dao;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.usjt.sdesk.model.entity.Fila;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
@Repository
public class FilaDAO {
	EntityManager manager;
	
	@Autowired
	public FilaDAO(EntityManager manager) throws IOException {
		this.manager = manager;
	}

	@SuppressWarnings("unchecked")
	public List<Fila> listarFilas() throws IOException {
		String query = "select id_fila, nm_fila from fila";
		
		return manager.createQuery(query).getResultList();
	}

	public Fila carregar(int id) throws IOException {
		Fila fila = new Fila();
		fila.setId(id);
		
		String query = "select nm_fila from fila where id_fila=?";

		
		return manager.find(query, id);
	}
}
