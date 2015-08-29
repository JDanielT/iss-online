package br.com.os2.iss.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.validation.constraints.Size;


/**
 *
 * @author daniel
 */
@Entity
@Table(name = "unidades_de_medida")
public class UnidadeMedida extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 1, max = 4, message = "{unidade.medida.sigla.tamanho}")
    private String sigla;
    
    @Size(min = 3, max = 70, message = "{unidade.medida.descricao.tamanho}")
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
