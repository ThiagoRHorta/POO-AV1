package com.mycompany.av1.entidade;

import com.mycompany.av1.TipoUsuario;
import static com.mycompany.av1.Usuario.usuarios;
import com.mycompany.av1.interfaces.EscreverArquivo;

import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public abstract class Usuario implements EscreverArquivo {
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

    @Override
    public String toString() {
        return this.nome + "," + this.usuario + "," + this.senha + "," + this.tipo;
    }

    public static boolean usuarioExistente(String usuario){
        return usuarios.containsKey(usuario.toLowerCase());
    }
    
    public static void preencherJTable(DefaultTableModel model) {
        for (Usuario user : usuarios.values()) {
            String value = "N/A";
            if(user instanceof Aluno)
                value = ((Aluno) user).getCurso();
            else if(user instanceof Professor)
                value = ((Professor) user).getDisciplina();
            model.addRow(new Object[]{
                user.getUsuario(),
                user.getNome(),
                user.getTipo().toString(),
                value
            });
        }
    }
}
