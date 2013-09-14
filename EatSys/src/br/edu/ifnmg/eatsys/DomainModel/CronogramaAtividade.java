/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author emerson
 */
@Entity
@Table(name="CronogramaAtividades")
public class CronogramaAtividade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Descricao")
    private String descricao;
    
    @Column(name="NumeroAtividade")
    private int numeroAtividade;
   
    @Temporal(TemporalType.DATE)
    @Column(name="DataInicio")
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    @Column(name="NumeroAtividade")
    private Date dataFim;
    
    @Column(name="NumeroAtividade")
    private boolean status;
    
    @Column(name="NumeroAtividade")
    @ManyToOne
    private PlanoDeTrabalho atividadePlanoTrabalho;
    
    //Construtor

     public CronogramaAtividade() {
        this.descricao = "";
        this.numeroAtividade = 0;
        this.dataInicio = new Date();
        this.dataFim = new Date();
        this.status = true;
        this.atividadePlanoTrabalho = new PlanoDeTrabalho();
    }
    
    public CronogramaAtividade(Long id, String descricao, int numeroAtividade, Date dataInicio, Date dataFim, boolean status, PlanoDeTrabalho atividadePlanoTrabalho) {
        this.id = id;
        this.descricao = descricao;
        this.numeroAtividade = numeroAtividade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.atividadePlanoTrabalho = atividadePlanoTrabalho;
    }
    
    //Metodos
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroAtividade() {
        return numeroAtividade;
    }

    public void setNumeroAtividade(int numeroAtividade) {
        this.numeroAtividade = numeroAtividade;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public PlanoDeTrabalho getAtividadePlanoTrabalho() {
        return atividadePlanoTrabalho;
    }

    public void setAtividadePlanoTrabalho(PlanoDeTrabalho atividadePlanoTrabalho) {
        this.atividadePlanoTrabalho = atividadePlanoTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + this.numeroAtividade;
        hash = 97 * hash + Objects.hashCode(this.dataInicio);
        hash = 97 * hash + Objects.hashCode(this.dataFim);
        hash = 97 * hash + (this.status ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.atividadePlanoTrabalho);
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
        final CronogramaAtividade other = (CronogramaAtividade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (this.numeroAtividade != other.numeroAtividade) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.atividadePlanoTrabalho, other.atividadePlanoTrabalho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CronogramaAtividade{" + "id=" + id + ", descricao=" + descricao + ", numeroAtividade=" + numeroAtividade + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", status=" + status + ", atividadePlanoTrabalho=" + atividadePlanoTrabalho + '}';
    }
    
    
}
