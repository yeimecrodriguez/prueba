/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.Insumos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ydds2
 */
@Stateless
public class InsumosFacade extends AbstractFacade<Insumos> {

    @PersistenceContext(unitName = "proyLp2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InsumosFacade() {
        super(Insumos.class);
    }
    
}
