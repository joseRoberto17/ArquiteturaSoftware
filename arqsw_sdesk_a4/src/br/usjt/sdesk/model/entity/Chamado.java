package br.usjt.sdesk.model.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author Jos� Roberto Xavier da Silva
 * 			816113694
 *
 */
@Entity
@Table(name="chamdo")
public class Chamado {
	
	@Id
	@Column(name="id_chamado")	
	private int numero;
	
	@Column(name="dt_abertura")
	private Date dataAbertura; 
	
	@Column(name="dt_fechamento")
	private Date dataFechamento;
	
	@Column(name="status")
	private String status;
	
	@Column(name="descricao")
	@NotNull 
	@Size(max=100,min=10, message="Deve estar entre 10 e 100 caracteres")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id")
	@NotNull
	private Fila fila;
	
	public static final String ABERTO = "aberto";
	public static final String FECHADO = "fechado";
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getTempoDias(){
		//getTime e currentTimeMillis retornam o tempo em milisegundos
		//dividir por 1000 * 60 * 60 * 24 converte para dias
		int dias;
		if(dataFechamento == null){
			
			dias =  (int)(System.currentTimeMillis() - dataAbertura.getTime())/(1000 * 60 * 60 * 24);
		} else {
			
			dias = (int)(dataFechamento.getTime() - dataAbertura.getTime())/(1000 * 60 * 60 * 24);
		}
		return dias;
	}
	
	@Override
	public String toString() {
		return "Chamado [numero=" + numero + ", dataAbertura=" + dataAbertura
				+ ", dataFechamento=" + dataFechamento + ", status=" + status
				+ ", descricao=" + descricao + ", fila=" + fila + "]";
	}


}
