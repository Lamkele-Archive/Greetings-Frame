
package za.ac.tut.ui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class GreetingsGUI extends JFrame{
    
        private JPanel namePnl;
        private JPanel surnamePnl;
        private JPanel nameAndSurnamePnl;
        private JPanel greetingsAreaPnl;
        private JPanel btnsPnl;
        private JPanel mainPnl;
        private JPanel headingPnl;
        
        private JLabel headingLbl;
        private JLabel nameLbl;
        private JLabel surnameLbl;
        
        private JTextField nameTxtFld;
        private JTextField surnameTxtFld;
        
        private JTextArea greetingsTxtArea;
        
        private JButton greetBtn;
        private JButton clearBtn;
        private JButton exitBtn;
    
    public GreetingsGUI(){
        
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(500,500);
        setBackground(Color.YELLOW);
        
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Greetings"));
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name:");
        surnameLbl = new JLabel("Surname:");
        
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        greetingsTxtArea = new JTextArea(40,50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello! [naem] [surname]");
        
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        greetingsAreaPnl.add(greetingsTxtArea);
        
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
    }
}
