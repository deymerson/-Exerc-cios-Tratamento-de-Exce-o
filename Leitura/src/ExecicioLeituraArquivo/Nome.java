package ExecicioLeituraArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Nome {
    static String nome[] = new String[10];
    static String sobrenome[] = new String[10];

    public static void lerNome(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        for (int i = 0; i < 10; i++) {
            nome[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

    }

    public static void lerSobreNome(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        for (int i = 0; i < 10; i++) {
            sobrenome[i] = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.append(nome[i] + " " + sobrenome[i] + "\n");
        }
        bufferedWriter.close();

    }

    public static void lerNomeCompleto(String path) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            for (int i = 0; i < 10; i++) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}
