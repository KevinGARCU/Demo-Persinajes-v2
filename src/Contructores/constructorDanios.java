/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructores;

import Fabricas.FabricaDanios;

/**
 *
 * @author Kevin Garcia
 */
public class constructorDanios extends constructorPersonajes{
    
    FabricaDanios fb = new FabricaDanios();

    @Override
    public void crearSprites() {
        personaje.setAbajo(fb.crearAbajo());
        personaje.setArriba(fb.crearArriba());
        personaje.setDerecha(fb.crearDerecha());
        personaje.setIzquierda(fb.crearIzquierda());
    }
    
}
