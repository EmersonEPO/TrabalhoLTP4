/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
@Entity
@Table(name="Nacionalidades")
public class Nacionalidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="Nome")
    private String nomeNacionalidade;

    //Construtor

    public Nacionalidade(Long id, String nomeNacionalidade) {
        this.id = id;
        this.nomeNacionalidade = nomeNacionalidade;
    }
    
    //Metodos
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeNacionalidade() {
        return nomeNacionalidade;
    }

    public void setNomeNacionalidade(String nomeNacionalidade) {
        this.nomeNacionalidade = nomeNacionalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.nomeNacionalidade);
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
        final Nacionalidade other = (Nacionalidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nomeNacionalidade, other.nomeNacionalidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomeNacionalidade;
    }
    
   
    
    
}
