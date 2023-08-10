
/**
 * Write a description of class BankGUI here.
 *
 * @author (22068741 Nishan Thapa)
 * @version (1.0.0)
 */

//Step 0 : Import

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JLabel;


public class BankGUI implements ActionListener  {
    
    //declare all components here
    
     private JFrame frame;
     private JTabbedPane panel;
    
    //Debit card components
    
     private JPanel debitCard_panel;
     private String debitCard_clientName;
     private String debitCard_issuerBank;
     private String debitCard_bankAccount;
     private int    debitCard_cardID;
     private int    debitCard_PIN_Number;
     private double debitCard_balanceAmount;
     
     
    //Debit card headings
    
     private JLabel debitCard;
     private JLabel add_debitCard;
     private JLabel debitCard_clientName_D;
     private JLabel debitCard_issuerBank_D;
     private JLabel debitCard_bankAccount_D;
     private JLabel debitCard_cardID_D;
     private JLabel debitCard_balanceAmount_D;
     private JLabel debitCard_PIN_Number_D;
     
    //Debit card Textfields
     
     private JTextField debit_clientName;
     private JTextField debit_issuerBank;
     private JTextField debit_bankAccount;
     private JTextField debit_cardID;
     private JTextField debit_PIN_Number;
     private JTextField debit_balanceAmount;
     
     
    //Debit card buttons components
    
     private JButton Add_debitCard;
     private JButton Display_debitCard;
     private JButton Clear_debitCard;
    
    //Debit card withdrawal components
    
     private int debitWithdrawal_cardID;
     private int debitWithdrawal_amount;
     private int debitWithdrawal_PIN_Number;
     private String debit_DateOfWithdrawal;
    
    //Debit card withdrawal headings
    
     private JLabel withdraw_debitCard;
     private JLabel withdraw_amount;
     private JLabel withdraw_cardID;
     private JLabel withdraw_date;
     private JLabel withdraw_PIN_Number;
     
    //Debit card withdraw Textfields
    
     private JTextField withdraw_amount_T;
     private JTextField withdraw_cardID_T;
     private JTextField withdraw_PIN_Number_T;
     
    //Debit card withdrawl buttons components
    
     private JButton  withdrawal;
     private JButton  clearWithdrawal;
     private JButton  displayDebitCard;
     
    //Debit card combobox
    
     private JComboBox comboBox_Day;
     private JComboBox comboBox_Month;
     private JComboBox comboBox_Year;
     
    //------------Credit card components-------------------------------
    
     private JPanel creditCard_panel;
     private String creditCard_clientName;
     private String creditCard_issuerBank;
     private String creditCard_bankAccount;
     private String creditCard_expirationDate;
     private int    creditCard_cardID;
     private int    cvc_Number;
     private double creditCard_balanceAmount;
     private double interestRate;
     
    //Credit card headings
    
     private JLabel creditCard;
     private JLabel Add_creditCard;
     private JLabel creditCard_clientName_C;
     private JLabel creditCard_cardID_C;
     private JLabel creditCard_issuerBank_C;
     private JLabel interestRate_C;
     private JLabel creditCard_bankAccount_C;
     private JLabel creditCard_balanceAmount_C;
     private JLabel cvc_Number_C;     
     private JLabel creditCard_expirationDate_C;
     
    //Credit card TextFields
    
     private JTextField creditCard_clientName_T;
     private JTextField creditCard_cardID_T;
     private JTextField creditCard_issuerBank_T;
     private JTextField creditCard_interestRate_T;
     private JTextField creditCard_bankAccount_T;
     private JTextField creditCard_balanceAmount_T;
     private JTextField creditCard_CVCNumber_T;
     
     //Credit card combobox
     private JComboBox comboBox_Day_C;
     private JComboBox comboBox_Month_C;
     private JComboBox comboBox_Year_C;
     
     //Credit card buttons
    
     private JButton   add_creditCard_C;
     private JButton   display_creditCard;
     private JButton   clear_creditCard;
     
    //Credit limit components
    
     private int     limit_cardID;
     private boolean gracePeriod;
     private double  credit_limit;
     
    // Credit limit headings
    
     private JLabel creditCard_creditLimit;
     private JLabel creditCard_cardID_1;
     private JLabel creditCard_gracePeriod_1;
     private JLabel creditCard_creditLimit_1;
     
    //Credit limit TextFields
    
     private JTextField creditCard_cardID_t;
     private JTextField creditCard_gracePeriod_T;
     private JTextField creditCard_creditLimit_T;
    
    //Credit limit buttons
    
     private JButton set_creditLimit;
     private JButton clear_creditLimit;
     
    //Cancel credit card components
     
     private String cancel_cardID;
     
    //Cancel credit card headings
    
     private JLabel cancel_creditLimit_1;
     private JLabel cancel_cardID_1;
    
    //Cancel credit card Textfield
    
     private JTextField cancel_cardID_T;
     
    //Cancel credit card buttons
    
     private JButton cancel_creditLimit;
     private JButton cancel_creditCard;
     
    // Arraylist
    
