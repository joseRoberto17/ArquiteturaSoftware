package br.usjt.arqsw.entity;

public class Chamado {
/**
 * 
 * @author José Roberto Xavier da Silva
 * 		   816113694
 *         Si3AN-MCA2
 *         ArqSw
 */

	private int id;
	private String descricao;	
	private String status;
	private String dtFechamento;
	private String dtAbertura;
	private int idFila;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public int getIdFila() {
		return idFila;
	}
	public void setIdFila(int idFila) {
		this.idFila = idFila;
	}
	@Override
	public String toString() {
		return "Chamado [id=" + id + ", descricao=" + descricao + ", status=" + status + ", dtFechamento="
				+ dtFechamento + ", dtAbertura=" + dtAbertura + ", idFila=" + idFila + "]";
	}
	
	
	
}
