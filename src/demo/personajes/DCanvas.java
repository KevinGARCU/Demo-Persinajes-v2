/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.personajes;

import Fabricas.Personajes;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Kevin Garcia
 */
public class DCanvas extends Canvas {

    Image imgBuffer;
    Graphics miG;
    Timer timer;
    Personajes per;

    public DCanvas() {
        timer = new Timer();
        setBounds(0, 0, 196, 182);
        imgBuffer = new BufferedImage(600, 400, BufferedImage.OPAQUE);
        timer.schedule(new Actualizador(), 0, 100);

    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    
    
    public void paint(Graphics g){
        miG = imgBuffer.getGraphics();
        
        
    }
    
    private class Actualizador extends TimerTask{

        @Override
        public void run() {           
            repaint();
        }
        
    }

}
