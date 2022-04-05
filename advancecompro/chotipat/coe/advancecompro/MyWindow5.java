package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyWindow5 extends MyWindow4{

    protected JList sportList;

    public MyWindow5(String title) {
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
        MyWindow5 window = new MyWindow5("My Window5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    @Override
    protected void addComponents(){
        super.addComponents();
        String[] sports = {"Football", "Swimming", "Tennis", "Golf", "Racing", "Basketball"};
        sportList = new JList(sports);
        midPanel.add(sportList, BorderLayout.CENTER);
    }

}
