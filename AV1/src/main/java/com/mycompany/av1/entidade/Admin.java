package com.mycompany.av1.entidade;

import com.mycompany.av1.TipoUsuario;

public class Admin extends Usuario {

    public Admin(String nome, String usuario, String senha) {
        super(nome, usuario, senha, TipoUsuario.ADMIN);
    }

    public void salvar() {}

    public void remover() {}
}
