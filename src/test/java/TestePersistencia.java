/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import model.Aluno;
import model.Ministrante;
import model.Pessoa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sistemasemanaacademica.dao.PersistenciaJPA;

/**
 *
 * @author 20231PF.CC0021
 */
public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void testePersistencia() throws ParseException{
        Aluno a = new Aluno();
        a.setNome("Jorge dos Santos");
        a.setEmail("jorge@teste.com");
        a.setMatricula("20231PF.CC0099");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse("20/01/2005", dtf);
        a.setDataNascimento(nascimento);
        
        Ministrante m = new Ministrante();
        
        m.setNome("Maria Aparecida");
        m.setTitulacao("Doutora");
        m.setEspecialidade("Computação aplicada");
        
        
        
        try {
            jpa.persist(a);
            jpa.persist(m);

        } catch (Exception e) {
            System.err.println("Erro de persistencia: "+e);
        }
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
