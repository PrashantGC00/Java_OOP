/** 
* @author (22067480 Prashant G.C.) 
* @version (5.1.0)  
*/

class DebitCard extends BankCard{
    //declaring variables for subclass
    private int pin_Number;
    private int withdrawal_Amount;
    private String date_Of_Withdrawal;
    private boolean hasWithdrawn;
    
    
    /*constructor for subclass
    */ 
    public DebitCard(String issuerBank, int cardId, int balanceAmount,
     String bank_Account, String client_name, int pin_Number){
        //assigns parameter values to super-class contructor
        super(issuerBank, cardId, balanceAmount, bank_Account);
        
        this.pin_Number = pin_Number;
        
        //sets client_name using the setter method of super-class
        setclient_name(client_name);
        hasWithdrawn = false; 
    }
    
    
    //declaring getter methods for subclass
    public int getpin_Number(){
        return this.pin_Number;
    }
    public int getwithdrawal_Amount(){
        return this.withdrawal_Amount;
    }
    public String getdate_Of_Withdrawal(){
        return this.date_Of_Withdrawal;
    }
    public boolean gethasWithdrawn(){
        return this.hasWithdrawn;
    }
    
    
    //declaring setter method for witdrawal amount
    public void set_withdrawal_Amount(int withdrawal_Amount){
        this.withdrawal_Amount = withdrawal_Amount;
    }
    
    
    //assigns value from super class using getter method from the super class
    //double balanceAmount = super.getbalanceAmount();
    
    
    //creating a method to check for transaction verification and ability
    public void withdraw(int withdrawal_Amount,String date_Of_Withdrawal,int pin_Number){
        
        //sets the withdrawal amount for the subclass
        set_withdrawal_Amount(withdrawal_Amount);
        this.date_Of_Withdrawal = date_Of_Withdrawal;
        //nested if case for validity and ability for transaction
        if(pin_Number == this.pin_Number){
            if(withdrawal_Amount <= getbalanceAmount()){
                System.out.println("Transaction Complete");
                hasWithdrawn = true;
                //sets the new value for balanceAmount use setter method is super class
                setbalanceAmount(getbalanceAmount() - withdrawal_Amount);
            }
            else{
                System.out.println("Insufficient Amount");
            }
        }
        else{
            System.out.println("Incorrect Pin Number");
        }
    }
    
    
    //method displaying variables and its values 
    public void display(){
        if(hasWithdrawn == false){
            System.out.println("balanceAmount: "+ getbalanceAmount());;
        }
        else{
            //class display method of super class
            super.display();
            
            System.out.println("pin_Number: "+ pin_Number);
            System.out.println("withdrawal_Amount: "+withdrawal_Amount);
            System.out.println("date_Of_Withdrawal: "+date_Of_Withdrawal);
        }
    }
}