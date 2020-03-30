/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Kevin Garcia
 */
public class Personajes {
    
    Image[] arriba;
    Image[] abajo;
    Image[] izquierda;
    Image[] derecha;

    public void setArriba(Image[] arriba) {
        this.arriba = arriba;
    }

    public void setAbajo(Image[] abajo) {
        this.abajo = abajo;
    }

    public void setIzquierda(Image[] izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Image[] derecha) {
        this.derecha = derecha;
    }

    public Image[] getArriba() {
        return arriba;
    }

    public Image[] getAbajo() {
        return abajo;
    }

    public Image[] getIzquierda() {
        return izquierda;
    }

    public Image[] getDerecha() {
        return derecha;
    }
    
    public void dibujar(Graphics g, int direccion) {
        int cont = 0;
        cont++;
        cont = cont % 2;
        Graphics2D g2d = (Graphics2D)g;
        
        switch(direccion){
            case 1:
                g2d.drawImage(arriba[cont], 98, 91, null);//this
                break;
            case 2:
                g2d.drawImage(abajo[cont], 98, 91, null);//this
                break;
            case 3: 
                g2d.drawImage(derecha[cont], 98, 91, null);//this
                break;
            case 4:
                g2d.drawImage(izquierda[cont], 98, 91, null);//this
                break;
        }
        
    }
    
    
}
