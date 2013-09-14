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
@Table(name="PlanoDeTrabalho")
public class PlanoDeTrabalho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Introducao")
    private String introducao;
    
    @Column(name="Justificativa")
    private String justificativa;
    
    @Column(name="Objetivos")
    private String objetivos;
    
    @Column(name="Metodologia")
    private String metodologia;
    
    @Column(name="ResultadoEsperado")
    private String resultadoEsperado;
    
    @Column(name="ReferenciaBibliografica")
    private String referenciaBibliografica;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataInicio")
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataTermino")
    private Date dataTermino;
    
    @Column(name="Status")
    private boolean status;
    
    @Column(name="Aluno")
    @ManyToOne
    private Aluno aluno;
    
    //Construtor

    public PlanoDeTrabalho() {
        this.introducao = "";
        this.justificativa = "";
        this.objetivos = "";
        this.metodologia = "";
        this.resultadoEsperado = "";
        this.referenciaBibliografica = "";
        this.dataInicio = new Date();
        this.dataTermino = new Date();
        this.status = true;
        this.aluno = new Aluno();
    }
    
    public PlanoDeTrabalho(Long id, String introducao, String justificativa, String objetivos, String metodologia, String resultadoEsperado, String referenciaBibliografica, Date dataInicio, Date dataTermino, boolean status, Aluno aluno) {
        this.id = id;
        this.introducao = introducao;
        this.justificativa = justificativa;
        this.objetivos = objetivos;
        this.metodologia = metodologia;
        this.resultadoEsperado = resultadoEsperado;
        this.referenciaBibliografica = referenciaBibliografica;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.status = status;
        this.aluno = aluno;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }

    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.introducao);
        hash = 73 * hash + Objects.hashCode(this.justificativa);
        hash = 73 * hash + Objects.hashCode(this.objetivos);
        hash = 73 * hash + Objects.hashCode(this.metodologia);
        hash = 73 * hash + Objects.hashCode(this.resultadoEsperado);
        hash = 73 * hash + Objects.hashCode(this.referenciaBibliografica);
        hash = 73 * hash + Objects.hashCode(this.dataInicio);
        hash = 73 * hash + Objects.hashCode(this.dataTermino);
        hash = 73 * hash + (this.status ? 1 : 0);
        hash = 73 * hash + Objects.hashCode(this.aluno);
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
        final PlanoDeTrabalho other = (PlanoDeTrabalho) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.introducao, other.introducao)) {
            return false;
        }
        if (!Objects.equals(this.justificativa, other.justificativa)) {
            return false;
        }
        if (!Objects.equals(this.objetivos, other.objetivos)) {
            return false;
        }
        if (!Objects.equals(this.metodologia, other.metodologia)) {
            return false;
        }
        if (!Objects.equals(this.resultadoEsperado, other.resultadoEsperado)) {
            return false;
        }
        if (!Objects.equals(this.referenciaBibliografica, other.referenciaBibliografica)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTermino, other.dataTermino)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlanoDeTrabalho{" + "introducao=" + introducao + ", justificativa=" + justificativa + ", objetivos=" + objetivos + ", resultadoEsperado=" + resultadoEsperado + ", referenciaBibliografica=" + referenciaBibliografica + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + '}';
    }
    
    
}
