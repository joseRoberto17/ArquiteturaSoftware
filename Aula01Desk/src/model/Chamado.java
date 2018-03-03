package model;

public class Chamado {
	
	int idChamado;
	String descricao;
	Fila fila;
	
	public Chamado(int idChamado, String descricao, Fila fila) {
		this.idChamado = idChamado;
		this.descricao = descricao;
		this.fila = fila;
	}

	public int getIdChamado() {
		return idChamado;
	}

	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	

}
