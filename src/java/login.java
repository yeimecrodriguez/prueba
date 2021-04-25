/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author ydds2
 */
@Named(value = "login")
@SessionScoped
public class login implements Serializable {

    /**
     * Creates a new instance of login
     */
    private String  nombreusuario;
    private String password;
    
     
    public login() {
    }
    
    
}
