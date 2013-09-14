/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author emerson
 */
@Entity
@Table(name="ProjetosPesquisa")
public class ProjetoPesquisa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Titulo")
    private String titulo;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataInicio")
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataTermino")
    private Date dataTermino;
    
    @Column(name="GrupoPesquisa")
    private String grupoPesquisa;
    
    @Column(name="Resumo")
    private String resumo;
    
    @Column(name="FinanciamentoAprovado")
    private int financiamentoAprovado;
    
    @Column(name="ValorFinanciamento")
    private float valorFinanciamento;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DataFinanciamento")
    private Date dataFinanciamento;
    
    @Column(name="BolsaIniciacao")
    private int bolsasIniciacao;
    
    @Column(name="NumeroBolsas")
    private int numeroBolsas;
    
    @Column(name="AgenciaFinanciadora")
    private String agenciaFinanciadora;
    
    @Column(name="Convenio")
    private int convenio;
    
    @Column(name="NomeConvenio")
    private String nomeConvenio;
    
    @Column(name="Status")
    private int status;
    
    @Column(name="Fundacao")
    private int funcadao;
    
    @Column(name="FundacaoNome")
    private String fundacaoNome;
    
    @Column(name="ProjetoMulticampi")
    private int projetoMulticampi;
   
  
    @Column(name="Campus_Fk")
    @ManyToOne
    private Campus campus;
    
    @Column(name="Orientador_Fk")
    @ManyToOne
    private Orientador orientador;
    
    @Column(name="AreConhecimento_FK")
    @ManyToOne
    private AreaConhecimento_CnpqSubAreas areaConhecimento;
    
    @Column(name="Aluno_FK")
    @ManyToOne
    private Aluno aluno;
    
    @Column(name="ListaParticipantes_FK")
    @OneToMany
    private List<ParticipanteProjeto> listaParticipantes;
    
    //Construtor

     public ProjetoPesquisa() {
        this.titulo = "";
        this.dataInicio = new Date();
        this.dataTermino = new Date();
        this.grupoPesquisa = "";
        this.resumo = "";
        this.financiamentoAprovado = 0;
        this.valorFinanciamento = 0;
        this.dataFinanciamento = new Date();
        this.bolsasIniciacao = 0;
        this.numeroBolsas = 0;
        this.agenciaFinanciadora = "";
        this.convenio = 0;
        this.nomeConvenio = "";
        this.status = 0;
        this.funcadao = 0;
        this.fundacaoNome = "";
        this.projetoMulticampi = 0;
        this.campus = new Campus();
        this.orientador = new Orientador();
        this.areaConhecimento = new AreaConhecimento_CnpqSubAreas();
        this.aluno = new Aluno();
        this.listaParticipantes = new ArrayList<ParticipanteProjeto>();
    }
    
    public ProjetoPesquisa(Long id, String titulo, Date dataInicio, Date dataTermino, String grupoPesquisa, String resumo, int financiamentoAprovado, float valorFinanciamento, Date dataFinanciamento, int bolsasIniciacao, int numeroBolsas, String agenciaFinanciadora, int convenio, String nomeConvenio, int status, int funcadao, String fundacaoNome, int projetoMulticampi, Campus campus, Orientador orientador, AreaConhecimento_CnpqSubAreas areaConhecimento, Aluno aluno, List<ParticipanteProjeto> listaParticipantes) {
        this.id = id;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.grupoPesquisa = grupoPesquisa;
        this.resumo = resumo;
        this.financiamentoAprovado = financiamentoAprovado;
        this.valorFinanciamento = valorFinanciamento;
        this.dataFinanciamento = dataFinanciamento;
        this.bolsasIniciacao = bolsasIniciacao;
        this.numeroBolsas = numeroBolsas;
        this.agenciaFinanciadora = agenciaFinanciadora;
        this.convenio = convenio;
        this.nomeConvenio = nomeConvenio;
        this.status = status;
        this.funcadao = funcadao;
        this.fundacaoNome = fundacaoNome;
        this.projetoMulticampi = projetoMulticampi;
        this.campus = campus;
        this.orientador = orientador;
        this.areaConhecimento = areaConhecimento;
        this.aluno = aluno;
        this.listaParticipantes = listaParticipantes;
    }
    
    //Metodos
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getGrupoPesquisa() {
        return grupoPesquisa;
    }

    public void setGrupoPesquisa(String grupoPesquisa) {
        this.grupoPesquisa = grupoPesquisa;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getFinanciamentoAprovado() {
        return financiamentoAprovado;
    }

    public void setFinanciamentoAprovado(int financiamentoAprovado) {
        this.financiamentoAprovado = financiamentoAprovado;
    }

    public float getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(float valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }

    public Date getDataFinanciamento() {
        return dataFinanciamento;
    }

    public void setDataFinanciamento(Date dataFinanciamento) {
        this.dataFinanciamento = dataFinanciamento;
    }

    public int getBolsasIniciacao() {
        return bolsasIniciacao;
    }

    public void setBolsasIniciacao(int bolsasIniciacao) {
        this.bolsasIniciacao = bolsasIniciacao;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public String getAgenciaFinanciadora() {
        return agenciaFinanciadora;
    }

    public void setAgenciaFinanciadora(String agenciaFinanciadora) {
        this.agenciaFinanciadora = agenciaFinanciadora;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFuncadao() {
        return funcadao;
    }

    public void setFuncadao(int funcadao) {
        this.funcadao = funcadao;
    }

    public String getFundacaoNome() {
        return fundacaoNome;
    }

    public void setFundacaoNome(String fundacaoNome) {
        this.fundacaoNome = fundacaoNome;
    }

    public int getProjetoMulticampi() {
        return projetoMulticampi;
    }

    public void setProjetoMulticampi(int projetoMulticampi) {
        this.projetoMulticampi = projetoMulticampi;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public AreaConhecimento_CnpqSubAreas getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaConhecimento_CnpqSubAreas areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<ParticipanteProjeto> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<ParticipanteProjeto> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }
    
    //Adicionar Particiapnte
    public void addParticipante(ParticipanteProjeto p){
        if(!listaParticipantes.contains(p)){
            listaParticipantes.add(p);
        }
    }
    
    //Remover Participante
    public void removerParticipante(ParticipanteProjeto p){
        if(listaParticipantes.contains(p)){
            listaParticipantes.remove(p);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.dataInicio);
        hash = 53 * hash + Objects.hashCode(this.dataTermino);
        hash = 53 * hash + Objects.hashCode(this.grupoPesquisa);
        hash = 53 * hash + Objects.hashCode(this.resumo);
        hash = 53 * hash + this.financiamentoAprovado;
        hash = 53 * hash + Float.floatToIntBits(this.valorFinanciamento);
        hash = 53 * hash + Objects.hashCode(this.dataFinanciamento);
        hash = 53 * hash + this.bolsasIniciacao;
        hash = 53 * hash + this.numeroBolsas;
        hash = 53 * hash + Objects.hashCode(this.agenciaFinanciadora);
        hash = 53 * hash + this.convenio;
        hash = 53 * hash + Objects.hashCode(this.nomeConvenio);
        hash = 53 * hash + this.status;
        hash = 53 * hash + this.funcadao;
        hash = 53 * hash + Objects.hashCode(this.fundacaoNome);
        hash = 53 * hash + this.projetoMulticampi;
        hash = 53 * hash + Objects.hashCode(this.campus);
        hash = 53 * hash + Objects.hashCode(this.orientador);
        hash = 53 * hash + Objects.hashCode(this.areaConhecimento);
        hash = 53 * hash + Objects.hashCode(this.aluno);
        hash = 53 * hash + Objects.hashCode(this.listaParticipantes);
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
        final ProjetoPesquisa other = (ProjetoPesquisa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTermino, other.dataTermino)) {
            return false;
        }
        if (!Objects.equals(this.grupoPesquisa, other.grupoPesquisa)) {
            return false;
        }
        if (!Objects.equals(this.resumo, other.resumo)) {
            return false;
        }
        if (this.financiamentoAprovado != other.financiamentoAprovado) {
            return false;
        }
        if (Float.floatToIntBits(this.valorFinanciamento) != Float.floatToIntBits(other.valorFinanciamento)) {
            return false;
        }
        if (!Objects.equals(this.dataFinanciamento, other.dataFinanciamento)) {
            return false;
        }
        if (this.bolsasIniciacao != other.bolsasIniciacao) {
            return false;
        }
        if (this.numeroBolsas != other.numeroBolsas) {
            return false;
        }
        if (!Objects.equals(this.agenciaFinanciadora, other.agenciaFinanciadora)) {
            return false;
        }
        if (this.convenio != other.convenio) {
            return false;
        }
        if (!Objects.equals(this.nomeConvenio, other.nomeConvenio)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (this.funcadao != other.funcadao) {
            return false;
        }
        if (!Objects.equals(this.fundacaoNome, other.fundacaoNome)) {
            return false;
        }
        if (this.projetoMulticampi != other.projetoMulticampi) {
            return false;
        }
        if (!Objects.equals(this.campus, other.campus)) {
            return false;
        }
        if (!Objects.equals(this.orientador, other.orientador)) {
            return false;
        }
        if (!Objects.equals(this.areaConhecimento, other.areaConhecimento)) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.listaParticipantes, other.listaParticipantes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
    
}
