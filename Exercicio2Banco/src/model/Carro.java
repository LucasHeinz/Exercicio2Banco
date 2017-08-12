package model;

public class Carro {

	private String placa;
	private String tipo;
	private String cor;
	private String marca;

	public Carro() {
	}

	public Carro(String placa, String tipo, String marca, String cor) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.marca = marca;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Placa: " + this.placa + " Tipo: " + this.tipo + " Marca: " + this.marca + " Cor: " + this.cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
