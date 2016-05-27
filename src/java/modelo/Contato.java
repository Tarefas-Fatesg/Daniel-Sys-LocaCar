package modelo;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato implements Serializable {

    @Basic
    private String celular;

    @Basic
    private String residencial;

    @Id
    private Long id;

    @Basic
    private String email;

    public Contato() {

    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getResidencial() {
        return this.residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
