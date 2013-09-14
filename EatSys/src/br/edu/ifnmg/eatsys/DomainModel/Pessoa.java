/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author emerson
 */
@Entity
//Responsavel por criar as classes filhas separadas das classes mãe
@Inheritance(strategy= InheritanceType.JOINED)
//Aqui cria uma columa para indigar a quem pertende determinado registro
@DiscriminatorColumn(name="Referencia_FK", discriminatorType= DiscriminatorType.CHAR)
//valor ""
@DiscriminatorValue("")
//Nome da tabela
@Table(name="Pessoas")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Nome")
    private String nome;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataNascimeno")
    private Date dataNascimento;
    
    @Column(name="Cpf")
    private int cpf;
    
    @Column(name="Rg")
    private String rg;
    
    @Column(name="OrgaoExpedidor")
    private String rgOrgaoExpedidor;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataExpedicao")
    private Date rgDataExpedicao;
    
    @Column(name="Status")
    private boolean status;

    @Column(name="EnderecoRua")
    private String enderecoRua;
    
    @Column(name="EnderecoNumero")
    private String enderecoNumero;
    
    @Column(name="EnderecoBairro")
    private String enderecoBairro;
    
    @Column(name="EnderecoComplemento")
    private String enderecoComplmento;
    
    @Column(name="EnderecoCep")
    private int enderecoCep;
    
    @Column(name="TelefoneFixo")
    private String telefoneFixo;
    @Column(name="TelefoneCelular")
    private String telefoneCelular;
    
    @Column(name="Email")
    private String emailEndereco;
    
    //Relacionamentos
    @Column(name="UF")
    @ManyToOne
    private Estado estado;
    
    @Column(name="Nacionalidade")
    @ManyToOne
    private Nacionalidade nacionalidade;
    
    @Column(name="Cidade")
    @ManyToOne
    private Cidade cidade;
    
    @Column(name="Campus")
    @ManyToOne
    private Campus campus;
    
    //Construtores

    public Pessoa(Long id, String nome, Date dataNascimento, int cpf, String rg, String rgOrgaoExpedidor, Date rgDataExpedicao, boolean status, String enderecoRua, String enderecoNumero, String enderecoBairro, String enderecoComplmento, int enderecoCep, String telefoneFixo, String telefoneCelular, String emailEndereco, Estado estado, Nacionalidade nacionalidade, Cidade cidade, Campus campus) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.rgOrgaoExpedidor = rgOrgaoExpedidor;
        this.rgDataExpedicao = rgDataExpedicao;
        this.status = status;
        this.enderecoRua = enderecoRua;
        this.enderecoNumero = enderecoNumero;
        this.enderecoBairro = enderecoBairro;
        this.enderecoComplmento = enderecoComplmento;
        this.enderecoCep = enderecoCep;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.emailEndereco = emailEndereco;
        this.estado = estado;
        this.nacionalidade = nacionalidade;
        this.cidade = cidade;
        this.campus = campus;
    }
    
    //Metodos
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgOrgaoExpedidor() {
        return rgOrgaoExpedidor;
    }

    public void setRgOrgaoExpedidor(String rgOrgaoExpedidor) {
        this.rgOrgaoExpedidor = rgOrgaoExpedidor;
    }

    public Date getRgDataExpedicao() {
        return rgDataExpedicao;
    }

    public void setRgDataExpedicao(Date rgDataExpedicao) {
        this.rgDataExpedicao = rgDataExpedicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoComplmento() {
        return enderecoComplmento;
    }

    public void setEnderecoComplmento(String enderecoComplmento) {
        this.enderecoComplmento = enderecoComplmento;
    }

    public int getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(int enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmailEndereco() {
        return emailEndereco;
    }

    public void setEmailEndereco(String emailEndereco) {
        this.emailEndereco = emailEndereco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.dataNascimento);
        hash = 17 * hash + this.cpf;
        hash = 17 * hash + Objects.hashCode(this.rg);
        hash = 17 * hash + Objects.hashCode(this.rgOrgaoExpedidor);
        hash = 17 * hash + Objects.hashCode(this.rgDataExpedicao);
        hash = 17 * hash + (this.status ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.enderecoRua);
        hash = 17 * hash + Objects.hashCode(this.enderecoNumero);
        hash = 17 * hash + Objects.hashCode(this.enderecoBairro);
        hash = 17 * hash + Objects.hashCode(this.enderecoComplmento);
        hash = 17 * hash + this.enderecoCep;
        hash = 17 * hash + Objects.hashCode(this.telefoneFixo);
        hash = 17 * hash + Objects.hashCode(this.telefoneCelular);
        hash = 17 * hash + Objects.hashCode(this.emailEndereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.rgOrgaoExpedidor, other.rgOrgaoExpedidor)) {
            return false;
        }
        if (!Objects.equals(this.rgDataExpedicao, other.rgDataExpedicao)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.enderecoRua, other.enderecoRua)) {
            return false;
        }
        if (!Objects.equals(this.enderecoNumero, other.enderecoNumero)) {
            return false;
        }
        if (!Objects.equals(this.enderecoBairro, other.enderecoBairro)) {
            return false;
        }
        if (!Objects.equals(this.enderecoComplmento, other.enderecoComplmento)) {
            return false;
        }
        if (this.enderecoCep != other.enderecoCep) {
            return false;
        }
        if (!Objects.equals(this.telefoneFixo, other.telefoneFixo)) {
            return false;
        }
        if (!Objects.equals(this.telefoneCelular, other.telefoneCelular)) {
            return false;
        }
        if (!Objects.equals(this.emailEndereco, other.emailEndereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
     
}
