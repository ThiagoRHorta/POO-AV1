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
public class Matricula {
    private static ArrayList<Matricula> matriculas = new ArrayList<>();

    private Usuario aluno;
    private Curso curso;
    private String data;

    public Matricula(Usuario aluno, Curso curso, String data) {
        if(curso.temVaga()) {
            this.aluno = aluno;
            this.curso = curso;
            this.data = data;
            matriculas.add(this);
        } else {
            throw new RuntimeException("Não há vagas disponíveis para este curso.");
        }
    }

    public static int getQuantidadeMatriculados(Curso curso) {
        return (int) matriculas.stream().filter(m -> m.curso.equals(curso)).count();
    }
    
    /**
     * @return the aluno
     */
    public Usuario getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setUsuario(Usuario aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    
    
}