/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADM
 */
public class Aluno extends Pessoa{
    
    private String matricula;
    
    
    public Aluno(String nome) {
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }
    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
