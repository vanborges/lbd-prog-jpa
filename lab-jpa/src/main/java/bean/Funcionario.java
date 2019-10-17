package bean;

import javax.persistence.*;

@Entity
public class Funcionario {

    @Id
    @Column(name = "cpf", nullable = false)
    private String cpf;

    private String pnome;
    private String minicial;
    private String unome;
    private String endereco;
    private String sexo;
    private Float salario;

    @ManyToOne
    @JoinColumn(name = "dnr", referencedColumnName = "dnumero")
    private Departamento departamentoByDnr;


    public Funcionario() {
    }

    public Funcionario(String cpf, String pnome, String minicial, String unome, String endereco, String sexo, Float salario, Departamento departamentoByDnr) {
        this.cpf = cpf;
        this.pnome = pnome;
        this.minicial = minicial;
        this.unome = unome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.departamentoByDnr = departamentoByDnr;
    }

    public String getPnome() {
        return pnome;
    }

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }

    public String getMinicial() {
        return minicial;
    }

    public void setMinicial(String minicial) {
        this.minicial = minicial;
    }

    public String getUnome() {
        return unome;
    }

    public void setUnome(String unome) {
        this.unome = unome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamentoByDnr() {
        return departamentoByDnr;
    }

    public void setDepartamentoByDnr(Departamento departamentoByDnr) {
        this.departamentoByDnr = departamentoByDnr;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf='" + cpf + '\'' + ", pnome='" + pnome + '\'' + ", minicial='" + minicial + '\'' + ", unome='" + unome + '\'' + ", endereco='" + endereco + '\'' + ", sexo='" + sexo + '\'' + ", salario=" + salario + ", departamentoByDnr=" + departamentoByDnr + '}';
    }
}