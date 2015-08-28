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

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "municipios")
public class Municipio extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 3, max = 70, message = "{municipio.nome.tamanho}")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "estado_id", foreignKey = @ForeignKey(name = "fk_estado_id"))
    private Estado estado;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
