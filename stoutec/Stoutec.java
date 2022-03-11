package chotipats.stoutec;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;

public class Stoutec extends JFrame implements ActionListener {
    protected JFrame stoutecOutputFrame;
    protected JPanel mainPanel = new JPanel();
    protected JPanel subPanel1 = new JPanel();
    protected JPanel subPanel2 = new JPanel();
    protected JPanel subPanel3 = new JPanel();
    protected JPanel subPanel4 = new JPanel();
    protected JPanel subPanel5 = new JPanel();
    protected JPanel apPanel = new JPanel();
    protected JPanel outputPanel = new JPanel();
    protected JPanel outputButtonPanel = new JPanel();
    protected JPanel mainOutputPanel = new JPanel();
    protected JPanel titleTextPanel = new JPanel();
    protected JPanel titleTextPanel2 = new JPanel();
    protected JPanel titleTextPanel3 = new JPanel();
    protected JPanel abilityPanel = new JPanel();
    protected JPanel positionPanel = new JPanel();
    protected JPanel sexRadioButtonPanel = new JPanel();
    protected ButtonGroup sexRadioButtonGroup = new ButtonGroup();
    protected JRadioButton maleRadioButton, femaleRadioButton;
    protected JLabel apIDLabel, apNameLabel, apAddressLabel, apCHWLabel, apSexLabel, apEDLabel1, apEDLabel2, apMajLabel,
            qualDescLabel1, qualDescLabel2, qualDescLabel3, qualDescLabel4, qualDescLabel5, posNameLabel1,
            posNameLabel2, posNameLabel3, emptyLabel, emptyLabel2, titleLable, subTitleLable1, subTitleLable2,
            subTitleLable3,
            subTitleLabel4, subTitleLabel5;
    protected JLabel apIDOutput, apNameOutput, apAddressOutput, apCHWOutput, apSexOutput, apEDOutput, apMajOutput,
            qualDesc1Output, qualDesc2Output, qualDesc3Output, qualDesc4Output, qualDesc5Output, posName1Output,
            posName2Output, posName3Output , titleOutput;
    protected JTextField apIDTextField, apNameTextField, apAddressTextField, apCHWTextField, apEDTextField,
            apMajTextField;
    protected JComboBox qualDescComboBox1, qualDescComboBox2, qualDescComboBox3, qualDescComboBox4, qualDescComboBox5,
            posNameComboBox1, posNameComboBox2, posNameComboBox3;
    protected String[] qualDescComboBoxString1, qualDescComboBoxString2, qualDescComboBoxString3,
            qualDescComboBoxString4, qualDescComboBoxString5, posNameComboBoxString1, posNameComboBoxString2,
            posNameComboBoxString3;
    protected JButton okButton, editButton;
    protected Font font12Plain, font12Blod, font14Blod;

    public Stoutec(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        Stoutec stouTecForm = new Stoutec("STOU-TEC-FORM");
        stouTecForm.addComponent();
        stouTecForm.addListeners();
        stouTecForm.setFrameFeatures();
    }

