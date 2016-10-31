/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro2;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author oop
 */
public class Escaner extends JInternalFrame{
    private MyButton boton;
    private JLabel escan;
    //------------------------------------------

    public Escaner()  
    {
        super("Escaner",true,true,true,true);
        boton = new MyButton(0);
        escan =  new JLabel();
        widgets();
        setSize(300,300);
        setVisible(true);        
    
    }
    //------------------------------
    public void widgets()
    {
        add(boton, BorderLayout.SOUTH);
        add(escan,BorderLayout.CENTER);
    }
    
}
