
package model;

import java.util.Date;


public class Oficina {
    private int id;
    private String nome;
    private String descricao;
    private Date data;
    private double duracao;

    public Oficina(String nome, String descricao, Date data, double duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.duracao = duracao;
    }
    
    public Oficina()
    {
        
    }
    
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public double getDuracao() {
        return duracao;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
    
}
