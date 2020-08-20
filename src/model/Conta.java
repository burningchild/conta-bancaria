package model;

abstract class Conta {
	private int id;
	private String nome;
	private int agencia;
	private int conta;
	private int saldo;
	private int dataDeCriação;
	private int dataUltimaMovimentação; 
	public Conta(int id, String nome, int agencia, int conta, int saldo, int dataDeCriação, int dataUltimaMovimentação) {
		super();
		this.id = id;
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.dataDeCriação = dataDeCriação;
		this.dataUltimaMovimentação = dataUltimaMovimentação;
	}
	public int getDataUltimaMovimentação() {
		return dataUltimaMovimentação;
	}
	public void setDataUltimaMovimentação(int dataUltimaMovimentação) {
		this.dataUltimaMovimentação = dataUltimaMovimentação;
	}
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
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getDataDeCriação() {
		return dataDeCriação;
	}
	public void setDataDeCriação(int dataDeCriação) {
		this.dataDeCriação = dataDeCriação;
	}
	
	
}
