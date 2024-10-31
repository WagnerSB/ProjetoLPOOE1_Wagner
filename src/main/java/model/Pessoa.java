package model;

import java.util.Date;




public class Pessoa {
   
    private int id;
    private String nome;
    private Date dataNascimento;
    private String email;
    
//    public Pessoa()
//    {     
//    }
    
    public Pessoa(String nome)
    {     
        nome = this.nome;
    }
    
    public Pessoa(String nome, Date dataNascimento)
    {     
        nome = this.nome;
        dataNascimento = this.dataNascimento;
    }
    
    public Pessoa(String nome, Date dataNascimento, String email)
    {     
        nome = this.nome;
        email = this.email;
        dataNascimento = this.dataNascimento;
    }
    
    public Pessoa(String nome, String email)
    {     
        nome = this.nome;
        email = this.email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}