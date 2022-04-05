package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyWindow3 extends MyWindow2 {

    JMenuBar menuBar;
    JMenu fileMenu, configMenu;
    JMenuItem openMI, saveMI, exitMI, blueMI, yellowMI;

    public MyWindow3(String title) {
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
        MyWindow3 window = new MyWindow3("My Window3");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }


    public void addMenus(){
        openMI = new JMenuItem("Open");
        saveMI = new JMenuItem("Save");
        exitMI = new JMenuItem("Exit");
        blueMI = new JMenuItem("Blue");
        yellowMI = new JMenuItem("Yellow");
        
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");

        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);

        configMenu.add(blueMI);
        configMenu.add(yellowMI);

        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        
        setJMenuBar(menuBar);

    }
}
