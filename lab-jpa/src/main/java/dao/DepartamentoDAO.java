package dao;

import bean.Departamento;
import connection.ConnectionFactory;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {

    public Boolean save(Departamento departamento){
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            em.persist(departamento);
            em.getTransaction().commit();

        } catch (Exception e){
            System.out.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }

    public Departamento findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Departamento departamento = null;
        try {
            departamento = em.find(Departamento.class, id);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return departamento;
    }

    public List<Departamento> findByDnome(String dnome){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Departamento> dl = new ArrayList<Departamento>();
        try {
            dl = em.createQuery("from Departamento d").getResultList();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return dl;
    }
}
