/*
*Exercício — Tabuada
Faça um programa em Java que:
Peça ao usuário um número inteiro.
Use um for para mostrar a tabuada desse número de 1 até 10.
Mostre o resultado neste formato:
Digite um número: 7

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
...
7 x 10 = 70

Regras:

Use Scanner para receber o número.
Use obrigatoriamente um for.
Não precisa usar if, while ou do while.*/

package estudos.logica.loops.forr;
import java.util.Scanner;

public class Ex01 {
    static void main() {
        Scanner tab = new Scanner(System.in);
        System.out.println("Digite um número inteiro");

        int num = tab.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num + " x " +i+ " = " +num*i);
        }

        tab.close();
    }

}
