package br.com.model;

import java.io.Serializable;

public class AtributoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7447664956757734430L;

	private String nome;

	private String colunaNome;

	private String colunaValor;

	private String valores;
	
	private int payment;

	public AtributoDTO(String nome, String valores, String colunaNome, String colunaValor){
		this.nome = nome;
		this.valores = valores;
		this.colunaNome = colunaNome;
		this.colunaValor = colunaValor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColunaNome() {
		return colunaNome;
	}

	public void setColunaNome(String colunaNome) {
		this.colunaNome = colunaNome;
	}

	public String getColunaValor() {
		return colunaValor;
	}

	public void setColunaValor(String colunaValor) {
		this.colunaValor = colunaValor;
	}

	public String getValores() {
		return valores;
	}

	public void setValores(String valores) {
		this.valores = valores;
	}

	
	
}
