package model;

abstract class Conta {
	private int id;
	private String nome;
	private int agencia;
	private int conta;
	private int saldo;
	private int dataDeCria��o;
	private int dataUltimaMovimenta��o; 
	public Conta(int id, String nome, int agencia, int conta, int saldo, int dataDeCria��o, int dataUltimaMovimenta��o) {
		super();
		this.id = id;
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.dataDeCria��o = dataDeCria��o;
		this.dataUltimaMovimenta��o = dataUltimaMovimenta��o;
	}
	public int getDataUltimaMovimenta��o() {
		return dataUltimaMovimenta��o;
	}
	public void setDataUltimaMovimenta��o(int dataUltimaMovimenta��o) {
		this.dataUltimaMovimenta��o = dataUltimaMovimenta��o;
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
	public int getDataDeCria��o() {
		return dataDeCria��o;
	}
	public void setDataDeCria��o(int dataDeCria��o) {
		this.dataDeCria��o = dataDeCria��o;
	}
	
	
}
