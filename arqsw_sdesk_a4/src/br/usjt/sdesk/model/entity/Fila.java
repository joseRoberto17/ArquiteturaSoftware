package br.usjt.sdesk.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
@Entity
@Table(name="fila")

public class Fila {
	
	@Id
	@NotNull
	@Column(name="id_fila")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
