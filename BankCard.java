/** 
* @author (22067480 Prashant G.C.) 
* @version (5.1.0) 
*/

public class BankCard{
    //Declaring Variables 
    private String client_name;
    private String issuerBank;
    private int cardId;
    private int balanceAmount;
    private String bank_Account;
    
    //Constructors with 
    public BankCard(String issuerBank,int cardId,int balanceAmount,
     String bank_Account){
        this.issuerBank = issuerBank;
        this.cardId = cardId;
        this.balanceAmount = balanceAmount;
        this.bank_Account = bank_Account;
        
        //assigns client_name to an empty string as default value
        client_name = "";
    }
    
    /*setters for client_name 
     * and balanceAmount
       */
    public void setclient_name(String client_name){
        this.client_name = client_name;
    }
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    
    
    //getter methods for all variables    
    public String getclient_name(){
        return this.client_name;
    }
    public String getissuerBank(){
        return this.issuerBank;
    }
    public int getcardId(){
        return this.cardId;
    }
    public int getbalanceAmount(){
        return this.balanceAmount;
    }
    public String getbank_Account(){
        return this.bank_Account;
    }
    
    
    /*method displaying variables and its values
       also checking for an empty variable(client_name)*/
    public void display(){
        System.out.println("issuerBank: " + issuerBank);
        System.out.println("cardId: "+ cardId);
        System.out.println("balanceAmount: "+ balanceAmount);
        System.out.println("bank_Account: "+bank_Account);
        if(client_name.equals("")){
            System.out.println("client name is empty");
        }
        else{
            System.out.println("client name: " + client_name);
        }
    }
}