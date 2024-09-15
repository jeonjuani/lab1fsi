/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.concesionariofsi.ejb;

import com.udea.concesionariofsi.entity.com.udea.concesionariofsi.entity.Vehiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sirro
 */
@Stateless
public class VehiculoFacade extends AbstractFacade<Vehiculo> {

    @PersistenceContext(unitName = "com.udea_ConcesionarioFSI_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculoFacade() {
        super(Vehiculo.class);
    }
    
}
