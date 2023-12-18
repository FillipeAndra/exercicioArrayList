import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numero = 0;
        int opcao = 0;
        int soma = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        while (opcao >= 0) {
            System.out.println("Opções: \n1 para adicionar mais um número para a lista\n2 para ver a média\n3 para deletar um número da lista\nnúmero negativo para parar");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("digite um número inteiro para fazermos a média da lista");
                numero = leitor.nextInt();
                lista.add(numero);
                System.out.println("O número "+numero+" foi adicionado");
                soma = soma +numero;
            }else if (opcao == 2) {
                int media = soma/lista.size();
                System.out.println("A média foi de: "+media);
            }else if (opcao == 3) {
                System.out.println("Digite o index do item que você deseja excluir");
                int selecao = leitor.nextInt();
                System.out.println("O item "+lista.get(selecao)+" será removido da lista");
                lista.remove(selecao);
                System.out.println("Remoção concluida");
            }

        }
        System.out.println("A lista completa foi: "+lista);


    }
}