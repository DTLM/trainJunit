package treinoJunit.main.modal;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private Double qtdDinheiro;
	private LocalDate dataNascimento;
	private String cpf;
	
	public Cliente(String nome, Double dinheiro, LocalDate dataNascimento, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.qtdDinheiro = dinheiro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getQtdDinheiro() {
		return qtdDinheiro;
	}
	public void setQtdDinheiro(Double qtdDinheiro) {
		this.qtdDinheiro = qtdDinheiro;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer calcularIdade(LocalDate agora) {
		Integer idade = 0;
		return idade;
	}
}
