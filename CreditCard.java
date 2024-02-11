/** 
* @author (22067480 Prashant G.C.) 
* @version (5.1.0)  
*/
public class CreditCard extends BankCard{
    //declaring variables for subclass
    private int number_CVC;
    private double credit_Limit;
    private double intrest_Rate;
    private String expirationDate;
    private int grace_Period;
    private boolean isGranted;
    
    //constructor for subclass which takes specific arguments
    public CreditCard(String issuerBank, int cardId, int balanceAmount,
     String bank_Account, String client_name, int number_CVC, double intrest_Rate,
     String expirationDate){
        //calls the constructor of super class passing in relevant args
        super(issuerBank, cardId, balanceAmount, bank_Account);
        
        //calls and passes client name to setter method of super class
        setclient_name(client_name); 
        
        //assigns values from parameters to variables of subclass
        this.number_CVC = number_CVC;
        this.intrest_Rate = intrest_Rate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    
    /*
       getter methods for each variables in subclass*/
    public int getnumber_CVC(){
        return this.number_CVC;
    }
    public double getcredit_Limit(){
        return this.credit_Limit;
    }
    public double getintrest_Rate(){
        return this.intrest_Rate;
    }
    public String getexpirationDate(){
        return this.expirationDate;
    }
    public int getgrace_Period(){
        return this.grace_Period;
    }
    public boolean getisGranted(){
        return this.isGranted;
    }
    
    
    
    //setter method taking in 2 args
    public void setcredit_Limit(double credit_Limit,int grace_Period){
        //checks if the given condition is met
        if(credit_Limit <= (2.5 * getbalanceAmount())){
            /*when condition is met
               sets values for credit limit and grave period in subclass
               also reassigns boolean value to true*/
            System.out.println("Credit Granted");
            isGranted = true;
            this.credit_Limit = credit_Limit;
            this.grace_Period = grace_Period;
        }
        else{
            /*when condition is not met
               prints statement =>*/
            System.out.println("Credit Limit not met, Credit not Granted"); 
        }
    }
    
    //method reassigns values for variables of subclass 
    public void cancelCreditCard(){
        number_CVC = 0;
        credit_Limit = 0;
        grace_Period = 0;
        isGranted = false;
    }
    
    //displays values of variables in subclass
    public void display(){
        // calss dublicate method from super class
        super.display();
        if(isGranted == true){
            /*when condition is met
              */
            System.out.println("credit_Limit: "+ credit_Limit);
            System.out.println("grace_Period: "+grace_Period);
            System.out.println("number_CVC: "+number_CVC);
            System.out.println("expirationDate: "+expirationDate);
            System.out.println("intrest_Rate: "+intrest_Rate);
        }
        else{
            System.out.println("Credit limit not met");
        }
    }
}