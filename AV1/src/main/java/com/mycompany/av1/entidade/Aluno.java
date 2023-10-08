package com.mycompany.av1.entidade;

import com.mycompany.av1.TipoUsuario;
import com.mycompany.av1.Utils;

import javax.swing.*;
import java.io.*;

public class Aluno extends Usuario {
    private final static String FILE_PATH = System.getProperty("user.dir") + "/src/main/java/com/mycompany/av1/alunos.txt";

    private String curso;

    public Aluno(String nome, String usuario, String senha) {
        super(nome, usuario, senha, TipoUsuario.ALUNO);
        this.carregarCurso();
    }

    private void carregarCurso() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] values = linha.split(",");
                String user = values[0].toLowerCase();

                if (user.equals(this.getUsuario())) {
                    this.curso = values[1];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void salvar() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(this.getUsuario() + "," + this.curso);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void remover() {
        String chave = this.getUsuario() + "," + this.curso;
        Utils.removerLinha(new File(FILE_PATH), chave);
        Usuario.atualizarJTable();
    }
}
