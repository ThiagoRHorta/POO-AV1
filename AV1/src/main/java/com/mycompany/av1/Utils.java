package com.mycompany.av1;

import com.mycompany.av1.entidade.Admin;
import com.mycompany.av1.entidade.Aluno;
import com.mycompany.av1.entidade.Professor;
import com.mycompany.av1.entidade.Usuario;

import java.io.*;
import javax.swing.JOptionPane;

public class Utils {
    static String fileName = "credenciais.txt";
    static String filePath = System.getProperty("user.dir") + "/src/main/java/com/mycompany/av1/";
    static String file = filePath + fileName; 
    
    public static void inicializarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            
            while ((linha = br.readLine()) != null) {
                String[] values = linha.split(",");
                if (values.length == 4) {

                    Usuario usuario = getUser(values[0], values[1], values[2], TipoUsuario.valueOf(values[3]));
                    System.out.println(usuario);
                } else {
                    System.out.println("Formato de linha inválido no arquivo. Favor seguir com 'nome,usuario,senha,TipoUsuario'");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void registrarUsuario(String nome, String user, String senha, String tipo) {
        try {
            if (nome.isEmpty() || user.isEmpty() || senha.isEmpty() || tipo == null){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");  
                return;
            }   
            
            if(Usuario.usuarioExistente(user)){
                JOptionPane.showMessageDialog(null, "O usuário já está cadastrado!");  
                return;
            }

            // Incluir novo usuário.
            getUser(nome, user, senha, TipoUsuario.valueOf(tipo));
            
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.newLine();
            bufferedWriter.write(nome + "," + user + "," + senha + "," + tipo);

            bufferedWriter.close();
            
            JOptionPane.showMessageDialog(null, "Usuário "+user+" registrado com sucesso"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void deletarUsuario(String nomeUsuario) {
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Usuario.usuarios.remove(nomeUsuario.toLowerCase()).remover();
            Usuario.usuarios.forEach((key, usuario) -> {
                try {
                    bufferedWriter.write(usuario.toString());
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedWriter.close();
            JOptionPane.showMessageDialog(null, "Usuário " + nomeUsuario + " removido com sucesso!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void removerLinha(File file, String chave) {
        try {
            String temp = System.getProperty("user.dir") + "/src/main/java/com/mycompany/av1/" + file.getName() + "_temp.txt";
            File tempFile = new File(temp);

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

            String atual;

            while ((atual = reader.readLine()) != null) {
                String trimmedLine = atual.trim();
                if (trimmedLine.equals(chave)) continue;
                writer.write(atual + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            
            file.delete();
            tempFile.renameTo(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static Usuario getUser(String nome, String usuario, String senha, TipoUsuario type) {
        switch (type) {
            case ALUNO:
                return new Aluno(nome, usuario, senha);
            case PROFESSOR:
                return new Professor(nome, usuario, senha);
            default:
                return new Admin(nome, usuario, senha);
        }
    }
}