    protected void addComponent() {
        this.setComponet();
        this.setComponetStyle();

        titleTextPanel.setLayout(new GridLayout(5, 1));
        titleTextPanel.add(titleLable);
        titleTextPanel.add(subTitleLable1);
        titleTextPanel.add(subTitleLable2);
        titleTextPanel.add(subTitleLable3);
        titleTextPanel.add(emptyLabel);

        apPanel.setLayout(new GridLayout(8, 2));
        apPanel.add(apIDLabel);
        apPanel.add(apIDTextField);
        apPanel.add(apNameLabel);
        apPanel.add(apNameTextField);
        apPanel.add(apAddressLabel);
        apPanel.add(apAddressTextField);
        apPanel.add(apCHWLabel);
        apPanel.add(apCHWTextField);
        apPanel.add(apSexLabel);
        apPanel.add(sexRadioButtonPanel);
        apPanel.add(apEDLabel1);
        apPanel.add(apEDTextField);
        apPanel.add(apEDLabel2);
        apPanel.add(emptyLabel);
        apPanel.add(apMajLabel);
        apPanel.add(apMajTextField);

        titleTextPanel2.add(subTitleLabel4);
        abilityPanel.setLayout(new GridLayout(5, 2));
        abilityPanel.add(qualDescLabel1);
        abilityPanel.add(qualDescComboBox1);
        abilityPanel.add(qualDescLabel2);
        abilityPanel.add(qualDescComboBox2);
        abilityPanel.add(qualDescLabel3);
        abilityPanel.add(qualDescComboBox3);
        abilityPanel.add(qualDescLabel4);
        abilityPanel.add(qualDescComboBox4);
        abilityPanel.add(qualDescLabel5);
        abilityPanel.add(qualDescComboBox5);

        titleTextPanel3.add(subTitleLabel5);
        positionPanel.setLayout(new GridLayout(3, 2));
        positionPanel.add(posNameLabel1);
        positionPanel.add(posNameComboBox1);
        positionPanel.add(posNameLabel2);
        positionPanel.add(posNameComboBox2);
        positionPanel.add(posNameLabel3);
        positionPanel.add(posNameComboBox3);

        subPanel1.setLayout(new BorderLayout());
        subPanel1.add(titleTextPanel, BorderLayout.NORTH);
        subPanel1.add(apPanel, BorderLayout.CENTER);

        subPanel2.setLayout(new BorderLayout());
        subPanel2.add(titleTextPanel2, BorderLayout.NORTH);
        subPanel2.add(abilityPanel, BorderLayout.CENTER);

        subPanel3.setLayout(new BorderLayout());
        subPanel3.add(titleTextPanel3, BorderLayout.NORTH);
        subPanel3.add(positionPanel, BorderLayout.CENTER);
        subPanel3.add(okButton, BorderLayout.SOUTH);

        subPanel4.setLayout(new BorderLayout());
        subPanel4.add(subPanel2, BorderLayout.NORTH);
        subPanel4.add(subPanel3, BorderLayout.CENTER);

        subPanel5.add(okButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(subPanel1, BorderLayout.NORTH);
        mainPanel.add(subPanel4, BorderLayout.CENTER);
        mainPanel.add(subPanel5, BorderLayout.SOUTH);
        add(mainPanel);

    }

    protected void setFrameFeatures() {
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    protected void setComponet() {
        titleLable = new JLabel("บริษัท STOU-TEC จำกัด");
        subTitleLable1 = new JLabel("แบบฟอร์มใบสมัครพนักงาน");
        subTitleLable2 = new JLabel("ใบสมัครสำหรับงานด้าน ICT นี้ ให้ผู้สมัครกรอกรายละเอียดต่อไปนี้เพื่อที่");
        subTitleLable3 = new JLabel("บริษัท STOU-TEC จำกัด ทำการคัดเลือกตามความเหมาะสม");
        subTitleLabel4 = new JLabel("ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DLSC) (ตอบได้ไม่เกิน 5 รายการ)");
        subTitleLabel5 = new JLabel("ตำแหน่งที่ต้องการสมัคร (POS_NAME) : (ตอบได้ไม่เกิน 3 ตำแหน่ง)");
        apIDLabel = new JLabel("เลขประจำตัวของผู้สมัคร (AP_ID) : ");
        apNameLabel = new JLabel("ชื่อ-นามสกุล (AP_NAME) : ");
        apAddressLabel = new JLabel("ที่อยู่ (AP_ADDRESS) : ");
        apCHWLabel = new JLabel("จังหวัด (AP_CHW) : ");
        apSexLabel = new JLabel("เพศ (AP_SEX) : ");
        apEDLabel1 = new JLabel("วุฒิการศึกษาชั้นสูงสุด (AP_ED) : ");
        apEDLabel2 = new JLabel("(เช่น B.S., B.A., M.S., M.BA., M.A.)");
        apMajLabel = new JLabel("วิชาเอก (AP_MAJ) : ");
        emptyLabel = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        maleRadioButton = new JRadioButton();
        femaleRadioButton = new JRadioButton();

        qualDescLabel1 = new JLabel("ความรู้ความสามารถ 1 ");
        qualDescLabel2 = new JLabel("ความรู้ความสามารถ 2 ");
        qualDescLabel3 = new JLabel("ความรู้ความสามารถ 3 ");
        qualDescLabel4 = new JLabel("ความรู้ความสามารถ 4 ");
        qualDescLabel5 = new JLabel("ความรู้ความสามารถ 5 ");
        qualDescComboBoxString1 = new String[] { "เลือกความรู้ความสามารถ 1 ", "Web_ASP", "C++",
                "Database Adminstrator,DB2",
                "Database Adminstrator,ORACLE", "Graphic Desigh", "JAVA", "Management", "Network",
                "Secretarial work,45 words/min", "Secretarial work,60 words/min", "System Analyst, Level 1",
                "System Analyst, Level 2", "Visual Basic" };
        qualDescComboBoxString2 = new String[] { "เลือกความรู้ความสามารถ 2 ", "Web_ASP", "C++",
                "Database Adminstrator,DB2",
                "Database Adminstrator,ORACLE", "Graphic Desigh", "JAVA", "Management", "Network",
                "Secretarial work,45 words/min", "Secretarial work,60 words/min", "System Analyst, Level 1",
                "System Analyst, Level 2", "Visual Basic" };
        qualDescComboBoxString3 = new String[] { "เลือกความรู้ความสามารถ 3 ", "Web_ASP", "C++",
                "Database Adminstrator,DB2",
                "Database Adminstrator,ORACLE", "Graphic Desigh", "JAVA", "Management", "Network",
                "Secretarial work,45 words/min", "Secretarial work,60 words/min", "System Analyst, Level 1",
                "System Analyst, Level 2", "Visual Basic" };
        qualDescComboBoxString4 = new String[] { "เลือกความรู้ความสามารถ 4 ", "Web_ASP", "C++",
                "Database Adminstrator,DB2",
                "Database Adminstrator,ORACLE", "Graphic Desigh", "JAVA", "Management", "Network",
                "Secretarial work,45 words/min", "Secretarial work,60 words/min", "System Analyst, Level 1",
                "System Analyst, Level 2", "Visual Basic" };
        qualDescComboBoxString5 = new String[] { "เลือกความรู้ความสามารถ 5 ", "Web_ASP", "C++",
                "Database Adminstrator,DB2",
                "Database Adminstrator,ORACLE", "Graphic Desigh", "JAVA", "Management", "Network",
                "Secretarial work,45 words/min", "Secretarial work,60 words/min", "System Analyst, Level 1",
                "System Analyst, Level 2", "Visual Basic" };
        posNameLabel1 = new JLabel("ตำแหน่งที่ต้องการสมัคร 1 ");
        posNameLabel2 = new JLabel("ตำแหน่งที่ต้องการสมัคร 2 ");
        posNameLabel3 = new JLabel("ตำแหน่งที่ต้องการสมัคร 3 ");
        posNameComboBoxString1 = new String[] { "เลือกตำแหน่งที่ต้องการสมัคร 1 ", "Technical Programmer",
                "Web Developer", "General Manager",
                "ICT Specialist", "E-Business Analyst", "ICT Documenter", "Database Administrator",
                "PC Administrator", "Network Specialist", "ICT Manager" };
        posNameComboBoxString2 = new String[] { "เลือกตำแหน่งที่ต้องการสมัคร 2 ", "Technical Programmer",
                "Web Developer", "General Manager",
                "ICT Specialist", "E-Business Analyst", "ICT Documenter", "Database Administrator",
                "PC Administrator", "Network Specialist", "ICT Manager" };
        posNameComboBoxString3 = new String[] { "เลือกตำแหน่งที่ต้องการสมัคร 3 ", "Technical Programmer",
                "Web Developer", "General Manager",
                "ICT Specialist", "E-Business Analyst", "ICT Documenter", "Database Administrator",
                "PC Administrator", "Network Specialist", "ICT Manager" };

        qualDescComboBox1 = new JComboBox(qualDescComboBoxString1);
        qualDescComboBox2 = new JComboBox(qualDescComboBoxString2);
        qualDescComboBox3 = new JComboBox(qualDescComboBoxString3);
        qualDescComboBox4 = new JComboBox(qualDescComboBoxString4);
        qualDescComboBox5 = new JComboBox(qualDescComboBoxString5);
        posNameComboBox1 = new JComboBox(posNameComboBoxString1);
        posNameComboBox2 = new JComboBox(posNameComboBoxString2);
        posNameComboBox3 = new JComboBox(posNameComboBoxString3);
        okButton = new JButton("ตกลง");
        editButton = new JButton("แก้ไข");

        maleRadioButton.setText("ชาย");
        femaleRadioButton.setText("หญิง");
        sexRadioButtonGroup.add(maleRadioButton);
        sexRadioButtonGroup.add(femaleRadioButton);
        maleRadioButton.setSelected(true);
        sexRadioButtonPanel.add(maleRadioButton);
        sexRadioButtonPanel.add(femaleRadioButton);

        apIDTextField = new JTextField(20);
        apNameTextField = new JTextField(20);
        apAddressTextField = new JTextField(20);
        apCHWTextField = new JTextField(10);
        apMajTextField = new JTextField(20);
        apEDTextField = new JTextField(20);

        titleLable.setHorizontalAlignment(JLabel.CENTER);
        subTitleLable1.setHorizontalAlignment(JLabel.CENTER);
        subTitleLable2.setHorizontalAlignment(JLabel.CENTER);
        subTitleLable3.setHorizontalAlignment(JLabel.CENTER);
        subTitleLabel4.setHorizontalAlignment(JLabel.CENTER);
        subTitleLabel5.setHorizontalAlignment(JLabel.CENTER);
    }

    protected void setComponetStyle() {
        font12Plain = new Font("SansSerif", Font.PLAIN, 12);
        font12Blod = new Font("SansSerif", Font.BOLD, 12);
        font14Blod = new Font("Sanserif", Font.BOLD, 14);
        titleLable.setFont(font14Blod);
        subTitleLable1.setFont(font12Blod);
        subTitleLable2.setFont(font12Blod);
        subTitleLable3.setFont(font12Blod);
        subTitleLabel4.setFont(font12Blod);
        subTitleLabel5.setFont(font12Blod);

        apIDLabel.setFont(font12Plain);
        apNameLabel.setFont(font12Plain);
        apAddressLabel.setFont(font12Plain);
        apCHWLabel.setFont(font12Plain);
        apSexLabel.setFont(font12Plain);
        apEDLabel1.setFont(font12Plain);
        apEDLabel2.setFont(font12Plain);
        apMajLabel.setFont(font12Plain);
        maleRadioButton.setFont(font12Plain);
        femaleRadioButton.setFont(font12Plain);

        apIDTextField.setFont(font12Plain);
        apNameTextField.setFont(font12Plain);
        apAddressTextField.setFont(font12Plain);
        apCHWTextField.setFont(font12Plain);
        apEDTextField.setFont(font12Plain);
        apMajTextField.setFont(font12Plain);

        qualDescComboBox1.setFont(font12Plain);
        qualDescComboBox2.setFont(font12Plain);
        qualDescComboBox3.setFont(font12Plain);
        qualDescComboBox4.setFont(font12Plain);
        qualDescComboBox5.setFont(font12Plain);
        posNameComboBox1.setFont(font12Plain);
        posNameComboBox2.setFont(font12Plain);
        posNameComboBox3.setFont(font12Plain);

        okButton.setFont(font12Plain);
    }

    protected void addListeners() {
        okButton.addActionListener(this);
        editButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Stoutec stouTecOutput = new Stoutec("");
        String command = e.getActionCommand();
        Object scrObj = e.getSource();
        titleOutput = new JLabel("รายละเอียดของผู้สมัคร");
        titleOutput.setFont(font14Blod);
        titleOutput.setHorizontalAlignment(JLabel.CENTER);
        emptyLabel2 = new JLabel(" ");
        apIDOutput = new JLabel("เลขประจำตัวผู้สมัคร : "+ apIDTextField.getText());
        apNameOutput = new JLabel("ชื่อ - นามสกุล : " + apNameTextField.getText());
        apAddressOutput = new JLabel("ที่อยู่ : " + apAddressTextField.getText());
        apCHWOutput = new JLabel("จังหวัด : " + apCHWTextField.getText());
        maleRadioButton.setActionCommand("ชาย");
        femaleRadioButton.setActionCommand("หญิง");
        apSexOutput = new JLabel("เพศ : " + (sexRadioButtonGroup.getSelection().getActionCommand()));
        apEDOutput = new JLabel("วุฒิการศึกษาชั้นสูงสุด : " + apEDTextField.getText());
        apMajOutput = new JLabel("วิชาเอก : " + apMajTextField.getText());
        qualDesc1Output = new JLabel(qualDescLabel1.getText()+ " : "  + qualDescComboBox1.getSelectedItem().toString());
        qualDesc2Output = new JLabel(qualDescLabel2.getText()+ " : "  + qualDescComboBox2.getSelectedItem().toString());
        qualDesc3Output = new JLabel(qualDescLabel3.getText()+ " : "  + qualDescComboBox3.getSelectedItem().toString());
        qualDesc4Output = new JLabel(qualDescLabel4.getText()+ " : "  + qualDescComboBox4.getSelectedItem().toString());
        qualDesc5Output = new JLabel(qualDescLabel5.getText()+ " : "  + qualDescComboBox5.getSelectedItem().toString());
        posName1Output = new JLabel(posNameLabel1.getText()+ " : "  + posNameComboBox1.getSelectedItem().toString());
        posName2Output = new JLabel(posNameLabel2.getText()+ " : "  + posNameComboBox2.getSelectedItem().toString());
        posName3Output = new JLabel(posNameLabel3.getText()+ " : "  + posNameComboBox3.getSelectedItem().toString());

        
        
        if (scrObj == okButton) {
            outputPanel.setLayout(new GridLayout(17,1));
            outputPanel.add(titleOutput);
            outputPanel.add(emptyLabel2);
            outputPanel.add(apIDOutput);
            outputPanel.add(apNameOutput);
            outputPanel.add(apAddressOutput);
            outputPanel.add(apCHWOutput);
            outputPanel.add(apSexOutput);
            outputPanel.add(apEDOutput);
            outputPanel.add(apMajOutput);
            outputPanel.add(qualDesc1Output);
            outputPanel.add(qualDesc2Output);
            outputPanel.add(qualDesc3Output);
            outputPanel.add(qualDesc4Output);
            outputPanel.add(qualDesc5Output);
            outputPanel.add(posName1Output);
            outputPanel.add(posName2Output);
            outputPanel.add(posName3Output);

            outputButtonPanel.add(editButton);
            mainOutputPanel.setLayout(new BorderLayout());
            mainOutputPanel.add(outputPanel, BorderLayout.NORTH);
            mainOutputPanel.add(outputButtonPanel, BorderLayout.SOUTH);
            // dispose();
            stoutecOutputFrame = new JFrame("");
            stoutecOutputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            stoutecOutputFrame.setLocationRelativeTo(null);
            stoutecOutputFrame.add(mainOutputPanel);
            stoutecOutputFrame.setVisible(true);
            stoutecOutputFrame.pack();
            setVisible(false);

        }
        if (scrObj == editButton) {
            // stouTecOutput.dispose();
            // stouTecOutput.removeAll();
            setVisible(true);
            stoutecOutputFrame.setVisible(false);
            stoutecOutputFrame.dispose();
            outputPanel.removeAll();
            outputButtonPanel.removeAll();
            mainOutputPanel.removeAll();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


}