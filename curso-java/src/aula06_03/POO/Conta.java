package aula06_03.POO;

public class Conta {
	
	private Long numero;
	private Long agencia;
	private String tipoConta;
	private double saldo;
	private Banco banco;
	
	public Conta(Long numero, Long agencia, String tipoConta, double saldo, Banco banco) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
		this.banco = banco;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", tipoConta=" + tipoConta + ", saldo=" + saldo
				+ ", banco=" + banco + "]";
	}
	
	
}
