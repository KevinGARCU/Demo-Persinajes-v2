/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimientos.Abajo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class AbajoFlancos extends Abajo{

    @Override
    public Image[] getSprites() {
        Image[] abajo = {new ImageIcon(getClass().getResource("../Sprites/Flancos/amg1_bk1.gif")).getImage(),
            new ImageIcon(getClass().getResource("../Sprites/Flancos/amg1_bk2.gif")).getImage()};
        return abajo;
    }
    
}
