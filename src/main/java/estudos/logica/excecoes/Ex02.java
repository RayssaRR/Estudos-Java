/*Exercício 2 — Entrada inválida

Agora vamos praticar try/catch com Scanner.

Faça um programa em Java que:

Peça para o usuário digitar um número inteiro.
Mostre o número digitado.
Caso o usuário digite algo que não seja um número inteiro, mostre:
"Digite apenas números inteiros!"

Exemplos

Se o usuário digitar:
Digite um número inteiro:
25
Você digitou: 25
Se digitar:
Digite um número inteiro:
abc

Digite apenas números inteiros!*/


package estudos.logica.excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");



        try{
            int num1 = sc.nextInt();
            System.out.println("Você digitou: " + num1);
        }catch(InputMismatchException e){
            System.out.println("Digite apenas números inteiros!");
        }

    }
}
