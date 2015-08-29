package br.com.os2.iss.entidades;

import br.com.os2.iss.enums.Confirmacao;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Enumerated;

import java.time.LocalDate;
import javax.persistence.EnumType;
import javax.persistence.ForeignKey;
import javax.validation.constraints.NotNull;


/**
 *
 * @author daniel
 */
@Entity
@Table(name = "notas_fiscais")
public class NotaFiscal extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 11)
    private String codigo;
    
    private LocalDate emissao;
    
    @Column(length = 11)
    private String validador;
    
    @Column(columnDefinition = "TEXT")
    private String historico;
    
    @Column(columnDefinition = "TEXT")
    private String obeservacoes;
    
    @ManyToOne
    @JoinColumn(name = "tipo_servico_id", foreignKey = @ForeignKey(name = "fk_tipo_servico"))
    private TipoServico tipoServico;
    
    @NotNull(message = "{nota.fiscal.iss.vazio}")
    private BigDecimal iss;
    
    @NotNull(message = "{nota.fiscal.irrf.vazio}")
    private BigDecimal irrf;
    
    @NotNull(message = "{nota.fiscal.inss.vazio}")
    private BigDecimal inss;
    
    @NotNull(message = "{nota.fiscal.clss.vazio}")
    private BigDecimal clss;
    
    @NotNull(message = "{nota.fiscal.cofins.vazio}")
    private BigDecimal cofins;
    
    @NotNull(message = "{nota.fiscal.pis.vazio}")
    private BigDecimal pis;
    
    @Column(name = "outras_deducoes")
    @NotNull(message = "{nota.fiscal.outras.deducoes.vazio}")
    private BigDecimal outrasDeducoes;
    
    @NotNull(message = "{nota.fiscal.aliquota.vazio}")
    private BigDecimal aliquota;
    
    @Column(name = "base_calculo")
    @NotNull(message = "{nota.fiscal.base.calculo.vazio}")
    private BigDecimal baseCalculo;
    
    @Column(name = "total_bruto")
    @NotNull(message = "{nota.fiscal.total.bruto.vazio}")
    private BigDecimal totalBruto;
    
    @Column(name = "total_liquido")
    @NotNull(message = "{nota.fiscal.total.liquido.vazio}")
    private BigDecimal totalLiquido;
    
    @NotNull(message = "{nota.fiscal.destinatario.vazio}")
    @ManyToOne
    @JoinColumn(name = "destinatario_id", foreignKey = @ForeignKey(name = "fk_destinatario_id"))
    private Pessoa destinatario;
   
    @NotNull(message = "{nota.fiscal.emitente.vazio}")
    @ManyToOne
    @JoinColumn(name = "emitente_id", foreignKey = @ForeignKey(name = "fk_emitente_id"))
    private Emitente emitente;
    
    @NotNull(message = "{nota.fiscal.municipio.tributacao.vazio}")
    @ManyToOne
    @JoinColumn(name = "municipio_tributacao_id", foreignKey = @ForeignKey(name = "fk_municipio_tributacao_id"))
    private Municipio municipioTributacao;
    
    @Column(name = "aliquota_municipio_tributacao")
    @NotNull(message = "{nota.fiscal.aliquota.municipio.tributacao.vazio}")
    private BigDecimal aliquotaMunicipioTributacao;
    
    @Column(name = "iss_retido")
    @NotNull(message = "{nota.fiscal.iss.retido.vazio}")
    @Enumerated(EnumType.STRING)
    private Confirmacao issRetido;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public String getValidador() {
        return validador;
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getObeservacoes() {
        return obeservacoes;
    }

    public void setObeservacoes(String obeservacoes) {
        this.obeservacoes = obeservacoes;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public BigDecimal getIss() {
        return iss;
    }

    public void setIss(BigDecimal iss) {
        this.iss = iss;
    }

    public BigDecimal getIrrf() {
        return irrf;
    }

    public void setIrrf(BigDecimal irrf) {
        this.irrf = irrf;
    }

    public BigDecimal getInss() {
        return inss;
    }

    public void setInss(BigDecimal inss) {
        this.inss = inss;
    }

    public BigDecimal getClss() {
        return clss;
    }

    public void setClss(BigDecimal clss) {
        this.clss = clss;
    }

    public BigDecimal getCofins() {
        return cofins;
    }

    public void setCofins(BigDecimal cofins) {
        this.cofins = cofins;
    }

    public BigDecimal getPis() {
        return pis;
    }

    public void setPis(BigDecimal pis) {
        this.pis = pis;
    }

    public BigDecimal getOutrasDeducoes() {
        return outrasDeducoes;
    }

    public void setOutrasDeducoes(BigDecimal outrasDeducoes) {
        this.outrasDeducoes = outrasDeducoes;
    }
    
    public BigDecimal getAliquota() {
        return aliquota;
    }

    public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
    }

    public BigDecimal getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(BigDecimal baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public BigDecimal getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(BigDecimal totalBruto) {
        this.totalBruto = totalBruto;
    }

    public BigDecimal getTotalLiquido() {
        return totalLiquido;
    }

    public void setTotalLiquido(BigDecimal totalLiquido) {
        this.totalLiquido = totalLiquido;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    public Municipio getMunicipioTributacao() {
        return municipioTributacao;
    }

    public void setMunicipioTributacao(Municipio municipioTributacao) {
        this.municipioTributacao = municipioTributacao;
    }

    public BigDecimal getAliquotaMunicipioTributacao() {
        return aliquotaMunicipioTributacao;
    }

    public void setAliquotaMunicipioTributacao(BigDecimal aliquotaMunicipioTributacao) {
        this.aliquotaMunicipioTributacao = aliquotaMunicipioTributacao;
    }

    public Confirmacao getIssRetido() {
        return issRetido;
    }

    public void setIssRetido(Confirmacao issRetido) {
        this.issRetido = issRetido;
    }
    
}

