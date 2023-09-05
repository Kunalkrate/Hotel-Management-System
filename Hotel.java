package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtFriedRice;
	private JTextField txtButterChicken;
	private JTextField txtShahiPaneer;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
	
    double firstnum;
    double secondnum;
    double result;
	String operations;
	
	double Indian_Rupees = 82;
	double Chinese_Yuan = 7;
	double Nigerian_Naira = 760;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1485, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(64, 128, 128), 5, true));
		panel.setBounds(10, 50, 514, 788);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 494, 766);
		panel.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textArea.setBounds(10, 11, 469, 716);
		panel_3.add(textArea);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		textField.setColumns(10);
		textField.setBounds(10, 24, 472, 58);
		panel_2.add(textField);
		
		JButton btnBackSpace = new JButton("");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) 
				{
					 String backSpace = null;
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
				   backSpace=strB.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.BOLD, 60));
		btnBackSpace.setBounds(10, 93, 109, 100);
		panel_2.add(btnBackSpace);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnNewButton_1.setBounds(129, 93, 109, 100);
		panel_2.add(btnNewButton_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn7.getText();
				textField.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn7.setBounds(10, 203, 109, 100);
		panel_2.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn8.getText();
				textField.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn8.setBounds(129, 204, 109, 100);
		panel_2.add(btn8);
		
		JButton btnNewButton_1_1 = new JButton("%");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				 operations = "%";
			}
		});
		btnNewButton_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnNewButton_1_1.setBounds(248, 93, 109, 100);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				 operations = "+";
			}
		});
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnNewButton_2.setBounds(373, 93, 109, 100);
		panel_2.add(btnNewButton_2);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
			    operations = "-";
			}
		});
		btnMinus.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnMinus.setBounds(373, 203, 109, 100);
		panel_2.add(btnMinus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn9.getText();
				textField.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn9.setBounds(248, 203, 109, 100);
		panel_2.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn4.getText();
				textField.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn4.setBounds(10, 313, 109, 100);
		panel_2.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn5.getText();
				textField.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn5.setBounds(129, 313, 109, 100);
		panel_2.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn6.getText();
				textField.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn6.setBounds(248, 313, 109, 100);
		panel_2.add(btn6);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				 operations = "X";
			}
		});
		btnX.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnX.setBounds(373, 313, 109, 100);
		panel_2.add(btnX);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn1.getText();
				textField.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn1.setBounds(10, 423, 109, 100);
		panel_2.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn2.getText();
				textField.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn2.setBounds(129, 423, 109, 100);
		panel_2.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn3.getText();
				textField.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn3.setBounds(248, 423, 109, 100);
		panel_2.add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				 operations = "/";
			}
		});
		btnDivide.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnDivide.setBounds(373, 423, 109, 100);
		panel_2.add(btnDivide);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn0.getText();
				textField.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btn0.setBounds(10, 533, 109, 100);
		panel_2.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btnDot.getText();
				textField.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnDot.setBounds(129, 533, 109, 100);
		panel_2.add(btnDot);
		
		JButton btnPlus = new JButton("+/-");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusminus = Double.parseDouble(String.valueOf(textField.getText()));
				 plusminus = plusminus*(-1);
				 textField.setText(String.valueOf(plusminus));
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 60));
		btnPlus.setBounds(248, 534, 115, 100);
		panel_2.add(btnPlus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations =="+") {
					result = firstnum+secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result = firstnum-secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "X") {
					result = firstnum*secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = firstnum/secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result = firstnum%secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		btnEqual.setBounds(373, 533, 109, 100);
		panel_2.add(btnEqual);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(64, 128, 128), 5, true));
		panel_1.setBounds(534, 169, 925, 344);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1.setBounds(24, 11, 112, 43);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Qty");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(209, 11, 112, 43);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Price $");
		lblNewLabel_1_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(343, 11, 112, 43);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setForeground(new Color(0, 0, 0));
		btnFriedRice.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnFriedRice.setBounds(24, 64, 112, 43);
		panel_1.add(btnFriedRice);
		
		JLabel btnButterChicken = new JLabel("Butter Chicken");
		btnButterChicken.setForeground(new Color(0, 0, 0));
		btnButterChicken.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnButterChicken.setBounds(24, 106, 157, 43);
		panel_1.add(btnButterChicken);
		
		JLabel ShahiPaneer = new JLabel("Shahi Paneer");
		ShahiPaneer.setForeground(new Color(0, 0, 0));
		ShahiPaneer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		ShahiPaneer.setBounds(24, 160, 137, 43);
		panel_1.add(ShahiPaneer);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coke", "Pepsi", "Minute Made"}));
		btnChooseDrink.setBounds(24, 214, 175, 27);
		panel_1.add(btnChooseDrink);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtFriedRice.setBounds(209, 71, 86, 28);
		panel_1.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtButterChicken = new JTextField();
		txtButterChicken.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtButterChicken.setColumns(10);
		txtButterChicken.setBounds(209, 113, 86, 28);
		panel_1.add(txtButterChicken);
		
		txtShahiPaneer = new JTextField();
		txtShahiPaneer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtShahiPaneer.setColumns(10);
		txtShahiPaneer.setBounds(209, 167, 86, 28);
		panel_1.add(txtShahiPaneer);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtChooseDrink.setColumns(10);
		txtChooseDrink.setBounds(209, 213, 86, 28);
		panel_1.add(txtChooseDrink);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("4.21");
		lblNewLabel_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(354, 64, 112, 43);
		panel_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("6.31");
		lblNewLabel_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_1_3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_3_2.setBounds(354, 106, 112, 43);
		panel_1.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("5.21");
		lblNewLabel_1_3_3.setForeground(Color.BLACK);
		lblNewLabel_1_3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_3_3.setBounds(354, 152, 112, 43);
		panel_1.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("  -");
		lblNewLabel_1_3_4.setForeground(Color.BLACK);
		lblNewLabel_1_3_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_3_4.setBounds(354, 198, 112, 43);
		panel_1.add(lblNewLabel_1_3_4);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(501, 11, 9, 322);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 253, 481, 2);
		panel_1.add(separator_1);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "102", "VIP"}));
		btnChooseRoom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnChooseRoom.setBounds(24, 261, 175, 27);
		panel_1.add(btnChooseRoom);
		
		JCheckBox CheckBoxDelivery = new JCheckBox("Delivery");
		CheckBoxDelivery.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		CheckBoxDelivery.setBounds(24, 295, 97, 23);
		panel_1.add(CheckBoxDelivery);
		
		JCheckBox CheckBoxTax = new JCheckBox("Tax");
		CheckBoxTax.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		CheckBoxTax.setBounds(135, 295, 97, 23);
		panel_1.add(CheckBoxTax);
		
		
		
		
		
		JLabel lblNewLabel_1_6 = new JLabel("Currency Converter");
		lblNewLabel_1_6.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_1_6.setBounds(556, 11, 261, 43);
		panel_1.add(lblNewLabel_1_6);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(556, 124, 236, 34);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0,0,0),1));
		txtCurrencyOutput.setBounds(556, 181, 236, 32);
		panel_1.add(txtCurrencyOutput);
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "India", "China", "Nigeria"}));
		btnSelectCountry.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnSelectCountry.setBounds(556, 64, 236, 34);
		panel_1.add(btnSelectCountry);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
				
				if(btnSelectCountry.getSelectedItem().equals("India"))
				{
					String Rupees = String.format("INR %.2f",USA_Dollar*Indian_Rupees );
					txtCurrencyOutput.setText(Rupees);
							
				}
				
				if(btnSelectCountry.getSelectedItem().equals("Nigeria"))
				{
					String Naira = String.format("N %.2f",USA_Dollar*Nigerian_Naira );
					txtCurrencyOutput.setText(Naira);
				}
				
				if(btnSelectCountry.getSelectedItem().equals("China"))
				{
					String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
					txtCurrencyOutput.setText(Yuan);
				}
				
				
			}
		});
		btnConvert.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnConvert.setBounds(556, 276, 118, 27);
		panel_1.add(btnConvert);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnSelectCountry.setSelectedItem("Country");
			}
		});
		btnReset_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnReset_1.setBounds(676, 276, 97, 27);
		panel_1.add(btnReset_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(64, 128, 128), 5, true));
		panel_1_1.setBounds(534, 515, 925, 323);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel btnTotalCostMeal = new JLabel("Total Cost of Meal");
		btnTotalCostMeal.setForeground(Color.BLACK);
		btnTotalCostMeal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTotalCostMeal.setBounds(29, 41, 193, 43);
		panel_1_1.add(btnTotalCostMeal);
		
		JLabel btnTotalCostDrink = new JLabel("Total Cost of Drink");
		btnTotalCostDrink.setForeground(Color.BLACK);
		btnTotalCostDrink.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTotalCostDrink.setBounds(29, 101, 193, 43);
		panel_1_1.add(btnTotalCostDrink);
		
		JLabel btnDeliveryCost = new JLabel("Cost of Delivery");
		btnDeliveryCost.setForeground(Color.BLACK);
		btnDeliveryCost.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnDeliveryCost.setBounds(29, 166, 193, 43);
		panel_1_1.add(btnDeliveryCost);
		
		JLabel btnCostRoom = new JLabel("Cost of Room");
		btnCostRoom.setForeground(Color.BLACK);
		btnCostRoom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnCostRoom.setBounds(29, 230, 193, 43);
		panel_1_1.add(btnCostRoom);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(500, 11, 9, 301);
		panel_1_1.add(separator_2);
		
		JLabel txtTotalCostMeal = new JLabel("");
		txtTotalCostMeal.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtTotalCostMeal.setBorder(new LineBorder(new Color(0,0,0),1));
		txtTotalCostMeal.setBounds(241, 41, 236, 32);
		panel_1_1.add(txtTotalCostMeal);
		
		JLabel txtTotalCostDrink = new JLabel("");
		txtTotalCostDrink.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtTotalCostDrink.setBorder(new LineBorder(new Color(0,0,0),1));
		txtTotalCostDrink.setBounds(241, 101, 236, 32);
		panel_1_1.add(txtTotalCostDrink);
		
		JLabel txtDeliveryCost = new JLabel("");
		txtDeliveryCost.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtDeliveryCost.setBorder(new LineBorder(new Color(0,0,0),1));
		txtDeliveryCost.setBounds(241, 166, 236, 32);
		panel_1_1.add(txtDeliveryCost);
		
		JLabel txtCostRoom = new JLabel("");
		txtCostRoom.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtCostRoom.setBorder(new LineBorder(new Color(0,0,0),1));
		txtCostRoom.setBounds(241, 230, 236, 32);
		panel_1_1.add(txtCostRoom);
		
		JLabel btnTax = new JLabel("Tax");
		btnTax.setForeground(Color.BLACK);
		btnTax.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTax.setBounds(551, 59, 54, 43);
		panel_1_1.add(btnTax);
		
		JLabel btnSubTotal = new JLabel("Sub Total");
		btnSubTotal.setForeground(Color.BLACK);
		btnSubTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnSubTotal.setBounds(551, 129, 125, 43);
		panel_1_1.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnTotal.setBounds(551, 208, 125, 43);
		panel_1_1.add(btnTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtTax.setBorder(new LineBorder(new Color(0,0,0),1));
		txtTax.setBounds(690, 59, 182, 32);
		panel_1_1.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtSubTotal.setBorder(new LineBorder(new Color(0,0,0),1));
		txtSubTotal.setBounds(690, 129, 182, 32);
		panel_1_1.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtTotal.setBorder(new LineBorder(new Color(0,0,0),1));
		txtTotal.setBounds(690, 208, 182, 32);
		panel_1_1.add(txtTotal);
		
		JLabel lblNewLabel = new JLabel("Guest Services Manager");
		lblNewLabel.setForeground(new Color(64, 128, 128));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 80));
		lblNewLabel.setBounds(542, 50, 917, 116);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1459, 39);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("New");
		mnNewMenu_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Receipt");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Invoice1 = Double.parseDouble(txtFriedRice.getText());
				Double Invoice2 = Double.parseDouble(txtButterChicken.getText());
				Double Invoice3 = Double.parseDouble(txtShahiPaneer.getText());
				Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
				
				textArea.append("\t\n Guest Servies Manager:\n"
				                    + "\n Fried Rice : \t"                                     +  Invoice1
				                    + "\n Butter Chicken : \t"                                +  Invoice2  
				                    + "\n Shahi Paneer : \t"                                  +  Invoice3
				                    + "\n" + btnChooseDrink.getSelectedItem() + " : \t\t"    +  Invoice4
				                    + "\n Total :\t \t"                                              +  txtTotal.getText()
				                    + "\n\nWelcome and Thank you for your patronage"
				                   );
			}
		});
		mntmNewMenuItem.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Reset");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null);
				txtButterChicken.setText(null);
				txtShahiPaneer.setText(null);
				txtChooseDrink.setText(null);
			    txtTotalCostMeal.setText(null);
			    txtTotalCostDrink.setText(null);
			    txtDeliveryCost.setText(null);
			    txtCostRoom.setText(null);
			    txtTax.setText(null);
			    txtSubTotal.setText(null);
			    txtTotal.setText(null);
			    btnChooseDrink.setSelectedItem("Choose a drink");
			    btnChooseRoom.setSelectedItem("Choose a room");
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Convert");
		mntmNewMenuItem_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Refresh");
		mntmNewMenuItem_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setForeground(new Color(255, 0, 0));
		mntmNewMenuItem_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Convert");
		mnNewMenu_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_5 = new JMenu("Reset");
		mnNewMenu_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Receipt");
		mnNewMenu_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("");
		menuBar.add(mnNewMenu_7);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//=======================Drink============================
		double Drinks = Double.parseDouble(txtChooseDrink.getText());
		double CocaCola = 1.12*Drinks;
		double Pepsi = 2.43*Drinks;
		double MinuteMade = 1.67*Drinks;
		
		if(btnChooseDrink.getSelectedItem().equals("Coke"))
		{
			String pCoca_Cola = String.format("%.2f", CocaCola);
			txtTotalCostDrink.setText(pCoca_Cola);
		}
		
		if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
		{
			String pPepsi = String.format("%.2f", Pepsi);
			txtTotalCostDrink.setText(pPepsi);
		}
		
		if(btnChooseDrink.getSelectedItem().equals("Minute Made"))
		{
			String pMinuteMade = String.format("%.2f", MinuteMade);
			txtTotalCostDrink.setText(pMinuteMade);
		}
		
		if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
		{
			txtTotalCostDrink.setText("0.000");
		}
		
		//======================Room========================
		double R101 = 50;
		double R102 = 60;
		double VIP = 80;
		
		if(btnChooseRoom.getSelectedItem().equals("101"))
		{
			String p101 = String.format("%.2f", R101);
			txtCostRoom.setText(p101);
		}
		
		if(btnChooseRoom.getSelectedItem().equals("102"))
		{
			String p102 = String.format("%.2f", R102);
			txtCostRoom.setText(p102);
		}
		if(btnChooseRoom.getSelectedItem().equals("VIP"))
		{
			String pVIP = String.format("%.2f", VIP);
			txtCostRoom.setText(pVIP);
		}
		
		//=====================Meal=========================
		
		double FriedRice = Double.parseDouble(txtFriedRice.getText());
		double pFriedRice = 	4.21;
		double getFriedRice = (FriedRice*pFriedRice);
	    String TotalFriedRice = String.format("%.2f", getFriedRice);
	    txtTotalCostMeal.setText(TotalFriedRice);
	    
	    double ButterChicken = Double.parseDouble(txtButterChicken.getText());
	    double pButterChicken = 6.31;
	    double getButterChicken = (ButterChicken*pButterChicken);
	    String TotalButterChicken = String.format("%.2f", getButterChicken + getFriedRice);
	    txtTotalCostMeal.setText(TotalButterChicken);
	    
	    double ShahiPaneer = Double.parseDouble(txtShahiPaneer.getText());
	    double pShahiPaneer = 5.21;
	    double getShahiPaneer = (ShahiPaneer*pShahiPaneer);
	    String TotalShahiPaneer = String.format("%.2f", getShahiPaneer + getFriedRice + getButterChicken );
	    txtTotalCostMeal.setText(TotalShahiPaneer);
	    
	    //======================Delivery=======================
	    
	    double cDelivery = 1.20;
	    if(CheckBoxDelivery.isSelected())
	    {
	    	String pDelivery = String.format("%.2f",cDelivery );
	    	txtDeliveryCost.setText(pDelivery);
	    }
	    else 
	    {
	    	txtDeliveryCost.setText("0.00");
	    }
	    
	    //=====================Tax==========================
	    double pTotal1 = Double.parseDouble(txtTotalCostDrink.getText());
	    double pTotal2 = Double.parseDouble(txtTotalCostMeal.getText());
	    double pTotal3 = Double.parseDouble(txtDeliveryCost.getText());
	    double pTotal = (pTotal1 + pTotal2 + pTotal3)/100;
	    
	    if(CheckBoxTax.isSelected())
	    {
	    	String xTotal = String.format("%.2f", pTotal);
	    	txtTax.setText(xTotal);
	    }
	    
	    //====================Total==========================
	    double pTotal4 = Double.parseDouble(txtTax.getText());
	    String zTaxTotal = String.format("%.2f", pTotal4);
	    txtTax.setText(zTaxTotal);
	    
	    double SubTotal = (pTotal1 + pTotal2 + pTotal3);
	    String pSubTotal = String.format("%.2f", SubTotal);
	    txtSubTotal.setText(pSubTotal);
	    
	    double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
	    String yTotal = String.format("%.2f", xTotal);
	    txtTotal.setText(yTotal);
	    
	 
			}
		});
		btnSubmit.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnSubmit.setBounds(238, 276, 118, 27);
		panel_1.add(btnSubmit);
		
		   //====================Reset======================
		   
	    JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null);
				txtButterChicken.setText(null);
				txtShahiPaneer.setText(null);
				txtChooseDrink.setText(null);
			    txtTotalCostMeal.setText(null);
			    txtTotalCostDrink.setText(null);
			    txtDeliveryCost.setText(null);
			    txtCostRoom.setText(null);
			    txtTax.setText(null);
			    txtSubTotal.setText(null);
			    txtTotal.setText(null);
			    btnChooseDrink.setSelectedItem("Choose a drink");
			    btnChooseRoom.setSelectedItem("Choose a room");
			    
			}
		});
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnReset.setBounds(358, 276, 97, 27);
		panel_1.add(btnReset);
	}
}
