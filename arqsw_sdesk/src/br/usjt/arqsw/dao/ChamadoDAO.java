package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;

public class ChamadoDAO {
	
	/**
	 * 
	 * @author José Roberto Xavier da Silva
	 * 		   816113694
	 *         Si3AN-MCA2
	 *         ArqSw
	 */

	public int criar(Chamado c) throws IOException {

		String sqlInsert = "INSERT INTO chamado(descricao, status, dt_fechamento,dt_abertura,id_fila) "
				+ "VALUES (?, ?, ?, ?, ?)";

		Connection conn = ConnectionFactory.getConnection();

		try (PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, c.getDescricao());
			stm.setString(2, c.getStatus());
			stm.setString(3, c.getDtFechamento());
			stm.setString(4, c.getDtAbertura());
			stm.setInt(5, c.getIdFila());
			System.out.println("Cadastro " + c);
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery); ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					c.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new IOException();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new IOException();
		}
		return c.getId();
	}

	public ArrayList<Chamado> listarFilas() throws IOException {

		String query = "select c.id_fila, f.id_fila, c.descricao, c.status, c.dt_Abertura, c.dt_Fechamento "
				+ "from chamado c, fila f" + " where c.id_fila = f.id_fila;";

		ArrayList<Chamado> lista = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pst = conn.prepareStatement(query);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				Chamado fila = new Chamado();
				
				fila.setId(rs.getInt("c.id_fila"));
				fila.setIdFila(rs.getInt("f.id_fila"));
				fila.setDescricao(rs.getString("c.descricao"));
				fila.setStatus(rs.getString("c.status"));
				
				fila.setDtFechamento(rs.getString("c.dt_Fechamento"));
				
				lista.add(fila);
			
				System.out.println(" OLAAA " + lista + " \n");
			}
			
			

		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}

}
