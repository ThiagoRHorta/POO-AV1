package com.mycompany.av1;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Cliente {
    private static PrintWriter writer;
    private static BufferedReader reader;
    private static Socket socket;
    
    public static void StartClient(){
        String hostname = "localhost";
        int port = 12245;
        
        try {
            socket = new Socket(hostname, port);
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
        } catch (UnknownHostException ex) {
            System.out.println("Servidor não encontrado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Erro de I/O: " + ex.getMessage());
        }
    }
    
    public static String SendMessage(String message){
        try {
            writer.println(message);
            return reader.readLine();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public static Object SendAllMessages(ArrayList<String> messages){
        try {
            String components = String.join(";", messages);
            writer.append(components).append("\n");
            writer.flush();
            ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
            // Leia o objeto diretamente do ObjectInputStream
            return objectInput.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}
