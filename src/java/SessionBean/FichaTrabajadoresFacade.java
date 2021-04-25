/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import entities.FichaTrabajadores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ydds2
 */
@Stateless
public class FichaTrabajadoresFacade extends AbstractFacade<FichaTrabajadores> {

    @PersistenceContext(unitName = "proyLp2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichaTrabajadoresFacade() {
        super(FichaTrabajadores.class);
    }
    
}
