package br.usjt.sdesk.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	public static final String LOGADO = "logado";
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String nome;
	
	@Column(name="senha")
	private String senha;
	
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", senha=" + senha + "]";
	}
}
