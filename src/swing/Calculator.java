package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JPanel panel1, panel2, panel3;
    JTextField text;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btn00;
    JButton btnDiv, btnMulti, btnMinus, btnPlus, btnMod, btnEqual;
    int flag;
    double num1,num2, result;

    Calculator(){

        //Font
        Font font = new Font("Arial", Font.BOLD, 30);

        //Panel1
        panel1 = new JPanel();
        panel1.setBounds(5, 0, 495, 150);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        add(panel1);

        //Panel2
        panel2 = new JPanel();
        panel2.setBounds(5, 148, 342, 375);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(new GridLayout(4, 3, 3, 3));
        add(panel2);

        //Panel3);
        panel3 = new JPanel();
        panel3.setBounds(350, 150, 150, 374);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(new GridLayout(6, 1, 3, 3));
        add(panel3);

        //TextField
        text = new JTextField();
        text.setBounds(12, 15, 470, 120);
        text.setFont(font);
        text.setHorizontalAlignment(JTextField.RIGHT);
        panel1.add(text);

        //For One
        btn1 = new JButton("1");
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setFont(font);

        //For Two
        btn2 = new JButton("2");
        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setFont(font);

        //For Three
        btn3 = new JButton("3");
        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.setFont(font);

        //For Four
        btn4 = new JButton("4");
        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.setFont(font);

        //For Five
        btn5 = new JButton("5");
        btn5.setBackground(Color.LIGHT_GRAY);
        btn5.setFont(font);

        //For Six
        btn6 = new JButton("6");
        btn6.setBackground(Color.LIGHT_GRAY);
        btn6.setFont(font);

        //For Seven
        btn7 = new JButton("7");
        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.setFont(font);

        //For Eight
        btn8 = new JButton("8");
        btn8.setBackground(Color.LIGHT_GRAY);
        btn8.setFont(font);

        //For Nine
        btn9 = new JButton("9");
        btn9.setBackground(Color.LIGHT_GRAY);
        btn9.setFont(font);

        //For Zero
        btn0 = new JButton("0");
        btn0.setBackground(Color.LIGHT_GRAY);
        btn0.setFont(font);

        //For Dot
        btnDot = new JButton(".");
        btnDot.setBackground(Color.LIGHT_GRAY);
        btnDot.setFont(font);

        //For DoubleZero
        btn00 = new JButton("00");
        btn00.setBackground(Color.LIGHT_GRAY);
        btn00.setFont(font);

        //For Div
        btnDiv = new JButton("\u00F7");
        btnDiv.setBackground(Color.LIGHT_GRAY);
        btnDiv.setFont(font);

        //For Multi
        btnMulti = new JButton("\u00D7");
        btnMulti.setBackground(Color.LIGHT_GRAY);
        btnMulti.setFont(font);

        //For Minus
        btnMinus = new JButton("\u2212");
        btnMinus.setBackground(Color.LIGHT_GRAY);
        btnMinus.setFont(font);

        //For Plus
        btnPlus = new JButton("\u002B");
        btnPlus.setBackground(Color.LIGHT_GRAY);
        btnPlus.setFont(font);

        //For Mod
        btnMod = new JButton("\u0025");
        btnMod.setBackground(Color.LIGHT_GRAY);
        btnMod.setFont(font);

        //For Equal
        btnEqual = new JButton("\u003D");
        btnEqual.setBackground(Color.LIGHT_GRAY);
        btnEqual.setFont(font);

        //Adding button to Panel2
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn0);
        panel2.add(btnDot);
        panel2.add(btn00);

        //Adding button to Panel3
        panel3.add(btnDiv);
        panel3.add(btnMulti);
        panel3.add(btnMinus);
        panel3.add(btnPlus);
        panel3.add(btnMod);
        panel3.add(btnEqual);

        //ActionListener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnDot.addActionListener(this);
        btn00.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMulti.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMod.addActionListener(this);
        btnEqual.addActionListener(this);



        setSize(510, 560);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str2 = text.getText();
        String str1 = text.getText();

    if(e.getSource()==btn1){
        text.setText(text.getText()+"1");
    }
    if(e.getSource()==btn2){
        text.setText(text.getText()+"2");
    }
    if(e.getSource()==btn3){
        text.setText(text.getText()+"3");
    }
    if(e.getSource()==btn4){
        text.setText(text.getText()+"4");
    }
    if(e.getSource()==btn5){
        text.setText(text.getText()+"5");
    }
        if(e.getSource()==btn6){
            text.setText(text.getText()+"6");
        }
        if(e.getSource()==btn7){
            text.setText(text.getText()+"7");
        }
        if(e.getSource()==btn8){
            text.setText(text.getText()+"8");
        }
        if(e.getSource()==btn9){
            text.setText(text.getText()+"9");
        }
        if(e.getSource()==btn0){
            text.setText(text.getText()+"0");
        }
        if(e.getSource()==btnDot){
            text.setText(text.getText()+".");
        }
        if(e.getSource()==btn00){
            text.setText(text.getText()+"00");
        }

        if(e.getSource()==btnDiv)
        {
            num1 = Double.parseDouble(str1);
            text.setText("");
            flag = 1;
        }
        if(e.getSource()==btnMulti)
        {
            num1 = Double.parseDouble(str1);
            text.setText("");
            flag = 2;
        }
        if(e.getSource()==btnMinus)
        {
            num1 = Double.parseDouble(str1);
            text.setText("");
            flag = 3;
        }
        if(e.getSource()==btnPlus)
        {
            num1 = Double.parseDouble(str1);
            text.setText("");
            flag = 4;
        }
        if(e.getSource()==btnMod)
        {
            num1 = Double.parseDouble(str1);
            text.setText("");
            flag = 5;
        }

        //Equal
        if(e.getSource()==btnEqual)
        {
           if(flag == 1)
           {

               num2 = Double.parseDouble(str2);
               result = num1 / num2;
               text.setText(Double.toString(result));

               if(Double.toString(result).endsWith(".0")) {
                   text.setText(Double.toString(result).replace(".0",""));
               }
               else{
                   text.setText(Double.toString(result));
               }
           }

           if(flag == 2)
           {
               num2 = Double.parseDouble(str2);
               result = num1 * num2;
               text.setText(Double.toString(result));

               if(Double.toString(result).endsWith(".0")) {
                   text.setText(Double.toString(result).replace(".0", ""));
               }
                   else{
                   text.setText(Double.toString(result));
               }
           }

           if(flag == 3)
           {
               num2 = Double.parseDouble(str2);
               result = num1 - num2;
               text.setText(Double.toString(result));

               if(Double.toString(result).endsWith(".0"))
               {
                   text.setText(Double.toString(result).replace(".0",""));
               }
               else
               {
                   text.setText(Double.toString(result));
               }
           }

           if(flag == 4)
           {
               num2 = Double.parseDouble(str2);
               result= num1 + num2;
               text.setText(Double.toString(result));

               if(Double.toString(result).endsWith(".0"))
               {
                   text.setText(Double.toString(result).replace(".0",""));
               }
               else
               {
                   text.setText(Double.toString(result));
               }
           }

           if(flag == 5)
           {
               num2 = Double.parseDouble(str2);
               result = num1 % num2;
               text.setText(Double.toString(result));

               if(Double.toString(result).endsWith(".0"))
               {
                   text.setText(Double.toString(result).replace(".0",""));
               }
               else
               {
                   text.setText(Double.toString(result));
               }
           }
        }
    }
}
