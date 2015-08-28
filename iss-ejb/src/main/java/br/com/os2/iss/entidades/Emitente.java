package br.com.os2.iss.entidades;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

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
    @NotEmpty(message = "{pessoa.isentoIss.vazio}")
    private String isentoIss;
    
    @Column(name = "desconta_inss")
    @NotEmpty(message = "{pessoa.descontaInss.vazio}")
    private String decontaInss;
    
    @Column(name = "desconta_irrf")
    @NotEmpty(message = "{pessoa.descontaIrrf.vazio}")
    private String descontaIrrf;
    
    @Column(name = "simples_nacional")
    @NotEmpty(message = "{pessoa.simpleNacional.vazio}")
    private String simplesNacional;
    
    @Column(name = "numero_dependentes")
    @NotEmpty(message = "{pessoa.numeroDependentes.vazio}")
    private Integer numeroDependentes;

    public LocalDate getLicenca() {
        return licenca;
    }

    public void setLicenca(LocalDate licenca) {
        this.licenca = licenca;
    }

    public String getIsentoIss() {
        return isentoIss;
    }

    public void setIsentoIss(String isentoIss) {
        this.isentoIss = isentoIss;
    }

    public String getDecontaInss() {
        return decontaInss;
    }

    public void setDecontaInss(String decontaInss) {
        this.decontaInss = decontaInss;
    }

    public String getDescontaIrrf() {
        return descontaIrrf;
    }

    public void setDescontaIrrf(String descontaIrrf) {
        this.descontaIrrf = descontaIrrf;
    }

    public String getSimplesNacional() {
        return simplesNacional;
    }

    public void setSimplesNacional(String simplesNacional) {
        this.simplesNacional = simplesNacional;
    }

    public Integer getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(Integer numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
    
}
