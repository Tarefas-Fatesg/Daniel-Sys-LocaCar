package modelo;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class veiculo implements Serializable {

    @Basic
    private String cor;

    @Basic
    private String chassi;

    @OneToMany(targetEntity = Acessorios.class)
    private List<Acessorios> acessorios;

    @Id
    private Long id;

    @OneToMany(targetEntity = Manutencao.class)
    private List<Manutencao> manutencao;

    @OneToOne(targetEntity = Modelo.class)
    private Modelo modelo;

    @Basic
    private String placa;

    public veiculo() {

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public List<Acessorios> getAcessorios() {
        return this.acessorios;
    }

    public void setAcessorios(List<Acessorios> acessorios) {
        this.acessorios = acessorios;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Manutencao> getManutencao() {
        return this.manutencao;
    }

    public void setManutencao(List<Manutencao> manutencao) {
        this.manutencao = manutencao;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}