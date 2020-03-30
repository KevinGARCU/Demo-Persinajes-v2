/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos.Izquierda;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class IzquierdaTanques extends Izquierda {

    @Override
    public Image[] getSprites() {
        Image[] izquierda = {new ImageIcon(getClass().getResource("../Sprites/Tanques/avt1_lf1.gif")).getImage(),
            new ImageIcon(getClass().getResource("../Sprites/Tanques/avt1_lf2.gif")).getImage()};
        return izquierda;
    }

}
