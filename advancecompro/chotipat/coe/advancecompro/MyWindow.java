package chotipat.coe.advancecompro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyWindow extends JFrame implements ActionListener{
    protected JButton okBut, canBut;
    protected JPanel buttonPanel, mainPanel, outputPanel, RBPanel, midPanel;
    protected JTextArea output;
    protected JRadioButton javaRB, pythonRB;
    protected ButtonGroup bg;
    protected JComboBox petList;

    public MyWindow(String title){
        super(title);
    }

    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { public void run() {
				createAndShowGUI();
			}
		});
    }

    public static void createAndShowGUI() {
        MyWindow window = new MyWindow("My Window");
        window.addComponents();
        window.addListeners();
        window.setFrameFeatures();
    }

    protected void addListeners() {
        okBut.addActionListener(this);
        canBut.addActionListener(this);
    }

    protected void addComponents() {
        okBut = new JButton("OK");
        canBut = new JButton("Cancel");

        mainPanel = new JPanel(new BorderLayout());

        buttonPanel = new JPanel();
        buttonPanel.add(canBut);
        buttonPanel.add(okBut);

        outputPanel = new JPanel();
        output = new JTextArea(5,20);
        outputPanel.add(output);

        javaRB = new JRadioButton("Java", true);
        pythonRB = new JRadioButton("Python");
        bg = new ButtonGroup();
        bg.add(javaRB);
        bg.add(pythonRB);
        RBPanel = new JPanel();
        RBPanel.add(javaRB);
        RBPanel.add(pythonRB);

        midPanel = new JPanel(new BorderLayout());
        String[] animals = {"bird", "Cat", "dog"};
        petList = new JComboBox(animals);
        midPanel.add(RBPanel, BorderLayout.NORTH);
        midPanel.add(petList, BorderLayout.SOUTH);

        mainPanel.add(outputPanel, BorderLayout.NORTH);
        mainPanel.add(midPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);

        // setsize
        pack();

        //set visible
        setVisible(true);

        //set exit on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        StringBuffer showMsg = new StringBuffer();
        if(src == okBut){
            showMsg.append(output.getText());
            if(javaRB.isSelected()){
                showMsg.append("\nJava");
            } else if(pythonRB.isSelected()){
                showMsg.append("\nPython");
            }
            showMsg.append("\n"+petList.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, showMsg);
        } else if(src == canBut){
            output.setText("");
            if(!javaRB.isSelected()){
                javaRB.setSelected(true);
            }
            if(petList.getSelectedItem().toString() != "bird"){
                petList.setSelectedIndex(0);
            }
        }
    }
}
