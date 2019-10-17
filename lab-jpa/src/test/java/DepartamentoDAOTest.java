import bean.Departamento;
import dao.DepartamentoDAO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepartamentoDAOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testInsert() {
        Departamento departamento = new Departamento("Pesquisa", 1);
        DepartamentoDAO dao = new DepartamentoDAO();
        if(dao.save(departamento)){
            System.out.println("Salvo com sucesso "+ departamento.toString());
        } else {
            Assertions.fail("Erro ao salvar");
        }
    }
    @Test
    public void testFindById() {
        DepartamentoDAO dao = new DepartamentoDAO();
        Departamento departamento = dao.findById(1);
        if(departamento != null){
            System.out.println("Departamento encontrado "+ departamento.toString());
            Assertions.assertEquals(1, departamento.getDnumero());
            Assertions.assertEquals("Pesquisa",departamento.getDnome());
        } else {
            Assertions.fail("Erro ao salvar");
        }
    }

    @Test
    public void testfindByDnome(){
        DepartamentoDAO dao = new DepartamentoDAO();
        for(Departamento d: dao.findByDnome("Pesquisa")){
            System.out.println(d);
        }
    }
}