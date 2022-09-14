package com.dio;

import com.dio.modelo.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato1);
		System.out.println(livro);
	}

}

class Livro {
	String nome;
}
