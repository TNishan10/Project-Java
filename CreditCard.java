
/**
 * Write a description of class CreditCard here.
 *
 * @author (22068741 Nishan Thapa)
 * @version (1.0.0)
 */

public class CreditCard extends BankCard //A subClass called CreditCard is created
{   
    //declaring attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //parameterized constructor
public CreditCard(int cardId,String clientName,String issuerBank,String bankAccount,double balanceAmount,int cvcNumber,double interestRate,String expirationDate)
 {
    //calling constructor from superClass 
    super(balanceAmount,cardId,bankAccount,issuerBank);
    
    //setter method from superClass
    setClientName(clientName);
    
    //assigning attributes
    this.cvcNumber = cvcNumber;
    this.interestRate = interestRate;
    this.expirationDate = expirationDate;
    this.isGranted = false;
}
 
 //Getter method
public int getCvcNumber() {
     return this.cvcNumber;
    }

public double getcreditLimit(){
     return this.creditLimit;
    } 

public double getinterestRate() {
      return this.interestRate;
    }

public String getexpirationDate() {
       return this.expirationDate;
    } 

public int getgracePeriod() {
       return this.gracePeriod;
    } 

public boolean getisGranted() {
       return this.isGranted;
    } 

 
 //Setter Method for credit limit
public void setCreditLimit(double creditLimit,int gracePeriod) {
    if(creditLimit <= 2.5 * getbalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true; 
        }
        
    else{
            System.out.println("Credit cannot be issued.");
        }
    }

 //Cancel CreditCard method
public void cancelCreditCard() {
    if (isGranted){
            cvcNumber = 0;
            creditLimit = 0;
            gracePeriod = 0;
            isGranted = false;
        }
    }
    
 //display Method
public void display(){
    super.display();
      
       if(isGranted) {
          System.out.println("CVC Number: " + cvcNumber);
          System.out.println("Credit Limit: " + creditLimit);
          System.out.println("Interest Rate: " + interestRate );
          System.out.println("Expiration Date: " + expirationDate);
          System.out.println("Grace Period: " + gracePeriod);
        }
    }
}