public class PersonalAcct extends Account{

  private double MIN = 100;

   

  public PersonalAcct (double bal){

    super (bal);

    

  }

  

   
   public void withdrawal(double amt, double balance) {

   if (amt <= balance) {

    balance -= amt;

   if (balance < MIN) {

    balance = balance - 2; 

   } else {

    System.out.println("Not enough money in account.");

   }

 }

}

 

  public boolean equals (Object p){

    PersonalAcct testObj = (PersonalAcct) p;

    

    if(testObj.getBalance() == super.getBalance()){

      return(true);

    }else{

      return (false);

    }

  }

 

  public String toString(){

    String personacctString;

     

    personacctString = "The balance is" + super.getBalance();

    return(personacctString);

  }

}
