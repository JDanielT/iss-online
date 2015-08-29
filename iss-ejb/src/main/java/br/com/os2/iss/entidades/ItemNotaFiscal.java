package br.com.os2.iss.entidades;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "itens_de_nota_fiscal")
public class ItemNotaFiscal extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Size(min = 3, max = 70, message = "{item.nota.fiscal.descricao.tamanho}")
    private String descricao;
    
    @NotNull(message = "{item.nota.fiscal.quantidade.vazio}")
    private BigDecimal quantidade;
    
    @Column(name = "valor_unitario")
    @NotNull(message = "{item.nota.fiscal.valor.unitario.vazio}")
    private BigDecimal valorUnitario;
    
    @Column(name = "valor_total")
    @NotNull(message = "{item.nota.fiscal.valor.total.vazio}")
    private BigDecimal valorTotal;
    
    @ManyToOne
    @JoinColumn(name = "nota_fiscal_id", foreignKey = @ForeignKey(name = "fk_nota_fiscal"))
    private NotaFiscal notaFiscal;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
}
