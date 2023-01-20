import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class smallCalc implements ActionListener {
    JFrame frame;
	JPanel p;
	JLabel firstOperand,secondOperand,answer;
	JTextField op1,op2,ans;
	JButton plus,mul,clear;

    smallCalc() {
        frame = new JFrame();

        firstOperand=new JLabel("FIRST OPERAND");
		secondOperand=new JLabel("SECOND OPERAND");
		answer=new JLabel("ANSWER");
		op1=new JTextField(10);
		op2=new JTextField(10);
		ans=new JTextField(10);
		plus=new JButton("+");
		mul=new JButton("*");
        clear=new JButton("clear");

        // creating buttons
        // JButton b1 = new JButton("NORTH");
        // // the button will be labeled as NORTH
        // JButton b2 = new JButton("SOUTH");

        // Container c=frame.getContentPane();
		// c.setLayout(new BorderLayout());

		// frame.setLayout(new BorderLayout());
		 p = new JPanel();
		//  p.setLayout(new BorderLayout());
		// c1.setLayout(new BorderLayout());
		frame.add(p);
		// c1.setBounds(10, 10, 200, 200);

        p.add(firstOperand);
		p.add(op1);		
		p.add(secondOperand);
		p.add(op2);
		p.add(answer);
		p.add(ans);


        p.add(plus);
		p.add(mul);
        p.add(clear);

        
        plus.addActionListener(this);
		mul.addActionListener(this);
        clear.addActionListener(this);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new smallCalc();
    }

    
    public void actionPerformed(ActionEvent ae) {
        String oper,result;
		int num1,num2,num3;
		
		if(ae.getSource()==plus)
		{
		oper=op1.getText();
		num1=Integer.parseInt(oper);
		

		oper=op2.getText();
		num2=Integer.parseInt(oper);

		num3=num1+num2;

		result=num3+"";

		ans.setText(result);
		}

		else if(ae.getSource()==mul)
		{
		oper=op1.getText();
		num1=Integer.parseInt(oper);
		

		oper=op2.getText();
		num2=Integer.parseInt(oper);

		num3=num1*num2;

		result=num3+"";
		ans.setText(result);
		}
        else if(ae.getSource() == clear){
            System.out.println("clear clicked");
            op1.setText(" ");
            op2.setText(" ");
			ans.setText(" ");       }
        
    }
}