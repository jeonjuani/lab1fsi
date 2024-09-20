/**
 * This file was generated by the Jeddict
 */
package com.udea.concesionarioudea.entity.com.udea.concesionarioudea.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Juan Sebastian
 */
@Entity
@IdClass(VehiculoPK.class)
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model", unique = true, updatable = false, nullable = false)
    @Basic
    private String model;

    @Column(name = "price", nullable = false)
    @Basic
    private double price;

    @Column(name = "pictureUrl", unique = true, nullable = false)
    @Basic
    private String pictureUrl;

    @Column(name = "mileage")
    @Basic
    private String mileage;

    @Column(name = "entryDate", updatable = false, nullable = false)
    @Basic
    @Temporal(TemporalType.DATE)
    private Date entryDate;

    @Column(name = "licensePlate", unique = true, updatable = false)
    @Basic
    private String licensePlate;

    @Column(name = "manufactureYear", updatable = false, nullable = false)
    @Basic
    private int manufactureYear;

    @Column(name = "marca", updatable = false, nullable = false)
    @Basic
    private String marca;

    @Id
    @ManyToOne
    private Marca marca1;

    public Vehiculo(Long id, String model, double price, String pictureUrl, String mileage, Date entryDate, String licensePlate, int manufactureYear, String marca) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.mileage = mileage;
        this.entryDate = entryDate;
        this.licensePlate = licensePlate;
        this.manufactureYear = manufactureYear;
        this.marca = marca;
    }

    public Vehiculo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getMileage() {
        return this.mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Optional<String> getLicensePlate() {
        return Optional.ofNullable(this.licensePlate);
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getManufactureYear() {
        return this.manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Marca getMarca1() {
        return this.marca1;
    }

    public void setMarca1(Marca marca1) {
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
        final Vehiculo other = (Vehiculo) obj;
        if (!java.util.Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + " id=" + id + ", model=" + model + ", price=" + price + ", pictureUrl=" + pictureUrl + ", mileage=" + mileage + ", entryDate=" + entryDate + ", licensePlate=" + licensePlate + ", manufactureYear=" + manufactureYear + ", marca=" + marca + '}';
    }

}