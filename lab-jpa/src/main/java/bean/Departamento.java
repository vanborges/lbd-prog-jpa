package bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departamento {

    @Id
    @Column(name = "dnumero", nullable = false)
    private int dnumero;
    private String dnome;

    @OneToMany(mappedBy = "departamentoByDnr")
    private List<Funcionario> funcionariosByDnumero;

    public Departamento() {
    }

    public Departamento(String dnome, int dnumero) {
        this.dnome = dnome;
        this.dnumero = dnumero;
    }

    public String getDnome() {
        return dnome;
    }

    public void setDnome(String dnome) {
        this.dnome = dnome;
    }

    public int getDnumero() {
        return dnumero;
    }

    public void setDnumero(int dnumero) {
        this.dnumero = dnumero;
    }

    public List<Funcionario> getfuncionariosByDnumero() {
        return funcionariosByDnumero;
    }

    public void setfuncionariosByDnumero(List<Funcionario> funcionariosByDnumero) {
        this.funcionariosByDnumero = funcionariosByDnumero;
    }

    @Override
    public String toString() {
        return "Departamento{" + "dnumero=" + dnumero + ", dnome='" + dnome + '\'' + '}';
    }
}

