/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos.Derecha;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class DerechaTanques extends Derecha {

    @Override
    public Image[] getSprites() {
        Image[] derecha = {new ImageIcon(getClass().getResource("../Sprites/Tanques/avt1_rt1.gif")).getImage(),
            new ImageIcon(getClass().getResource("../Sprites/Tanques/avt1_rt2.gif")).getImage()};
        return derecha;
    }

}
