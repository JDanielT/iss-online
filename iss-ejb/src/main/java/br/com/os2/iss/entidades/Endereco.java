package br.com.os2.iss.entidades;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "enderecos")
public class Endereco extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 3, max = 70, message = "{endereco.logradouro.tamanho}")
    private String logradouro;
    
    @Size(min = 3, max = 50, message = "{endereco.bairro.tamanho}")
    private String bairro;
    
    @Size(min = 3, max = 10, message = "{endereco.numero.tamanho}")
    private String numero;
    
    @Size(max = 70, message = "{endereco.logradouro.tamanho}")
    private String complemento;
    
    @NotEmpty
    @Size(max = 9) 
    private String cep;
    
    @ManyToOne
    @JoinColumn(name = "municipio_id", foreignKey = @ForeignKey(name = "fk_munipio_id"))
    private Municipio municipio;
    
    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
}
