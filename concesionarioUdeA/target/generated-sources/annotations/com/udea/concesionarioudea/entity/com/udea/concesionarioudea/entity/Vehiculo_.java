package com.udea.concesionarioudea.entity.com.udea.concesionarioudea.entity;

import com.udea.concesionarioudea.entity.com.udea.concesionarioudea.entity.Marca;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-19T17:24:50")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, String> licensePlate;
    public static volatile SingularAttribute<Vehiculo, Date> entryDate;
    public static volatile SingularAttribute<Vehiculo, Double> price;
    public static volatile SingularAttribute<Vehiculo, String> pictureUrl;
    public static volatile SingularAttribute<Vehiculo, Marca> marca1;
    public static volatile SingularAttribute<Vehiculo, String> model;
    public static volatile SingularAttribute<Vehiculo, Long> id;
    public static volatile SingularAttribute<Vehiculo, Integer> manufactureYear;
    public static volatile SingularAttribute<Vehiculo, String> mileage;

}