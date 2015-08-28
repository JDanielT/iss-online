package br.com.os2.iss.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "contatos")
public class Contato extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Email(message = "contato.email.valido")
    @NotEmpty(message = "contato.email.vazio")
    private String email;
    
    @Size(min = 13, max = 13, message = "{contato.telefone.residencial.tamanho}")
    @Column(name = "telefone_residencial")
    private String telefoneResidencial;
    
    @Size(min = 13, max = 13, message = "{contato.telefone.comercial.tamanho}")
    @Column(name = "telefone_comercial")
    private String telefoneComercial;
    
    @Size(max = 14, message = "{contato.celular.tamanho}")
    private String celular;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
