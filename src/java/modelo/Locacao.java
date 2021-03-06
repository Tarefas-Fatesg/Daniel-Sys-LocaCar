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
public class Locacao implements Serializable {

    @OneToOne(targetEntity = veiculo.class)
    private veiculo veiculo;

    @OneToMany(targetEntity = Ocorrencia.class)
    private List<Ocorrencia> ocorrencias;

    @Basic
    private String dataLoca;

    @Id
    private Long id;

    @Basic
    private Float subTotal;

    @OneToOne(targetEntity = Itinerario.class)
    private Itinerario itinerario;

    @Basic
    private String dataDev;

    public Locacao() {

    }

    public veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Ocorrencia> getOcorrencias() {
        return this.ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public String getDataLoca() {
        return this.dataLoca;
    }

    public void setDataLoca(String dataLoca) {
        this.dataLoca = dataLoca;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public Itinerario getItinerario() {
        return this.itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public String getDataDev() {
        return this.dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }
}
