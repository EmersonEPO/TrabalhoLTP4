/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
@Entity
@Table(name="AreaConhecimento_Cnpq")
public class AreaConhecimento_Cnpq implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="Codigo")
    private String codigo;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="SubAreasCnpq")
    @OneToMany
    private List<AreaConhecimento_CnpqSubAreas> listaAreasCnpq;
    
    //Contrutor

     public AreaConhecimento_Cnpq() {
        this.codigo = "";
        this.nome = "";
        this.listaAreasCnpq = new ArrayList<AreaConhecimento_CnpqSubAreas>();
    }
    
    public AreaConhecimento_Cnpq(Long id, String codigo, String nome, List<AreaConhecimento_CnpqSubAreas> listaAreasCnpq) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.listaAreasCnpq = listaAreasCnpq;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AreaConhecimento_CnpqSubAreas> getListaAreasCnpq() {
        return listaAreasCnpq;
    }

    public void setListaAreasCnpq(List<AreaConhecimento_CnpqSubAreas> listaAreasCnpq) {
        this.listaAreasCnpq = listaAreasCnpq;
    }
    //Adicionar area para lista
    public void addListaAreasCnpq(AreaConhecimento_CnpqSubAreas cnpq){
        if(!listaAreasCnpq.contains(cnpq)){
            listaAreasCnpq.add(cnpq);
        }
    }
    
    //Remover area da lista
    public void removerListaAreasCnpq(AreaConhecimento_CnpqSubAreas cnpq){
        if(listaAreasCnpq.contains(cnpq)){
            listaAreasCnpq.remove(cnpq);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.codigo);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.listaAreasCnpq);
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
        final AreaConhecimento_Cnpq other = (AreaConhecimento_Cnpq) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.listaAreasCnpq, other.listaAreasCnpq)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + "-" + nome;
    }

    
   
}
