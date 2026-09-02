/*Exercício — Divisão

Faça um programa em Java que:

Peça ao usuário dois números inteiros.
Divida o primeiro número pelo segundo.
Mostre o resultado.
Caso o usuário tente dividir por 0, mostre:
"Não é possível dividir por zero!"
Dicas

Você vai precisar de:
Scanner
try
catch
ArithmeticException

A estrutura que você deve completar é:

try {
    // faça a divisão aqui

} catch (ArithmeticException e) {
    // mostre a mensagem de erro aqui
}*/
package estudos.logica.excecoes;
import java.util.Scanner;
public class Ex01 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Informe outro numero inteiro:");
        int num2 = sc.nextInt();

        try{
           int divisao = num1/num2;
            System.out.println("Resultado: " + divisao);
        }catch(ArithmeticException e){
            System.out.println("Divisão por 0");
        }


    }
}
