package com.mycompany.av1;

import java.util.ArrayList;


public class AV1 {
    
    public static void main(String[] args) {
        //Inicializar o programa com os usuarios já cadastrados
        Cliente.StartClient();
        Utils.inicializarUsuarios();
        System.out.println(Cliente.SendMessage("iniciarusuarios"));
        //Iniciar tela
        MenuPrincipal.main(args);
    }
}
