import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefa {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList();

        boolean ativo = true;

        while (ativo) {
            System.out.println("==============================");
            System.out.println("1 - Acessar Lista de Tarefa");
            System.out.println("2 - Atualizar Lista de tarefa");
            System.out.println("3 - Remover tarefa da lista");
            System.out.println("4 - Sair do Programa");
            System.out.println("==============================");
            System.out.println("Digite a opção: ");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("Lista de tarefa");
                    System.out.println("Informe a tarefa");
                    String tarefa = leitor.nextLine();

                    Tarefa t = new Tarefa();
                    t.setTarefas(tarefa);

                    tarefas.add(t);
                    System.out.println(" Informado com Sucesso!!! ");


                    break;
                }
                case "2": {
                    System.out.println("Lista de tarefa");
                    System.out.println("Atualizando a tarefa");
                    String tarefa = leitor.nextLine();

                    for (Tarefa t : tarefas) {
                        String tLista = t.getTarefas();

                        boolean tarefaAtualizado = tarefa.equals(tLista);

                        if (tarefaAtualizado) {
                            System.out.println(" Atualizado com Sucesso!!! ");
                            homePage();
                        }
                    }

                    break;
                }
                case "3": {
                    System.out.println("Lista de tarefa");
                    System.out.println("Informe a tarefa");
                    String tarefa = leitor.nextLine();
                    break;
                }
                case "4": {
                    ativo = false;
                    System.out.println("Saindo da lista!");
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println("Fim do Programa By Gabriel Alves de Lima");
        }
    }

    public static void homePage() {
        boolean ativo = true;
        while (ativo) {
            System.out.println("1 - Adcionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Finalizar tarefa");
            System.out.println("4 - Sair da Lista");
            System.out.print("Digite o Opção :");
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "1": {
                    break;
                }
                case "2": {

                    break;
                }
                case "3": {
                    break;
                }
                case "4": {
                    ListaDeTarefa()
                    break;
                }
            }
        }
    }
}
