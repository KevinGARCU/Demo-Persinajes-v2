/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos.Arriba;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class ArribaSoportes extends Arriba {

    @Override
    public Image[] getSprites() {
        Image[] arriba = {new ImageIcon(getClass().getResource("../Sprites/Soportes/scr1_fr1.gif")).getImage(),
            new ImageIcon(getClass().getResource("../Sprites/Soportes/scr1_fr2.gif")).getImage()};
        return arriba;
    }

}
