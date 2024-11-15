package Bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,mini_statement,pin, balance,exit;
    String pinnumber;
    Transactions(String pinnumber)
    {
        this.pinnumber=pinnumber;
        // Adding image of atm machine
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Bank_management_system/icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,890,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        //....................................................................................................
        JLabel txt=new JLabel("Please select your Transactions");
        txt.setBounds(210,320,700,35);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        image.add(txt);
        //.........................................................................................
        // creating buttons for various actions in ATM
         deposit = new JButton("Deposit");
         deposit.setBounds(170,415,150,30);
         deposit.addActionListener(this);
         image.add(deposit);

        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        mini_statement = new JButton("Mini statement");
        mini_statement.setBounds(355,450,150,30);
        mini_statement.addActionListener(this);
        image.add(mini_statement);

        pin= new JButton("Pin Change");
        pin.setBounds(170,485,150,30);
        pin.addActionListener(this);
        image.add(pin);

        balance= new JButton("Balance Enquiry");
        balance.setBounds(355,485,150,30);
        balance.addActionListener(this);
        image.add(balance);

        exit= new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true); // helps us to remove upper taskbar like part of the frame which contains -,x
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            System.exit(0);
        } else if (ae.getSource()==deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);

        } else if (ae.getSource()==withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()==fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (ae.getSource()==pin) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);

        } else if (ae.getSource()==balance) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
            
        } else if (ae.getSource()==mini_statement) {
            setVisible(false);
            new Ministatement(pinnumber).setVisible(true);

        }

    }
    public static void main(String[] args) {
        new Transactions("");

    }
}
