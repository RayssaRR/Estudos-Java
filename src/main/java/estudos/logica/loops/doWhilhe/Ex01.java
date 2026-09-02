/*Exercício — Senha

Faça um programa em Java que:

Peça para o usuário digitar uma senha.
Enquanto a senha estiver errada, continue pedindo novamente.
Quando o usuário digitar a senha correta (1234), mostre:
"Acesso permitido!"
Exemplo de execução
Digite a senha: 1111
Senha incorreta!

Digite a senha: 2222
Senha incorreta!

Digite a senha: 1234
Acesso permitido!*/

package estudos.logica.loops.doWhilhe;
import java.util.Scanner;

public class Ex01 {

    static void main() {
        Scanner ex01 = new Scanner(System.in);

        int senha;
        do{
            System.out.println("Digite sua senha" );
            senha = ex01.nextInt();
            if( senha !=1234) {
                System.out.println("Senha incorreta!");
            }
        }while(senha!=1234);

        System.out.println("Acesso Permitido!");
    }

}
