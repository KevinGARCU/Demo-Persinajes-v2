/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructores;

import Fabricas.*;

/**
 *
 * @author Kevin Garcia
 */
public abstract class constructorPersonajes {
    
    protected Personajes personaje;
    
    
    public void nuevo(){
        personaje = new Personajes();
    }
    
    public Personajes obtenerPersonaje(){
        return personaje;
    }
    
    public abstract void crearSprites();
    
}
