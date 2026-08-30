
/*Exercício — Soma até o usuário digitar 0

Faça um programa em Java que:

Peça para o usuário digitar um número.
Enquanto o número não for 0, continue pedindo outros números.
Some todos os números digitados.
Quando o usuário digitar 0, encerre o while.
Mostre a soma total.

Exemplo:

Digite um número: 5
Digite um número: 10
Digite um número: 3
Digite um número: 0
A soma dos números é: 18*/

package estudos.logica.loops.whilee;
import java.util.Scanner;

public class Ex02 {

    static void main() {
        Scanner obj = new Scanner(System.in);

        int num = 1;
        int soma = 0;


        while(num !=0){
            System.out.println("Digite um número");
            num = obj.nextInt();

            soma = soma + num;

        }

        int total = soma;

        System.out.println("A soma dos números é: " + total);

        obj.close();

    }
}
