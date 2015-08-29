package br.com.os2.iss.entidades;

import br.com.os2.iss.enums.TipoPessoa;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "tipo_pessoa")
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;
    
    @Size(min = 3, max = 70, message = "{pessoa.nome.tamanho}")
    private String nome;
    
    @Column(name = "data_cadastro")
    @NotNull(message = "{pessoa.data.cadastro.vazia}")
    private LocalDate dataCadastro;
    
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    
    @OneToOne
    private Endereco endereco;
    
    @OneToOne
    private Contato contato;

    @OneToOne
    private Documento documento;
    
    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
}
