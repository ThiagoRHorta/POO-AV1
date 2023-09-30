package com.mycompany.av1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class AV1 {
    
    private static void criarAdmin(){
        String fileName = "credenciais.txt";
        String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\mycompany\\av1\\";
        String file = filePath+fileName;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            if (line != null) {
                String[] values = line.split(",");
                if (values.length == 4) {
                    Usuario usuario = new Usuario(values[0], values[1], values[2], TipoUsuario.valueOf(values[3]));
                    System.out.println(usuario);
                } else {
                    System.out.println("Formato de linha inválido no arquivo. Favor seguir com 'nome,usuario,senha,TipoUsuario'");
                }
            } else {
                System.out.println("O arquivo está vazio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    
    public static void main(String[] args) {
        //Iniciar tela
        MenuPrincipal.main(args);
        
        //Inicializar o programa com um login de adm
        criarAdmin();
    }
    
}
