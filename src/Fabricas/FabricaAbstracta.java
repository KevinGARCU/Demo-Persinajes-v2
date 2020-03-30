/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Kevin Garcia
 */
public interface FabricaAbstracta {
    public abstract Image[] crearArriba();
    public abstract Image[] crearAbajo();
    public abstract Image[] crearIzquierda();
    public abstract Image[] crearDerecha();
}
