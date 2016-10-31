/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro2;

import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author oop
 */
public class Acerca extends JInternalFrame{
    private JLabel uni;
    private MyButton boton;

    public Acerca()
    {
        super("Acerca de",true,true,true,true);
        setSize(300,300);
        uni = new JLabel("Universidad de Nariño - 2016");
        boton = new MyButton(0);
        add(uni, BorderLayout.CENTER);
        add(boton,BorderLayout.SOUTH);
        
        setVisible(true);        
    }
    

    
}
