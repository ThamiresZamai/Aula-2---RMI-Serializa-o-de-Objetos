package comum;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private int idade;
	private String telefone;
	private String cidade;
	private String endereco;
	private String estado;
	private double salario;
	private String nomeMae;
	private String nomePai;
	private PessoaJuridica pj;
	private PessoaFisica pf;
	
	
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public PessoaJuridica getPj() {
		return pj;
	}
	public void setPj(PessoaJuridica pj) {
		this.pj = pj;
	}
	public PessoaFisica getPf() {
		return pf;
	}
	public void setPf(PessoaFisica pf) {
		this.pf = pf;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
