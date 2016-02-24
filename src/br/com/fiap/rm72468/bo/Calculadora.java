package br.com.fiap.rm72468.bo;

import java.text.NumberFormat;

public class Calculadora {

	private Double numero1;
	private Double numero2;
	private String operacao;

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Calculadora() {

	}

	public Calculadora(Double numero1, Double numero2, String operacao) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacao = operacao;
	}

	private Double somar() {
		return numero1 + numero2;
	}

	private Double subtrair() {
		return numero1 - numero2;
	}

	private Double multiplicar() {
		return numero1 * numero2;
	}

	private Double dividr() {
		if(numero2==0)
			throw new ArithmeticException("Não pode dividir por zero.");
		return numero1 / numero2;
	}

	public String fazCalculo() {

		Double resultado = null;

		switch (operacao) {
		case "+":
			resultado = somar();
			break;
		case "-":
			resultado = subtrair();
			break;
		case "*":
			resultado = multiplicar();
			break;
		case "/":
			resultado = dividr();
			break;
		}
		NumberFormat fmt = NumberFormat.getInstance();
		fmt.setMaximumFractionDigits(2);
		return fmt.format(resultado);
	}

}
