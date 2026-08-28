/*Exercício — Soma dos números
Faça um programa em Java que:
Peça ao usuário um número inteiro positivo.
Use um for para somar todos os números de 1 até o número informado.
Mostre o resultado.

Exemplo:

Digite um número: 5

1 + 2 + 3 + 4 + 5 = 15

Se o usuário digitar 10:
A soma dos números de 1 até 10 é: 55
Regras
Use Scanner.
Use obrigatoriamente um for.
Crie uma variável para armazenar a soma.
Não use while ou do while.
Tente fazer sem olhar resposta pronta.*/


package estudos.logica.loops.forr;
import java.util.Scanner;

public class Ex02 {

    static void main() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Informe um número inteiro positivo");
        int num = obj.nextInt();
        int soma = 0;

        for(int i = 1; i<=num;i++){

             soma = soma + i;
            System.out.print(i + " + ");
        }
        System.out.println("= " + soma);
    }

}
