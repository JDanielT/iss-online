package br.com.os2.iss.entidades;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "tipos_de_servico")
public class TipoServico extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer codigo;
    
    @Size(min = 3, max = 500, message = "{tipo.servico.descricao.tamanho}")
    private String descricao;
    
    @NotNull(message = "{tipo.servico.aliquota.vazia}")
    private BigDecimal aliquota;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getAliquota() {
        return aliquota;
    }

    public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }
    
}
