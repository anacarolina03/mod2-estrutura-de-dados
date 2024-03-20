package br.com.ana.fibonacci;

/** Embora a implementação recursiva de fibonacci apresentada no módulo seja eficaz, 
 * as mesmas apresentam o problema de apresentar desempenho mais lento, pois as diversas chamadas recursivas fazem 
 * com que os mesmos valores sejam recalculados diversas vezes. Por exemplo, rodar os programas recursivos para calcular fibo(30) e veja que o programa levará um longo tempo para apresentar a resposta. 
 * A seguir apresenta-se uma solução iterativa que computa o enésimo termo de uma maneira bem mais rápida. */

public class Fibonacci {

    static long fibo(int n) {
        int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }

        }

        return F;
    }

    public static void main(String[] args) {

	// teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

    }

}

