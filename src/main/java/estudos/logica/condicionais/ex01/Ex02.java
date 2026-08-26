package estudos.logica.condicionais.ex01;
import java.util.Scanner;
/*Maior de três números
Peça ao usuário três números inteiros.
Descubra qual é o maior número entre os três.
Exemplo:
Digite o primeiro número: 10
Digite o segundo número: 25
Digite o terceiro número: 17
O maior número é: 25
Desafio: tente considerar também quando houver números iguais.*/
public class Ex02 {

    static void main() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Informe 3 números inteiros");
        int numero1 = obj.nextInt();
        int numero2 = obj.nextInt();
        int numero3 = obj.nextInt();
        if(numero1 > numero2){
            System.out.println("O maior número é: " + numero1);
        }else if(numero1 > numero3){
            System.out.println("O maior número é: " + numero1);
        }

        obj.close();
    }
}
