package travelling;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;

public class Online_Travellingticket {

	private JFrame frame;
	private JTextField stax;
	private JTextField subtotal;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField frm;
	private JTextField to;
	private JTextField dte;
	private JTextField tim;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtRoute;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Online_Travellingticket window = new Online_Travellingticket();
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
	public Online_Travellingticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("dialog", Font.BOLD | Font.ITALIC, 25));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(41, 39, 1281, 47);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(" Ticket booking system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket class");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(41, 97, 219, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard class");
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton.setBounds(18, 227, 205, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Economy class");
		rdbtnNewRadioButton_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_1.setBounds(17, 268, 206, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("First class");
		rdbtnNewRadioButton_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_2.setBounds(16, 306, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("single ticket");
		rdbtnNewRadioButton_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_3.setBounds(16, 343, 173, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Return ticket ");
		rdbtnNewRadioButton_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_4.setBounds(322, 306, 173, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Adult");
		rdbtnNewRadioButton_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_5.setBounds(322, 227, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Childen");
		rdbtnNewRadioButton_6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_6.setBounds(322, 268, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Private class");
		rdbtnNewRadioButton_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rdbtnNewRadioButton_7.setBounds(322, 343, 173, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(18, 141, 486, 2);
		frame.getContentPane().add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"destination", "Delhi ", "mumbai", "karnal", "panipat", "pinjor ", "chandigarh", "ambala", "haridwar", "gurugram", "noida ", "faridabad", "amritsar ", "bangaloru"}));
		comboBox.setBounds(18, 398, 454, 22);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(18, 444, 486, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("TAX");
		lblNewLabel_2.setBounds(33, 481, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel txtLuggageCost = new JLabel("LUGGAGE COST");
		txtLuggageCost.setBounds(248, 481, 89, 14);
		frame.getContentPane().add(txtLuggageCost);
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total");
		lblNewLabel_4.setBounds(33, 529, 48, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		stax = new JTextField();
		stax.setBounds(93, 478, 96, 20);
		frame.getContentPane().add(stax);
		stax.setColumns(10);
		
		subtotal = new JTextField();
		subtotal.setBounds(91, 526, 96, 20);
		frame.getContentPane().add(subtotal);
		subtotal.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(376, 478, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(322, 169, 155, 33);
		frame.getContentPane().add(dateChooser);
		
		JLabel date = new JLabel("choose a Arrival date -");
		date.setFont(new Font("Tahoma", Font.BOLD, 18));
		date.setBounds(41, 169, 219, 33);
		frame.getContentPane().add(date);
		
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			stax.setText(null);
			subtotal.setText(null);
			textField_2.setText(null);
			textField_3.setText(null);
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
			rdbtnNewRadioButton_3.setSelected(false);
			rdbtnNewRadioButton_4.setSelected(false);
			rdbtnNewRadioButton_5.setSelected(false);
			rdbtnNewRadioButton_6.setSelected(false);
			rdbtnNewRadioButton_7.setSelected(false);
			comboBox.setSelectedItem("destination");
			textField_1.setText(null);
			textField_4.setText(null);
			textField_5.setText(null);
			frm.setText(null);
			to.setText(null);
			dte.setText(null);
			tim.setText(null);
			textField_10.setText(null);
			textField_11.setText(null);
			txtRoute.setText(null);
			textField.setText(null);
			dateChooser.setDate(null);
			}
		});
		btnNewButton.setToolTipText("RESET SYSTEM");
		btnNewButton.setBounds(33, 591, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton C = new JButton("TOTAL");
		C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent args0) {
				double tax= 19.50;
				double MilesK8 = 25.78;
				double MilesK12= 25.10;
                double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco= 3.85, fclass = 5.60,milesk10 = 5.0;


				if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_3.isSelected())&& (rdbtnNewRadioButton_6.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
				&& comboBox.getSelectedItem().equals("karnal"))
				{
				totalCost = (tax * MilesK8) / 100;
				String sstax = String.format("%.2f", totalCost);
				stax.setText(sstax);
				String luggage = String.format("%.2f",milesk10);
				textField_2.setText(luggage);
				String Total = String.format("%.2f",MilesK8+ milesk10+totalCost);
				textField_3.setText(Total);
				String subTotal = String.format("%.2f",MilesK8); 
				subtotal.setText(subTotal);
				textField_11.setText(subTotal);
                textField.setText("STD");
				textField_1.setText("ONE WAY");
				textField_4.setText("ONE");
				textField_5.setText("Present");
				}
				else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_5.isSelected())
						&& comboBox.getSelectedItem().equals("karnal"))
						{
						totalCost = (tax * MilesK8) / 100;
						String sstax = String.format("%.2f", totalCost);
						stax.setText(sstax);
						String luggage = String.format("%.2f",milesk10);
						textField_2.setText(luggage);
						String Total = String.format("%.2f",MilesK8+ milesk10+totalCost);
						textField_3.setText(Total);
						String subTotal = String.format("%.2f",MilesK8); 
						subtotal.setText(subTotal);
						textField_11.setText(subTotal);
		                textField.setText("STD");
						textField_1.setText("RETURN");
						textField_4.setText("ONE");
						textField_5.setText("NIL");
						}
				else if ((rdbtnNewRadioButton.isSelected()) && (rdbtnNewRadioButton_4.isSelected()) && (rdbtnNewRadioButton_6.isSelected())
						&& comboBox.getSelectedItem().equals("karnal"))
						{
						totalCost = (tax * MilesK8) / 100;
						String sstax = String.format("%.2f", totalCost);
						stax.setText(sstax);
						String luggage = String.format("%.2f",milesk10);
						textField_2.setText(luggage);
						String Total = String.format("%.2f",MilesK8+ milesk10+totalCost);
						textField_3.setText(Total);
						String subTotal = String.format("%.2f",MilesK8); 
						subtotal.setText(subTotal);
						textField_11.setText(subTotal);
		                textField.setText("STD");
						textField_1.setText("RETURN");
						textField_4.setText("NIL");
						textField_5.setText("PRESENT");
						}
			}
		});
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				//time
				Calendar time=Calendar.getInstance();
				time.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("hh:mm:ss");
			tim.setText(tTime.format(time.getTime()));	
				
			//date
			SimpleDateFormat tdate=new SimpleDateFormat("dd:MMM:yyyy");
			dte.setText(tdate.format(time.getTime()));	
			 
			frm.setText("pinjore *");
			to.setText((String)comboBox.getSelectedItem()+"*" ) ;	
				
			
			//random number generator
			int num1;
			String q1="";
			num1=1342+(int)(Math.random()*4543);
			q1+=num1+1342;
			textField_10.setText(q1);
			txtRoute.setText("ANY");			
			}
            });
		C.setToolTipText("TOTAL COST OF TICKET");
		C.setBounds(200, 591, 89, 23);
		frame.getContentPane().add(C);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setToolTipText("EXIT SYSTEM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame= new JFrame("exit");
				if (JOptionPane.showConfirmDialog(frame,"confirm if you want to exit ","ticketing system",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setBounds(376, 591, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel txtTotal = new JLabel("TOTAL");
		txtTotal.setBounds(248, 529, 78, 14);
		frame.getContentPane().add(txtTotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(376, 526, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(221, 457, 2, 113);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(545, 116, 2, 512);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_3 = new JLabel("Class");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_3.setBounds(610, 115, 78, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Ticket");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_5.setBounds(800, 116, 78, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adult");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_6.setBounds(1001, 116, 78, 33);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Child");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_7.setBounds(1201, 116, 65, 33);
		frame.getContentPane().add(lblNewLabel_7);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(588, 156, 734, 2);
		frame.getContentPane().add(separator_4);
		
		textField = new JTextField();
		textField.setBounds(588, 197, 114, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(782, 197, 109, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(983, 197, 109, 33);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(1182, 197, 109, 33);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(588, 268, 734, 10);
		frame.getContentPane().add(separator_5);
		
		JLabel lblNewLabel_8 = new JLabel("From ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_8.setBounds(610, 314, 78, 33);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("To");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_9.setBounds(820, 314, 71, 33);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Today Date");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_10.setBounds(983, 314, 152, 33);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Time");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_11.setBounds(1201, 314, 65, 33);
		frame.getContentPane().add(lblNewLabel_11);
		
		frm = new JTextField();
		frm.setBounds(588, 373, 109, 33);
		frame.getContentPane().add(frm);
		frm.setColumns(10);
		
		to = new JTextField();
		to.setBounds(782, 373, 109, 33);
		frame.getContentPane().add(to);
		to.setColumns(10);
		
		dte = new JTextField();
		dte.setBounds(983, 373, 109, 33);
		frame.getContentPane().add(dte);
		dte.setColumns(10);
		
		tim = new JTextField();
		tim.setBounds(1182, 373, 109, 33);
		frame.getContentPane().add(tim);
		tim.setColumns(10);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(588, 456, 734, 2);
		frame.getContentPane().add(separator_6);
		
		JLabel lblNewLabel_12 = new JLabel("Ticket no..");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_12.setBounds(599, 496, 114, 33);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Price");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_13.setBounds(813, 497, 78, 31);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Route");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_14.setBounds(1020, 498, 89, 31);
		frame.getContentPane().add(lblNewLabel_14);
		
		textField_10 = new JTextField();
		textField_10.setBounds(592, 559, 139, 33);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(782, 559, 146, 33);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		txtRoute = new JTextField();
		txtRoute.setBounds(996, 559, 139, 33);
		frame.getContentPane().add(txtRoute);
		txtRoute.setColumns(10);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(18, 648, 1304, 2);
		frame.getContentPane().add(separator_7);

		JButton printtt = new JButton("Print Ticket");
		printtt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		printtt.setBounds(1182, 559, 140, 33);
		frame.getContentPane().add(printtt);
		printtt.setToolTipText("Printing verification");
		printtt.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFrame printFrame = new JFrame("Print");
		        printFrame.setSize(300, 200);

		        JLabel onee = new JLabel("Ticket is verified and printing");
		        onee.setFont(new Font("Tahoma", Font.BOLD, 16));
		        onee.setBounds(50, 50, 250, 33);
		        printFrame.getContentPane().add(onee);

		        printFrame.setVisible(true);
		    }
		});

		
	}
}
