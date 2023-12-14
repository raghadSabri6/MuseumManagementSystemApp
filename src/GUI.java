import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame{
    
    public JPanel allpanel = new JPanel();
    public JPanel onframe = new JPanel(new BorderLayout());
    public JPanel inframe = new JPanel(new BorderLayout());
    private ActionListener action = new Actions();
    
    public JLabel label = new JLabel("Muesum System");
    public JLabel l1 = new JLabel("[0]");
    public JLabel l2 = new JLabel("[0]");
    public JTextField t1 = new JTextField(20);
    public JTextField t2 = new JTextField(20);
    public JTextField t3 = new JTextField(30);
    public JTextField t4 = new JTextField(30);
    public JTextField t5 = new JTextField(30);
    public JTextField t6 = new JTextField(30);
    public JTextField t7 = new JTextField(30);
    public JTextField t8 = new JTextField(30);
    public JTextField t9 = new JTextField(30);
    public JTextField t10 = new JTextField(30);
    public JTextArea ta = new JTextArea();
    public JButton b1 = new JButton("Guide Information");
    public JButton b2 = new JButton("Visitor Information");
    public JButton b3 = new JButton("Management");
    public JButton b4 = new JButton("Search Guide");
    public JButton b5 = new JButton("List All Available Guides");
    public JButton b6 = new JButton("List All Guides");
    public JButton b7 = new JButton("Search Visitor");
    public JButton b8 = new JButton("Add Visitor");
    public JButton b9 = new JButton("Add Guide");
    public JButton b10 = new JButton("Issue Ticket");
    public JCheckBox c1 = new JCheckBox("Regular Visitor");    
    public JCheckBox c2 = new JCheckBox("Senior Visitor");
    public JCheckBox c3 = new JCheckBox("Sun");
    public JCheckBox c4 = new JCheckBox("Mon");
    public JCheckBox c5 = new JCheckBox("Tue");
    public JCheckBox c6 = new JCheckBox("Wed");
    public JCheckBox c7 = new JCheckBox("Thu");
    public JCheckBox c8 = new JCheckBox("Fri");
    public JCheckBox c9 = new JCheckBox("Sat");
    public JCheckBox c10 = new JCheckBox("Yes");
    public JComboBox cc1 = new JComboBox();
    public JComboBox cc2 = new JComboBox();
    public JComboBox cc3 = new JComboBox();
    public JRadioButton r1 = new JRadioButton("Daily");
    public JRadioButton r2 = new JRadioButton("Monthly");
    public JRadioButton r3 = new JRadioButton("Yearly");
    public JRadioButton r4 = new JRadioButton("Regular Visitor");
    public JRadioButton r5 = new JRadioButton("Senior Visitor");       
    
    public GUI(){
        
        setTitle("Muesum System");
        setSize(new Dimension(850, 700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        b1.addActionListener(action);
        b2.addActionListener(action);
        b3.addActionListener(action);
    }
    
    public void components(){
        
        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        label.setFont(new Font("", Font.BOLD+Font.ITALIC, 30));
        onframe.add(panel, BorderLayout.NORTH);
        onframe.add(label, BorderLayout.CENTER);
        onframe.add(new JLabel("Days Working[Sunday, Tuesday, Wednesday, Thuresday]"), BorderLayout.SOUTH);
        
        add(onframe, BorderLayout.NORTH);
        add(inframe, BorderLayout.CENTER);
        
        additems();
    }
    private void additems(){
        
        cc1.addItem("Sunday");
        cc1.addItem("Monday");
        cc1.addItem("Tuesday");
        cc1.addItem("Wednesday");
        cc1.addItem("Thuresday");
        cc1.addItem("Friday");
        cc1.addItem("Satarday");
        
        cc2.addItem("Arabic");
        cc2.addItem("English");
        cc2.addItem("Frensh");
        cc2.addItem("Spanish");
        cc2.addItem("Brazilsh");
        
        cc3.addItem("No any guide");
    }
    
    private class Actions implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(b1 == e.getSource()){ 
                inframe.removeAll();
                JPanel panel1 = new JPanel();
                panel1.add(new JLabel("Guide Name"));
                panel1.add(t1);
                panel1.add(b4);
                JPanel panel2 = new JPanel();
                panel2.add(new JLabel("Guide Working Days"));
                panel2.add(cc1);
                panel2.add(b5);
                JPanel panel3 = new JPanel();
                panel3.add(new JLabel("Tours Languages"));
                panel3.add(cc2);
                panel3.add(b6);
                
                JPanel pp = new JPanel(new BorderLayout());               
                pp.add(panel1, BorderLayout.NORTH);
                pp.add(panel2, BorderLayout.CENTER);
                pp.add(panel3, BorderLayout.SOUTH);
                
                inframe.add(pp, BorderLayout.NORTH);
                inframe.add(ta, BorderLayout.CENTER);
                validate();
            }
            if(b2 == e.getSource()){ 
                inframe.removeAll();
                JPanel panel1 = new JPanel();
                panel1.add(new JLabel("Total Number of Visitor"));
                panel1.add(c1);
                panel1.add(c2);
                panel1.add(l1);
                JPanel panel2 = new JPanel();
                panel2.add(new JLabel("Visitor's Name"));
                panel2.add(t2);
                panel2.add(b7);
                JPanel panel3 = new JPanel();
                panel3.add(new JLabel("Total Number of Subscription/Visits"));
                panel3.add(r1);
                panel3.add(r2);
                panel3.add(r3);
                panel3.add(l2);
                
                JPanel pp = new JPanel(new BorderLayout());               
                pp.add(panel1, BorderLayout.NORTH);
                pp.add(panel2, BorderLayout.CENTER);
                pp.add(panel3, BorderLayout.SOUTH);
                
                inframe.add(pp, BorderLayout.NORTH);
                inframe.add(ta, BorderLayout.CENTER);
                validate();
            }
            if(b3 == e.getSource()){ 
                inframe.removeAll();
                JPanel panel1 = new JPanel(new GridLayout(5, 2));
                panel1.add(new JLabel("Visitor's Name"));
                panel1.add(t3);
                panel1.add(new JLabel("Visitor's ID"));
                panel1.add(t4);
                panel1.add(new JLabel("Visitor's BOD"));
                panel1.add(t5);
                panel1.add(r4);
                panel1.add(r5);
                panel1.add(b8);
                
                JPanel panel2 = new JPanel(new GridLayout(5, 2));
                panel2.add(new JLabel("Guide's Name"));
                panel2.add(t6);
                panel2.add(new JLabel("Guide's ID"));
                panel2.add(t7);
                panel2.add(new JLabel("Guide's BOD"));
                panel2.add(t8);
                panel2.add(new JLabel("Guide's Days Working"));
                JPanel p = new JPanel();
                p.add(c3);
                p.add(c4);
                p.add(c5);
                p.add(c6);
                p.add(c7);
                p.add(c8);
                p.add(c9);
                panel2.add(p);
                panel2.add(b9);
                
                JPanel panel3 = new JPanel(new GridLayout(5, 2));
                panel3.add(new JLabel("Visitor's ID"));
                panel3.add(t9);
                panel3.add(new JLabel("Expected Day"));
                panel3.add(t10);
                panel3.add(new JLabel("Ticket Type"));
                JPanel p1 = new JPanel();
                p1.add(r1);
                p1.add(r2);
                p1.add(r3);
                panel3.add(p1);
                panel3.add(new JLabel("Book a Tour for this visit?"));
                JPanel p2 = new JPanel();
                p2.add(c10);
                p2.add(new JLabel("Language"));
                p2.add(cc2);
                p2.add(new JLabel("Available Guides"));
                p2.add(cc3);
                panel3.add(p2);
                panel3.add(b10);
                
                JPanel pppp = new JPanel(new BorderLayout());
                pppp.add(panel1, BorderLayout.NORTH);
                pppp.add(panel2, BorderLayout.CENTER);
                pppp.add(panel3, BorderLayout.SOUTH);
                
                inframe.add(pppp, BorderLayout.NORTH);
                inframe.add(ta, BorderLayout.CENTER);
                validate();
            }
        }
    }
}
