package com.mycompany.av1;

public enum TipoUsuario {
    ADMIN(3), PROFESSOR(2), ALUNO(1);
    public int tipo;

    TipoUsuario(int tipo){
        this.tipo = tipo;
    }
    
    public boolean permUsuario (TipoUsuario tipoUsuario){
        return this.tipo >= tipoUsuario.tipo;
    }
}