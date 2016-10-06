/** jinmo chong's code
 * 
 */


package fractionCalculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fraction.Fraction;

public class FractionCalculator extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JFrame masterFrame;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonadd;
	private JButton buttonfrac;
	private JButton buttondiv;
	private JButton buttonclearall;
	private JButton buttonclear;
	private JButton buttonnegate;
	private JButton buttoninvert;
	private JButton buttonbackspace;
	private JButton buttonminus;
	private JButton buttonmulti;
	private JTextField inputField;
	
	// this is a flag to indicate if the former button was invert or negate
	// if it was invert or negate, store the inverted or negated fraction in the memory
	// if it is not, just stay alone the memory
	private boolean invneg = false;
	
	private String displaynumber = "0";
	private Fraction memorynumber = new Fraction(0);
	
	
	public static void main(String[] args) {
		FractionCalculator fc = new FractionCalculator();
		// for construct() make JFrame, JPanel, JButtons and stuff and display it
		// startlisteners connect with listeners
		fc.construct();
		fc.startListeners();	
	}
	
	public void construct()  {
		// setting masterFrame, which is JFrame
		
		masterFrame = new JFrame("Fraction Calculator");
		masterFrame.setLayout(new BorderLayout());
		
		//setting buttons 4X4 16
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonclear = new JButton("Clear");
		buttonclearall = new JButton("Clearall");
		buttonfrac = new JButton("/");
		buttonminus = new JButton("-");
		buttonmulti = new JButton(((char)215) + "");
		buttondiv = new JButton(((char)247) + "");
		buttonadd = new JButton("+");
		buttoninvert = new JButton("Invert");
		buttonnegate = new JButton("negate");
		buttonbackspace = new JButton(((char)8592) + "");
		
		
		// two panels first for input, second for buttons 
		// second for flow 
		JPanel buttonpanel = new JPanel();
		masterFrame.add(buttonpanel, BorderLayout.CENTER);
		buttonpanel.setLayout(new GridLayout(4, 4));
		
		//adding buttons to the JPanel
		buttonpanel.add(button9);
		buttonpanel.add(button8);
		buttonpanel.add(button7);
		buttonpanel.add(buttonclear);
		buttonpanel.add(buttonclearall);
		buttonpanel.add(button6);
		buttonpanel.add(button5);
		buttonpanel.add(button4);
		buttonpanel.add(buttonadd);
		buttonpanel.add(buttonminus);
		buttonpanel.add(button3);
		buttonpanel.add(button2);
		buttonpanel.add(button1);
		buttonpanel.add(buttonmulti);
		buttonpanel.add(buttondiv);
		buttonpanel.add(button0);
		buttonpanel.add(buttonbackspace);
		buttonpanel.add(buttoninvert);
		buttonpanel.add(buttonnegate);
		buttonpanel.add(buttonfrac);
	
		//setting inputfield for calculating
		inputField = new JTextField();
		inputField.setText(displaynumber + "");
		inputField.setEnabled(false);
		
		masterFrame.add(inputField, BorderLayout.NORTH);
		
		masterFrame.pack();
		masterFrame.setSize(500, 500);
		masterFrame.setVisible(true);
	}
		
	
	public void startListeners() {
		//ctrl-c ctrl-v for this
		
		button1.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "1";
					inputField.setText(displaynumber);
				}
				else if (displaynumber == "0") {
					displaynumber = "1";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "1";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "2";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "2";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "2";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "3";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "3";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "3";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button4.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "4";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "4";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "4";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button5.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "5";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "5";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "5";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button6.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "6";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "6";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "6";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button7.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "7";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "7";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "7";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button8.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "8";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "8";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "8";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button9.addActionListener(new ActionListener() {
			// this is the class ActionListener
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "9";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "9";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "9";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (invneg == true) {
					String s1 = inputField.getText();
					Fraction f1;
					f1 = new Fraction(s1);
					memorynumber = f1;
					invneg = false;
					displaynumber = "0";
					inputField.setText(displaynumber);
				} else if (displaynumber == "0") {
					displaynumber = "0";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "0";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		buttonfrac.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				if (displaynumber == "0") {
					displaynumber = "/";
					inputField.setText(displaynumber);
				} else {
				displaynumber += "/";
				inputField.setText(displaynumber);		
				}
			}
		});
		
		buttonclear.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				displaynumber = "0";
				inputField.setText(displaynumber);		
			}
		});
		
		buttonclearall.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				displaynumber = "0";
				memorynumber = new Fraction(0);
				inputField.setText(displaynumber);
			}
		});
		
		//doesn't work don't know why especially the else if one
		buttonnegate.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				String a = inputField.getText();
				Fraction afrac = new Fraction(a);
				afrac = afrac.negate();
				inputField.setText(afrac.toString());
				displaynumber = "0";
				invneg = true;
				} catch (Exception e) {
					inputField.setText("ERROR");
				}
	
			}
		});
		
		buttoninvert.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					String a = inputField.getText();
					Fraction afrac;
					afrac = new Fraction(a);
					afrac = afrac.inverse();
					inputField.setText(afrac.toString());
					displaynumber = "0";
					invneg = true;
				} catch (Exception e) {
					inputField.setText("Error");
				}	
			}
		});

		// also doesn't work don't know why
		buttonbackspace.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int n = displaynumber.length();
				if (displaynumber.equals("0") || displaynumber.equals("")) {
					displaynumber = "0";
					inputField.setText(displaynumber);	
				} else {
					displaynumber = displaynumber.substring(0, n - 1);
					inputField.setText(displaynumber);
				}
			}
		});
		
		buttonadd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				Fraction f1;
				String f1s = inputField.getText();
				f1 = new Fraction(f1s);
				memorynumber = memorynumber.add(f1);
				inputField.setText(memorynumber.toString());
				displaynumber = "0";
				} catch (Exception e) {
					inputField.setText("ERROR");
				}
			}
		});
		
		buttonminus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				Fraction f1;
				String f1s = inputField.getText();
				f1 = new Fraction(f1s);
				memorynumber = memorynumber.subtract(f1);
				inputField.setText(memorynumber.toString());
				displaynumber = "0";
				} catch (Exception e) {
					inputField.setText("ERROR");
				}
			}
		});
		
		buttonmulti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					Fraction f1;
					String f1s = inputField.getText();
					f1 = new Fraction(f1s);
					memorynumber = memorynumber.multiply(f1);
					inputField.setText(memorynumber.toString());
					displaynumber = "0";
				} catch (Exception e) {
					inputField.setText("ERROR");
				}
			}
		});
		
		buttondiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					Fraction f1;
					String f1s = inputField.getText();
					f1 = new Fraction(f1s);
					memorynumber = memorynumber.divide(f1);
					inputField.setText(memorynumber.toString());
					displaynumber = "0";
				} catch (Exception e) {
					inputField.setText("ERROR");
				}
			}
		});
	}

}
