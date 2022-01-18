package aula07_04.POO;

import aula07_04.POO_INTERFACE.Agregados;
import aula07_04.POO_INTERFACE.CobrarImposto;

public class Apartamento extends Imovel implements CobrarImposto, Agregados {

	private Double taxaDeCondominio;
	
	public Apartamento (Long registro, Endereco endereco, Double taxaDeCondominio) {
		super(registro, endereco);
		this.taxaDeCondominio = taxaDeCondominio;
	}

	public Double getTaxaDeCondominio() {
		return taxaDeCondominio;
	}

	public void setTaxaDeCondominio(Double taxaDeCondominio) {
		this.taxaDeCondominio = taxaDeCondominio;
	}

	@Override
	public String toString() {
		return "Apartamento [taxaDeCondominio=" + taxaDeCondominio + ", getRegistro()=" + getRegistro()
				+ ", isOcupado()=" + isOcupado() + ", getEndereco()=" + getEndereco() + "]";
	}

	@Override
	public double IPTU() {
		return this.taxaDeCondominio * 0.4;
	}

	@Override
	public double gas() {
		return 120.0;
	}

	@Override
	public double energia() {
		return 300.0;
	}

	@Override
	public double agua() {
		return 300.0;
	}
	
	
}
