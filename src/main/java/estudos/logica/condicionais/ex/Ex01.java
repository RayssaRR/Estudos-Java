package estudos.logica.condicionais.ex;
import java.util.Scanner;
/**
 * Exercício 1 — Positivo, negativo ou zero
 * Peça ao usuário para digitar um número inteiro.
 * Seu programa deve informar:
 * Se o número for maior que 0 → "Positivo"
 * Se for menor que 0 → "Negativo"
 * Se for igual a 0 → "Zero"
 * Exemplos:
 * Digite um número: 15
 * Resultado: Positivo
 * Digite um número: -8
 * Resultado: Negativo
 */

public class Ex01 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro");
        int numero = scanner.nextInt();
        if(numero>0){
            System.out.println("Positivo");
        }else if(numero<0){
            System.out.println("Negativo");
        }else{
            System.out.println("Zero");
        }

        scanner.close();

    }


}