     ArrayList<BankCard> GUI = new ArrayList<BankCard>();
    
    
    public BankGUI(){
    
    //create a new frame
          
      //Step 1 : Create JFrame using constructor
      //Add components using contructor after Jframe and before displaying the Jframe
      //Set the bounds of the component (setBounds())
      //Add the component to the JFrame ()
    
    JFrame frame = new JFrame();
    
    
    //TabbedPane
    
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
    
    debitCard_panel = new JPanel();
    //Step 3 : setting the layout managaer to null
    debitCard_panel.setLayout(null);
    tabbedPane.addTab("Debit Card", debitCard_panel);
    
    
    //GUI Debit Card
    
    //Debit card Labels
    
    debitCard = new JLabel("Debit Card");
    debitCard.setBounds(338, 29, 124, 36);
    
    add_debitCard = new JLabel("Add Debit Card");
    add_debitCard.setBounds(311, 96, 178, 36);
    
    debitCard_clientName_D = new JLabel("Client Name: ");
    debitCard_clientName_D.setBounds(35, 179, 77, 20);
    
    debitCard_issuerBank_D = new JLabel("Issuer Bank: ");
    debitCard_issuerBank_D.setBounds(35, 268, 84, 28);
    
    debitCard_bankAccount_D = new JLabel("Bank Account: ");
    debitCard_bankAccount_D.setBounds(35, 349, 102, 41);
    
    debitCard_cardID_D = new JLabel("Card ID: ");
    debitCard_cardID_D.setBounds(425, 179, 73, 33);

    debitCard_PIN_Number_D = new JLabel("PIN Number: ");
    debitCard_PIN_Number_D.setBounds(425, 274, 95, 25);
    
    debitCard_balanceAmount_D = new JLabel("Balance Amount: ");
    debitCard_balanceAmount_D.setBounds(420, 357, 102, 20);
    
    //Debit card Textfields
    
    debit_clientName = new JTextField();
    debit_clientName.setBounds(151, 179, 180, 32);
    
    debit_issuerBank = new JTextField();
    debit_issuerBank.setBounds(151, 268, 180, 32);
    
    debit_bankAccount = new JTextField();
    debit_bankAccount.setBounds(151, 358, 180, 32);
    
    debit_cardID = new JTextField();
    debit_cardID.setBounds(559, 179, 180, 32);
    
    debit_PIN_Number = new JTextField();
    debit_PIN_Number.setBounds(559, 271, 180, 32);
    
    debit_balanceAmount = new JTextField();
    debit_balanceAmount.setBounds(559, 357, 180, 32);
    
    //Debit card Buttons
    
    Add_debitCard = new JButton("Add Debit Card");
    Add_debitCard.setBounds(131, 442, 120, 32);
    Add_debitCard.addActionListener(this);
    
    Display_debitCard = new JButton("Display");
    Display_debitCard.setBounds(339, 443, 120, 32);
    Display_debitCard.addActionListener(this);
    
    Clear_debitCard = new JButton("Clear");
    Clear_debitCard.setBounds(547, 443, 120, 32);
    Clear_debitCard.addActionListener(this);
    
    // Debit card Withdrawal headings
    
    withdraw_debitCard = new JLabel("Withdraw from Debit Card ");
    withdraw_debitCard.setBounds(252, 526, 319, 36);
    
    withdraw_amount = new JLabel("Amount of Withdrawal: ");
    withdraw_amount.setBounds(35, 604, 137, 20);
    
    withdraw_cardID = new JLabel("Card ID: ");
    withdraw_cardID.setBounds(35, 676, 48, 20);
    
    withdraw_date = new JLabel("Date of Withdrawal: ");
    withdraw_date.setBounds(428, 603, 121, 20);
    
    withdraw_PIN_Number = new JLabel("PIN Number: ");
    withdraw_PIN_Number.setBounds(428, 671, 77, 20);
    
    //Debit Card Withdrawl TextFields 
    
    withdraw_amount_T = new JTextField();
    withdraw_amount_T.setBounds(190, 604, 180, 32);
    
    withdraw_cardID_T = new JTextField();
    withdraw_cardID_T.setBounds(190, 676, 180, 32);
    
    withdraw_PIN_Number_T = new JTextField();
    withdraw_PIN_Number_T.setBounds(580, 671, 180, 32);
    
    //Debit card ComboBox
    
    comboBox_Day = new JComboBox();
    comboBox_Day.addItem("1");
    comboBox_Day.addItem("2");
    comboBox_Day.addItem("3");
    comboBox_Day.addItem("4");
    comboBox_Day.addItem("5");
    comboBox_Day.addItem("6");
    comboBox_Day.addItem("7");
    comboBox_Day.addItem("8");
    comboBox_Day.addItem("9");
    comboBox_Day.addItem("10");
    comboBox_Day.addItem("11");
    comboBox_Day.addItem("12");
    comboBox_Day.addItem("13");
    comboBox_Day.addItem("14");
    comboBox_Day.addItem("15");
    comboBox_Day.addItem("16");
    comboBox_Day.addItem("17");
    comboBox_Day.addItem("18");
    comboBox_Day.addItem("19");
    comboBox_Day.addItem("20");
    comboBox_Day.addItem("21");
    comboBox_Day.addItem("22");
    comboBox_Day.addItem("23");
    comboBox_Day.addItem("24");
    comboBox_Day.addItem("25");
    comboBox_Day.addItem("26");
    comboBox_Day.addItem("27");
    comboBox_Day.addItem("28");
    comboBox_Day.addItem("29");
    comboBox_Day.addItem("30");
    comboBox_Day.addItem("31");
    comboBox_Day.setBounds(580, 603, 50, 34);
    
    comboBox_Month = new JComboBox();
    comboBox_Month.addItem("1");
    comboBox_Month.addItem("2");
    comboBox_Month.addItem("3");
    comboBox_Month.addItem("4");
    comboBox_Month.addItem("5");
    comboBox_Month.addItem("6");
    comboBox_Month.addItem("7");
    comboBox_Month.addItem("8");
    comboBox_Month.addItem("9");
    comboBox_Month.addItem("10");
    comboBox_Month.addItem("11");
    comboBox_Month.addItem("12");
    comboBox_Month.setBounds(649, 603, 51, 33);
    
    comboBox_Year = new JComboBox();
    comboBox_Year.addItem("2010");
    comboBox_Year.addItem("2011");
    comboBox_Year.addItem("2012");
    comboBox_Year.addItem("2013");
    comboBox_Year.addItem("2014");
    comboBox_Year.addItem("2015");
    comboBox_Year.addItem("2016");
    comboBox_Year.addItem("2017");
    comboBox_Year.addItem("2018");
    comboBox_Year.addItem("2019");
    comboBox_Year.addItem("2020");
    comboBox_Year.addItem("2021");
    comboBox_Year.addItem("2022");
    comboBox_Year.addItem("2023");
    comboBox_Year.setBounds(719, 603, 47, 33);
    
    //Debit card Withdrawal buttons
    
    withdrawal = new JButton("Withdraw");
    withdrawal.setBounds(144, 746, 120, 32);
    withdrawal.addActionListener(this);
    
    displayDebitCard = new JButton("Display");
    displayDebitCard.setBounds(351, 746, 120, 32);
    displayDebitCard.addActionListener(this);
    
    clearWithdrawal = new JButton("Clear");
    clearWithdrawal.setBounds(545, 746, 120, 32);
    clearWithdrawal.addActionListener(this);
    
    //Adding items to debit card
    
    debitCard_panel.add(debitCard);
    debitCard_panel.add(add_debitCard);
    debitCard_panel.add(debitCard_clientName_D);
    debitCard_panel.add(debitCard_issuerBank_D);
    debitCard_panel.add(debitCard_bankAccount_D);
    debitCard_panel.add(debitCard_cardID_D);
    debitCard_panel.add(debitCard_PIN_Number_D);
    debitCard_panel.add(debitCard_balanceAmount_D);
    debitCard_panel.add(debit_clientName);
    debitCard_panel.add(debit_issuerBank);
    debitCard_panel.add(debit_bankAccount);
    debitCard_panel.add(debit_cardID);
    debitCard_panel.add(debit_PIN_Number);
    debitCard_panel.add(debit_balanceAmount);
    debitCard_panel.add(Add_debitCard);
    debitCard_panel.add(Display_debitCard);
    debitCard_panel.add(Clear_debitCard);
    debitCard_panel.add(withdraw_debitCard);
    debitCard_panel.add(withdraw_amount);
    debitCard_panel.add(withdraw_cardID);
    debitCard_panel.add(withdraw_date);
    debitCard_panel.add(withdraw_PIN_Number);
    debitCard_panel.add(withdraw_amount_T);
    debitCard_panel.add(withdraw_cardID_T);
    debitCard_panel.add(withdraw_PIN_Number_T);
    debitCard_panel.add(comboBox_Day);
    debitCard_panel.add(comboBox_Month);
    debitCard_panel.add(comboBox_Year);
    debitCard_panel.add(withdrawal);
    debitCard_panel.add(displayDebitCard);
    debitCard_panel.add(clearWithdrawal);
    
    //----------------- Credit card panel---------------------------------------------------------
    
    creditCard_panel = new JPanel();
    //Step 3 : setting the layout managaer to null
    creditCard_panel.setLayout(null);
    tabbedPane.addTab("Credit Card", creditCard_panel);

    //Credit card heading
    
    creditCard = new JLabel("Credit Card");
    creditCard.setBounds(333, 19, 133, 36);
    
    //Add Credit card heading
    
    
    Add_creditCard = new JLabel("Add Credit Card");
    Add_creditCard.setBounds(301, 69, 186, 36);
    
    //Add Credit card components heading
    
    creditCard_clientName_C = new JLabel("Client Name: ");
    creditCard_clientName_C.setBounds(28, 136, 77, 49);
    
    creditCard_cardID_C = new JLabel("Card ID: ");
    creditCard_cardID_C.setBounds(28, 213, 48, 20);
    
    creditCard_issuerBank_C = new JLabel("Issuer Bank: ");
    creditCard_issuerBank_C.setBounds(28, 281, 74, 20);
    
    interestRate_C = new JLabel("Interest Rate: ");
    interestRate_C.setBounds(28, 349, 80, 20);
    
    creditCard_bankAccount_C = new JLabel("Bank Account: ");
    creditCard_bankAccount_C.setBounds(415, 135, 86, 46);
    
    creditCard_balanceAmount_C = new JLabel("Balance Amount: ");
    creditCard_balanceAmount_C.setBounds(415, 211, 102, 22);
    
    cvc_Number_C = new JLabel("CVC Number: ");
    cvc_Number_C.setBounds(415, 281, 108, 22);
    
    creditCard_expirationDate_C = new JLabel("Expiration Date: ");
    creditCard_expirationDate_C.setBounds(415, 351, 96, 20);
    
    //Credit card components TextFields
    
    creditCard_clientName_T = new JTextField();
    creditCard_clientName_T.setBounds(127, 145, 180, 32);
    
    creditCard_cardID_T = new JTextField();
    creditCard_cardID_T.setBounds(127, 213, 180, 32);
    
    creditCard_issuerBank_T = new JTextField();
    creditCard_issuerBank_T.setBounds(127, 281, 180, 32);
    
    creditCard_interestRate_T = new JTextField();
    creditCard_interestRate_T.setBounds(127, 349, 180, 32);

    creditCard_bankAccount_T = new JTextField();
    creditCard_bankAccount_T.setBounds(551, 141, 180, 32);

    creditCard_balanceAmount_T = new JTextField();
    creditCard_balanceAmount_T.setBounds(551, 211, 180, 32);

    creditCard_CVCNumber_T = new JTextField();
    creditCard_CVCNumber_T.setBounds(551, 281, 180, 32);

    //Credit card components comboBox
    
    comboBox_Day_C = new JComboBox();
    comboBox_Day_C.addItem("1");
    comboBox_Day_C.addItem("2");
    comboBox_Day_C.addItem("3");
    comboBox_Day_C.addItem("4");
    comboBox_Day_C.addItem("5");
    comboBox_Day_C.addItem("6");
    comboBox_Day_C.addItem("7");
    comboBox_Day_C.addItem("8");
    comboBox_Day_C.addItem("9");
    comboBox_Day_C.addItem("10");
    comboBox_Day_C.addItem("11");
    comboBox_Day_C.addItem("12");
    comboBox_Day_C.addItem("13");
    comboBox_Day_C.addItem("14");
    comboBox_Day_C.addItem("15");
    comboBox_Day_C.addItem("16");
    comboBox_Day_C.addItem("17");
    comboBox_Day_C.addItem("18");
    comboBox_Day_C.addItem("19");
    comboBox_Day_C.addItem("20");
    comboBox_Day_C.addItem("21");
    comboBox_Day_C.addItem("22");
    comboBox_Day_C.addItem("23");
    comboBox_Day_C.addItem("24");
    comboBox_Day_C.addItem("25");
    comboBox_Day_C.addItem("26");
    comboBox_Day_C.addItem("27");
    comboBox_Day_C.addItem("28");
    comboBox_Day_C.addItem("29");
    comboBox_Day_C.addItem("30");
    comboBox_Day_C.addItem("31");
    comboBox_Day_C.setBounds(551, 359, 50, 19);
    
    comboBox_Month_C = new JComboBox();
    comboBox_Month_C.addItem("1");
    comboBox_Month_C.addItem("2");
    comboBox_Month_C.addItem("3");
    comboBox_Month_C.addItem("4");
    comboBox_Month_C.addItem("5");
    comboBox_Month_C.addItem("6");
    comboBox_Month_C.addItem("7");
    comboBox_Month_C.addItem("8");
    comboBox_Month_C.addItem("9");
    comboBox_Month_C.addItem("10");
    comboBox_Month_C.addItem("11");
    comboBox_Month_C.addItem("12");
    comboBox_Month_C.setBounds(619, 359, 50, 19);
    
    comboBox_Year_C = new JComboBox();
    comboBox_Year_C.addItem("2010");
    comboBox_Year_C.addItem("2011");
    comboBox_Year_C.addItem("2012");
    comboBox_Year_C.addItem("2013");
    comboBox_Year_C.addItem("2014");
    comboBox_Year_C.addItem("2015");
    comboBox_Year_C.addItem("2016");
    comboBox_Year_C.addItem("2017");
    comboBox_Year_C.addItem("2018");
    comboBox_Year_C.addItem("2019");
    comboBox_Year_C.addItem("2020");
    comboBox_Year_C.addItem("2021");
    comboBox_Year_C.addItem("2022");
    comboBox_Year_C.addItem("2023");
    comboBox_Year_C.setBounds(687, 359, 50, 19);

    //ADD Credit Buttons
    
    add_creditCard_C = new JButton("Add Credit Card");
    add_creditCard_C.setBounds(79, 431, 148, 32);
    add_creditCard_C.addActionListener(this);
    
    display_creditCard = new JButton("Display");
    display_creditCard.setBounds(324, 431, 120, 32);
    display_creditCard.addActionListener(this);
    
    clear_creditCard = new JButton("Clear");
    clear_creditCard.setBounds(541, 431, 120, 32);
    clear_creditCard.addActionListener(this);
    
    //Set credit limit heading
    
    creditCard_creditLimit = new JLabel("Set Credit Limit");
    creditCard_creditLimit.setBounds(311, 506, 178, 36);
    
    //Set credit limit components labels
    
    creditCard_cardID_1 = new JLabel("Card ID");
    creditCard_cardID_1.setBounds(31, 564, 48, 17);
    
    creditCard_gracePeriod_1 = new JLabel("Grace Period");
    creditCard_gracePeriod_1.setBounds(31, 635, 82, 20);
    
    creditCard_creditLimit_1 = new JLabel("Credit Limit");
    creditCard_creditLimit_1.setBounds(444, 561, 75, 20);
    
    //Set Credit components TextFields
    
    creditCard_cardID_t = new JTextField();
    creditCard_cardID_t.setBounds(179, 561, 180, 32);
    
    creditCard_gracePeriod_T = new JTextField();
    creditCard_gracePeriod_T.setBounds(179, 635, 180, 32);
    
    creditCard_creditLimit_T = new JTextField();
    creditCard_creditLimit_T.setBounds(562, 561, 180, 32);
    
    //Set Credit Buttons
    
    set_creditLimit = new JButton("Set Credit Limit");
    set_creditLimit.setBounds(450, 629, 130, 32);
    set_creditLimit.addActionListener(this);
    
    clear_creditLimit = new JButton("Clear");
    clear_creditLimit.setBounds(622, 629, 120, 32);
    clear_creditLimit.addActionListener(this);
    
    //Cancel credit components heading
    
    cancel_creditLimit_1 = new JLabel("Cancel Credit Card");
    cancel_creditLimit_1.setBounds(311, 689, 221, 36);
    
    //Cancel credit Labels
    
    cancel_cardID_1 = new JLabel("Card ID");
    cancel_cardID_1.setBounds(31, 752, 48, 17);
    
    //Cancel credit TextField
    
    cancel_cardID_T = new JTextField();
    cancel_cardID_T.setBounds(121, 752, 180, 32);
    
    //Cancel credit buttons
    
    cancel_creditLimit = new JButton("Cancel Credit Card");
    cancel_creditLimit.setBounds(411, 753, 159, 32);
    cancel_creditLimit.addActionListener(this);
    
    cancel_creditCard = new JButton("Clear");
    cancel_creditCard.setBounds(627, 753, 120, 32);
    cancel_creditCard.addActionListener(this);
    
    //Adding components to credit panel
    
    creditCard_panel.add(creditCard);
    creditCard_panel.add(Add_creditCard);
    creditCard_panel.add(creditCard_clientName_C);
    creditCard_panel.add(creditCard_cardID_C);
    creditCard_panel.add(creditCard_issuerBank_C);
    creditCard_panel.add(interestRate_C);
    creditCard_panel.add(creditCard_bankAccount_C);
    creditCard_panel.add(creditCard_balanceAmount_C);
    creditCard_panel.add(cvc_Number_C);
    creditCard_panel.add(creditCard_expirationDate_C);
    creditCard_panel.add(creditCard_clientName_T);
    creditCard_panel.add(creditCard_cardID_T);
    creditCard_panel.add(creditCard_issuerBank_T);
    creditCard_panel.add(creditCard_interestRate_T);
    creditCard_panel.add(creditCard_bankAccount_T);
    creditCard_panel.add(creditCard_balanceAmount_T);
    creditCard_panel.add(creditCard_CVCNumber_T);
    creditCard_panel.add(comboBox_Day_C);
    creditCard_panel.add(comboBox_Month_C);
    creditCard_panel.add(comboBox_Year_C);
    creditCard_panel.add(add_creditCard_C);
    creditCard_panel.add(display_creditCard);
    creditCard_panel.add(clear_creditCard);
    creditCard_panel.add(creditCard_creditLimit);
    creditCard_panel.add(creditCard_cardID_1);
    creditCard_panel.add(creditCard_gracePeriod_1);
    creditCard_panel.add(creditCard_creditLimit_1 );
    creditCard_panel.add(creditCard_cardID_t);
    creditCard_panel.add(creditCard_gracePeriod_T);
    creditCard_panel.add(creditCard_creditLimit_T);
    creditCard_panel.add(set_creditLimit);
    creditCard_panel.add(clear_creditLimit);
    creditCard_panel.add(cancel_creditLimit_1);
    creditCard_panel.add(cancel_cardID_1);
    creditCard_panel.add(cancel_cardID_T);
    creditCard_panel.add(cancel_creditLimit);
    creditCard_panel.add(cancel_creditCard);
    
    
    frame.add(tabbedPane);
    
    //Step 2 : set the size of the Jframe
    frame.setSize(800,800);
    //Step 4 : set what happens when the frame is closed(default close)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Step 5 : make the frame visible
    frame.setVisible(true);
    
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e){
        
       //Add button for Debit card
                 
        if(e.getSource() == Add_debitCard){
            //if arrayList is empty
            //Add Debit Card
            if(debit_clientName.getText().isEmpty() || debit_issuerBank.getText().isEmpty() || debit_bankAccount.getText().isEmpty() || debit_cardID.getText().isEmpty() || debit_PIN_Number.getText().isEmpty() || debit_balanceAmount.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning",JOptionPane.WARNING_MESSAGE);
            }
               //add logic
               //add debit card
                  //get the parameters of the constructor
                  //call the constructor | create the object
               //add to array list
               //show message:("Card has been added")
               
               //else
                       //check to see if cardId is present
                           //loop through the arrayList
                           //if present:
                              //dont add
                              //show message ("CAnt be added same ID")
                             //else:
                         //Add Debit Card
                         //show message ("Debit card has been added")
            else{
                try{                  
                    double debitCard_balanceAmount  = Integer.parseInt(debit_balanceAmount.getText());
                    int debitCard_cardID            = Integer.parseInt(debit_cardID.getText());
                    int debitCard_PIN_Number        = Integer.parseInt(debit_PIN_Number.getText());
                    String debitCard_clientName     = debit_clientName.getText();
                    String debitCard_bankAccount    = debit_bankAccount.getText();
                    String debitCard_issuerBank     = debit_issuerBank.getText();
                    if(GUI.isEmpty()){
                        DebitCard Debit_Parameters = new DebitCard(debitCard_balanceAmount,debitCard_cardID,debitCard_bankAccount,debitCard_issuerBank,debitCard_clientName,debitCard_PIN_Number);
                        GUI.add(Debit_Parameters);
                
                    }else{
                        for(BankCard card : GUI){
                            if(card instanceof DebitCard){
                                DebitCard debitCard = (DebitCard)card;
                                if(debitCard.getcardId() == debitCard_cardID){
                                    JOptionPane.showMessageDialog(frame,"The addition of a Debit Card to the account has been confirmed.");
                                }else{
                                    DebitCard Debit_Parameters = new DebitCard(debitCard_balanceAmount,debitCard_cardID,debitCard_bankAccount,debitCard_issuerBank,debitCard_clientName,debitCard_PIN_Number);
                                    GUI.add(Debit_Parameters);
                                    JOptionPane.showMessageDialog(frame,"The addition of the Debit Card was successful.");
                                }
                            }
                        }
                    }
                    
                                //get the parameters
                         //check if the parameter are valid or not
                             //if not valid:
                                //show message:
                
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Kindly review the provided form and ensure that all information has been accurately provided.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
       }
       
       if (debit_PIN_Number.getText().length()>4){
            JOptionPane.showMessageDialog(frame,"Your PIN Number input should not exceed four digits. Please try again.","Error",JOptionPane.WARNING_MESSAGE);
        }
       
       //display buton functionality for debitcard
       
       //call the display method
       if(e.getSource() == Display_debitCard){
            //if arraylist is empty:
             // cant display
             // show message: Cant display
            if(debit_clientName.getText().isEmpty() || debit_issuerBank.getText().isEmpty() || debit_bankAccount.getText().isEmpty() || debit_cardID.getText().isEmpty() || debit_PIN_Number.getText().isEmpty() || debit_balanceAmount.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            
            //else:
             // loop through the arraylist
             // if debit card is present(if obj instance of DebitCard)
                  // downcast
                  // call the display method
            else{
                try{

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"The action could not be completed due to an exception. Please try again.","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
            for(BankCard Debit: GUI  ){
                if( Debit instanceof DebitCard){
                    ((DebitCard)Debit).display();
                }
            }
        }
        
       //Clear button function for Add Debit card
       
       if(e.getSource() == Clear_debitCard){
           debit_clientName.setText("");
           debit_issuerBank.setText("");
           debit_bankAccount.setText("");
           debit_cardID.setText("");
           debit_PIN_Number.setText("");
           debit_balanceAmount.setText("");
       }
       
       //Withdrawal button for debit card
           //get the parameters
           //call the withdraw method
           
           //if arraylist is empty
                //dont withdraw
                //show message 
       if (e.getSource() == withdrawal)
        {
            String withdraw_cardID     = withdraw_cardID_T.getText();
            String withdrawal_Amount    = withdraw_amount_T.getText();
            String Debit_balanceAmount = debit_balanceAmount.getText();
            String pin_Number           = withdraw_PIN_Number_T.getText();
            String Year                = comboBox_Year.getSelectedItem().toString();
            String Month               = comboBox_Month.getSelectedItem().toString();
            String Day                 = comboBox_Day.getSelectedItem().toString();
            String date                = Day +"/"+ Month  + "/" +Year;                  
            boolean isWithdrawn        = false;

            if (withdraw_cardID_T.getText().isEmpty() || withdraw_amount_T.getText().isEmpty() || withdraw_PIN_Number_T.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning", JOptionPane.ERROR_MESSAGE);
            }
             
            //else
            //check if the debitcard is present
                //loop through the arrayList
                //is is debitcard or not?
                //if card id matches
                   //show information in a dialogue box
                   //if pin number matches
                      //call the withdraw method with the parameters
                      //show message: Amoount has been withdrawn
                      
            else
            {

                int cardId_Withdraw, withdrawalAmount_Withdraw, pinNumber_Withdraw, balanceAmount_Withdraw;
                try
                {
                    cardId_Withdraw = Integer.parseInt(withdraw_cardID);
                    withdrawalAmount_Withdraw = Integer.parseInt(withdrawal_Amount);
                    pinNumber_Withdraw = Integer.parseInt(pin_Number);
                    balanceAmount_Withdraw = Integer.parseInt(Debit_balanceAmount);

                    boolean debitCardPresent = false;

                    if(GUI.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "Before we proceed, please provide us with the required information.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {

                        for (BankCard bankcard : GUI)
                        {
                            if (bankcard instanceof DebitCard)
                            {
                                DebitCard debitCard = (DebitCard) bankcard;

                                if (debitCard.getcardId() == cardId_Withdraw)
                                {
                                    debitCardPresent = true;

                                    if (debitCard.getPinNumber() == pinNumber_Withdraw)
                                    {
                                        if (withdrawalAmount_Withdraw < balanceAmount_Withdraw  )
                                        {
                                            debitCard.withdraw(withdrawalAmount_Withdraw, date, pinNumber_Withdraw);
                                            JOptionPane.showMessageDialog(frame, "You have successfully completed a withdrawal.", "The transaction has been completed.", JOptionPane.INFORMATION_MESSAGE);
                                            isWithdrawn = true;
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(frame, "Your balance is not sufficient for this transaction.", "Insufficient amount is available.", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else
                                    {
                                        JOptionPane.showMessageDialog(frame, "The pin number you entered does not match our records.", "The pin number entered is incorrect.", JOptionPane.ERROR_MESSAGE);
                                    }

                                    break;
                                }
                            }

                        }
                        
                        //else 
                        //show message card not found
                        if (!debitCardPresent)
                        {
                            JOptionPane.showMessageDialog(frame, "The provided ID does not match any debit cards in our system.", "The system was unable to find the card.", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame, "Please enter digits only, other characters are not accepted.", "The input provided is incorrect.", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
       if (withdraw_PIN_Number_T.getText().length()>4){
            JOptionPane.showMessageDialog(frame,"Your PIN Number input should not exceed four digits. Please try again.","Error",JOptionPane.WARNING_MESSAGE);
        }

        //display buton for withdraw debit card
       if(e.getSource() == displayDebitCard){
            
            if(withdraw_amount_T.getText().isEmpty() || withdraw_cardID_T.getText().isEmpty() || withdraw_PIN_Number_T.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning",JOptionPane.WARNING_MESSAGE);

            }else{
                try{

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"The action could not be completed due to an exception. Please try again.","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
            for(BankCard Debit: GUI  ){
                if( Debit instanceof DebitCard){
                    ((DebitCard)Debit).display();
                }
            }
        }
        
       //Clear button function for Withdrawal Debit card
       
       if(e.getSource() == clearWithdrawal){
           withdraw_amount_T.setText("");
           withdraw_cardID_T.setText("");
           withdraw_PIN_Number_T.setText("");
       }
       
    
       //Same logic as the debit card
       if(e.getSource() == add_creditCard_C){
            if(creditCard_clientName_T.getText().isEmpty() || creditCard_cardID_T.getText().isEmpty() || creditCard_issuerBank_T.getText().isEmpty() || creditCard_interestRate_T.getText().isEmpty() || creditCard_bankAccount_T.getText().isEmpty() || creditCard_balanceAmount_T.getText().isEmpty() || creditCard_CVCNumber_T.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    String creditCard_clientName     =  creditCard_clientName_T.getText();
                    String creditCard_issuerBank     =  creditCard_issuerBank_T.getText();
                    String creditCard_bankAccount    =  creditCard_bankAccount_T.getText();
                    int    creditCard_cardID         =  Integer.parseInt(creditCard_cardID_T.getText());
                    int cvc_Number             =  Integer.parseInt(creditCard_CVCNumber_T.getText());
                    double creditCard_balanceAmount  =  Integer.parseInt(creditCard_balanceAmount_T.getText());
                    double interestRate              =  Integer.parseInt(creditCard_interestRate_T.getText());
                    String year                      =  comboBox_Year_C.getSelectedItem().toString();
                    String month                     =  comboBox_Month_C.getSelectedItem().toString();
                    String day                       =  comboBox_Day_C.getSelectedItem().toString();
                    String creditCard_expirationDate =  day +"/"+ month + "/" + year;
                    if(GUI.isEmpty()){
                        CreditCard Credit_Parameters = new CreditCard(creditCard_cardID ,creditCard_clientName,creditCard_issuerBank ,creditCard_bankAccount,creditCard_balanceAmount,cvc_Number ,interestRate,creditCard_expirationDate);
                        GUI.add(Credit_Parameters);
                    }else{
                        for(BankCard card : GUI){
                            if(card instanceof CreditCard){
                                CreditCard creditCard = (CreditCard)card;
                                if(creditCard.getcardId() == creditCard_cardID ){
                                    JOptionPane.showMessageDialog(frame,"The addition of a Credit Card to the account has been confirmed.");
                                }else{
                                    CreditCard Credit_Parameters = new CreditCard(creditCard_cardID ,creditCard_clientName,creditCard_issuerBank ,creditCard_bankAccount,creditCard_balanceAmount,cvc_Number ,interestRate,creditCard_expirationDate);
                                    GUI.add(Credit_Parameters);
                                    JOptionPane.showMessageDialog(frame,"The addition of the Credit Card was successful.");
                                }
                            }  
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Kindly review the provided form and ensure that all information has been accurately provided.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
       
       //display buton for creditcard 
       
       if(e.getSource() == display_creditCard){
            if(creditCard_clientName_T.getText().isEmpty() || creditCard_cardID_T.getText().isEmpty() || creditCard_issuerBank_T.getText().isEmpty() || creditCard_interestRate_T.getText().isEmpty() || creditCard_bankAccount_T.getText().isEmpty() || creditCard_balanceAmount_T.getText().isEmpty() || creditCard_CVCNumber_T.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"The action could not be completed due to an exception. Please try again.","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
            for(BankCard Credit : GUI  ){
                if( Credit instanceof CreditCard){
                    ((CreditCard)Credit).display();
                }
            }
        }
        
       //Clear button function for Clear Credit card
       
       if(e.getSource() == clear_creditCard){
           creditCard_clientName_T.setText("");
           creditCard_cardID_T.setText("");
           creditCard_issuerBank_T.setText("");
           creditCard_interestRate_T.setText("");
           creditCard_bankAccount_T.setText("");
           creditCard_balanceAmount_T.setText("");
           creditCard_CVCNumber_T.setText("");
       }
       
       //Set Credit limit button functionality
       
       if(e.getSource() == set_creditLimit) {
            String creditLimit  =  creditCard_creditLimit_T.getText();
            String gracePeriod  =  creditCard_gracePeriod_T.getText();
            String limit_cardID =  creditCard_cardID_t.getText();

            if (limit_cardID.isEmpty() || gracePeriod.isEmpty()|| creditLimit.isEmpty())  {
                JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you","Warning",JOptionPane.WARNING_MESSAGE);
            } else {
                try{
                    int Creditlimit_T = Integer.parseInt(creditLimit);
                    int gracePeriod_T = Integer.parseInt(gracePeriod);
                    int limit_cardID_T = Integer.parseInt(limit_cardID);

                    boolean creditCardFound = false;

                    if(GUI.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Before we proceed, please provide us with the required information.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{

                    }

                    for (BankCard bankCard : GUI) {

                        if (bankCard instanceof CreditCard) {
                            CreditCard creditCard = (CreditCard) bankCard;

                            if (creditCard.getcardId() == limit_cardID_T){
                                creditCardFound = true;

                                creditCard.setCreditLimit(Creditlimit_T, gracePeriod_T);
                                JOptionPane.showMessageDialog(frame, "The new credit limit has been added to your account.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                    }

                    if (!creditCardFound) {
                        JOptionPane.showMessageDialog(frame, "The credit card with the provided ID could not be found.", " not found", JOptionPane.ERROR_MESSAGE);
                    }

                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(frame, "Please enter digits only, other characters are not accepted.", " Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        
       //Clear button function for Credit Limit
       
        if(e.getSource() == clear_creditLimit){
           creditCard_cardID_t.setText("");
           creditCard_gracePeriod_T.setText("");
           creditCard_creditLimit_T.setText("");
       }
       
       //Cancel credit button functionality
       
       if(e.getSource() == cancel_creditLimit) {
            String cardId_cancel = cancel_cardID_T.getText();

            try{
                if (cardId_cancel.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Dear User, We kindly request that you fill out the form that has been given to you", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int cardIdcancel = Integer.parseInt(cardId_cancel);
                    boolean creditCardFound = false;
                    for(BankCard bankcard : GUI) {
                        if(bankcard instanceof CreditCard) {
                            CreditCard creditcard = (CreditCard) bankcard;
                            if(creditcard.getcardId() == cardIdcancel) {
                                GUI.remove(creditcard);
                                JOptionPane.showMessageDialog(frame, "Credit Card " + cardIdcancel + "Id cancel", "Credit card Canceled", JOptionPane.INFORMATION_MESSAGE);
                                creditCardFound = true;
                                break;

                            }

                        }
                    }
                    if (!creditCardFound) {
                        JOptionPane.showMessageDialog(frame, "The credit card with the provided ID could not be found.", " not found", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(frame, "Please enter digits only, other characters are not accepted.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

       //Clear button function for Cancel Credit
       
        if(e.getSource() == cancel_creditCard){
           cancel_cardID_T.setText("");
       }
       

    }
    public static void main (String [] args){
         BankGUI obj = new BankGUI();   
        }
    }

