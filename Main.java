import javax.lang.model.util.AbstractTypeVisitor14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends Frame implements ActionListener {
 TextField textField;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btc,bte,btp,btm,btmul,btd;
    Calculator(){
         textField = new TextField("");
        textField.setBounds(50,50,300,30);

        bt1 = new Button("1");
        bt1.addActionListener(this);
        bt2 = new Button("2");
        bt2.addActionListener(this);
        bt3 = new Button("3");
        bt3.addActionListener(this);
        bt4 = new Button("4");
        bt4.addActionListener(this);
        bt5 = new Button("5");
        bt5.addActionListener(this);
        bt6 = new Button("6");
        bt6.addActionListener(this);
        bt7 = new Button("7");
        bt7.addActionListener(this);
        bt8 = new Button("8");
        bt8.addActionListener(this);
        bt9 = new Button("9");
        bt9.addActionListener(this);

        bt0 = new Button("0");
        bt0.addActionListener(this);
        bte = new Button("=");
        bte.addActionListener(this);
        btc = new Button("C");
        btc.addActionListener(this);
        btp = new Button("+");
        btp.addActionListener(this);
        btm = new Button("-");
        btm.addActionListener(this);
        btmul = new Button("*");
        btmul.addActionListener(this);
        btd = new Button("/");
        btd.addActionListener(this);


        bt7.setBounds(50,90,30,30);
        bt4.setBounds(50,130,30,30);
        bt1.setBounds(50,170,30,30);
        bt0.setBounds(50,210,30,30);
        bt8.setBounds(100,90,30,30);
        bt5.setBounds(100,130,30,30);
        bt2.setBounds(100,170,30,30);
        bte.setBounds(100,210,30,30);
        bt9.setBounds(150,90,30,30);
        bt6.setBounds(150,130,30,30);
        bt3.setBounds(150,170,30,30);
        btc.setBounds(150,210,30,30);
        btp.setBounds(200,90,30,30);
        btm.setBounds(200,130,30,30);
        btmul.setBounds(200,170,30,30);
        btd.setBounds(200,210,30,30);








        add(textField);
        add(bt7);
        add(bt4);
        add(bt1);
        add(bt0);
        add(bt8);
        add(bt5);
        add(bt2);
        add(bte);
        add(bt9);
        add(bt6);
        add(bt3);
        add(btc);
        add(btp);
        add(btm);
        add(btmul);
        add(btd);



        setLayout(null);
        setSize(500,500);
        setVisible(true);


    }
 public void actionPerformed(ActionEvent e){

     if(e.getSource()==bt1){
         String expression = textField.getText();
         expression+="1";
         textField.setText(expression);
     }

     if(e.getSource()==bt2){
         String expression = textField.getText();
         expression+="2";
         textField.setText(expression);
     }

     if(e.getSource()==bt0){
         String expression = textField.getText();
         expression+="0";
         textField.setText(expression);
     }

     if(e.getSource()==bt3){
         String expression = textField.getText();
         expression+="3";
         textField.setText(expression);
     }

     if(e.getSource()==bt4){
         String expression = textField.getText();
         expression+="4";
         textField.setText(expression);
     }

     if(e.getSource()==bt5){
         String expression = textField.getText();
         expression+="5";
         textField.setText(expression);
     }

     if(e.getSource()==bt6){
         String expression = textField.getText();
         expression+="6";
         textField.setText(expression);
     }

     if(e.getSource()==bt7){
         String expression = textField.getText();
         expression+="7";
         textField.setText(expression);
     }

     if(e.getSource()==bt8){
         String expression = textField.getText();
         expression+="8";
         textField.setText(expression);
     }
     if(e.getSource()==bt9){
         String expression = textField.getText();
         expression+="9";
         textField.setText(expression);
     }

     if(e.getSource()==btp){
         String expression = textField.getText();
         expression+="+";
         textField.setText(expression);
     }

     if(e.getSource()==btm){
         String expression = textField.getText();
         expression+="-";
         textField.setText(expression);
     }

     if(e.getSource()==btmul){
         String expression = textField.getText();
         expression+="*";
         textField.setText(expression);
     }
     if(e.getSource()==btd){
         String expression = textField.getText();
         expression+="/";
         textField.setText(expression);
     }

     if(e.getSource()==btc){
         String expression = textField.getText();
         expression = "0";
         textField.setText(expression);
     }

     if(e.getSource()==bte){
            StringBuilder temp1= new StringBuilder();
         String temp2="";
         int result=0;
            int a,b, i;
            char operator = '+';
            String expression = textField.getText();
            for(i=0;i<expression.length();i++) {
                if (Character.isDigit(expression.charAt(i))) {
                    temp1.append(expression.charAt(i));
                } else {
                    operator = expression.charAt(i);
                    break;
                }
            }
                 a = Integer.parseInt(String.valueOf(temp1));
                b = Integer.parseInt(expression.substring(i+1));
                if(operator=='+') result = a+b;
                else if (operator=='-') result = a-b;
                else if (operator=='*') result = a*b;
                else result = a/b;
                textField.setText(String.valueOf(result));
                    
                }

    }




    public static void main(String[] args) {
        new Calculator();
    }
}