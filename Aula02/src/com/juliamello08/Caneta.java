package com.juliamello08;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta de cor " + this.cor );
		System.out.println("Seu modelo �: " + this.modelo );
		System.out.println("Tamanho da ponta �: " + this.ponta );
		System.out.println("Com carga de: " + this.carga );
		System.out.println("Est� tampada? " + this.tampada );
	}
	void rabiscar() {
		
	}
	void tampar() {
		
	}
	void destampar() {
		
	}
}
