package view;

import model.Lista;

public class Principal {
	public static void main (String[] args) {
		Lista<Integer> lista = new Lista<>();
		
			int[] vetor = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
			int tamanho = vetor.length;
			
			for (int i = 0; i < tamanho; i++) {
				try {
					lista.addLast(vetor[i]);
				} catch(Exception e) {
					e.printStackTrace();;
				}
			}
			
			int maiorValor = Integer.MIN_VALUE;
			int segundoMaior = Integer.MIN_VALUE;

			for (int contador = 0; contador < tamanho; contador++) {
				int valor = 0;
				try {
					valor = lista.get(contador);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if (valor > maiorValor) {
					segundoMaior = maiorValor;
					maiorValor = valor;
				} else if (valor > segundoMaior && valor < maiorValor) {
					segundoMaior = valor;
				}
			}

			System.out.println("1º maior valor: " + maiorValor);
			System.out.println("2º maior valor: " + segundoMaior);
	}
}

