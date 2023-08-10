
/**
 * Write a description of class BankCard here.
 *
 * @author (22068741 Nishan Thapa)
 * @version (1.0.0)
 */
public class BankCard //A superClass called BankCard is created.
{
   //declaring attributes

   //cardID and balanceAmount is declared as a number.
   private int cardId;
   private double balanceAmount;
   
   //clientName, issuerBank and bankAccount declared as a String.
   private String clientName;
   private String issuerBank;
   private String bankAccount;
   
   
   
   //parameterized constructor accepting four attributes. Methods must be public.
   public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
   {
       //assigning attributes with parameter values
       
       this.balanceAmount = balanceAmount;
       this.cardId = cardId;
       this.bankAccount = bankAccount;
       this.issuerBank = issuerBank;
       this.clientName = ""; //clientName initialised as an emptystring.
   }
   
   // accessor methods of attributes.
   public double getbalanceAmount()
   {
       return this.balanceAmount;
   }
   
   public int getcardId()
   {
       return this.cardId;
   }

   public String getissuerBank()
   {
       return this.issuerBank;
   }
   
    public String getbankAccount()
   {
       return this.bankAccount;
   }
   
   public String getClientName()
   {
       return this.clientName;
   }
   
   
   //setter method for clientName and balanceAmount
   public void setClientName(String clientName)
   {
       this.clientName = clientName;
   }
   
    public void setBalanceAmount(double balanceAmount)
   {
       this.balanceAmount = balanceAmount;
   }
      
  
   //display method
   public void display() 
   {   
       System.out.println("Balance Amount: " + balanceAmount);
       System.out.println("Card ID "+ cardId);     
       System.out.println("Issuer Bank: " + issuerBank);
       System.out.println("Bank Account: " + bankAccount);
       
       if(clientName.isEmpty())
       {
         System.out.println("Please assign a client name");
       }
       else
       {
         System.out.println("Client Name: " + clientName);//display message if clientName is not assigned.
       }
        
   }
   
}
