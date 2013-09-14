/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsys.DomainModel;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author emerson
 */
@Entity
@DiscriminatorValue("Orientador") //Vai para a coluna Referencia_FK em Pessoa
@Table(name="Orientadores")
public class Orientador extends Pessoa implements Serializable {
 
    @Column(name="MatriculaSiape")
    private int matriculaSiape;
    
    @Column(name="LocalPermanencia")
    private String localPermanencia;
    
    @Column(name="FormacaoUniversitaria")
    private String formacaoUniversitaria;
    
    @Column(name="TituloAcademico")
    private String tituloAcademico;
    
    @Column(name="TelefoneRamal")
    private String telefoneRamal;

    
    //Construtor
    public Orientador() {
        this.matriculaSiape = 0;
        this.localPermanencia = "";
        this.formacaoUniversitaria = "";
        this.telefoneRamal = "";
        this.tituloAcademico = "";
    
    }
    
    public Orientador(int matriculaSiape, String localPermanencia, String formacaoUniversitaria, String tituloAcademico, String telefoneRamal) {
        this.matriculaSiape = matriculaSiape;
        this.localPermanencia = localPermanencia;
        this.formacaoUniversitaria = formacaoUniversitaria;
        this.tituloAcademico = tituloAcademico;
        this.telefoneRamal = telefoneRamal;
    }

    public int getMatriculaSiape() {
        return matriculaSiape;
    }

    public void setMatriculaSiape(int matriculaSiape) {
        this.matriculaSiape = matriculaSiape;
    }

    public String getLocalPermanencia() {
        return localPermanencia;
    }

    public void setLocalPermanencia(String localPermanencia) {
        this.localPermanencia = localPermanencia;
    }

    public String getFormacaoUniversitaria() {
        return formacaoUniversitaria;
    }

    public void setFormacaoUniversitaria(String formacaoUniversitaria) {
        this.formacaoUniversitaria = formacaoUniversitaria;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getTelefoneRamal() {
        return telefoneRamal;
    }

    public void setTelefoneRamal(String telefoneRamal) {
        this.telefoneRamal = telefoneRamal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.matriculaSiape;
        hash = 97 * hash + Objects.hashCode(this.localPermanencia);
        hash = 97 * hash + Objects.hashCode(this.formacaoUniversitaria);
        hash = 97 * hash + Objects.hashCode(this.tituloAcademico);
        hash = 97 * hash + Objects.hashCode(this.telefoneRamal);
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
        final Orientador other = (Orientador) obj;
        if (this.matriculaSiape != other.matriculaSiape) {
            return false;
        }
        if (!Objects.equals(this.localPermanencia, other.localPermanencia)) {
            return false;
        }
        if (!Objects.equals(this.formacaoUniversitaria, other.formacaoUniversitaria)) {
            return false;
        }
        if (!Objects.equals(this.tituloAcademico, other.tituloAcademico)) {
            return false;
        }
        if (!Objects.equals(this.telefoneRamal, other.telefoneRamal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orientador{" + "matriculaSiape=" + matriculaSiape + ", localPermanencia=" + localPermanencia + ", formacaoUniversitaria=" + formacaoUniversitaria + ", tituloAcademico=" + tituloAcademico + ", telefoneRamal=" + telefoneRamal + '}';
    }
    
   
}
