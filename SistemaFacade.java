import java.util.Scanner;
import CadastroRespostas; // Adicione esta linha
import ScannerSingleton; // Adicione esta linha (se ScannerSingleton for uma classe personalizada)

public class SistemaFacade {
    private CadastroRespostas cadastroRespostas;
    private Scanner scanner;

    public SistemaFacade() {
        this.cadastroRespostas = new CadastroRespostas();
        this.scanner = ScannerSingleton.getInstance();
    }

    public void criarArquivoRespostasDisciplina() {
        cadastroRespostas.criarArquivoDisciplina(scanner);
    }

    public void gerarResultadosDisciplina() {
        cadastroRespostas.gerarResultado(scanner);
    }

    // Novo método na Fachada para visualizar respostas
    public void visualizarRespostasAlunos(String nomeArquivo) {
        cadastroRespostas.visualizarArquivo(nomeArquivo);
    }
}