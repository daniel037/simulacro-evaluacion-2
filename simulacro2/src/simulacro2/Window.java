/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author oop
 */
public class Window extends JFrame{
    private JMenuBar      menu;
    private JMenu         ejercicios,help;
    private JMenuItem     escaner,lista,acerca;
    private JDesktopPane  mdi;
    
    //--------------------------------------------------
    public Window()
    {
        super("Evaluacion 3 Grupo 1");
        setSize(600,400);
        widgets();
        evens();
        setVisible(true);
    }
    
    //------------------------------------------------------------------------
    public void widgets()
    {
        menu     = new JMenuBar();
        help     = new JMenu("Help");
        ejercicios     = new JMenu("Ejercicios");
        escaner  = new JMenuItem("Escaner");
        lista    = new JMenuItem("Lista de chequeo");
        acerca   = new JMenuItem("Acerca de");
        mdi      = new JDesktopPane();

        
        setJMenuBar(menu);
        menu.add(ejercicios);
        menu.add(help);
        
        ejercicios.add(escaner);
        ejercicios.addSeparator();
        ejercicios.add(lista);
        
        help.add(acerca);
        
        add(mdi); // por defecto se coloca en el borderLayout en el centro... :O   
    }
    //----------------------------------------------------------------------
    public  void evens()
    {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        //------------------------------------------       
    
        escaner.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 mdi.add(new Escaner());
             }
         });
        //---------------------------------------------
        lista.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               mdi.add(new ListaChequeo());
             }
         });
        //----------------------------------------------
        acerca.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 mdi.add(new Acerca());
             }
         });
    }
    
    public static void main(String[] args) {
        new Window();
    }
}
