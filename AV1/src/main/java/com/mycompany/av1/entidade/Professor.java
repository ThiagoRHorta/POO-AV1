package com.mycompany.av1.entidade;

import com.mycompany.av1.TipoUsuario;
import com.mycompany.av1.Utils;

import java.io.*;

public class Professor extends Usuario {
    private final static String FILE_PATH = System.getProperty("user.dir") + "/src/main/java/com/mycompany/av1/professores.txt";
    private String disciplina;

    public Professor(String nome, String usuario, String senha) {
        super(nome, usuario, senha, TipoUsuario.PROFESSOR);
        this.carregarDisciplina();
    }

    private void carregarDisciplina() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] values = linha.split(",");
                String user = values[0].toLowerCase();

                if (user.equals(this.getUsuario())) {
                    this.disciplina = values[1];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void salvar() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(this.getUsuario() + "," + this.disciplina);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void remover() {
        String chave = this.getUsuario() + "," + this.disciplina;
        Utils.removerLinha(new File(FILE_PATH), chave);
    }
}
