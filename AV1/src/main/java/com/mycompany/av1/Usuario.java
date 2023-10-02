package com.mycompany.av1;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    public static Map<String, Usuario> usuarios = new HashMap<>();
    
    private String nome;
    private String usuario;
    private String senha;
    private TipoUsuario tipo;

    public Usuario(String nome, String usuario, String senha, TipoUsuario tipo){
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
        usuarios.put(usuario.toLowerCase(), this);
    }
    
    //Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Usuario
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Senha
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Tipo
    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    public static boolean usuarioExistente(String usuario){
        return usuarios.containsKey(usuario.toLowerCase());
    }
    
}
