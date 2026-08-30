/*Exercício — Contador de números
Faça um programa em Java que:
Comece com uma variável numero valendo 1.
Use um while para imprimir os números de 1 até 10.
Ao final, mostre a mensagem:
"Fim da contagem!"

Exemplo da saída:

1
2
3
4
5
6
7
8
9
10
Fim da contagem!*/

package estudos.logica.loops.whilee;

public class Ex01 {

    static void main() {
        int numero = 1;

        while(numero<=10){
            System.out.println(numero);
            numero++;
        }
        System.out.println("Fim da contagem!");

    }



}
