package ExecicioLeituraArquivo;
import java.io.IOException;

public class Principa {
    public static void main(String[] args) throws IOException {
        String path = "/ExecicioLeituraArquivo/src/br/arquivoNome.txt";
        NomeCompleto.lerNome(path);

        path = "/ExecicioLeituraArquivo/src/br/sobreNome.txt";
        NomeCompleto.lerSobreNome(path);

        path = "/ExecicioLeituraArquivo/src/br/nomeCompleto.txt";
        NomeCompleto.escritor(path);
        NomeCompleto.lerNomeCompleto(path);
       

    }

}