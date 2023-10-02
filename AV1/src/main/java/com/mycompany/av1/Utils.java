package com.mycompany.av1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Utils {
    static String fileName = "credenciais.txt";
    static String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\com\\mycompany\\av1\\";
    static String file = filePath + fileName; 
    
    public static void inicializarUsuarios() {
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            
            while ((linha = br.readLine()) != null) {
                String[] values = linha.split(",");
                if (values.length == 4) {
                    Usuario usuario = new Usuario(values[0], values[1], values[2], TipoUsuario.valueOf(values[3]));
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
            
            if(Usuario.usuarioExistente(user) == true){
                JOptionPane.showMessageDialog(null, "O usuário já está cadastrado!");  
                return;
            }
            
            Usuario usuario = new Usuario(nome, user, senha, TipoUsuario.valueOf(tipo));
            
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
    
    public static void deletarUsuario(String user){
        
    }
    
}
