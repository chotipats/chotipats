package chotipat.coe.advancecompro;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MyWindow2 extends MyWindow implements ItemListener{

    public MyWindow2(String title){
        super(title);
    }

    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { public void run() {
				createAndShowGUI();
			}
		});
    }

    public static void createAndShowGUI() {
        MyWindow2 window = new MyWindow2("My Window2");
        window.addComponents();
        window.addListeners();
        window.setFrameFeatures();
    }

    @Override
    protected void addListeners(){
        super.addListeners();
        javaRB.addItemListener(this);
        pythonRB.addItemListener(this);
        //petList.addItemListener(this);
        petList.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object src = e.getSource();
        if(e.getStateChange() == ItemEvent.SELECTED){
            //if(src instanceof JRadioButton){
                            //JRadioButton button = (JRadioButton) e.getItem();
                JOptionPane.showMessageDialog(this, ((JRadioButton) e.getItem()).getText() + " is selectd");

            //} else if(src instanceof JComboBox){
                //JOptionPane.showMessageDialog(this, ((JComboBox) src).getSelectedItem().toString() + " is selectd");
            //}
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        super.actionPerformed(e);
        Object src = e.getSource();
        if(src instanceof JComboBox){
            JOptionPane.showMessageDialog(this, ((JComboBox) src).getSelectedItem().toString() + " is selectd");
        }
    }
}
