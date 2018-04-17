/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufrn.projeto.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "TEMPERATURA")
public class Temperatura implements Serializable{    
    @Id
    @Column(name ="id_temperatura" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    
    @Column(nullable = false)
    private double value;
    
    @Column(name="data_coleta", nullable = false)
    private Date dataColeta;
    
    
    
    public Temperatura() {
    }
    public Temperatura(Integer id, double value, Date dataColeta) {
        this.id = id;
        this.value = value;
        this.dataColeta = dataColeta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "id=" + id + ", value=" + value + ", dataColeta=" + dataColeta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.dataColeta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Temperatura other = (Temperatura) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataColeta, other.dataColeta)) {
            return false;
        }
        return true;
    }
     
    
}
