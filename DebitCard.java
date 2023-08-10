
/**
 * Write a description of class DebitCard here.
 *
 * @author (22068741 Nishan Thapa)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard //A subClass called DebitCard is created.
{
    //declaring attributes
    
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //parameterized constructor
public DebitCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber)
    {
      //calling constructor from superClass
        super(balanceAmount,cardId,bankAccount,issuerBank);

      //setter method from superClass
        setClientName(clientName);
        
      //assigning attributes  
        this.pinNumber = pinNumber; 
        this.hasWithdrawn = false; 
    }

 //accessor methods
public int getPinNumber() {
    return this.pinNumber;
    }

public int getWithdrawalAmount() {
    return this.withdrawalAmount; 
    }

public String getdateOfWithdrawal() {
    return this.dateOfWithdrawal;
    }

public boolean gethasWithdrawn() {
    return this.hasWithdrawn;
    }

//settor methods
public void setWithdrawalAmount(int withdrawalAmount){
    this.withdrawalAmount = withdrawalAmount;
    }
    
//method accepts=withdrawalAmount,dateOfWithdrawal,pinNumber
    
public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int enteredPinNumber) //adding parameters to method
{
    if(enteredPinNumber == this.pinNumber && withdrawalAmount <= getbalanceAmount()) 
        {
            setBalanceAmount(getbalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
        }
    else if(enteredPinNumber != this.pinNumber) {
            System.out.println("The Entered PIN-Number is INVALID!");
        }
    else {
            System.out.println("The Balance is insufficient!");
        }
    }

//display method
public void display() 
    {
        super.display();
        System.out.println("PIN-Number: " + pinNumber);
        if(hasWithdrawn) 
        {
            System.out.println("Withdrawal-Amount: " + withdrawalAmount);
            System.out.println("Date-Of-WithDrawal: " + dateOfWithdrawal);
        }
    }
}