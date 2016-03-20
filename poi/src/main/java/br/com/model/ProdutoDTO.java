package br.com.model;

import java.io.Serializable;
import java.util.List;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = -1913355008606962090L;

	private static final String GENERO_CONSTANTE = "Gênero";

	private static final String TAMANHO = "Tamanho";

	private String id;

	private String skuSeller;

	private String nome;

	private String descricao;

	private String marca;

	private String corSabor;

	private String tamanho;

	private String departamento;

	private String tipoProduto;

	private List<AtributoDTO> atributos;

	private List<ImagemDTO> imagens;

	private String observacoes;

	private String tipoGenero;

	private String genero;

	private String eanIsbn;

	private String codigoFabricante;

	private String codigoAgrupador;

	private Double altura;

	private Double largura;

	private Double profundidade;

	private Double peso;

	private String precoDe;

	private String precoPor;

	private Long estoque;

	private String urlVideo;

	private String tipoTamanho;

	private String imagem1;

	private String imagem2;

	private String imagem3;

	private String imagem4;

	private String imagem5;

	private String imagem6;

	private List<String> urlsImagem;

	private String tipoCorSabor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkuSeller() {
		return skuSeller;
	}

	public void setSkuSeller(String skuSeller) {
		this.skuSeller = skuSeller;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCorSabor() {
		return corSabor;
	}

	public void setCorSabor(String corSabor) {
		this.corSabor = corSabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public List<AtributoDTO> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<AtributoDTO> atributos) {
		this.atributos = atributos;
	}

	public List<ImagemDTO> getImagens() {
		return imagens;
	}

	public void setImagens(List<ImagemDTO> imagens) {
		this.imagens = imagens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEanIsbn() {
		return eanIsbn;
	}

	public void setEanIsbn(String eanIsbn) {
		this.eanIsbn = eanIsbn;
	}

	public String getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(String codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	public String getCodigoAgrupador() {
		return codigoAgrupador;
	}

	public void setCodigoAgrupador(String codigoAgrupador) {
		this.codigoAgrupador = codigoAgrupador;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getPrecoDe() {
		return precoDe;
	}

	public void setPrecoDe(String precoDe) {
		this.precoDe = precoDe;
	}

	public String getPrecoPor() {
		return precoPor;
	}

	public void setPrecoPor(String precoPor) {
		this.precoPor = precoPor;
	}

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getTipoTamanho() {
		return tipoTamanho;
	}

	public void setTipoTamanho(String tipoTamanho) {
		this.tipoTamanho = tipoTamanho;
	}

	public String getImagem1() {
		return imagem1;
	}

	public void setImagem1(String imagem1) {
		this.imagem1 = imagem1;
	}

	public String getImagem2() {
		return imagem2;
	}

	public void setImagem2(String imagem2) {
		this.imagem2 = imagem2;
	}

	public String getImagem3() {
		return imagem3;
	}

	public void setImagem3(String imagem3) {
		this.imagem3 = imagem3;
	}

	public String getImagem4() {
		return imagem4;
	}

	public void setImagem4(String imagem4) {
		this.imagem4 = imagem4;
	}

	public String getImagem5() {
		return imagem5;
	}

	public void setImagem5(String imagem5) {
		this.imagem5 = imagem5;
	}

	public String getImagem6() {
		return imagem6;
	}

	public void setImagem6(String imagem6) {
		this.imagem6 = imagem6;
	}

	public List<String> getUrlsImagem() {
		return urlsImagem;
	}

	public void setUrlsImagem(List<String> urlsImagem) {
		this.urlsImagem = urlsImagem;
	}

	public String getTipoCorSabor() {
		return tipoCorSabor;
	}

	public void setTipoCorSabor(String tipoCorSabor) {
		this.tipoCorSabor = tipoCorSabor;
	}

	
	
}
