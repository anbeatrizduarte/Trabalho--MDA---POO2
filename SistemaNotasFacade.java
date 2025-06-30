import java.util.Scanner;

public class SistemaNotasFacade {
    private CadastroRespostas cadastroRespostas;
    private Scanner scanner;

    public SistemaNotasFacade() {
        this.cadastroRespostas = new CadastroRespostas();
        this.scanner = ScannerSingleton.getInstance(); // Obtém o Scanner via Singleton
    }

    public void criarArquivoRespostasDisciplina() {
        cadastroRespostas.criarArquivoDisciplina(scanner); // Scanner usado internamente pelo Facade
    }

    public void gerarResultadosDisciplina() {
        cadastroRespostas.gerarResultado(scanner); // Scanner usado internamente pelo Facade
    }

    public void visualizarRespostasAlunos(String nomeArquivo) {
        cadastroRespostas.visualizarArquivo(nomeArquivo);
    }
}   