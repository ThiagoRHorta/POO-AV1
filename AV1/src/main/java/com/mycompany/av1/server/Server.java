/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1.server;

/**
 *
 * @author João
 */
import com.mycompany.av1.Cliente;
import com.mycompany.av1.Utils;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 12245;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server na porta " + port);
            
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    InputStream input = socket.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                    OutputStream output = socket.getOutputStream();
                    PrintWriter writer = new PrintWriter(output, true);

                    String text;

                    while ((text = reader.readLine()) != null) {
                        System.out.println(text);
                        String[] parts = text.split(";");
                        String comand = parts[0];
                        switch (comand.toLowerCase()) {
                            case "iniciarusuarios":
                                Utils.inicializarUsuarios();
                                writer.println("Iniciando Usuarios...");
                                break;
                            case "registrarusuario":
                                Utils.registrarUsuario(parts[1], parts[2], parts[3], parts[4]);
                                writer.println("Registrando Usuario...");
                                break;
                            case "login":
                                ObjectOutputStream objectOutput = new ObjectOutputStream(socket.getOutputStream());
                                objectOutput.writeObject(Utils.login(parts[1], parts[2]));
                                objectOutput.flush();
                                break;
                            default:
                                System.out.println(Cliente.SendMessage("iniciarUsuarios"));
                                writer.println("Comando não reconhecido.");
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Exception quando tenta conectar na porta " + port);
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
