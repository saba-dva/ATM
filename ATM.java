import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM implements ActionListener
{
    JFrame frame;
    JPanel  panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    JButton button11, button12, button14;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8;
    JTextField  textField2, textField3;
    JPasswordField password1, password2;
    long moj = 100000000;
    int pass;

    ATM()
    {
        frame = new JFrame("ATM");
        frame.setVisible(true);
        frame.setSize(700,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        panel1.setBounds(0,0,700,700);
        panel1.setBackground(Color.darkGray);
        panel1.setLayout(null);
        /////////////////////////////////////////////////////////
        label1 = new JLabel("Choose language");
        label1.setBounds(440,400,250,70);
        label2 = new JLabel("زبان خود را انتخاب کنید");
        label2.setBounds(150,400,250,70);
        panel1.add(label1);
        panel1.add(label2);
        button1 = new JButton("English");
        button1.setBounds(0,400,130,70);
        button2 = new JButton("فارسی");
        button2.setBounds(570,400,130,70);
        button2.addActionListener(this);
        panel1.add(button1);
        panel1.add(button2);
        ////////////////////////////////////////////////////////
        panel2 = new JPanel();
        panel2.setBounds(0,0,700,700);
        panel2.setBackground(Color.darkGray);
        panel2.setLayout(null);
        label3 = new JLabel("رمز خود را وارد کنید");
        label3.setBounds(320,200,200,100);
        panel2.add(label3);
        password2 = new JPasswordField();
        password2.setBounds(270,300,200,50);
        panel2.add(password2);
        button3 = new JButton("ثبت");
        button3.setBounds(300,430,150,70);
        button3.addActionListener(this);
        panel2.add(button3);
        ////////////////////////////////////////////////////////
        panel3 = new JPanel();
        panel3.setBounds(0,0,700,700);
        panel3.setBackground(Color.darkGray);
        panel3.setLayout(null);
        button4 = new JButton("برداشت وجه");
        button4.setBounds(0,200,150,70);
        button4.addActionListener(this);
        panel3.add(button4);
        button5 = new JButton("تغییر رمز");
        button5.setBounds(550,200,150,70);
        button5.addActionListener(this);
        panel3.add(button5);
        button6 = new JButton("کارت به کارت");
        button6.setBounds(0,400,150,70);
        button6.addActionListener(this);
        panel3.add(button6);
        button7 = new JButton("اعلام موجودی");
        button7.setBounds(550,400,150,70);
        button7.addActionListener(this);
        panel3.add(button7);
        /////////////////////////////////////////////////////////
        panel4 = new JPanel();
        panel4.setBounds(0,0,700,700);
        panel4.setBackground(Color.darkGray);
        panel4.setLayout(null);
        label4 = new JLabel("عملیات با موفقیت انجام شد!");
        label4.setBounds(300,300,500,100);
        panel4.add(label4);
        /////////////////////////////////////////////////////////
        panel5= new JPanel();
        panel5.setBounds(0,0,700,700);
        panel5.setBackground(Color.darkGray);
        panel5.setLayout(null);
        label5 = new JLabel("رمز جدید را وارد کنید");
        label5.setBounds(300,150,500,100);
        panel5.add(label5);
        password1 = new JPasswordField();
        password1.setBounds(250,250,200,50);
        panel5.add(password1);
        button8 = new JButton("تایید");
        button8.setBounds(290,400,120,50);
        button8.addActionListener(this);
        panel5.add(button8);
        ///////////////////////////////////////////////////////////////
        panel6 = new JPanel();
        panel6.setBounds(0,0,700,700);
        panel6.setBackground(Color.darkGray);
        panel6.setLayout(null);
        label6 = new JLabel("موجودی حساب شما:" + moj + "ریال");
        label6.setBounds(300,300,500,100);
        panel6.add(label6);
        ///////////////////////////////////////////////////////////////
        panel7 = new JPanel();
        panel7.setBounds(0,0,700,700);
        panel7.setBackground(Color.darkGray);
        panel7.setLayout(null);
        button9 = new JButton("500000");
        button9.setBounds(0,200,150,70);
        button9.addActionListener(this);
        panel7.add(button9);
        button10 = new JButton("1500000");
        button10.setBounds(550,200,150,70);
        button10.addActionListener(this);
        panel7.add(button10);
        button11 = new JButton("1000000");
        button11.setBounds(0,400,150,70);
        button11.addActionListener(this);
        panel7.add(button11);
        button12 = new JButton("2000000");
        button12.setBounds(550,400,150,70);
        button12.addActionListener(this);
        panel7.add(button12);
        /////////////////////////////////////////////////////////////
        panel8 = new JPanel();
        panel8.setBounds(0,0,700,700);
        panel8.setBackground(Color.darkGray);
        panel8.setLayout(null);
        label7 = new JLabel("مبلغ مورد نظر را وارد کنید");
        label7.setBounds(300,300,200,100);
        panel8.add(label7);
        label8 = new JLabel("شماره کارت مقصد را وارد کنید:");
        label8.setBounds(300,100,200,100);
        panel8.add(label8);
        textField2 = new JTextField();
        textField2.setBounds(270,400,200,50);
        panel8.add(textField2);
        button14 = new JButton("ثبت");
        button14.setBounds(300,530,150,70);
        button14.addActionListener(this);
        panel8.add(button14);
        textField3 = new JTextField();
        textField3.setBounds(270,200,200,50);
        panel8.add(textField3);
        frame.add(panel1);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button2)
        {
            frame.remove(panel1);
            frame.add(panel2);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button3)
        {
            pass = Integer.parseInt(String.valueOf(password2.getPassword()));
            password2.setText("");
            frame.remove(panel2);
            frame.add(panel3);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button5)
        {
            frame.remove(panel3);
            frame.add(panel5);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button4)
        {
            frame.remove(panel3);
            frame.add(panel7);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button6)
        {
            frame.remove(panel3);
            frame.add(panel8);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button9)
        {
            frame.remove(panel7);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button10)
        {
            frame.remove(panel7);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button11)
        {
            frame.remove(panel7);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button12)
        {
            frame.remove(panel7);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button8)
        {
            pass = Integer.parseInt(String.valueOf(password1.getPassword()));
            password1.setText("");
            frame.remove(panel5);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button14)
        {
            frame.remove(panel8);
            frame.add(panel4);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource() == button7)
        {
            frame.remove(panel3);
            frame.add(panel6);
            frame.revalidate();
            frame.repaint();
        }
    }
    public static void main(String[] args)
    {
        ATM ATM = new ATM();
    }
}
