public class BankAccount{

private int realAccountID;
private double realBalance;
private String realPassword;

public BankAccount ( double balance, int accountID, String password){
  realAccountID = accountID;
  realBalance = balance;
  realPassword = password;
}


public String toString(){
  return realAccountID + "\t" + realBalance;
}

public double getBalance(){
  return realBalance;
}

public int getAccountID(){
  return realAccountID;
}


 public void setPassword(String newPass){
   realPassword = newPass;
 }
private boolean authenticate(String password){
if (realPassword.equals(password)){
return true;}
else {
return false;}}



 public boolean deposit(double amount){
   if (amou  nt >= 0){
     realBalance += amount;
     return true;
   }
   else {
     return false;
   }
 }

 public boolean withdraw(double amount){
   if (amount >= 0 && amount <= realBalance){
     realBalance = realBalance - amount;
     return true;
   }
   else {
     return false;
   }
 }

}
