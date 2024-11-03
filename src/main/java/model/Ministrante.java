
package model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_ministrante")
public class Ministrante extends Pessoa{
    private String titulacao;
    private String especialidade;

    public Ministrante(String nome) {
        super(nome);
    }
    
    public Ministrante() {
        super();
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    
    
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
