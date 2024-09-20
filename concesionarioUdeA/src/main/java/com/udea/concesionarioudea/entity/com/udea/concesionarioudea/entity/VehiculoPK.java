//
// This file was generated by the Jeddict
//
package com.udea.concesionarioudea.entity.com.udea.concesionarioudea.entity;

import java.io.Serializable;
import java.util.Objects;

public class VehiculoPK implements Serializable {

    private Long id;

    private Long marca1;

    public VehiculoPK() {
    }

    public VehiculoPK(Long id, Long marca1) {
        this.id = id;
        this.marca1 = marca1;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarca1() {
        return this.marca1;
    }

    public void setMarca1(Long marca1) {
        this.marca1 = marca1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Objects.equals(getClass(), obj.getClass())) {
            return false;
        }
        final VehiculoPK other = (VehiculoPK) obj;
        if (!java.util.Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        if (!java.util.Objects.equals(this.getMarca1(), other.getMarca1())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getId());
        hash = 31 * hash + Objects.hashCode(this.getMarca1());
        return hash;
    }

    @Override
    public String toString() {
        return "VehiculoPK{" + " id=" + id + ", marca1=" + marca1 + '}';
    }

}