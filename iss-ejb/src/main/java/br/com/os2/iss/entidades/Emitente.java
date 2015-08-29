package br.com.os2.iss.entidades;

import br.com.os2.iss.enums.Confirmacao;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.validation.constraints.NotNull;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "emitentes")
public class Emitente extends Pessoa {
    
    @NotNull(message = "{pessoa.licenca.vazia}")
    private LocalDate licenca;
    
    @Column(name = "isento_iss")
    @NotNull(message = "{pessoa.isento.iss.vazio}")
    @Enumerated(EnumType.STRING)
    private Confirmacao isentoIss;
    
    @Column(name = "desconta_inss")
    @NotNull(message = "{pessoa.desconta.inss.vazio}")
    @Enumerated(EnumType.STRING)
    private Confirmacao decontaInss;
    
    @Column(name = "desconta_irrf")
    @NotNull(message = "{pessoa.desconta.irrf.vazio}")
    @Enumerated(EnumType.STRING)
    private Confirmacao descontaIrrf;
    
    @Column(name = "simples_nacional")
    @NotNull(message = "{pessoa.simples.nacional.vazio}")
    @Enumerated(EnumType.STRING)
    private Confirmacao simplesNacional;
    
    @Column(name = "numero_dependentes")
    @NotNull(message = "{pessoa.numero.dependentes.vazio}")
    private Integer numeroDependentes;

    public LocalDate getLicenca() {
        return licenca;
    }

    public void setLicenca(LocalDate licenca) {
        this.licenca = licenca;
    }

    public Confirmacao getIsentoIss() {
        return isentoIss;
    }

    public void setIsentoIss(Confirmacao isentoIss) {
        this.isentoIss = isentoIss;
    }

    public Confirmacao getDecontaInss() {
        return decontaInss;
    }

    public void setDecontaInss(Confirmacao decontaInss) {
        this.decontaInss = decontaInss;
    }

    public Confirmacao getDescontaIrrf() {
        return descontaIrrf;
    }

    public void setDescontaIrrf(Confirmacao descontaIrrf) {
        this.descontaIrrf = descontaIrrf;
    }

    public Confirmacao getSimplesNacional() {
        return simplesNacional;
    }

    public void setSimplesNacional(Confirmacao simplesNacional) {
        this.simplesNacional = simplesNacional;
    }

    public Integer getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(Integer numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
    
}
