
/**
 * Write a description of class BankCard here.
 *
 * @author (22067659 Rojma Shakya)
 * @version (1.0.0)
 */
public class BankCard
{
   //attribute
   private int cardId;
   private String clientName;
   private String issuerBank;
   private String bankAccount;
   private double balanceAmount;
   
   //constructor
   public BankCard(  int cardId ,String issuerBank ,String bankAccount,double balanceAmount ){
   
   this.clientName="";
   this.cardId=cardId;
   this.issuerBank=issuerBank;
   this.bankAccount=bankAccount;
   this.balanceAmount=balanceAmount;
   
   
   
}
           //accessor methods
           public int getCardId(){ 
               return this.cardId;
            
            }
           public String getClientName(){
               return this.clientName;
            }
           public   String getIssuerBank(){
               return this.issuerBank ;
            }
           public   String getBankAccount(){
               return   this.bankAccount;
            }
           public   double getBalanceAmount(){
               return this.balanceAmount  ;
            }
           
           //new methods
           public void setClientName(String clientName){
                  this. clientName=clientName;
            }
             public void setBalanceAmount(double balanceAmount){
                  this. balanceAmount=balanceAmount;  
                }
               
                
            
           
   //displaymethod
   public void display(){
       if (clientName==""){
       System.out.println("Client name not assigned");
    }else{
        System.out.println("Card ID is"+cardId);
         System.out.println("Client Name is"+ clientName);
         System.out.println("Issuer Bank is"+issuerBank ); 
        System.out.println("Bank Account   is"+ bankAccount);
        System.out.println("Balance  Amount is"+ balanceAmount);
        
    }
       
   }
}
