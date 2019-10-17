package dao;

import bean.Funcionario;
import connection.ConnectionFactory;

import javax.persistence.EntityManager;

public class FuncionarioDAO {
    public Boolean save(Funcionario funcionario){
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();

        } catch (Exception e){
            System.out.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }

    public Funcionario findById(String cpf){
        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario funcionario = null;
        try {
            funcionario = em.find(Funcionario.class, cpf);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return funcionario;

    }
}
