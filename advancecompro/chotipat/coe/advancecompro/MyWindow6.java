package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

public class MyWindow6 extends MyWindow5 implements ListSelectionListener{

    ListSelectionModel lsm;

    public MyWindow6(String title) {
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
        MyWindow6 window = new MyWindow6("My Window6");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    @Override
    protected void addListeners(){
        super.addListeners();
        lsm = sportList.getSelectionModel();
        lsm.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        StringBuffer results = new StringBuffer();
        boolean isAdjusting = e.getValueIsAdjusting();
        if (!isAdjusting) {
            if (!lsm.isSelectionEmpty()) {
                ArrayList<String> list = (ArrayList) sportList.getSelectedValuesList();
                for (int i = 0; i < list.size(); i++) {
                    if (i > 0) {
                        results.append(", ");
                    }
                    results.append(list.get(i));
                }
            }
            JOptionPane.showMessageDialog(this, results.toString());
        }        
    }
}
