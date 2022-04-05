package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

import org.w3c.dom.events.Event;

public class MyWindow7 extends MyWindow6 {

    public MyWindow7(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MyWindow7 window = new MyWindow7("My Window7");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    @Override
    protected void addListeners() {
        super.addListeners();

        openMI.addActionListener(this);
        saveMI.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        JFileChooser fc = new JFileChooser();
        if (src == openMI) {
            int rt = fc.showOpenDialog(this);
            if (rt == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this, fc.getSelectedFile().getName() + " is opened");
            } else {
                JOptionPane.showMessageDialog(this, " Open file is cancled");
            }
        } else if (src == saveMI) {
            int rt = fc.showSaveDialog(this);
            if (rt == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this, fc.getSelectedFile().getName() + " is saved");
            } else {
                JOptionPane.showMessageDialog(this, " Save file is cancled");
            }
        }
    }
}
