import bean.Departamento;
import bean.Funcionario;
import dao.FuncionarioDAO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionarioDAOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testInsert() {
        Departamento departamento = new Departamento("Pesquisa", 1);
        Funcionario funcionario = new Funcionario("11111111111", "Renato", "a", "Silva", null, "M", Float.valueOf(10000), departamento);
        FuncionarioDAO dao = new FuncionarioDAO();
        if (dao.save(funcionario)) {
            System.out.println("Salvo com sucesso " + funcionario.toString());
        } else {
            Assertions.fail("Erro ao salvar");
        }
    }

    @Test
    public void testFindById() {
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = dao.findById("11111111111");
        if(funcionario != null){
            System.out.println("Funcionário encontrado "+ funcionario.toString());
            Assertions.assertEquals("11111111111", funcionario.getCpf());
            Assertions.assertEquals("Renato", funcionario.getPnome());
        } else {
            Assertions.fail("Erro ao salvar");
        }
    }

}