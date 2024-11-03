/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author ADM
 */
@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa{
    
    @Column(length = 15)
    private String matricula;
    
    
    public Aluno(String nome) {
        super(nome);
    }

    public Aluno() {
        super();
    }

    public String getMatricula() {
        return matricula;
    }
    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
