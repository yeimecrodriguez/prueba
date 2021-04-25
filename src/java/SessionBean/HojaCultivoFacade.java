/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.HojaCultivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ydds2
 */
@Stateless
public class HojaCultivoFacade extends AbstractFacade<HojaCultivo> {

    @PersistenceContext(unitName = "proyLp2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HojaCultivoFacade() {
        super(HojaCultivo.class);
    }
    
}
