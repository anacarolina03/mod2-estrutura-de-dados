package br.com.ana.fatorial;

/** Tudo é essencialmente o mesmo, mas com BigInteger. A classe Stream nos fornece o método mapToObj , 
 * que usamos para converter valores int em BigInteger para depois multiplicá-los com eles mesmos usando o método de multiplicação. 
 * Se executarmos qualquer um desses  métodos com um argumento de 100, podemos ter um estouro de pilha e não obtermos o resultado correto */

public class Recursiva {
	
	public static int calcFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int entrada = 7;

        int saida = calcFatorial(entrada);

        System.out.println("Fatorial de " + entrada + " é: " + saida);
    }

}
