/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av1;

import java.util.ArrayList;

/**
 *
 * @author João
 */
public class Curso {
    private String nome;
    private String descricao;
    private Usuario professor; // considerando que um professor é um usuário
    private int capacidadeMaxima;
    private ArrayList<Usuario> alunosMatriculados = new ArrayList<>();

    public Curso(String nome, String descricao, Usuario professor, int capacidadeMaxima) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean temVaga() {
        return Matricula.getQuantidadeMatriculados(this) < capacidadeMaxima;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the professor
     */
    public Usuario getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }

    /**
     * @return the capacidadeMaxima
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * @param capacidadeMaxima the capacidadeMaxima to set
     */
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    
}
