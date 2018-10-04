public class Driver{
  public static void main (String[]args){
    BankAccount a = new BankAccount (1234,250.0,"admin123");
    System.out.println ("Your Account ID is " + a.getAccountID());
    System.out.println ("Your current balance is " +  a.getBalance());
    System.out.println (a);
    if (a.deposit(-100.0)){
      System.out.println("Deposit success!");
         }
    else{
      System.out.println("Deposit failure");
         }
    if (a.deposit(1000.0)){
      System.out.println("Deposit success!");
          }
    else{
      System.out.println("Deposit failure");
          }
    System.out.println ("Your current balance is " +  a.getBalance());
    if (a.withdraw(-100.0)){
      System.out.println("Withdrawal success!");
               }
    else{
      System.out.println("Withdrawal failure");
               }
    if (a.withdraw(200000.0)){
      System.out.println("Withdrawal success!");
                          }
    else{
      System.out.println("Withdrawal failure");
                          }
    if (a.withdraw(1000.0)){
      System.out.println("Withdrawal success!");
                                                }
    else{
      System.out.println("Withdrawal failure");
                                                }
    System.out.println ("Your current balance is " +  a.getBalance());

  }
}
