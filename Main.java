import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerSingleton.getInstance();
        SistemaNotasFacade facade = new SistemaNotasFacade();

        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Criar Arquivo de Respostas da Disciplina");
            System.out.println("2. Gerar Resultados da Disciplina");
            System.out.println("3. Visualizar Respostas dos Alunos");
            System.out.println("0. Sair");
            System.out.print("Digite a opcao: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    facade.criarArquivoRespostasDisciplina();
                    break;
                case 2:
                    facade.gerarResultadosDisciplina();
                    break;
                case 3:
                    System.out.print("Digite o nome da disciplina para visualizar (ex: Matematica.txt): ");
                    String nomeArqVisualizar = scanner.nextLine();
                    facade.visualizarRespostasAlunos("RespostasAlunos/" + nomeArqVisualizar);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        ScannerSingleton.closeInstance();
    }
}