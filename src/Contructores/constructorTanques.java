/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructores;

import Fabricas.FabricaTanques;

/**
 *
 * @author Kevin Garcia
 */
public class constructorTanques extends constructorPersonajes{
    
    FabricaTanques fb = new FabricaTanques();

    @Override
    public void crearSprites() {
        personaje.setAbajo(fb.crearAbajo());
        personaje.setArriba(fb.crearArriba());
        personaje.setDerecha(fb.crearDerecha());
        personaje.setIzquierda(fb.crearIzquierda());
    }
    
}
