import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JButton sevenbutton;
	JLabel displaylabel;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton zerobutton;
	JButton decimalbutton;
	JButton addbutton;
	JButton substractbutton;
	JButton multiplybutton;
	JButton dividebutton;
	JButton equalbutton;
	JButton clearbutton;
	JButton backbutton;
	String oldvalue="hey";
	String newvalue="hey";
	int selectoperator=0;
	boolean isOperatorClicked=true;
	boolean isNumberClicked=false;
	boolean isDecimalClicked=false;
	float oldvalue1;
	float finalResult;
	

	Calculator()
	{
		JFrame frame=new JFrame("Calculator");
		frame.setSize(320, 460);
	    frame.getContentPane().setBackground(new Color(20,25,35));
		frame.setLocation(400, 90);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displaylabel=new JLabel("");
		displaylabel.setBounds(0, 0, 300, 120);
		displaylabel.setBackground(Color.black);
		displaylabel.setForeground(Color.lightGray);
		displaylabel.setFont(new Font("",Font.PLAIN,45));
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setOpaque(true);
		frame.add(displaylabel); 
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(5, 125, 70, 50);
		sevenbutton.setBackground(Color.gray);
		sevenbutton.setForeground(Color.black);
		
		sevenbutton.setFocusPainted(false);
		sevenbutton.addActionListener(this);
		frame.add(sevenbutton);
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(80, 125, 70, 50);
		eightbutton.setBackground(Color.gray);
		eightbutton.setBorder(null);
		eightbutton.setForeground(Color.black);
		
		eightbutton.setFocusPainted(false);
		eightbutton.addActionListener(this);
		frame.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(155, 125, 70, 50);
		ninebutton.setBackground(Color.gray);
		ninebutton.setForeground(Color.black);
		
		ninebutton.setFocusPainted(false);
		ninebutton.addActionListener(this);
		frame.add(ninebutton);
		
		dividebutton=new JButton("%");
		dividebutton.setBounds(230, 125, 70, 50);
		dividebutton.setBackground(Color.darkGray);
		dividebutton.setFont(new Font("",Font.PLAIN,15));
		dividebutton.setForeground(Color.white);
		dividebutton.setFocusPainted(false);
		dividebutton.addActionListener(this);
		frame.add(dividebutton);
		
		//first row of buttons completed
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(5, 180, 70, 50);
		fourbutton.setBackground(Color.gray);
		fourbutton.setForeground(Color.black);
		
		fourbutton.setFocusPainted(false);
		fourbutton.addActionListener(this);
		frame.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(80, 180, 70, 50);
		fivebutton.setBackground(Color.gray);
		fivebutton.setForeground(Color.black);
		
		fivebutton.setFocusPainted(false);
		
		fivebutton.addActionListener(this);
		frame.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(155, 180, 70, 50);
		sixbutton.setBackground(Color.gray);
		sixbutton.setForeground(Color.black);
		
		sixbutton.setFocusPainted(false);
		sixbutton.addActionListener(this);
		frame.add(sixbutton);
		
		multiplybutton=new JButton("x");
		multiplybutton.setBounds(230, 180, 70, 50);
		multiplybutton.setBackground(Color.darkGray);
		multiplybutton.setForeground(Color.white);
		multiplybutton.setFont(new Font("",Font.PLAIN,20));
		
		multiplybutton.setFocusPainted(false);
		multiplybutton.addActionListener(this);
		frame.add(multiplybutton);
		
		//second row of buttons completed
		
		onebutton=new JButton("1");
		onebutton.setBounds(5, 235, 70, 50);
		onebutton.setBackground(Color.gray);
		onebutton.setForeground(Color.black);
		
		onebutton.setFocusPainted(false);
		onebutton.addActionListener(this);
		frame.add(onebutton);
		

		twobutton=new JButton("2");
		twobutton.setBounds(80, 235, 70, 50);
		twobutton.setBackground(Color.gray);
		twobutton.setForeground(Color.black);
		
		twobutton.setFocusPainted(false);
		twobutton.addActionListener(this);
		frame.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(155, 235, 70, 50);
		threebutton.setBackground(Color.gray);
		threebutton.setForeground(Color.black);
		
		threebutton.setFocusPainted(false);
		threebutton.addActionListener(this);
		frame.add(threebutton);
		
		substractbutton=new JButton("-");
		substractbutton.setBounds(230, 235, 70, 50);
		substractbutton.setBackground(Color.darkGray);
		substractbutton.setFont(new Font("",Font.PLAIN,35));
		substractbutton.setForeground(Color.white);
		
		substractbutton.setFocusPainted(false);
		substractbutton.addActionListener(this);
		frame.add(substractbutton);
		
		//Third row of buttons completed
		
		decimalbutton=new JButton(".");
		decimalbutton.setBounds(5, 290, 70, 50);
		decimalbutton.setBackground(Color.gray);
		decimalbutton.setForeground(Color.black);
		decimalbutton.setFont(new Font("",Font.PLAIN,35));
		
		decimalbutton.setFocusPainted(false);
		decimalbutton.addActionListener(this);
		frame.add(decimalbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(80, 290, 70, 50);
		zerobutton.setBackground(Color.gray);
		zerobutton.setForeground(Color.black);
		
		zerobutton.setFocusPainted(false);
		zerobutton.addActionListener(this);
		frame.add(zerobutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(155, 290, 70, 50);
		equalbutton.setBackground(Color.ORANGE);
		equalbutton.setFont(new Font("",Font.PLAIN,20));
		equalbutton.setForeground(Color.DARK_GRAY);
		
		equalbutton.setFocusPainted(false);
		equalbutton.addActionListener(this);
		frame.add(equalbutton);
		
		addbutton=new JButton("+");
		addbutton.setBounds(230, 290, 70, 50);
		addbutton.setBackground(Color.darkGray);
		addbutton.setFont(new Font("",Font.PLAIN,25));
		addbutton.setForeground(Color.white);
		
		addbutton.setFocusPainted(false);
		addbutton.addActionListener(this);
		frame.add(addbutton);
		
		//fourth row of buttons completed 
		
		
		clearbutton=new JButton("Clear");
		clearbutton.setBounds(5, 345, 145, 40);
		clearbutton.setBackground(Color.gray);
		clearbutton.setForeground(Color.black);
		
		clearbutton.setFocusPainted(false);
		clearbutton.addActionListener(this);
		frame.add(clearbutton);
		
		backbutton=new JButton("Back");
		backbutton.setBounds(155, 345, 145, 40);
		backbutton.setBackground(Color.gray);
		backbutton.setForeground(Color.black);
		
		backbutton.setFocusPainted(false);
		backbutton.addActionListener(this);
		frame.add(backbutton);

	}
	
	public static void main(String au[])
	{
		new Calculator();
		
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==sevenbutton)
		{
			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("7");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"7");
			}
		}
		else if(e.getSource()==eightbutton)
		{

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("8");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		else if(e.getSource()==ninebutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("9");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"9");
			}
		}
		else if(e.getSource()==fourbutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("4");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"4");
			}
			
		}
		else if(e.getSource()==fivebutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("5");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"5");
			}
			
		}
		else if(e.getSource()==sixbutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("6");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"6");
			}
			
		}
		else if(e.getSource()==onebutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("1");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"1");
			}
			
		}
		else if(e.getSource()==twobutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("2");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"2");
			}
			
		}
		else if(e.getSource()==threebutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("3");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"3");
			}
			
		}
		else if(e.getSource()==zerobutton)
		{
			isNumberClicked=true;

			isNumberClicked=true;
			if(isOperatorClicked==true)
			{
				oldvalue=displaylabel.getText();
				displaylabel.setText("0");
				isOperatorClicked=false;
			}
			else
			{
			displaylabel.setText(displaylabel.getText()+"0");
			}
			
		}
		else if(e.getSource()==decimalbutton)
		{
			if(isDecimalClicked==true)
			{
				
			}
			else
			{
				isDecimalClicked=true;
			displaylabel.setText(displaylabel.getText()+".");
			}
			
		}
		else if(e.getSource()==clearbutton)
		{
			isDecimalClicked=false;
			displaylabel.setText("");	
		}
		else if(e.getSource()==backbutton)
		{
			
			String back=displaylabel.getText();
			int back1=Integer.parseInt(back);
			int backdisplay=back1/10;
			displaylabel.setText(backdisplay+"");
			
		}
		else if(e.getSource()==dividebutton)
		{
			isDecimalClicked=false;
			isOperatorClicked=true;
			selectoperator=1;
		}
		else if(e.getSource()==multiplybutton)
		{
			isDecimalClicked=false;
			isOperatorClicked=true;
			selectoperator=2;
		}
		else if(e.getSource()==substractbutton)
		{
			isDecimalClicked=false;
			isOperatorClicked=true;
			selectoperator=3;
		}
		
		else if(e.getSource()==addbutton)
		{
			if(selectoperator!=0)  //need changes from here to
			{
				if(selectoperator==1)
				{
				String new1=displaylabel.getText();
				float new2=Float.parseFloat(new1);
				float result2=oldvalue1/new2;
				oldvalue1=result2;
				displaylabel.setText(result2+"");
				isDecimalClicked=false;
				isOperatorClicked=true;
				selectoperator=4;
				}
				
			    else if(selectoperator==2)
				{
				String new1=displaylabel.getText();
				float new2=Float.parseFloat(new1);
				float result2=oldvalue1*new2;
				oldvalue1=result2;
				displaylabel.setText(result2+"");
				isDecimalClicked=false;
				isOperatorClicked=true;
				selectoperator=4;  
				}
				else if(selectoperator==3)
				{
				String new1=displaylabel.getText();
				float new2=Float.parseFloat(new1);
				float result2=oldvalue1-new2;
				oldvalue1=result2;
				displaylabel.setText(result2+"");
				isDecimalClicked=false;
				isOperatorClicked=true;
				selectoperator=4;
				}
				else if(selectoperator==4)
				{
				String new1=displaylabel.getText();
				float new2=Float.parseFloat(new1);
				float result2=new2+oldvalue1;
				oldvalue1=result2;
				displaylabel.setText(result2+"");
				isDecimalClicked=false;
				isOperatorClicked=true;
				selectoperator=4;
				}
			}
			else
			{
			isDecimalClicked=false;
			isOperatorClicked=true;
			selectoperator=4;
			}      //....to here
		}
		else if(e.getSource()==equalbutton)
		{
			if(selectoperator==1)
			{
				newvalue=displaylabel.getText();
				float newvalue1=Float.parseFloat(newvalue);
				oldvalue1=Float.parseFloat(oldvalue);
				finalResult=oldvalue1/newvalue1;
				displaylabel.setText(finalResult+"");
				
			}
			if(selectoperator==2)
			{
				newvalue=displaylabel.getText();
				float newvalue1=Float.parseFloat(newvalue);
				oldvalue1=Float.parseFloat(oldvalue);
				finalResult=newvalue1*oldvalue1;
				displaylabel.setText(finalResult+"");
				
			}
			if(selectoperator==3)
			{
				newvalue=displaylabel.getText();
				float newvalue1=Float.parseFloat(newvalue);
				oldvalue1=Float.parseFloat(oldvalue);
				finalResult=oldvalue1-newvalue1;
				displaylabel.setText(finalResult+"");
				
			}
			if(selectoperator==4)
			{
				newvalue=displaylabel.getText();
				float newvalue1=Float.parseFloat(newvalue);
				oldvalue1=Float.parseFloat(oldvalue);
				finalResult=newvalue1+oldvalue1;
				displaylabel.setText(finalResult+"");
				
			}
			
		}
	}
	

}
