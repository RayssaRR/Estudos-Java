package estudos.logica.condicionais.switchCase;
import java.util.Scanner;
/*Exercício — Menu de opções

Faça um programa em Java que mostre o seguinte menu:

===== MENU =====
1 - Cadastrar usuário
2 - Listar usuários
3 - Excluir usuário
4 - Sair

O programa deve pedir para o usuário escolher uma opção e,
usando switch case, mostrar:

1 → "Usuário cadastrado!"
2 → "Lista de usuários"
3 → "Usuário excluído!"
4 → "Saindo do sistema..."
Qualquer outro número → "Opção inválida!"*/
public class MenuOpcoes {

    static void main() {

        Scanner user = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Listar Usuários");
        System.out.println("3 - Excluir Usuário");
        System.out.println("4 - Sair");

        int opcao = user.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Usuário cadastrado!");
                break;
            case 2:
                System.out.println("Lista de usuários");
                break;
            case 3:
                System.out.println("Usuário excluído!");
                break;
            case 4:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

}
