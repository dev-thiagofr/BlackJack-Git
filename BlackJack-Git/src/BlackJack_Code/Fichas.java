package BlackJack_Code;

import java.io.FileWriter;
import java.io.*;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Fichas {

    private int qtn_fichas;

    public Fichas(int qtn_fichas) {
        this.qtn_fichas = qtn_fichas;
    }

    public void qtn_venceu() {
        qtn_fichas = +qtn_fichas + 50;
    }

    public void qtn_perdeu() {
        qtn_fichas = +qtn_fichas - 25;
    }

    public int getQtn_fichas() {
        return qtn_fichas;
    }

    public void setQtn_fichas(int qtn_fichas) {
        this.qtn_fichas = qtn_fichas;
    }

    public void savedFichas() throws IOException {

        FileWriter fw = new FileWriter("savedFichas.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(this.qtn_fichas);

        pw.flush();
        pw.close();
        fw.close();

    }

    public String loadFichas() throws FileNotFoundException {

        String text = "";
        try {

            text = new String(Files.readAllBytes(Paths.get("savedFichas.txt")));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Sua quantidade de fichas é: " + text;

    }

    @Override
    public String toString() {
        return "Sua quantidade de fichas é: " + qtn_fichas;

    }
}
