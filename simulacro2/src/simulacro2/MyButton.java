/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro2;

import javax.swing.JButton;

/**
 *
 * @author oop
 */
public class MyButton extends JButton{
    private String v;
    //----------------------------
    public MyButton(int v)
    {
        super("Autor: ");
//        this.v = v;
    }
    //------------------------------------
    public void show()
    {
        setText(""+v);
    }

    
}
