package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyWindow4 extends MyWindow3{

    public MyWindow4(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { public void run() {
				createAndShowGUI();
			}
		});
    }

    public static void createAndShowGUI() {
        MyWindow4 window = new MyWindow4("My Window4");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    @Override
    protected void addListeners(){
        super.addListeners();
        exitMI.addActionListener(this);
        blueMI.addActionListener(this);
        yellowMI.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
        Object src = e.getSource();
        if(src == exitMI){
            System.exit(1);
        } else if(src == blueMI){
            output.setForeground(Color.BLUE);
        } else if(src == yellowMI){
            output.setForeground(Color.YELLOW);
        } 
    }

    @Override
    public void addMenus(){
        super.addMenus();
        fileMenu.setMnemonic(KeyEvent.VK_F);
        configMenu.setMnemonic(KeyEvent.VK_C);

        setAccKey(exitMI, KeyEvent.VK_X);
        setAccKey(blueMI, KeyEvent.VK_B);
        setAccKey(yellowMI, KeyEvent.VK_Y);
    }

    public void setAccKey(JMenuItem menu, int mkey){
        menu.setAccelerator(KeyStroke.getKeyStroke(mkey, ActionEvent.CTRL_MASK ));
    }
}
